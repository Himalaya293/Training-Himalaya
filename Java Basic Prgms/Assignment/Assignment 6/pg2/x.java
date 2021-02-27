/*Input: 1->2->3->4->5->NULL, k = 2
Output: 4->5->1->2->3->NULL*/

import java.util.*;
class x
{
public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.print("enter k value");
     int k=sc.nextInt();
     System.out.print("enter n value");
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<a.length;i++)
     {
         a[i]=sc.nextInt();
     }
     for(int i=k;i<a.length;i++)
     {
         System.out.print(a[i]);
     } 
     if(n-k>0){
     for(int j=0;j<k;j++)
     {
         System.out.print(a[j]);
     }
     }
}
}