package assign9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class seri {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static Date emdate;
	//private static String emdepartment;
	//private static String emdesignation;
	//private static Double emtsalary;

	public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {
		
		Date dateofbirth=new SimpleDateFormat("MM/dd/yyyy").parse("12/16/1997");
		employee em=new employee("hima",dateofbirth,"Ece","developer",(double) 10000);
		FileOutputStream fout=new FileOutputStream("D:\\hima.txt");
        ObjectOutputStream out=new  ObjectOutputStream(fout);
		out.writeObject(em);
		out.close();
        
	FileInputStream fin=new FileInputStream("D:\\hima.txt");
    ObjectInputStream oin=new  ObjectInputStream(fin);
    em=(employee)oin.readObject();
    System.out.println(em.name+" "+em.dateofbirth+" "+em.department+" "+em.designation+" "+em.salary);
    oin.close();
 }
 
}
