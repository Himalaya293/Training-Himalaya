import java.util.Scanner;
class pyeerestuarant{
void takeorder(String order){
System.out.println("order given is"+order);
}
void takeorder(String order1,String order2){
System.out.println("order given is"+order1+"and"+order2);
}
void takeorder(String order1,String order2,String order3){
System.out.println("order given is"+order1+"and"+order2+" "+order3);
}
}
class customer{
public static void main(String []args)
{
pyeerestuarant res=new pyeerestuarant();
Scanner sc=new Scanner(System.in);
res.takeorder(sc.next());
}
}