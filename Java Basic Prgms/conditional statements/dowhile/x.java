import java.util.*;
class x
{
public static void main(String []args)
{
   Scanner sc=new Scanner(System.in);
   int sum=0;
   int n=sc.nextInt();
   int i=0;
   while(i<=n)
   {
      sum=sum+i;
      i++;
    }
    System.out.print(sum);
}
}