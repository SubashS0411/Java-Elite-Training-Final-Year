import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int v=5;
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);

        // Edge 2 --- 4
        adj.get(2).add(4);
        adj.get(4).add(2);
        System.out.println(adj);
        ArrayList<Integer> ans=bfsOfGraph(v,adj);
        System.out.println(ans);
    }
    public static ArrayList<Integer> bfsOfGraph(int v,ArrayList<ArrayList<Integer>> adj){
            ArrayList<Integer> bfs=new ArrayList<>();
            boolean vis[]=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            Integer node=q.poll();
            bfs.add(node);
            for (Integer it:adj.get(node)){
                if(vis[it]==false){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
