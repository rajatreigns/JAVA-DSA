import java.util.*;
import java.io.*;
import java.util.Scanner;
public class PreciseDecimal{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    float a= sc.nextFloat();
    float b= sc.nextFloat();
    float ans =a/b;

    System.out.println(ans);
    System.out.format("%.3f", ans); // define %.3f

  }
}
