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
public class Task1 {
    
    public static void main(String[] args){
        
        System.out.println(factorial(3));
    }
    
    public static int factorial(int x){
        
        if(x == 0){
            return 1;
        }else{
            
            return x * factorial(x-1);
        }
    }
    
}
