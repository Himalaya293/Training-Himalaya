package jdbcprgms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preinsert extends prestatementassign {

	public static Connection assigninsert(Connection con) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	
	int id;
	String name,section,department,payment,option;
		do {
			String sql="insert into Students values(?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);

		System.out.println("Enter Student Records");
		id=sc.nextInt();
		name=sc.next();
		section=sc.next();
		department=sc.next();
		payment=sc.next();
		//option=sc.next();
		
		ps.setInt(1,id);
		ps.setString(2,name );
		ps.setString(3,section);
		ps.setString(4,department);
		ps.setString(5,payment);
		int x=ps.executeUpdate();
		if(x==0) {
			System.out.println("Record inserted");}
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


