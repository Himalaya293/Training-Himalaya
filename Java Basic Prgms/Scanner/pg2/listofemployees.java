import java.util.Scanner;
class listofemployees{
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
Scanner sc=new Scanner(System.in);
listofemployees emp=new listofemployees();
emp.name=sc.next();
emp.age=sc.nextInt();
emp.id=sc.nextInt();
emp.mobileno=sc.nextDouble();
emp.domain=sc.next();
emp.percentage=sc.nextFloat();
emp.salary=sc.nextInt();
emp.offname=sc.next();
emp.emailid=sc.next();
emp.offaddress=sc.next();

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
std.name=sc.next();
std.age=sc.nextInt();
//std.id=sc.nextInt();
std.mobileno=sc.nextDouble();
std.department=sc.next();
std.rollno=sc.next();
std.year=sc.nextInt();
std.section=sc.next().charAt(0);
std.percentage=sc.nextFloat();
//std.collegename=sc.next();
std.collegeaddress=sc.next();

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