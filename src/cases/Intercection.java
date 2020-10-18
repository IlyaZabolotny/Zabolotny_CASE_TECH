package cases;

public class Intercection {
    public Point rayCircleInter(Point O, Point A, Circle C){
        Point D=A.subtract(O);
        Point OC=O.subtract(C.getCenter());

        double k1=D.dot(D);
        double k2=2*OC.dot(D);
        double k3=OC.dot(OC)-C.getRadius()*C.getRadius();
        double discriminant=k2*k2-4*k1*k3;

        if (discriminant==0){
            double t=-k2/(2*k1);
            return new Point(O.getX()+t*D.getX(),O.getY()+t*D.getY());
        } else if (discriminant>0){
            double t1=(-k2+Math.sqrt(discriminant))/(2*k1);
            double t2=(-k2-Math.sqrt(discriminant))/(2*k1);
            if (t1<t2 && t1>0){
                return new Point(O.getX()+t1*D.getX(),O.getY()+t1*D.getY());
            }
            if (t1>t2 && t2>0) {
                return new Point(O.getX()+t2*D.getX(),O.getY()+t2*D.getY());
            }
        } else {
            System.out.println("No intersection!");
        }
        return new Point();
    }
}
