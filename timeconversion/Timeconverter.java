package timeconversion;

import java.util.Scanner;

public class Timeconverter {
    int hours,seconds,minutes;
    int input;
    Scanner sc = new Scanner(System.in);

    public void secondstohours(){
        System.out.println("Enter the number of seconds");
        input = sc.nextInt();
        hours = (input/(60*60));
        minutes = ((input%(60*60)/60));
        seconds = ((input%(60*60))%60);
        System.out.println("Hours : "+hours);
        System.out.println("Minutes : "+minutes);
        System.out.println("seconds : "+seconds);
    }

    public void minutestohours() {
        System.out.println("Enter the number of minutes");
        minutes = sc.nextInt();
        hours = minutes/60;
        minutes = minutes%60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
    }

    public void hourstominutes(){
        System.out.println("Enter the number of hours");
        hours = sc.nextInt();
        minutes = hours*60;
        seconds = (minutes%60)*60;
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }

    public void hourstoseconds(){
        System.out.println("Enter the number of hours");
        hours =sc.nextInt();
        seconds =(hours*60*60);
        System.out.println("Seconds: " + seconds);
    }
}
