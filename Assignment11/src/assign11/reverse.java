package assign11;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=0,sum=0;
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
      System.out.println(sum);
	}

}
