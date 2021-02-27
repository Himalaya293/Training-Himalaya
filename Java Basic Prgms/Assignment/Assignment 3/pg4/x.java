import java.util.*;
class x
{
 public static void main(String []args)
  {
     //Scanner sc=new Scanner(System.in);
     String x="123";
     int y=Integer.parseInt(x);
     int c=0,a=y,d=0;
     int k=y;
     int r=0,r1=0,sum=0,sum1=0,c1=0,p=0,p1=0;
     for(int i=d;i>=d+d;i++)
     {
       int n=d;
       int temp=d;
        while(n!=0)
        {
           r=n%10;
           sum=sum*10+r;
           n=n/10;
           c++;
           System.out.print(sum+c);
         }
        if(temp==sum)
        {
             p=temp;
             break;
         }
     }
for(int i=1;i<=c;i++)
    {
      int n1=k;
      int temp1=k;
      while(n1!=0)
        {
           r1=n1%10;
           sum1=sum1*10+r;
           n1=n1/10;
           c1++;
         }
        if(temp1==sum1)
        {
             p1=temp1;
             break;
         }
     }
   if(c1<=c)
     {
         System.out.print(p1);
      }
       else
      {
         System.out.print(p);
       }
   }
}