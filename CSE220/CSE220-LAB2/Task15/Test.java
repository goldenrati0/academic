import java.util.ArrayList;

public class Test{
    
    public static int [] removeOdd (int [] input){
        
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        for(int i=0; i<input.length; i++){
            
            if(input[i]%2==0){
                
                x.add(input[i]);
            }
        }
        
        int[] y = new int[x.size()];
        
        for(int i=0; i<x.size(); i++){
            
            y[i] = x.get(i);
        }
        
        return y;
    }
    
    public static void main(String [] args){
        
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        
        for (int i = 0; i < mixedArray.length; i++) {
            
            System.out.print(mixedArray[i] + " ");
        }
        
        System.out.println();
        
        int [] noOdd = removeOdd(mixedArray);
        
        for (int i = 0; i < noOdd.length; i++) {
            
            System.out.print(noOdd[i] + " ");
        }    
    }
}