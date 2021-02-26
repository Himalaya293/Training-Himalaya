package assign11;

import java.util.Scanner;

public class nonduplicates {

	public static void main(String[] args) {
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
        int a[]=new int[n];
		for(int i=0;i<a.length;i++) 
		{a[i]=sc.nextInt();}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j]) 
				{c++;}
			}
			if(c==1)
			{System.out.println(a[i]);}
		}

	}

}
