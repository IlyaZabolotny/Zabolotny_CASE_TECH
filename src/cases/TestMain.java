package cases;

public class TestMain {
    public static void main(String[] args) {
        Point O=new Point(12.0,13.0);
        Point A=new Point(100.0,30.0);
        //Circle C=new Circle(100,0,5.0);
        Intercection intercection=new Intercection();
        System.out.println(intercection.rayCircleInter(O,A).getX()+" "+intercection.rayCircleInter(O,A).getY());
    }
}
