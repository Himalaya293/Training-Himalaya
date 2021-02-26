package jdbcprgms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preupdate extends prestatementassign {
	
	public static Connection assignupdate(Connection con) throws SQLException, ClassNotFoundException {
Scanner sc=new Scanner(System.in);
	
	String option;
		do {
			String sql="update students set spayment=50000 where sid=3";
			PreparedStatement ps=con.prepareStatement(sql);
			
		int x=ps.executeUpdate();
		if(x==0) {
			System.out.println("Record updated");}
		System.out.println("Do You Want To Continue(y/n)?");
		option=sc.next();
		if(option.equalsIgnoreCase("n")) {System.out.print("enter the choice");int choice=sc.nextInt();
		if(choice==1) {preinsert.assigninsert(con);}
		if(choice==2) {predisplay.assigndisplay(con);}
		if(choice==3) {preupdate.assignupdate(con);}
		if(choice==4) {predelete.assigndelete(con);}
		if(choice>=5) {preexit.assignexit(con);}
		}
	}
	while(true);
}

}
