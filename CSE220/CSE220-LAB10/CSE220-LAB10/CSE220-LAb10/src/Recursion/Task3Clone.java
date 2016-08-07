/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author tahmid
 */
public class Task3Clone {
    
    public static void main(String[] args){
        
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println(binarySearch(x, 0, 9, 8));
        
    }
    
    public static int binarySearch(int[] x, int start, int end, int target){
        
        if(start>end){
            return -1;
        }else{
            
            int midIndex = (start + end)/2;
            
            if(x[midIndex] == target)
                return midIndex;
            else{
                
                if(x[midIndex] < target){
                    
                    start = midIndex + 1;
//                    Task3Clone.binarySearch(x, start, end, target);
                }else if(x[midIndex] > target){
                    
                    end = midIndex - 1;
//                    Task3Clone.binarySearch(x, start, end, target);
                }
                
                return Task3Clone.binarySearch(x, start, end, target);
            }
        }
    }
    
}
