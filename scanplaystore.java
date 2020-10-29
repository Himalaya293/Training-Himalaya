import java.util.Scanner;
class scanplaystore{
void listofapps(){
System.out.println("1.templerun  2.ludo 3.paytm 4.phonepe");
}
void selectapp(String app){
System.out.println("selected app is="+app);
}
String appuses(){
return "its an gaming app which consist of 2 to 3 persons and an 3D animations";
}
int apppayment(int pay){
System.out.println("for 3 months need to pay= "+pay);
return 600;
}
}
class features{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
scanplaystore iphone=new scanplaystore();
iphone.listofapps();
iphone.selectapp(sc.next());
System.out.println(iphone.appuses());
System.out.println("for 6 months="+iphone.apppayment(sc.nextInt()));
}
}