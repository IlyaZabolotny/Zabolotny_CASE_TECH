package cases;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Point[] arrayInterPoints=new Point[10];
        Point O=new Point(0.0,0.0);
        System.out.println("Enter coordinates of the circle center: ");
        Scanner sc=new Scanner(System.in);
        double Cx=sc.nextDouble();
        double Cy=sc.nextByte();
        Point Center=new Point(Cx,Cy);
        System.out.println("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        Circle C=new Circle(Center,radius);
        Intercection intercection=new Intercection();
        for (int i=0;i<10;i++){
            System.out.println("Enter coordinates of the point: ");
            double Ax=sc.nextDouble();
            double Ay=sc.nextDouble();
            Point A=new Point(Ax,Ay);
            arrayInterPoints[i]=intercection.rayCircleInter(O,A,C);
        }
        System.out.println(arrayInterPoints);
    }
}
