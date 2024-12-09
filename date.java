package javacode;
import java.util.Date;
public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Date obj = new Date();
     System.out.println(obj);
	}

}

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
class Main{
    public static void main(String[] args){
        Date obj = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        System.out.print(sdf.format(obj));
    }
}
