package cases;

public class Circle {
    private double xC;
    private double yC;
    private double radius;

    public Circle(double xC, double yC, double radius){
        this.xC=xC;
        this.yC=yC;
        this.radius=radius;
    }
    public double getxC(){
        return xC;
    }
    public double getyC(){
        return yC;
    }
    public double getRadius(){
        return radius;
    }
}
