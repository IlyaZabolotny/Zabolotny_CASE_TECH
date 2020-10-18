package cases;

public class Point {
    private double x;
    private double y;

    public Point(){
        this.x=0.0;
        this.y=0.0;
    }
    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }
    public Point(Point p){
        this.x=p.getX();
        this.y=p.getY();
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public Point subtract(Point p){
        return new Point(this.x-p.x,this.y-p.y);
    }
    public double dot(Point p){
        return p.x*x+p.y*y;
    }
}
