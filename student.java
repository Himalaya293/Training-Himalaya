class student{
int id;
float percentage;
static String college;
}
class employee{
int id;
float percentage;
String company;
}
class variables{
public static void main(String []args)
{
student hema=new student();
hema.id=102;
hema.percentage=78.5f;
student.college="MRECW";
System.out.println("hema.id="+hema.id);
System.out.println("hema.percentage="+hema.id);
System.out.println("hema.college="+hema.college);
System.out.println("---------------------Employee Details-------------");
employee emp=new employee();
emp.id=118;
emp.percentage=78.5f;
emp.company="JNIT";
System.out.println("emp.id="+emp.id);
System.out.println("emp.percentage="+emp.id);
System.out.println("emp.company="+emp.company);
}
}