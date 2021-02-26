package assign9;

import java.util.Scanner;

public class closestdivisiors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int a[]=closest(num+1);
		int b[]=closest(num+2);
		if(a[1]-a[0]<b[1]-b[0])
		{
			 System.out.println(a[0]+" "+a[1]);
		}
		else
			System.out.println(b[0]+" "+b[1]);
		}
	static int[] closest(int n)
	{
		int a=(int)Math.sqrt(n);
		for(int i=0;i<a;i++)
		{
			if(n%(a-i)==0)
			{
			   int arr[]= {a-i,n/(a-i)};
			   return arr;
			}
		}
		return null;
	}
}


