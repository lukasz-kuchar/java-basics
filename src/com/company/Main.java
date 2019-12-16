package com.company;

public class Main {

    public static void main(String[] args) {
       /* System.out.println("Java Rocks!");
        System.out.println("second line");
        String imie = "lukasz";
       imie=  imie.toUpperCase();
        System.out.println(imie);

        boolean isCold = true;
        if(isCold)
        {
            System.out.printf("it is cold");
        } */

        /*int carSpeed = 110;
        int allowedSpeed = 90;

        if(carSpeed - allowedSpeed > 0) {


            if (carSpeed - allowedSpeed > 0 && carSpeed - allowedSpeed < 10) {
                System.out.println("dopuszczalny blad || brak mandatu");
            } else if (carSpeed - allowedSpeed >= 10 && carSpeed - allowedSpeed < 20) {
                System.out.printf("zakres od 10 do 20 || mandat 100zl");
            } else {
                System.out.printf("zakres 20+ || mandat 200zl");
            }

        }
        else {
            System.out.printf("jedziesz bezpiecznie");
        } */

        /* int time = 13;

        String timeOfDay;

        if(time >= 5 && time < 12) {
            timeOfDay = "morning";
        }
        else if(time >= 12 && time < 20) {
            timeOfDay = "daytime";
        }
        else {
            timeOfDay = "night";
        }
        System.out.printf(timeOfDay); */
        /* int weekday = 4;
        boolean holiday =true;

        if(holiday){
            System.out.println("Sleep in!");
        }
        else {
            if(weekday != 6 && weekday != 7){
                System.out.println("Wake up at 7:00");
            }
            else{
                System.out.println("Sleep in!");
            }
        } */

        int dayOffWeek = 1;
        String schedule;

        switch(dayOffWeek){
            case 1: schedule = "Gym in the morning";
                    break;
            case 2: schedule = "Class after work";
            break;
            case 3: schedule = "Meetings all day";
            break;
            case 4: schedule = "Work from home";
            break;
            case 5: schedule = "Game night after work";
            default: schedule = "Free!";
        }
        System.out.println(schedule);
        }
    }

