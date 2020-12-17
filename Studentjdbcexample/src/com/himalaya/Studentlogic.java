package com.himalaya;

import java.util.Scanner;


public class Studentlogic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the choice");
		
		int choice=sc.nextInt();
		//if(choice==1) {preinsert.assigninsert(con);}
		//else if(choice==2) {predisplay.assigndisplay(con);}
		 if(choice==3) {Stdupdate.supdate();}
		else if(choice==4) {Stddelete.sdelete();}
		else if(choice>=5) {Exit.sexit();}

	}

}
