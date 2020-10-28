class employee{
String name;
int age;
int id;
double mobileno;
String domain;
float percentage;
int salary;
String offname;
String emailid;
String offaddress;
}
class student{
String name;
int age;
int id;
double mobileno;
String department;
String rollno;
int year;
char section;
float percentage;
String collegename;
String collegeaddress;
}
class variables{
public static void main(String []args)
{
employee emp=new employee();
emp.name="geetha";
emp.age=40;
emp.id=112;
emp.mobileno=9567556678d;
emp.domain="developer";
emp.percentage=78.9f;
emp.salary=60000;
emp.offname="JNIT";
emp.emailid="geetha@gmail.com";
emp.offaddress="Hyderabad,madhapur";

System.out.println("---------------------Employee Details-------------");
System.out.println("emp.name="+emp.name);
System.out.println("emp.id="+emp.id);
System.out.println("emp.mobileno="+emp.mobileno);
System.out.println("emp.domain="+emp.domain);
System.out.println("emp.percentage="+emp.percentage);
System.out.println("emp.salary="+emp.salary);
System.out.println("emp.offname="+emp.offname);
System.out.println("emp.emailid="+emp.emailid);
System.out.println("emp.offaddress="+emp.offaddress);

student std=new student();
std.name="rahul";
std.age=50;
//std.id=156;
std.mobileno=9567556678d;
std.department="ECE";
std.rollno="14RH1A0494";
std.year=2;
std.section='B';
std.percentage=78.5f;
//std.collegename="MRECW";
std.collegeaddress="maisammaguda,dullapally";

System.out.println("---------------------Student Details-------------");
System.out.println("std.name="+std.name);
System.out.println("std.age="+std.age);
System.out.println("std.id="+std.id);
System.out.println("std.mobileno="+std.mobileno);
System.out.println("std.department="+std.department);
System.out.println("std.rollno="+std.rollno);
System.out.println("std.year="+std.year);
System.out.println("std.section="+std.section);
System.out.println("std.percentage="+std.percentage);
System.out.println("std.collegename="+std.collegename);
System.out.println("std.collegeaddress="+std.collegeaddress);
}
}