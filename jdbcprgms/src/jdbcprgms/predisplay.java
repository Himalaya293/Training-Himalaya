package jdbcprgms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class predisplay extends prestatementassign {
	public static boolean assigndisplay(Connection con) throws SQLException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the option1");
		int option1=sc.nextInt();
		String option;
			do {
				if(option1==1) {String sql="SELECT *FROM students";PreparedStatement ps=con.prepareStatement(sql);
				ps.executeQuery();}
				else if(option1>=2) {String sql="SELECT sid FROM students";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.executeQuery();}
			    
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
