package cases;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

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
        System.out.println("Enter coordinates of the point: ");
        double Ax=sc.nextDouble();
        double Ay=sc.nextDouble();
        Point A=new Point(Ax,Ay);
        System.out.println(intercection.rayCircleInter(O,A,C).getX()+" "+intercection.rayCircleInter(O,A,C).getY());
//        for (int i=0;i<10;i++){
//            System.out.println("Enter coordinates of the point: ");
//            double Ax=sc.nextDouble();
//            double Ay=sc.nextDouble();
//            Point A=new Point(Ax,Ay);
//            arrayInterPoints[i]=intercection.rayCircleInter(O,A,C);
//        }
//        System.out.println(arrayInterPoints);
        JFrame jf = new JFrame("RayCircleIntersection");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RayCircleIntersection gui = new RayCircleIntersection();
        jf.add(gui);
        jf.setSize(500,500);
        jf.setVisible(true);
    }
}
