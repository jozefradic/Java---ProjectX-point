package sk.akademiasovy.point;

import sk.akademiasovy.date.MyDate;
import sk.akademiasovy.other.MyClass;

import java.util.Date;
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
        Object o1=new Point();
        Point p3=new Point3D(2,8,7);


        System.out.println(p3.getDistance());
        Point3D p33=(Point3D)p3;
        //Point3D p34=new Point();

        ((Point3D) p3).test();      //pretypovanie

        Geometry g1;
        g1=new Point(5,-9);
        ((Point)g1).print();



        Geometry[] arr=new Geometry[10];
        int i;
        for(i=0;i<10;i++){
            Point3D p=new Point3D();
            p.generateRandomCoord();
            arr[i]=p;
        }
        for(Geometry g:arr) {
            ((Point3D)g).print();
        }

        Point bod15=new Point(2,5);



        Line line1=new Line(bod15, new Point(10, 4));
        Line line2=new Line(1,3,4,6);

        System.out.println("Length of line1 is "+line1.getLength());
        line2.getMiddleOfLine().print();

        Triangle triangle1=new Triangle(new Point(3,3), new Point(4,7), new Point(5,3));
        Triangle triangle2=new Triangle(new Point(7,7), new Point(20,7), new Point(20,2));
        Triangle triangle3=new Triangle(new Point(0,0), new Point(0,1), new Point(2,1/2));


        System.out.println("Length of line1 is "+line1.getLength());
        System.out.println("Perimeter of Tria is "+triangle1.getPerimeter());
        System.out.println("Area of Tria is "+triangle1.getArea());
        System.out.println("Equilatera is :"+triangle1.isEquilateral());
        System.out.println("Isosacales is :"+triangle1.isIsosceles());
        System.out.println("Rectangular is :"+triangle1.isRectangular());

        System.out.println("Equilatera is :"+triangle2.isEquilateral());
        System.out.println("Isosacales is :"+triangle2.isIsosceles());
        System.out.println("Rectangular is :"+triangle2.isRectangular());

        System.out.println("Equilatera is :"+triangle3.isEquilateral());

        MyDate myDate1=new MyDate();
        myDate1.Today();
        myDate1.Today2();


        MyClass myClass1=new MyClass();
        System.out.println(myClass1.formatName("guNmAn"));

        MyClass myClass=new MyClass();
        System.out.println(myClass.isEmailValid("janko@hrasko"));

        MyClass myClass2=new MyClass();
        System.out.println(myClass.getGender("881814/8945"));

        MyClass myClass3=new MyClass();
        System.out.println(myClass.getGender("885614/8945"));

        MyClass myClass4=new MyClass();
        System.out.println(myClass.getGender("881814/894587"));




        //date1.today2();







    }


}
