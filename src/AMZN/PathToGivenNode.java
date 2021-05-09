package AMZN;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given a Binary Tree A containing N nodes.
//        You need to find the path from Root to a given node B.
//
//        NOTE:
//        No two nodes in the tree have same data values.
//        You can assume that B is present in the tree A and a path always exists.
//
//        Input Format
//        First Argument represents pointer to the root of binary tree A.
//        Second Argument is an integer B denoting the node number.
//        Output Format
//        Return an one-dimensional array denoting the path from Root to the node B in order.
//
//        Example
//        Input:
//        A =
//        1
//        / \
//        2 3
//        / \ / \
//        4 5 6 7
//
//        B = 5
//
//        Ouput:
//        [1, 2, 5]
//
//        Source: https://www.interviewbit.com/problems/path-to-given-node/
public class PathToGivenNode {
    public static boolean hasPath(TreeNode root, ArrayList<Integer> arr, int x ){
    //if root is null, there is no path
        if (root==null) return false;
     //push the node's value in array
        arr.add(root.val);
     //if it is the required node, return true
     if (root.val==x) return true;
     //else check whether the required node lies in the left subtree or right subtree of the current node
     if (hasPath(root.left, arr, x)||hasPath(root.right, arr, x)) return true;
     // if required node does not lie neither in the left nor right subtree of the current node.
     // Thus, remove current node's value from 'arr' and then return false
     arr.remove(arr.size()-1);
     return false;
    }

    public static void printPath(TreeNode root, int x){
        //ArrayList to store the path
        ArrayList<Integer> arr=new ArrayList<>();
        // if required node "x" is present, print the path

        if(hasPath(root, arr,x)) {
            System.out.println(arr);
        }
        //if 'x' is not present in the binary tree
        else{
            System.out.println(arr);

            }
        }

    public static void main(String[] args) {
        PathToGivenNode p = new PathToGivenNode();
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        root.left = a;
        root.right = b;
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(5);
        a.left = c;
        a.right = d;
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(7);
        b.left = e;
        b.right = f;

        //p.printPath(null, 5);
        p.printPath(root,5);

    }
}
