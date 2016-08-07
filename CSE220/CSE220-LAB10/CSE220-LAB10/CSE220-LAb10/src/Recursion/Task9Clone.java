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
public class Task9Clone {
    
    public static void main(String[] args){
        
        Node sixthNode = new Node(600, null);
        Node fifthNode = new Node(500, sixthNode);
        Node forthNode = new Node(400, fifthNode);
        Node thirdNode = new Node(300, forthNode);
        Node secondNode = new Node(200, thirdNode);
        Node firstNode = new Node(100, secondNode);

        System.out.println(reversePrintLinkedList(firstNode));
    }
    
    public static String reversePrintLinkedList(Node headNode){
        
//        System.err.println(headNode.val);
        
        if(headNode.next == null){
            
//            System.err.println(headNode.val);
            return headNode.val + " ";
        }else{
            
//            System.err.println(headNode.val);
            return reversePrintLinkedList(headNode.next) + " " + headNode.val;
        }
    }
}
