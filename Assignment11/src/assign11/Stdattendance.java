package assign11;

import java.util.Scanner;

public class Stdattendance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of string");
		int c=0;
		int c1=0;
		char ch='A';
		char cp='L';
		boolean status1=true;
		boolean status=false;
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==ch) {c++;}
		else {c1++;}
		if(c>1||c1>2) {System.out.println(status);break;}
		else{System.out.println(status1);break;}
	}
	}
}
