/*
High Way Driving lab for APCS

Author Tad Pierski
Start date 11/14/22

End date 11/16/22

provides user with a terminal application interface to 
inform of the number of rest stops with varying numbers 
of available parking spots for cars and/or trucks.
User enters name of the interstate they are driving on
as well as the number of miles they are driving.
App calculates the number of rest stops they will cross,
and displays data about each rest stop.
*/

import java.util.*;
import java.text.DecimalFormat;
public class HighWayDriving{
  public static void main(String[] args){
    //variable assignments
    Scanner sc = new Scanner(System.in);DecimalFormat fmt = new DecimalFormat("0.00");int restStop,truckSpots,carSpot,ttlMiles,numStopsPassed;String iname;final int DISTBETWEEN = 50;Random choice = new Random();
    //user input
    System.out.println("Enter the name of the interstate you are traveling on: ");
    iname = sc.nextLine();

    System.out.println("Enter the ammount of miles you are driving: ");
    ttlMiles = sc.nextInt();

    //logic code
    /*
    do distance driving modulus distance between
    */
/*
    int test = ttlMiles / DISTBETWEEN;

    System.out.println(test);

//    int stopName = choice.nextInt(ttlMiles + 1);

    int ttlStops = ttlMiles / DISTBETWEEN;
    int count = 1;
    for (int i = 0; i < ttlStops; i++){
      int car,truck;
      car = choice.nextInt(100+1);
      truck = choice.nextInt(50+1);
      System.out.println("Stop " + count + " has " + car + " car spots and " + truck + " truck spots.");
        count ++;
    }
    

    
  } 
}*/
public class CalcMPG{
  private double cumulmiles(){
    
}