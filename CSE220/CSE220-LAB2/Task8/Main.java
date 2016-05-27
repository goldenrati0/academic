import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner ana = new Scanner(System.in);
        
        int a = ana.nextInt();
        int b = ana.nextInt();
        int c = ana.nextInt();
        
        QuadEqn qe = new QuadEqn(a, b, c);
        
        System.out.println(qe.equation());
        qe.firstRoot();
    }
}