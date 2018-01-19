package sk.akademiasovy.point;

import java.util.Random;

public class Point implements Geometry {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
        //x=0;
        //y=0;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getQuadrant(){
        if(x>0 && y>0)
            return 1;
        else if(x<0 && y>0)
            return 2;
        else if(x>0 && y<0)
            return 3;
        else if(x<0 && y<0)
            return 4;
        else
            return 0;
    }

    @Override
    public void generateRandomCoord(){
        Random random = new Random();
        this.x=random.nextInt(41)-20;
        this.y=random.nextInt(41)-20;
    }

    @Override
    public double getDistance(){
        return Math.sqrt((x*x)+(y*y));
    }

    @Override
    public void print(){
        System.out.println("Point: ["+x+","+y+"] Q: "+getQuadrant()+ " Dist: "+getDistance());
    }

    public double getDistanceFromOtherPoint(Point other){
        return Math.sqrt(Math.pow(x-other.getX(),2)+Math.pow(y-other.getY(),2));
    }

    public void doAxialSymmetry(char type){
    if(type=='x' || type=='X'){
        y=y*-1;
    }
    else if(type=='y' || type=='Y'){
        x=x*-1;
    }
    }

    public void doCentralSymmetry() {
        x=x*-1;
        y=y*-1;
    }



}
