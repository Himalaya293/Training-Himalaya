import java.util.*;
class pattern2
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int a=1;
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
   for(int j=1;j<=i;j++)
    {
       if(a==1)
        {
           System.out.print(a);
           a--;
         }
         else
         {
            System.out.print(a);
            a++;
         }
    }
   System.out.println();
}
}
}
    