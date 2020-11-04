import java.util.*;
class pattern3
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int a=-1,b=1,sum=0;
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
   for(int j=0;j<i;j++)
    {
        sum=a+b;
        a=b;
        b=sum;
        System.out.print(sum);
    }
   System.out.println();
}
}
}
    