import java.util.Scanner;

public class Point{
    public static void main(String[] args){
        
        Scanner ana = new Scanner(System.in);
        int oX = 0;
        int oY = 0;
        
        System.out.print("X: ");
        int x = ana.nextInt();
        System.out.print("Y: ");
        int y = ana.nextInt();
        
        double distance = Math.sqrt( Math.pow(x - oX, 2) + Math.pow(y - oY, 2));
        
        System.out.println("Distance from Origin(0, 0): " + distance);
    }
}