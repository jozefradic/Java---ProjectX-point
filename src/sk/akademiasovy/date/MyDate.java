package sk.akademiasovy.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public void Today(){
        Date date =new Date();
        System.out.println(date);
    }

    public void Today2(){
        Date date =new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-yyyy , HH:mm:ss , EEEE");
        System.out.println(sdf.format(date));
    }




}
