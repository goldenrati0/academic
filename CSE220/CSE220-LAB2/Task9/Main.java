import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner ana = new Scanner(System.in);
        int[] ar = { 1,4,8,16,25,36,49,64,81,100 };
        
        int x = ana.nextInt();
        
        System.out.print("Rotate Left: ");
        rotateLeft(ar, x);
        System.out.print("Rotate Right: ");
        rotateRight(ar, x);
    }
    
    public static void rotateLeft(int[] x, int pos){
        
        int ar[] = new int[x.length];
        int indexManager = 0;
        
        for(int i=pos; i<=x.length+(pos-1); i++){
            
            ar[indexManager] = x[i%x.length];
            indexManager++;
        }
        
        for(int i=0; i<ar.length; i++){
            
            System.out.print(ar[i] + ", ");
        }
        System.out.println();
    }
    
    public static void rotateRight(int[] x, int pos){
        
        int[] ar = new int[x.length];
        int indexManager = 0;
        
        for(int i=x.length-pos; i<=x.length+(pos+1); i++){
            
            ar[indexManager] = x[i%x.length];
            indexManager++;
        }
        
        for(int i=0; i<ar.length; i++){
            
            System.out.print(ar[i] + ", ");
        }
        System.out.println();
    }
}
