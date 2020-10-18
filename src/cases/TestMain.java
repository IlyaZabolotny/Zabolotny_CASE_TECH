package cases;

public class TestMain {
    public static void main(String[] args) {
        Point O=new Point(0.0,0.0);
        Point A=new Point(10.0,0.0);
        Point Center=new Point(10,0.0);
        Circle C=new Circle(Center,5.0);
        Intercection intercection=new Intercection();
        System.out.println(intercection.rayCircleInter(O,A,C).getX()+" "+intercection.rayCircleInter(O,A,C).getY());
    }
}
