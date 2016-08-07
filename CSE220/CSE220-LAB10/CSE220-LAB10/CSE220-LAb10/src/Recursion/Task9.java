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
public class Task9 {
    
    static String reverseOrder = "";
    
    public static void main(String[] args) {
        
        Node sixthNode = new Node(60, null);
        Node fifthNode = new Node(50, sixthNode);
        Node forthNode = new Node(40, fifthNode);
        Node thirdNode = new Node(30, forthNode);
        Node secondNode = new Node(20, thirdNode);
        Node firstNode = new Node(10, secondNode);

        System.out.println(reversePrint(firstNode));
    }

    public static String reversePrint(Node firstNode) {


        if (firstNode.next == null) {
            return reverseOrder + firstNode.val + " ";
        } else {

            return reverseOrder + reversePrint(firstNode.next) + firstNode.val + " ";
        }
    }

}
