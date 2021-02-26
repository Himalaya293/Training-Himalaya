package assign10;

import java.util.Arrays;
import java.util.Scanner;

public class kthletter {

	public static void main(String[] args) {
	  int s=0,i;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the value of k");
	  int k=sc.nextInt();
	  System.out.println("enter the value of n");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for( i=1;i<a.length;i++) {a[i]=sc.nextInt();}// Arrays.sort(a);}
	  int[] d=new int[n+k+1];
	  for( i=1;i<=a[a.length-1]+k;i++) {
		  int j=0;
		  for(j=0;j<a.length&&i!=a[j];j++);
		  if(j==a.length) {
			  d[s]=i;
			  s++;
		  }
	  }
	  System.out.print(d[k-1]);
	  
	}
}
	


