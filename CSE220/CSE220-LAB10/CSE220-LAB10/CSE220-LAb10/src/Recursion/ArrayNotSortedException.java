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
public class ArrayNotSortedException extends Exception {
    
    public ArrayNotSortedException(){
        
        super("Array is not sorted. Binary search not possible");
    }
    
}
