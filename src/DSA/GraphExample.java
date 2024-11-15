package DSA;

import java.util.LinkedList;
import java.util.Queue;

public class GraphExample {
    //Graph and BFS:  implements BFS to find the shortest path in an undirected graph
    public static int shortestPathBFS(int[][] graph,int start,int end){
        boolean[] visited=new boolean[graph.length];
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(start);
        visited[start] =true;
        int steps=0;
        while (!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int node=queue.poll();
                if(node==end)return steps;
                for(int neighbor: graph[node]){
                    if(!visited[neighbor]){
                        queue.offer(neighbor);
                        visited[neighbor]=true;
                    }
                }
            }
            steps++;
        }
        return  -1;
    }
    public static void main(String args[]){
        int[][] graph={{1,2},{0,3},{0,3},{1,2}};
        int start=0,end=3;
        System.out.println("Shortest path length: "+shortestPathBFS(graph,start,end));
    }
}
