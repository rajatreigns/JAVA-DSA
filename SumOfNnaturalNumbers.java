import java.util.Scanner;

public class NaturalNumbers {
  public static void main(String args[]){

    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    int ans= n*(n+1)/2;
    System.out.println(ans);

  }
}

//Solution for Sum of first N natural numbers by formula , we can also solve it with for loop by using the 
int sum(int n){
for (int i=1;i<=n;i++)
  result=result+i;
return result;
}
