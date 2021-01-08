package com.himalaya;

import java.util.Scanner;


public class Studentlogic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the choice");
		
		int choice=sc.nextInt();
		if(choice==1) {Stdinsert.sinsert();}
		else if(choice==2) {Stddisplay.sdisplay();}
		else if(choice==3) {Stddelete.sdelete();}
		else if(choice>=4) {Exit.sexit();}

	}

}
