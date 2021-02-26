package jdbcprgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class crtinsert {

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
	       st.executeUpdate("insert into emp values(1,'laya',40000)");
	       st.executeUpdate("insert into emp values(2,'geetha',10000)");
	       st.executeUpdate("insert into emp values(3,'sam',15000)");
	       st.executeUpdate("insert into emp values(4,'hima',40000)");
	       st.executeUpdate("insert into emp values(5,'samreen',30000)");
	       st.executeUpdate("insert into emp values(6,'hema',25000)");
	       st.executeUpdate("insert into emp values(7,'bindhu',35000)");
	       st.executeUpdate("insert into emp values(8,'srii',30000)");
	       //if(x2!=0) {{System.out.println("its processed");}}

	}

}
