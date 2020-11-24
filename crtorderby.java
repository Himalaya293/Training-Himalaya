package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class crtorderby {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	       String url="jdbc:mysql://localhost:3307/JNIT";
	       String username="root";
	       String password="root";
	       
	       Connection con=DriverManager.getConnection(url,username,password);
	       System.out.println(con);
	       if(con!=null)
	       {System.out.println("connection.established");}
	       
	       Statement st=con.createStatement();
	       System.out.println(st);
	       ResultSet x=st.executeQuery("SELECT DISTINCT esalary FROM emp");

	}

}
