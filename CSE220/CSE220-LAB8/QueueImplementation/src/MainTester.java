
public class MainTester {

    public static void main(String[] args) {

        try {
        	
        	//ArrayQueue Checking
            System.err.println(" === Array Queue Check === \n");

            ArrayQueue aq = new ArrayQueue();
            
            System.out.println("isEmpty: " + aq.isEmpty());
            
//            System.out.println(aq.dequeue());
            
            System.err.println("enqueue() 5 times");
            aq.enqueue(10);
            aq.enqueue(20);
            aq.enqueue(30);
            aq.enqueue(40);
            aq.enqueue(50);
            
            System.out.println("isEmpty: " + aq.isEmpty());
            
            System.out.println(aq + " Size: " + aq.size());
            
            System.err.println("dequeue() 2 times");
            System.out.println(aq.dequeue());
            System.out.println(aq.dequeue());
            
            System.out.println(aq + " Size: " + aq.size());
            
            System.out.println("peek(): " + aq.peek());
            
            System.out.println("search(30): " + aq.search(30));
            System.out.println("search(40): " + aq.search(40));
            System.out.println("search(50): " + aq.search(50));
            
            Object[] x = aq.toArray();
            
            System.err.print("toArray() : ");
            
            for (Object val : x) {
                System.err.print(val + " ");
            }
            System.out.println();
            
            //ListQueue Checking
            
            System.err.println("\n\n\n\n === List Queue Check === \n");
            
            
            ListQueue lq = new ListQueue();
            
            System.out.println("isEmpty: " + lq.isEmpty());
            
//            System.out.println(aq.dequeue());
            
            System.err.println("enqueue() 5 times");
            lq.enqueue(10);
            lq.enqueue(20);
            lq.enqueue(30);
            lq.enqueue(40);
            lq.enqueue(50);
            
            System.out.println("isEmpty: " + lq.isEmpty());
            
            System.out.println(lq + " Size: " + lq.size());
            
            System.err.println("dequeue() 2 times");
            System.out.println(lq.dequeue());
            System.out.println(lq.dequeue());
            
            System.out.println(lq + " Size: " + lq.size());
            
            System.out.println("peek(): " + lq.peek());
            
            System.out.println("search(30): " + lq.search(30));
            System.out.println("search(40): " + lq.search(40));
            System.out.println("search(50): " + lq.search(50));
            
            Object[] y = lq.toArray();
            
            System.err.print("toArray() : ");
            
            for (Object val : y) {
                System.err.print(val + " ");
            }
            System.out.println();
            
        } catch (Exception e) {
            
            System.err.println("Caught Exception: " + e);
        }

    }

}