import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner ana = new Scanner(System.in);
        
        String x = ana.nextLine();
        
        ComplexNumber cn = new ComplexNumber(x);
        
        cn.increaseValue();
        System.out.println(cn);
        cn.polarRadius();
    }
}