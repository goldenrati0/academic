import java.util.Scanner;
import java.util.LinkedList;
import java.io.File;

public class dijkstrasAlgorithm {
	public static void main(String[] args) throws Exception {
		
		File file = new File("inputs.txt");
		Scanner ana = new Scanner(file);

		int node = ana.nextInt();
		int edge = ana.nextInt();

		int[][] adjMatrix = new int[node][edge];
		int[] distance = new int[node];

		for(int i=0; i<distance.length; i++) {
			distance[i] = 100000;
		}

		while(ana.hasNext()) {

			int nodeIndex = ana.nextInt();
			int edgeIndex = ana.nextInt();
			int weight = ana.nextInt();

			adjMatrix[nodeIndex][edgeIndex] += weight;
		}
                
        ana = new Scanner(System.in);
		System.out.println("Source node: ");
		int source = ana.nextInt();

		dijkstras(adjMatrix, distance, source);

		for(int i=0; i<adjMatrix[source].length; i++) {

			System.out.println("Distance from " + source + " to " + i + ": " + distance[i]);
		}
	}

	public static void dijkstras(int[][] adjMatrix, int[] distance, int source) {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		distance[source] = 0;
		linkedList.add(source);

		while(!linkedList.isEmpty()) {

			int temp = linkedList.removeFirst();

			for(int i=0; i<adjMatrix[temp].length; i++) {

				if(adjMatrix[temp][i] > 0) {

					if(distance[temp] + adjMatrix[temp][i] < distance[i]) {

						distance[i] = distance[temp] + adjMatrix[temp][i];
						linkedList.add(i);
					}
				}
			}
		}

	}
}