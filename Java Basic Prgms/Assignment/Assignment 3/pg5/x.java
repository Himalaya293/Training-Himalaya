import java.util.*;
class x
{
   public static void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      String d;
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++)
      {
          a[i]=sc.nextInt();
       }
      for(int i=a.length-1;i>=0;i--)
      {
          d=String.valueOf(a[i]);
          System.out.print(a[i]);
       }
     }
}