package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class preparedstatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=preparedstatementimp.conectivity();
		String sql="insert into Students values(?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
			
		int id;
		String name,section,department,payment,option;
		do {
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
			if(option.equalsIgnoreCase("n")) {break;}
		}
		while(true);
		con.close();
		}

	}
