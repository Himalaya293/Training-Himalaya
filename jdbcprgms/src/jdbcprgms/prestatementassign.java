package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class prestatementassign {
 
	public static  Connection conectivity() throws ClassNotFoundException, SQLException {  
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	    String url="jdbc:mysql://localhost:3307/motivity";
	    String username="root";
	    String password="root";
	    
	    Connection con=DriverManager.getConnection(url,username,password);
	    System.out.println(con);
	    if(con!=null)
	    {System.out.println("connection.established");}
		return con;
	   }


		

	}


