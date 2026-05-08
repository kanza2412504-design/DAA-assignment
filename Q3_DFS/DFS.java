import java.util.*;

public class TopologicalSortArray {
    private int V = 14; // Total vertices
    private LinkedList<Integer>[] adj; // Array of lists

    public TopologicalSortArray() {
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Convert char to index (m=0, n=1, ... z=13 based on your specific nodes)
    private int charToIndex(char c) {
        String nodes = "mnopqrstuvwxyz";
        return nodes.indexOf(c);
    }

    private char indexToChar(int i) {
        String nodes = "mnopqrstuvwxyz";
        return nodes.charAt(i);
    }

    public void addEdge(char u, char v) {
        adj[charToIndex(u)].add(charToIndex(v));
    }

    private void dfs(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for (int neighbor : adj[v]) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, stack);
            }
        }
        stack.push(v);
    }

    public void sort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) dfs(i, visited, stack);
        }

        System.out.println("Topological Sort (Using Arrays):");
        while (!stack.isEmpty()) {
            System.out.print(indexToChar(stack.pop()) + " ");
        }
    }

    public static void main(String[] args) {
        TopologicalSortArray graph = new TopologicalSortArray();
        // Add edges using the same logic as before...
        graph.addEdge('m', 'q'); // and so on
        graph.sort();
    }
}
