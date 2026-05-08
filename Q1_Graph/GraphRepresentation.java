import java.util.ArrayList;


    public static void main(String[] args) {

        int vertices = 4;

        // Adjacency Matrix
        int[][] matrix = {
                {0, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 0}
        };

        System.out.println("Adjacency Matrix:");

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Adjacency List
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Adding edges
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(0).add(3);

        adjList.get(1).add(0);
        adjList.get(1).add(2);
        adjList.get(1).add(3);

        adjList.get(2).add(0);
        adjList.get(2).add(1);
        adjList.get(2).add(3);

        adjList.get(3).add(0);
        adjList.get(3).add(1);
        adjList.get(3).add(2);

        System.out.println("\nAdjacency List:");

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int j : adjList.get(i)) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
