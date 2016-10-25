/*
 * Nonrecursive DFS with Stack
 */

import java.util.Scanner;
import java.util.Stack;
import java.io.File;

public class DFSStack {

	public static int node, edge;
	public static boolean[] visited;

	public static void main(String[] args) throws Exception {
		
		File file = new File("input.txt");
		Scanner ana = new Scanner(file);

		node = ana.nextInt();
		edge = ana.nextInt();

		int[][] adjMatrix = new int[node][edge];

		while(ana.hasNext()) {

			int nodeIndex = ana.nextInt();
			int edgeIndex = ana.nextInt();

			adjMatrix[nodeIndex][edgeIndex] += 1;
		}

		visited = new boolean[node];

		dfs_travers(2, adjMatrix, visited);
		System.out.println();
	}

	public static void dfs_travers(int i, int[][] adjMatrix, boolean[] visited) {

		Stack<Integer> traversStack = new Stack<Integer>();

		visited[i] = true;
		traversStack.push(i);
		System.out.print(i + " ");

		while( !traversStack.isEmpty() ) {

			int temp = traversStack.peek();

			if(hasUnvisitedNext(temp, adjMatrix)) {

				int temp_2 = next(temp, adjMatrix);

				if(temp_2 != -1) {
					
					if(!visited[temp_2]) {

						visited[temp_2] = true;
						traversStack.push(temp_2);

						System.out.print(temp_2 + " ");
					}
				}
			} else {

				traversStack.pop();
			}
		}
	}

	public static boolean hasUnvisitedNext(int node, int[][] adjMatrix) {

		for(int i=0; i<edge; i++) {

			if(adjMatrix[node][i] > 0 && !visited[i]) {

				return true;
			}
		}

		return false;
	}

	public static int next(int node, int[][] adjMatrix) {

		for(int i=0; i<edge; i++) {

			if(adjMatrix[node][i] > 0 && !visited[i]) {

				return i;
			}
		}

		return -1;
	}
}