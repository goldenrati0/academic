import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

public class KruskalMST {

    public static void main(String[] args) throws Exception {

        File file = new File("input.txt");
        Scanner ana = new Scanner(file);

        // node and edge
        int node = ana.nextInt();
        int edge = ana.nextInt();

        // added array for tracking nodes
        boolean added[] = new boolean[node + 1];

        // filling added array's all cell with FALSE
        for (int i = 0; i < added.length; i++) {
            added[i] = false;
        }

        // creating objects for ConnectionVertex class with start and end nodes and edge weight
        ConnectionVertex[] vertexCollection = new ConnectionVertex[edge];

        // weight array to sort weights and create MST
        int[] weightArray = new int[edge];

        for (int i = 0; i < vertexCollection.length; i++) {

            vertexCollection[i] = new ConnectionVertex(ana.nextInt(), ana.nextInt(), ana.nextInt(), false);
            weightArray[i] = vertexCollection[i].weight;
        }

        // sorting weight array
        Arrays.sort(weightArray);

        String mst = ""; // to store the final Minimum Spanning Tree

        // iterating each edge
        for (int i = 0; i < vertexCollection.length; i++) {

            if (!vertexCollection[i].visited) { // if that edge is already visited then that is ignored

                ConnectionVertex temp = retrieveNode(weightArray, vertexCollection, added, i); // retrieve particular node with lowest weight

                if (temp != null) { // in case the method returns NULL
           
                    if (!added[temp.startNode] || !added[temp.endNode]) { // at least one VERTEXT must be unvisited. Otherwise it will create cycle

                        mst += temp.startNode + " --> " + temp.endNode + " " + "["+temp.weight+"]" + "\n"; // Assigning it to MST

                        added[temp.startNode] = true; // marking both vertex as VISITED
                        added[temp.endNode] = true;
                    }

                    vertexCollection[i].visited = true; // mark the ENDGE as VISITED
                }
            }
        }

        System.out.println(mst);
    }

    public static ConnectionVertex retrieveNode(int weight[], ConnectionVertex vertexCollection[], boolean added[], int index) {

        ConnectionVertex node = null;

        for (int i = 0; i < vertexCollection.length; i++) {

            if ((weight[index] == vertexCollection[i].weight) && (!added[vertexCollection[i].startNode] || !added[vertexCollection[i].endNode])) {

                node = vertexCollection[i];
                break;
            }
        }

        return node;
    }
}

class ConnectionVertex {

    public int startNode;
    public int endNode;

    public int weight;

    public boolean visited;

    public ConnectionVertex(int startNode, int endNode, int weight, boolean visited) {

        this.startNode = startNode;
        this.endNode = endNode;
        this.weight = weight;
        this.visited = visited;
    }
}