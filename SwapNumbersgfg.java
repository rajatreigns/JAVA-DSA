/*(Given two numbers a and b, you need to swap their values so a holds the value of b and b holds the value of a. Just write the code to swap values of a and b at the specified place. The input and output are done automatically.

Examples

Input: a = 1 b = 2
Output: 2 1
Explanation: Initially a = 1 and b = 2, now a = 2 and b = 1.
Input: a = 6 b = 7  
Output: 7 6 
Explanation: Initially a = 6 and b = 7, now a = 7 and b = 6. */

// This is being swapped not in main method

//GFG solution

class Solution
{
    public void utility(int a, int b){
        //code here
     
        int c=0;
        
        c=a;
        a=b;
        b=c;
        
        System.out.println(a+" "+b);
    }
}

//In realtime solution
import java.util.Scanner;
public class SwapNumbers {
  public static void main(String args[]){
    int c=0;
    Scanner sc= new Scanner(System.in);
    int a= sc.nextInt();
    int b=sc.nextInt();

    c=a;
    a=b;
    b=c;
    System.out.println(a+" "+b);


  }
  
}

