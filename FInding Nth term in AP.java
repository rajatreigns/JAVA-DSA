public class NthAp{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in){
      int a= sc.nextInt();
      int d= sc.nextInt();
      int n=sc.nextInt();
      int ans= a+(n-1)*d;
      System.out.println(ans);
    }}
  //solution for findind nth term in Arithmetic Progression
