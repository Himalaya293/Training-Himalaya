import java.util.Scanner;
class college{
void listofcollege(String cllge){
System.out.println("cllge is"+cllge);
}
void listofcollege(String cllge1,String cllge2){
System.out.println("cllge is"+cllge1+"and"+cllge2);
}
void listofcollege(String cllge1,String cllge2,String cllge3){
System.out.println("cllge is"+cllge1+"and"+cllge2+" "+cllge3);
}
}
class customer{
public static void main(String []args)
{
college cg=new college();
Scanner sc=new Scanner(System.in);
cg.listofcollege(sc.next());
}
}