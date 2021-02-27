import java.util.*;
class pattern1
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int a=1,sum=1,d=1,fact=1,fact1=1;
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
   for(int j=1;j<=i;j++)
    {
             if(j>i-j)
             {
                j=i-j;
             }
             for (int k = 0; k < j; ++k) 
        { 
            sum= sum*(i - k); 
            sum=sum/ (k+ 1); 
        } 
             System.out.print(sum);
  } 
   System.out.println();
}
}
}
    