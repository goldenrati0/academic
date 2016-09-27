import java.util.Scanner;
import java.io.File;

public class Task2 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("task2-inputs.txt");
		Scanner ana = new Scanner(file);

		int node = ana.nextInt();
		int edge = ana.nextInt();

		String[] adjList = new String[node];

		for(int i=0; i<adjList.length; i++) {
			adjList[i] = "";
		}

		while(ana.hasNext()) {

			int nodeIndex = ana.nextInt();
			int edgeIndex = ana.nextInt();

			adjList[nodeIndex] += "->[ " + edgeIndex + " ]";
		}

		for(int i=0; i<adjList.length; i++) {
			System.out.println("[ " + i + " ]"+adjList[i]);
		}
	}
}