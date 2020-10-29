class university{
void listofcolleges(){
System.out.println("1.MRECW  2.CBIT 3.TKR 4.INR");
}
void selectcollege(String college){
System.out.println("selected college is="+college);
}
String seatalloted(){
return "yes";
}
String branchname(String name){
System.out.println("branch name ="+name);
return "congrats";
}
}
class student{
public static void main(String []args)
{
university JNTUH=new university();
JNTUH.listofcolleges();
JNTUH.selectcollege("3.TKR");
System.out.println("is seat alloted ="+JNTUH.seatalloted());
System.out.println(JNTUH.branchname("ECE"));
}
}