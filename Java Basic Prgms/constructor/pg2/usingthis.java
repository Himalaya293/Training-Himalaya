class usingthis{
int empid;
String empname;
int salary;
usingthis(int empid,String empname,int salary){
this.empid=empid;
this.empname=empname;
this.salary=salary;
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
usingthis hima=new usingthis(113,"laya",60000);
hima.display();
usingthis siri=new usingthis(110,"siri",40000);
siri.display();
}
}