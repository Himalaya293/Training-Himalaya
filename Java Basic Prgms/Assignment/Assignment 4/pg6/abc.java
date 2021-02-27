import java.util.*;
class abc
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int a,k;
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(" ");
    }
   a=65;
   for(int j=n;j>=i;j--)
    {
         char c=(char)a;
         System.out.print(c+" ");
         a++;
    } 
   k=65+n-i;
   for(int j=n;j>=i;j--)
    {
         char c1=(char)k;
         System.out.print(c1+" ");
         k--;
    } 
   System.out.println();
}
}
}
    