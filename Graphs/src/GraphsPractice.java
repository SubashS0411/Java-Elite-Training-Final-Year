import java.util.*;
public class GraphsPractice {
    public static void main(String[] args) {
        int n = 3;

        // Create the main directory of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Create an empty list for each vertex (0 through 3)
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Edge 1 --- 2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // Edge 2 --- 3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Edge 1 --- 3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // Print all the edges (Loop should be <= n to print the 3rd node)
        for (int i = 1; i <= n; i++) {
            System.out.print("Node " + i + " neighbors: ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
