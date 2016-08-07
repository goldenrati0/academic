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
public class Task5 {
    
    private static int targetIndex = 0;
    
    public static void main(String[] args){
        
        Node sixthNode = new Node(60, null);
        Node fifthNode = new Node(50, sixthNode);
        Node forthNode = new Node(40, fifthNode);
        Node thirdNode = new Node(30, forthNode);
        Node secondNode = new Node(20, thirdNode);
        Node firstNode = new Node(10, secondNode);
        
//        System.out.println(Task5.searchOverLinkedList(firstNode, 10));
//        System.out.println(Task5.searchOverLinkedList(firstNode, 20));
//        System.out.println(Task5.searchOverLinkedList(firstNode, 30));
//        System.out.println(Task5.searchOverLinkedList(firstNode, 40));
//        System.out.println(Task5.searchOverLinkedList(firstNode, 50));
//        System.out.println(Task5.searchOverLinkedList(firstNode, 60));
//        
//        System.err.println(Task5.searchOverLinkedList(firstNode, 100));
//        System.err.println(Task5.searchOverLinkedList(firstNode, 1065));
//        System.err.println(Task5.searchOverLinkedList(firstNode, 10564));
//        System.err.println(Task5.searchOverLinkedList(firstNode, 10234));
//        
    }
    
    public static int searchOverLinkedList(Node headNode, Object target){
        
        if(headNode.val == target){
            
            return Task5.targetIndex;
        }
        
        if(headNode.next == null){
            
            return -1;
        }
        
        Task5.targetIndex += 1;
        Node temp = headNode.next;
        
        return Task5.searchOverLinkedList(temp, target);
    }
    
}
