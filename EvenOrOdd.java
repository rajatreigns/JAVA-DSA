//Problem given a number n, find the number if even or odd

import java.util.Scanner;
public class ifElse {
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    if(n%2==0){
      System.out.println("Even");

    }
    else{
      System.out.println("odd");
    }
  }
}
