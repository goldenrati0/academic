/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularArray;

/**
 *
 * @author tahmid
 */
public class circularArrayTester {

    public static void main(String[] args) {

        Object[] linear = {10, 20, 30, 40, null};

        System.out.println("\n///// TEST 01 /////");
        circularArrayImplementation c = new circularArrayImplementation(linear, 2, 4);
        c.printFullLinear(); // This Should Print: 40, null, 10, 20, 30.
        c.printForward();  // This Should Print: 10, 20, 30, 40.
        c.printBackward(); // This Should Print: 40, 30, 20, 10.

        System.out.println("\n///// TEST 02 /////");
        c.linearize();
        c.printFullLinear(); // This Should Print: 10, 20, 30, 40.

        System.out.println("\n///// TEST 03 /////");
        Object[] linear2 = {10, 20, 30, 40, 50};
        circularArrayImplementation c2 = new circularArrayImplementation(linear2, 2, 5);
        c2.printFullLinear(); // This Should Print: 40, 50, 10, 20, 30.
        c2.resizeStartUnchanged(8); // parameter--> new Capacity
        c2.printFullLinear(); // This Should Print: null, null, 10, 20, 30, 40, 50, null.

        System.out.println("\n///// TEST 04 /////");
        Object[] linear3 = {10, 20, 30, 40, 50};
        circularArrayImplementation c3 = new circularArrayImplementation(linear3, 2, 5);
        c3.printFullLinear(); // This Should Print: 40, 50, 10, 20, 30.
        c3.resizeByLinearize(8); // parameter--> new Capacity
        c3.printFullLinear(); // This Should Print: 10, 20, 30, 40, 50, null, null, null.

        System.out.println("\n///// TEST 05 /////");
        Object[] linear4 = {10, 20, 30, 40, 50};
        circularArrayImplementation c4 = new circularArrayImplementation(linear3, 2, 5);
        c4.printFullLinear(); // This Should Print: 40, 50, 10, 20, 30.
        c4.insertByRightShift(80, 2); //parameter--> elem, pos. pos --> position relative to start.
        // Valid range of pos--> 0 to size
        // Increase array length by 3 if size==cir.length
        // use resizeStartUnchanged() for resizing.
        c4.printFullLinear(); // This Should Print: null, null, 10, 20, 80, 30, 40, 50.

        System.out.println("\n///// TEST 06 /////");
        c4.insertByLeftShift(90, 2); //parameter--> elem, pos. pos --> position relative to start.
        // Valid range of pos--> 0 to size
        // Increase array length by 3 if size==cir.length
        // use resizeStartUnchanged() for resizing.
        c4.printFullLinear(); // This Should Print: null, 10, 20, 80, 90, 30, 40, 50.
        c4.printForward(); // This Should Print: 10, 20, 80, 90, 30, 40, 50.
//        c4.printFullLinear();

        System.out.println("\n///// TEST 07 /////");
        Object[] linear5 = {10, 20, 30, 40, 50, null, null};
        circularArrayImplementation c5 = new circularArrayImplementation(linear5, 3, 5);
        c5.printFullLinear(); // This Should Print: 50, null, null, 10, 20, 30, 40.

        c5.removeByLeftShift(3); //parameter--> pos. pos --> position relative to start.
        // Valid range of pos--> 0 to size-1

        c5.printFullLinear(); // This Should Print: null, null, null, 10, 20, 30, 50.  

        System.out.println("\n///// TEST 08 /////");
        Object[] linear6 = {10, 20, 30, 40, 50, null, null};
        circularArrayImplementation c6 = new circularArrayImplementation(linear5, 3, 5);
        c6.printFullLinear(); // This Should Print: 50, null, null, 10, 20, 30, 40.

        c6.removeByRightShift(3); //parameter--> pos. pos --> position relative to start.
        // Valid range of pos--> 0 to size-1

        c6.printFullLinear(); // This Should Print: 50, null, null, null, 10, 20, 30.   
        c6.printForward();   // This Should Print: 10, 20, 30, 50.   

    }
}