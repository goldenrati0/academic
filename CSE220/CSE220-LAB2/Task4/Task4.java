import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        
        Scanner ana = new Scanner(System.in);
        
        System.out.println("Put Size of the Array");
        int size = ana.nextInt();
        
        int[] a = new int[size];
        for(int i=0; i<a.length; i++){
            
            a[i] = ana.nextInt();
        }
        
        int[] b = new int[size];
        for(int i=0; i<b.length; i++){
            
            b[i] = ana.nextInt();
        }
        
        for(int i=0; i<a.length; i++){
            
            a[i] = 5 * a[i];
        }
        
        System.err.print("[\t");
        for(int i=0; i<b.length; i++){
            
            System.out.print((a[i] - b[i]) + "\t");
        }
        System.err.print(" ]");
        System.out.println();
    }
}