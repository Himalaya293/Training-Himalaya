package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class crtcreate {

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
	       int x=st.executeUpdate("CREATE table emp(eid int(10),ename varchar(20),esalary int(50))");
           if(x!=0) {System.out.println("processed");}
	}

}
