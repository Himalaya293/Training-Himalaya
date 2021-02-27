class college{
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
college cllg=new college();
cllg.department="ECE";
cllg.students=450;
cllg.sections=4;
cllg.feez=500000;
//cllg.classteachername="Hemalatha";
cllg.collegename="MRECW";
System.out.println("---------------------college Details-------------");
System.out.println("cllg.department="+cllg.department);
System.out.println("cllg.students="+cllg.students);
System.out.println("cllg.sections="+cllg.sections);
System.out.println("cllg.feez="+cllg.feez);
System.out.println("cllg.classteachername="+cllg.classteachername);
System.out.println("cllg.collegename="+cllg.collegename);
}
}