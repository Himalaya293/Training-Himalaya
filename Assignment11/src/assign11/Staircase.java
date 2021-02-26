package assign11;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the value of n");
	  int n=sc.nextInt();
	  int c=0,c1=0,k=0;
	  if(n<=3) {
		  System.out.println(3);
	  }
	  else {
	  k=(n-1)+(n-2);
      System.out.println(k);
	}

}
}
