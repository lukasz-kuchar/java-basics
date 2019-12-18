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

       /* int dayOffWeek = 5;
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
        System.out.println(schedule); */

       // playMusic();
       /* int score = rollDice();

        System.out.println("score: " + score); */
        //double score = absoluteValue(3);
        //System.out.println("score: " + score);

       // printTemperature(75);

       // int score = keepRolling();
       // System.out.println("score :" + score);

      //  int total = thePyramid(45);
       // System.out.println("number of blocks needed: " + total);

       /* String [] names = {"Adam", "Monika", "John"};
       String longestName = findLongestName(names);
       System.out.println(longestName); */

      // int total = factorial(1);
      //  System.out.println(total);

        String[] sentence = {"Learning", "Java", "is", "fun."};
        int indexOfWordJava = indexOfFirstOccurrence(sentence, "Java");
        System.out.println(indexOfWordJava);

    }


    static boolean playButton = true;

    public static void playMusic() {
        if (playButton) {
            System.out.println("music is playing");
        } else {
            System.out.println("music is not playing");
        }
    }

    public double makeChange(double itemCost, double dollarsProvided) {

        double change;
        change = dollarsProvided - itemCost;
        return change;
            }

    public static int rollDice() {

        double randomNumber = ((Math.random() * 6) + 1);

        int score = (int) randomNumber; // CASTING

        return score;
    }

    public static double absoluteValue(double argument){
        double output;
        if(argument < 0){
            output = argument*(-1);
        }
        else{
            output = argument;
        }
        return output;
    }

    public static String namTagText(String name){
        String tag;
        tag = "Hello, my name is " + name;
        return tag;
    }

    public static double fahrenheitToCelsius(double F){
    double C = ((F - 32)*5)/9;
    return C;
    }

    public static void printTemperature(double F){
        System.out.println("F: " + F);
        System.out.println("C: " + fahrenheitToCelsius(F));
    }

    public static int monopolyRoll(){
        int firstRoll = rollDice();
        int secondRoll = rollDice();
        if(firstRoll != secondRoll){
            return firstRoll + secondRoll;
        }
        else{
            return firstRoll + secondRoll + rollDice() + rollDice();
        }
    }

    public static int keepRolling() {
        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();
        int dice4 = rollDice();
        int dice5 = rollDice();
        int count = 1;
        while (!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)){
            dice1 = rollDice();
            dice2 = rollDice();
            dice3 = rollDice();
            dice4 = rollDice();
            dice5 = rollDice();
            count = count + 1;
        }
        return count;
    }

    public static int thePyramid(int levels){

        int total = 0;
        for(int i = 1; i <= levels; i++){
            total = total + i * i;
        }
        return total;
    }

    public static String findLongestName(String [] names){

        int size = names.length;

        String longestName = names[0];

        for(int i = 1; i < size; i++){

            if(names[i].length() > longestName.length()){

                longestName = names[i];
            }
        }
        return longestName;
    }

    public static int factorial(int n) {

        int total = 1;

        for(int i = 1; i <= n; i++){
            total = total * i;
        }
        return total;
    }

    public static int indexOfFirstOccurrence(String[] stringArray, String target)
    {
        int size = stringArray.length;
        String wantedString = target;
        int index = 0;
        for(int i = 0; i < size; i++){
            if(wantedString.equals(stringArray[i])){
                index = i;
                break;
            }
            else{
                index = -1;
            }
        }
return index;
    }

}