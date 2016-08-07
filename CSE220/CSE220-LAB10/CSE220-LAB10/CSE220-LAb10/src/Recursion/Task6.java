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
public class Task6 {
    public static void main(String[] args) {
        
        System.out.println(pow(3, 2));
    }
    
    public static int pow(int base, int power){
        
        if(power == 0) return 1;
        else{
            
            return base * pow(base, power-1);
        }
    }
    
}
