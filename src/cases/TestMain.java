package cases;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class TestMain {
    public static void main(String[] args) {

//        for (int i=0;i<10;i++){
//            System.out.println("Enter coordinates of the point: ");
//            double Ax=sc.nextDouble();
//            double Ay=sc.nextDouble();
//            Point A=new Point(Ax,Ay);
//            intercection.rayCircleInter(O,A,C);
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
