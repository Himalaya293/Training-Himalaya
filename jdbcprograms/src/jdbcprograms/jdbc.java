package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class jdbc {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
       String url="jdbc:mysql://localhost:3307/JNIT";
       String username="root";
       String password="root";
       Connection con=DriverManager.getConnection(url,username,password);
       if(con!=null)
       {System.out.println("connection.established");}
       Statement st=con.createStatement();
       int x=st.executeUpdate("insert int emp values(1,'hima',30,000)");
       if(x!=1) {{System.out.println("its processed");}}
       
	}

}
