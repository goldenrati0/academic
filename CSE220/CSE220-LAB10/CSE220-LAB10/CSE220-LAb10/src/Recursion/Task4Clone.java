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
public class Task4Clone {
    
    private static String binaryString = "";
    
    public static void main(String[] args){
        
        toBinary(12);
    }
    
    public static void toBinary(int num){
        
        if(num/2 != 0){
            
            toBinary(num/2);
        }
        
        System.out.print((num%2) + "");
    }
    
}
