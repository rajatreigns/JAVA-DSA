//Find the greatest of three Number
import.java.util.Scanner;
public class GreatestNumber{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
  int A= sc.nextInt();
  int B=sc.nextInt();
  int C= sc.nextInt();

  if(A>=B && A>=C){
    System.out.println("A is the greatest");}
  else if (B>=A && B>=C)
  {
    System.out.println("B is the greatest");
  }
  else
  {
    System..out.println("C is the greatest");
  }

}
}
/*//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class Main {

    
// } Driver Code Ends
//User function Template for Java

public static int find_greatest_number(int a, int b, int c){
    // Write your code here..
    if (a>=b && a>=c)
    {
       return a;
      
    }
    else if(b>=a && b>=c)
    {
        return b;
 
        
    }
        else
        {
          return c;
        
        }
        
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            int c = scn.nextInt();
            int greatest_number = find_greatest_number(a,b,c);
            System.out.println(greatest_number);
        }
        scn.close();
    }
}
// } Driver Code Ends*/
