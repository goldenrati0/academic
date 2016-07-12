/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author BUCC MSP
 */
public class Tester {
    
    public static void main(String[] args){
        
        ListStack as = new ListStack();
        
        try{
            
            System.err.println("push() 5 times");
            as.push(10);
            as.push(20);
            as.push(30);
            as.push(40);
            as.push(5120);
            
            System.err.println("size()");
            System.out.println(as.size());
            System.err.println("peek()");
            System.out.println(as.peek());
            
//            System.err.println("pop()");
            as.pop();
            as.pop();
            
            System.err.println("After poping 2 times");
            System.out.println(as.size());
            System.out.println(as.peek());
            
            as.push(40);
            as.push(5120);
            
            System.err.println("toString()");
            System.out.println(as);
            Object a[] = as.toArray();
            
            System.err.println("toArray()");
            System.out.print("Array: ");
            
            for(int i=0; i<a.length; i++){
                
                
                System.out.print(a[i] + " ");
            }
            System.out.println();
            
            System.err.println("search()");
            System.out.println(as.search(20));
            
        }catch(Exception e){
            
        }
    }
    
}
