package assign10;

import java.util.Scanner;

public class uncommonstrings {

public static void main(String[] args) {
  try (Scanner sc = new Scanner(System.in)) {
	String s=sc.nextLine()+" "+sc.nextLine();
	  String sarr[]=s.split(" ");
	  for(int i=0;i<sarr.length;i++) {
		  boolean b=true;
		  for(int j=0;j<sarr.length;j++) {
			  if(sarr[i].equals(sarr[j]) && j!=1)
				  b=false;
		  }
		  if(b)
			  System.out.println(sarr[i]);
		  }
}
  }
}