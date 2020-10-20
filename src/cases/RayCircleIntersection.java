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
        //Параметры экрана
        int Ox=w/2;
        int Oy=h/2;
        int pointSize=8;

        Point O=new Point(0.0,0.0);

        g.setColor(Color.BLUE);
        //Ввод параметров окружности
        double Cx = 250;
        double Cy = 250;
        int radius = 100;
        //Создание окружности
        Point Center=new Point(Cx,Cy);
        Circle C=new Circle(Center,radius);
        //Отрисовка окружности
        g.drawOval((int) Center.getX()+Ox-radius,Oy-(int) Center.getY()-radius,2*radius,2*radius);

        Intercection intercection = new Intercection();
        g.setColor(Color.RED);

        int maxX=500;
        int minX=100;
        int maxY=500;
        int minY=100;
        for (int i=0; i<10;i++){
            int Ax=(int)(Math.random()*((maxX-minX)+1))+minX;
            int Ay=(int)(Math.random()*((maxY-minY)+1))+minY;
            Point A=new Point(Ax,Ay);
            if (intercection.rayCircleInter(O,A,C).getX()!=0 && intercection.rayCircleInter(O,A,C).getY()!=0){
                g.fillOval( Ox+(int) intercection.rayCircleInter(O,A,C).getX()-pointSize/2,
                        Oy-(int) intercection.rayCircleInter(O,A,C).getY()-pointSize/2,
                        pointSize,pointSize);
            }
        }




    }

}
