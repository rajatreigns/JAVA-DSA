import java.util.Scanner;

public class GeometricProgression {
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int r= sc.nextInt();
    int n= sc.nextInt();
    int ans= a*(int)Math.pow(r, n-1);
    System.out.println(ans);


  }
  
}

//problem of finding nth term in geometric progression
