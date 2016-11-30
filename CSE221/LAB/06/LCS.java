import java.util.Scanner;
import java.util.Stack;

public class LCS {

    public static void main(String[] args) {

        Scanner ana = new Scanner(System.in);

        String a = ana.nextLine();
        String b = ana.nextLine();

        a = 0 + a;
        b = 0 + b;

        int[][] table = new int[a.length()][b.length()];

        for (int i = 0; i < a.length(); i++) {

            for (int j = 0; j < b.length(); j++) {

                if (a.charAt(i) == '0' || b.charAt(j) == '0') {

                    table[i][j] = 0;
                } else if (a.charAt(i) == b.charAt(j)) {

                    table[i][j] = table[i - 1][j - 1] + 1;
                } else if (a.charAt(i) != b.charAt(j)) {

                    table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
                }
            }
        }

        int row = a.length() - 1;
        int column = b.length() - 1;

        Stack lcsStack = new Stack();

        while (row != 0 && column != 0) {

            if (a.charAt(row) == b.charAt(column)) {

                lcsStack.push(a.charAt(row));

                row--;
                column--;
            } else if (a.charAt(row) != b.charAt(column)) {

                int value = Math.max(table[row - 1][column], table[row][column - 1]);

                if (table[row - 1][column] == value) {
                    row--;
                } else if (table[row][column - 1] == value) {
                    column--;
                } else if (table[row][column - 1] == table[row - 1][column]) {

                    row--;
                }
            }
        }

        while (!lcsStack.isEmpty()) {

            System.out.print(lcsStack.pop());
        }
        
        System.out.println();
    }

}
