/*) Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays
Example: Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.*/


import java.util.Arrays;

import java.util.*;
class arraysort
{
public static void main(String []args)
  {
     Scanner sc=new Scanner(System.in);
     int count=0,c1=0,sum=0;
     System.out.print("enter n value");
     int n=sc.nextInt();
     int a[]=new int[n];
     for(int i=0;i<a.length;i++)
     {
         a[i]=sc.nextInt();
     }
     System.out.print("enter k value");
     int k=sc.nextInt();
     int b[]=new int[k];
     for(int i=0;i<b.length;i++)
     {
         b[i]=sc.nextInt();
     }
     int m=n+k;
     int c[]=new int[m];
     for(int i=0;i<a.length;i++)  
     {c[i]=a[i];count++;}   
    for(int j=0;j<b.length;j++)  
     {c[count++]=b[j];}
  
    
            Arrays.sort(c);     
   for(int i=0;i<c.length;i++)  
     {
       System.out.print(c[i]+" ");
     }
               for(int i=0;i<c.length;i++)  
                 {
                     if(m%2==1){int d=m+1;System.out.println("median"+c[(d/2)-1]);break;}
                     if(m%2==0){int d=c[(m/2)-1]+c[m/2];System.out.print("median"+d/2);break;}
                 }
                 
   }
}