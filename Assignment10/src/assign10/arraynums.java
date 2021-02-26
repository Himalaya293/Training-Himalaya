package assign10;

import java.util.Arrays;
import java.util.Scanner;

public class arraynums {

	public static void main(String[] args) {
		int d=0,c = 0,i;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<a.length;i++) {a[i]=sc.nextInt();Arrays.sort(a);}
        for(i=0;i<n;i++) {
        	if(a[i]!=i) {c=i;d=i+1;}
        }
        System.out.println(c);
       }
	
}

