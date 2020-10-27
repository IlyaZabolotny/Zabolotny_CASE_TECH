package cases;
import java.awt.*;
import javax.swing.*;


public class RayCircleIntersection extends JPanel{
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
        int pointSize=6;

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
        //Ввод координат произвольной точки
        double O1x=250;
        double O1y=250;
        Point O1=new Point(O1x,O1y);
        g.fillOval( Ox+(int) intercection.rayCircleInter(O,O1,C).getX()-pointSize/2,
                        Oy-(int) intercection.rayCircleInter(O,O1,C).getY()-pointSize/2,
                        pointSize,pointSize);
        double lengthOO1=Math.sqrt(O1.getX()*O1.getX()+O1.getY()*O1.getY());
        double cosPhi=O1.getX()/lengthOO1;
        double sinPhi=O1.getY()/lengthOO1;
        Point A1 = new Point(O1.getX()+cosPhi,O1.getY()+sinPhi+100*Math.sqrt(3)/3*cosPhi);
        g.fillOval( Ox+(int) intercection.rayCircleInter(O,A1,C).getX()-pointSize/2,
                Oy-(int) intercection.rayCircleInter(O,A1,C).getY()-pointSize/2,
                pointSize,pointSize);
        Point A2 = new Point(O1.getX()+cosPhi,O1.getY()-sinPhi-100*Math.sqrt(3)/3*cosPhi);
        g.fillOval( Ox+(int) intercection.rayCircleInter(O,A1,C).getX()-pointSize/2,
                Oy-(int) intercection.rayCircleInter(O,A1,C).getY()-pointSize/2,
                pointSize,pointSize);
        g.fillOval( Ox+(int) intercection.rayCircleInter(O,A2,C).getX()-pointSize/2,
                Oy-(int) intercection.rayCircleInter(O,A2,C).getY()-pointSize/2,
                pointSize,pointSize);
        double A2y=(int) A2.getY();
        double A1y=(int) A1.getY();
        if (A2y<A1y){
            while (A2y<A1.getY()){
                Point A3 = new Point(A1.getX(),A2y);
                if (A3.getX()!=0 && A3.getY()!=0){
                    g.fillOval( Ox+(int) intercection.rayCircleInter(O,A3,C).getX()-pointSize/2,
                            Oy-(int) intercection.rayCircleInter(O,A3,C).getY()-pointSize/2,
                            pointSize,pointSize);
                }
                A2y++;
            }
        } else{
            while (A2y > A1.getY()) {
                Point A3 = new Point(A1.getX(), A2y);
                if (A3.getX()!=0 && A3.getY()!=0) {
                    g.fillOval(Ox + (int) intercection.rayCircleInter(O, A3, C).getX() - pointSize / 2,
                            Oy - (int) intercection.rayCircleInter(O, A3, C).getY() - pointSize / 2,
                            pointSize, pointSize);
                }
                A2y--;
                }
        }

//        int maxX=500;
//        int minX=100;
//        int maxY=500;
//        int minY=100;
//        for (int i=0; i<10;i++){
//            int Ax=(int)(Math.random()*((maxX-minX)+1))+minX;
//            int Ay=(int)(Math.random()*((maxY-minY)+1))+minY;
//            Point A=new Point(Ax,Ay);
//            if (intercection.rayCircleInter(O,A,C).getX()!=0 && intercection.rayCircleInter(O,A,C).getY()!=0){
//                g.fillOval( Ox+(int) intercection.rayCircleInter(O,A,C).getX()-pointSize/2,
//                        Oy-(int) intercection.rayCircleInter(O,A,C).getY()-pointSize/2,
//                        pointSize,pointSize);
//            }
//        }




    }

}
