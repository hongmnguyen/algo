package Graph;

import java.util.*;

public class NumberOfProvinceBFS {
    public int findCircleNum(int[][] isConnected) {
    int n = isConnected.length;
    Map<Integer, Set<Integer>> adjacentMap = new HashMap<>();

        for (int i = 0; i < n;i++) {
        for (int j = 0; j< n;j++) {
            if (i != j && isConnected[i][j] == 1) {

                adjacentMap.computeIfAbsent(i,k-> new HashSet<Integer>()).add(j);
                adjacentMap.computeIfAbsent(j,k-> new HashSet<Integer>()).add(i);
            }
        }
    }

        for (Integer key:adjacentMap.keySet()){
        adjacentMap.get(key);
        System.out.println(key+ " "+ adjacentMap.get(key));

    }

    int groupCnt = 0;
    Set<Integer> visited = new HashSet<>();
        for (int v=0; v<n;v++){
        if(!visited.contains(v)){
            visitBFS(v, adjacentMap,visited);
            groupCnt++;

        }
    }
        return groupCnt;
}
    public void visitBFS(int v,Map<Integer, Set<Integer>> adjacent, Set<Integer> visited){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(v);
        visited.add(v);
        while (!queue.isEmpty()){
            int t= queue.poll();
            for (int nei:adjacent.getOrDefault(t,new HashSet<>())){ // go through each neighbor of the adjacent map to get value of nei. If v has no neighbor, return empty Hashset
                if(!visited.contains(nei)){// after getting neighbor, if set visited
                    queue.add(nei);
                    visited.add(nei);
                }

            }
        }
    }
}

