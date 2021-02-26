package assign9;

import java.util.Arrays;
import java.util.Scanner;

public class swapdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int temp;
		String d=" ";
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int j=0;
		int len=Integer.toString(n).length();
		int[] a=new int[len];
		while(n!=0)
		{
			a[len-j-1]=n%10;
			n=n/10;
			j++;
		}
		for(int i=0;i<a.length-1;i++) {
			temp=a[0];
			a[0]=a[1];
	        a[1]=temp;
		}
		d=Arrays.toString(a);
		System.out.println(d);
}
}
