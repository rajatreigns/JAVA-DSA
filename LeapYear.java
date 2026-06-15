//Find the leapyear in the years
import java.utiil.Scanner;
public class LeapYear{
  public static void main(String args[]{
    Scanner sc= new Scanner(System.in);
    int year= sc.nextInt();
    if(year%4==0 && 100 !=0){
      System.out.println("True");
    }
    else if (year %400==0){
      System.out.println("True");}
    else
    {System.out.println("False");}
  }}

//program for gfg Leap year
/*
public static void utility(int y){
    String isLeap = "False";// variables are getting reassigned

    //Your code below
    
    
    //Assign True or False to isLeap
    if(y % 4 == 0 && y % 100 != 0){
      isLeap = "True";
    }else if(y % 400 == 0){
      isLeap = "True";
    }else{
      isLeap = "False";
    }
    //Your code above
    //The line below prints the output
    System.out.println(isLeap);
}*/
