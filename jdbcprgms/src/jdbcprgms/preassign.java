package jdbcprgms;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.Scanner;

public class preassign {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=prestatementassign.conectivity();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the choice");
		
		int choice=sc.nextInt();
		if(choice==1) {preinsert.assigninsert(con);}
		else if(choice==2) {predisplay.assigndisplay(con);}
		else if(choice==3) {preupdate.assignupdate(con);}
		else if(choice==4) {predelete.assigndelete(con);}
		else if(choice>=5) {preexit.assignexit(con);}
		
		

}
}
