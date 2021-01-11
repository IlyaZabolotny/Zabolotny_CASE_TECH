package cases;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class TestMain {
    public static void main(String[] args) {

        JFrame jf = new JFrame("RayCircleIntersection");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        RayCircleIntersection gui = new RayCircleIntersection();
        jf.add(gui);
        jf.setSize(1000,1000);
        jf.setVisible(true);
    }
}
