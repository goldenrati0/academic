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
public class Task4 {
    
    public static void main(String[] args) {
        
        binary(10);
    }
    
    public static void binary(int x){
        
        if(x/2 != 0){
            binary(x/2);
        }
        
        System.out.print(x%2 + "");
    }
    
}
