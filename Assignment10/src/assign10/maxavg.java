package assign10;

import java.util.Arrays;
import java.util.Scanner;

public class maxavg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of k");
		int k=sc.nextInt();
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {a[i]=sc.nextInt();}
        float avg=0;
        for(int i=0;i<a.length-k+1;i++) {
        	float sum=0;
        	for(int j=i;j<(i+k);j++)
        		sum=sum+a[j];
        	if((sum/k)>avg)
        		avg=sum/k;
        }
        System.out.println(avg);
        sc.close();
	}
}
