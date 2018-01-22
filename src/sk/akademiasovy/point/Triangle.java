package sk.akademiasovy.point;


public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getSideA(){
        return b.getDistanceFromOtherPoint(c);
    }

    public double getSideB(){
        return a.getDistanceFromOtherPoint(c);
    }

    public double getSideC(){
        return b.getDistanceFromOtherPoint(a);
    }

    public double getPerimeter(){
        return getSideA()+getSideB()+getSideC();
    }

    public double getArea(){
        double s=getPerimeter()/2;
        return Math.sqrt(s*(s-getSideA())*(s-getSideB())*(s-getSideC()));
    }




}
