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
public class Task2 {
    public static void main(String[] args){
        
        System.out.println(fibonacci(7)); // 0, 1, 1, 2, 3, 5, 8, 13
    }
    
    public static int fibonacci(int x){
        
        if(x == 0){
            return 0;
        }else if(x == 1){
            return 1;
        }else{
            
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }
    
}
