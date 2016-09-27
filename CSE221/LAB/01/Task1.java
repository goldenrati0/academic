import java.util.Scanner;
import java.io.File;

public class Task1 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("task1-inputs.txt");
		Scanner ana = new Scanner(file);

		int node = ana.nextInt();
		int edge = ana.nextInt();

		int[][] adjMatrix = new int[node][edge];

		while(ana.hasNext()) {

			int nodeIndex = ana.nextInt();
			int edgeIndex = ana.nextInt();

			adjMatrix[nodeIndex][edgeIndex] += 1;
		}

		for(int i=0; i<node; i++) {
			for(int j=0; j<edge; j++) {
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}