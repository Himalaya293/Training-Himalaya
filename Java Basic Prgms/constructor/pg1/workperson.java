class workperson{
int empid;
String empname;
int salary;
workperson(int x,String y,int z){
empid=x;
empname=y;
salary=z;
}
void display(){
System.out.println("employee id="+empid);
System.out.println("employee name="+empname);
System.out.println("employee salary="+salary);
}
}
class constructor{
public static void main(String []args)
{
workperson hima=new workperson(113,"laya",60000);
hima.display();
workperson siri=new workperson(110,"siri",40000);
siri.display();
}
}