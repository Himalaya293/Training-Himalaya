package assign9;

import java.util.Scanner;

public class maxarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {a[i]=sc.nextInt();}
		for(int i=0;i<a.length;i++) {
			if(a[i]>=max) {max=a[i];}}
		System.out.println(max);
	}

}
