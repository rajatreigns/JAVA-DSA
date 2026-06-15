//Solution for Sum of first N natural numbers by formula , we can also solve it with for loop by using the 
1. Via Sum of N natural numbers:
  
import java.util.Scanner;
public class NaturalNumbers {
  public static void main(String args[]){

    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int sum= sc.nextInt();
    int i=sc.nextInt();
    int ans= n*(n+1)/2;
    System.out.println(ans);
 

  }
}
1. Via For Loop and increment operator
  
import java.util.Scanner;
public class NaturalNumbers {
  public static void main(String args[]){

  Scanner sc= new Scanner(System.in);
  int n= sc.nextInt();
  int result=0;
  for(int i=1; i<=n; i++)
  result=result+i;
  System.out.println( result);

  }
}

