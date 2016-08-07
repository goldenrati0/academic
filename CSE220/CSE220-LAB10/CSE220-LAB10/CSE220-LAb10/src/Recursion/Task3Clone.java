/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Arrays;

/**
 *
 * @author tahmid
 */
public class Task3Clone {
    
    public static void main(String[] args){
        
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] y = {54, 657, 78, 456, 19, 9};
        
        try{
            System.out.println(binarySearch(x, 0, 9, 8));
            System.out.println(binarySearch(y, 0, 5, 19));
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static int binarySearch(int[] x, int start, int end, int target) throws ArrayNotSortedException {
        
        int[] temp = x.clone();
        Arrays.sort(temp);
        
        if(!Arrays.equals(x, temp)){
            throw new ArrayNotSortedException();
        }
        
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
