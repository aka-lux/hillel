package com.hillel;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class ConfCall {

    public static void main(String[] args) {
        ConfMember rioMember = new ConfMember(DateTimeZone.forID("America/Sao_Paulo"),new LocalTime(8,0),new LocalTime(18,0));
        ConfMember kyivMember = new ConfMember(DateTimeZone.forID("America/Sao_Paulo"),new LocalTime(8,0),new LocalTime(18,0));
        ConfMember mumbaiMember = new ConfMember(DateTimeZone.forID("Asia/Kolkata"), new LocalTime(8,0),new LocalTime(18,0));

        for(int i = 0; i <= 47; i++){
            DateTime dt = new DateTime(2000,5,5, i/2,(i%2*30));
            System.out.print( dt.toString("HH:mm") + " " + rioMember.isWorkHour(dt) + " " + kyivMember.isWorkHour(dt) + " " + mumbaiMember.isWorkHour(dt));
            if(rioMember.isWorkHour(dt) && kyivMember.isWorkHour(dt) && mumbaiMember.isWorkHour(dt)){
                System.out.println(" Meeting time");
            } else System.out.println();
        }
    }


}
