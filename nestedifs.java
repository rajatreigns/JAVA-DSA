//Problem for nested if statement

import java.util.Scanner;
public class NestedIfs {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if (n>0) {
      System.out.println("The number is positive");
      if(n%2==0)
      {System.out.println("The number is positive even");}
      else
      {
        System.out.println("The number is positive odd");
      }
    }
    else if(n<0){
      System.out.println("The number is negative");
      if(n%2==0)
      {System.out.println("The number is negative even");}
      else
      {
        System.out.println("The number is negative odd");
      }
    }
    else{
      System.out.println("The number is Zero");
    }
    sc.close();
  }
  
  
}
