package sk.akademiasovy.point;

import java.util.SimpleTimeZone;

public class Main {
    public static void  main(String[] args){
        Point p1=new Point(8,12);
        System.out.println("Point p1 is in "+p1.getQuadrant()+" quadrant");
        Point p2=new Point();
        p2.generateRandomCoord();
        System.out.println("Point p2 is in "+p2.getQuadrant()+" quadrant");
        p2.getDistance();
        p1.getDistance();
        System.out.println("Distance p1 is in "+p1.getDistance());
        System.out.println("Distance p2 is in "+p2.getDistance());
        p1.print();
        p2.print();

        // 3D
        Point3D p31=new Point3D(8,6,-7);
        Point3D p32=new Point3D();
        p32.generateRandomCoord();
        p31.print();
        p32.print();
        System.out.println("Distance between p31 and p32 is"+p31.getDistanceFromOtherPoint(p32));


    }


}
