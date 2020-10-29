import java.util.Scanner;
class scan{
String department;
int students;
int sections;
int feez;
String classteachername;
String collegename;
}
class variables{
public static void main(String []args)
{
scan cllg=new scan();
Scanner sc=new Scanner(System.in);
cllg.department=sc.next();
cllg.students=sc.nextInt();
cllg.sections=sc.nextInt();
cllg.feez=sc.nextInt();
cllg.classteachername=sc.next();
cllg.collegename=sc.next();
System.out.println("---------------------college Details-------------");
System.out.println("cllg.department="+cllg.department);
System.out.println("cllg.students="+cllg.students);
System.out.println("cllg.sections="+cllg.sections);
System.out.println("cllg.feez="+cllg.feez);
System.out.println("cllg.classteachername="+cllg.classteachername);
System.out.println("cllg.collegename="+cllg.collegename);
}
}