import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Task2 {
	public static void main(String[] args) throws Exception {
		
		File file = new File("task2-inputs.txt");
		Scanner ana = new Scanner(file);

		int node = ana.nextInt();
		int edge = ana.nextInt();

		ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();

		for (int i=0; i<node; i++) {
			
			arrayList.add(new Integer[edge]);

			Integer[] temp = arrayList.get(i);

			fillArray(temp, null);
		}

		while(ana.hasNext()) {

			int nodeIndex = ana.nextInt();
			int edgeIndex = ana.nextInt();

			Integer[] temp = arrayList.get(nodeIndex);

			for (int i=0; i<temp.length; i++) {
				
				if(temp[i] == null) {
					temp[i] = edgeIndex;
					break;
				}
			}
		}

		for (int i=0; i<arrayList.size(); i++) {
			
			Integer[] temp = arrayList.get(i);

			System.out.print("["+i+"]");
			for (Integer val : temp) {
				
				if(val != null)
					System.out.print("-->["+val+"]");
			}
			System.out.println();
		}
	}

	public static void fillArray(Object[] x, Object val) {

		for (int i=0; i<x.length; i++) {
			
			x[i] = val;
		}
	}
}