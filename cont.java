import java.util.*;
class cont
{
public static void main(String []args)
{
   Scanner sc=new Scanner(System.in);
   int sum=0,i;
   int n=sc.nextInt();
   for(i=1;i<=n;i++){  
        if(i==5){  
            continue;
        }  
        System.out.println(i);  
    }  
   
  System.out.print(sum);
}
}