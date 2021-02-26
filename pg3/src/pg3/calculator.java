package pg3;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     int j=0;
	     System.out.print("enter k value");
	     int k=sc.nextInt();
	     System.out.print("enter n value");
	     int n=sc.nextInt();
	     int a[]=new int[n];
	     for(int i=0;i<a.length;i++)
	     {
	         a[i]=sc.nextInt();
	     }
	     int b[]=new int[n];
	     for(int i=0;i<b.length;i++)
	     {
	         b[i]=a[i];
	     }
	     int d=n-k;
	     for(j=d+1;j<a[j];j++)
	     {
	         System.out.print(b[j]);
	     } 
	     for(j=0;j<=d;j++)
	     {
	         System.out.print(a[j]);
	     }
	}

}
