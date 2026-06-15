import java.io.*;
import java.util.*;

public class Datatypes
{

    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      float b= sc.nextFloat();
      double c= sc.nextDouble();
      long l = sc.nextLong();
      byte d= sc.nextByte();

      double p= c/b;
      double q=b/a;
      double r= c/a;
      double m= r+l;
      int s=a/d;
      System.out.println( p +" "+ q+ " "+r+" "+m+""+s+" ");
    }
  }

//problem for manipulating data types
