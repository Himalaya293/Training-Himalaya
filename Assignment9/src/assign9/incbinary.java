package assign9;

import java.util.Scanner;

public class incbinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		String b[]=new String[n];
		int a[]=new int[n];
		int c[]=new int[n];
		int d[]=new int[n];
		for(int i=0;i<a.length;i++) {a[i]=sc.nextInt();}
		for(int i=0;i<a.length;i++) {
			b[i]=Integer.toBinaryString(a[i]);
			c[i]=Integer.parseInt(b[i]);
			System.out.print(c[i]+" ");
			int m=c[i];
			while(m>0) {
				m=m&(m-1);
				d[i]++;
			}System.out.print(d[i]);
		}
     for(int i=0;i<=a.length;i++) {
    	 int j;
    	 int k1=d[i];
    	 int k2=a[i];
    	 j=i-1;
    	 while(j>=0&&d[j]<k1)
    	 {
    		 d[j+1]=d[j];
    		 a[j+1]=a[j];
    		 j=j-1;
    	 }
    	 d[j+1]=k1;
    	 a[j+1]=k2;
    	 
     }
    for(int i=0;i<a.length;i++) {System.out.print(a[i]);}
}
}