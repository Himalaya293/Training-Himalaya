import java.util.*;
abstract class compartment{
abstract String notice();
}
class firstclass extends compartment{
String notice(){
 return "A";
}
}
class ladies extends compartment{
String notice(){return "B";}
}
class general extends compartment{
String notice(){return "C";}
}
class luggage extends compartment{
String notice(){return "D";}
}
class test{
public static void main(String []args)
{
compartment c1=new firstclass();
compartment c2=new ladies();
compartment c3=new general();
compartment c4=new luggage();
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
if(k==1)
{System.out.print(c1.notice());}
if(k==2)
{System.out.print(c2.notice());}
if(k==3)
{System.out.print(c3.notice());}
if(k==4)
{System.out.print(c4.notice());}
if(k>=5)
{System.out.println("Invalid");}
}
}