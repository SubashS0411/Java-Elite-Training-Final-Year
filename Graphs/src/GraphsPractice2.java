import java.util.*;
public class GraphsPractice2 {
    public static void main(String[] args) {
        int n = 3; // Number of vertices

        // 1. Create the Adjacency List
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // 2. Initialize empty lists for 1-based indexing (0 to 3)
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // 3. Add Edges (Undirected means you add both ways)
        // Edge between 1 and 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // Edge between 2 and 3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Edge between 1 and 3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // 4. Print the Adjacency List
        // Loop <= n so we actually print vertex 3!
        for (int i = 1; i <= n; i++) {
            System.out.print("Node " + i + " is connected to: ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
