package Trie;

import java.util.LinkedList;
import java.util.Queue;

public class TrieNode {
    public TrieNode[] children;
    public String word;

    public TrieNode() {
        children = new TrieNode[26];
    }
    public static void main(String[] args) {
        Trie trie= new Trie();
        trie.add("add");
        trie.add("orange");
        trie.add("banana");
        System.out.println(trie.isExisted("bana"));
        trie.printTrie(trie.getRoot());
        trie.printTrieBfs(trie.getRoot());
     }

}

class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public TrieNode getRoot() {  // getter is needed because root is defined as private.
        return root;
    }


    //apple -> [a,p,p,l,e]
    public void add(String word1) {
        TrieNode node = root; //need to keep root
        char[] chars = word1.toCharArray();
        for (char c : chars) {

            if (node.children[c - 'a'] == null) {//means the trie doesn't have that character, we will need to create that char
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
            // System.out.println(node.word);

        }
        node.word = word1;
        // System.out.println(node.word);
    }


    public boolean isExisted(String word) {
        TrieNode node = root; //need to keep root
        char[] chars = word.toCharArray();
        for (char c : chars) {

            if (node.children[c - 'a'] == null) {
                return false;
            }
            node = node.children[c - 'a'];

        }
        return true;
    }

    //dfs
    public void printTrie(TrieNode root) {
        TrieNode node = root;
        if (node == null) return;
        for (TrieNode child : node.children) {
            if (child != null) {
                if (child.word != null) {
                    System.out.println(child.word);
                }
                printTrie(child);
            }

        }
    }

    //bfs
    public void printTrieBfs(TrieNode root) {

        Queue<TrieNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TrieNode curr = queue.poll();
            if (curr.word != null) System.out.println(curr.word);
            for (TrieNode child : curr.children) {
                if (child != null) {
                    queue.add(child);
                }
            }
        }

    }
}