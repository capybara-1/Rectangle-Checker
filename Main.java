import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, x2, y1, y2, l1, l2, w1, w2;
        System.out.println("Please enter the first rectangles X - coordinate");
        x1 = sc.nextInt();
        System.out.println("Please enter the first rectangles Y - coordinate");
        y1 = sc.nextInt();
        System.out.println("Please enter the first rectangles length");
        l1 = sc.nextInt();
        System.out.println("Please enter the first rectangles width");
        w1 = sc.nextInt();
        System.out.println("Please enter the second rectangles X - coordinate");
        x2 = sc.nextInt();
        System.out.println("Please enter the second rectangles Y - coordinate");
        y2 = sc.nextInt();
        System.out.println("Please enter the second rectangles Length");
        l2 = sc.nextInt();
        System.out.println("Please enter the second rectangles Width");
        w2 = sc.nextInt();
        OurRectangle r1 = new OurRectangle(x1,y1,w1,l1);
        OurRectangle r2 = new OurRectangle(x2,y2,w2,l2);
        System.out.println("Total Perimeter: " + OurRectangle.totalPerimeter(r1,r2));
        System.out.println("Intersection: " + OurRectangle.intersection(r1,r2));
        System.out.println("is r2 inside r1: " + r2.contains(r1));
        System.out.println("is r1 inside r2: " + r1.contains(r2));
        //System.out.println("toString Test: " + (r1.toString().equals("base: (1,2) w:8 h:6")? "Passed" : "Failed"));
        //System.out.println("Area Test: " + (r1.area()==48 ? "Passed" : "Failed"));
        //System.out.println("Perimeter Test: " + (r1.perimeter()==28 ? "Passed" : "Failed"));
        System.out.println(r1.toString());
        System.out.println(OurRectangle.intersection(r1,r2).toString());
        //System.out.println("Intersection Test: " + (OurRectangle.intersection(r1,r2).toString().equals("base: (6,4) w:3 h:3")?"Passed":"Failed"));
    }
}