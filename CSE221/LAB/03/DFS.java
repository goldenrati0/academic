/*
 * DFS with recursion and without Stack
 */

import java.util.Scanner;
import java.io.File;

public class DFS {
	public static void main(String[] args) throws Exception {
		
		File file = new File("input.txt");
		Scanner ana = new Scanner(file);

		int node = ana.nextInt();
		int edge = ana.nextInt();

		int[][] adjMatrix = new int[node][edge];

		while(ana.hasNext()) {

			int nodeIndex = ana.nextInt();
			int edgeIndex = ana.nextInt();

			adjMatrix[nodeIndex][edgeIndex] += 1;
		}

		boolean[] visited = new boolean[node];

		dfs_travers(4, adjMatrix, visited);
		System.out.println();
	}

	public static void dfs_travers(int i, int adjMatrix[][], boolean[] visited) {

		visited[i] = true;
		printNode(i);

		for( int j=0; j<adjMatrix[i].length; j++) {

			if(adjMatrix[i][j]>0 && !visited[j]) {

				dfs_travers(j, adjMatrix, visited);
			}
		}
	}

	public static void printNode(int i) {
		System.out.print(i + " ");
	}
}