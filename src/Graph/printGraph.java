package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class printGraph {
        public void printGraph (int n, int[][] graph){ // n is number of vertexes.
        //step 1: building adjacent list from edges
            Map<Integer, Set<Integer>> adjacentList = new HashMap<>();
            for (int[] edge: graph){
                adjacentList.computeIfAbsent(edge[0], k->new HashSet<Integer>()).add(edge[1]);
                adjacentList.computeIfAbsent(edge[1], k->new HashSet<Integer>()).add(edge[0]);
            }
            for (Integer key:adjacentList.keySet()){
                System.out.println(key+" "+adjacentList.get(key));
              //  System.out.println("adjacent list is " +adjacentList.get(key));
            }

            Set<Integer> visited = new HashSet<>();

            for (int v=0; v<n;v++){
                if(!visited.contains(v)){// if v is not visited and belong to an edge
                    print(v,adjacentList, visited);
                    System.out.println("");
                }
            }
        }

          public void print(int v, Map<Integer, Set<Integer>> adjacent, Set<Integer> visited){
            visited.add(v);
            System.out.print(v + " ");



            for (int nei:adjacent.getOrDefault(v, new HashSet<>())){  //if got, then return value of key v; if not return to empty HashSet, then it doesnt go to print recursion anymore.
                if (!visited.contains(nei)){
                    print(nei, adjacent, visited);
                }
            }
    }

    public static void main(String[] args) {
            printGraph g=new printGraph();
            int [][] graph= {{0,1},{0,2},{1,2},{2,0},{2,3},{3,3},{4,5}};
            g.printGraph(6, graph);


    }
}
