/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author 15101052
 */
public class Task3 {
    public static void main(String[] args) {
        
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println(binarySearch(x, 0, 9, 8));
    }
    
    public static int binarySearch(int[] ar, int start, int end, int target){
        
        int index = 0;
        
        if(start>end){
            return -1;
        }else{
            
            int midIndex = (start+end)/2;
            if(ar[midIndex] == target){
                index = midIndex;
                
                return index;
            }else{
                
                if(ar[midIndex] > target){
                    end = midIndex - 1;
                }else if(ar[midIndex] < target){
                    start = midIndex + 1;
                }
                
                return binarySearch(ar, start, end, target);
            }
            
        }
        
    }
    
}
