import java.util.* ;
import java.io.*; 
public class Rectangle {
    // Data members
    private int length;
    private int breadth;

    // Constructor to initialize the length and breadth
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Member function to calculate and return the area
    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Sample Input 1: 4 20
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Rectangle rectangle1 = new Rectangle(a, b);
        int area1 = rectangle1.getArea();
        System.out.println(area1); // Output: 80

    }
}
