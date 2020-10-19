package cases;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;


public class RayCircleIntersection extends JPanel{
    private ArrayList<Point> interPoints;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }
    public void draw(Graphics g){
        this.setBackground(Color.WHITE);
        //Размеры JPanel
        int w=getWidth();
        int h=getHeight();

        //Отрисовка осей координат
        g.drawLine(w/2,0,w/2,h);
        g.drawLine(0,h/2,w,h/2);

        int Ox=w/2;
        int Oy=h/2;
        int pointSize=10;

        g.fillOval(Ox-pointSize/2,Oy-pointSize/2,pointSize,pointSize);
        g.setColor(Color.RED);

        Point O=new Point(0.0,0.0);
        Point Center=new Point(100,0);
        Circle C=new Circle(Center,50);
        g.drawOval((int) Center.getX()+Ox-50,Oy-(int) Center.getY()-50,100,100);

        Intercection intercection = new Intercection();

        Point A=new Point(10,-4);
        g.fillOval( Ox+(int) intercection.rayCircleInter(O,A,C).getX()-pointSize/2,Oy-(int) intercection.rayCircleInter(O,A,C).getY()-pointSize/2,pointSize,pointSize);



    }

}
