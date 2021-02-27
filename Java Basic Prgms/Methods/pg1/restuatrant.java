class restuatrant{
void menu(){
System.out.println("1.idly 2.doosa 3.wada 4.poori");
}
void takeorder(String order){
System.out.println("customer ordered="+order);
}
String servefood(){
return "wada";
}
int givenbill(){
return 421;
}
String payedbill(int amount){
System.out.println("customer payed ="+amount);
return "paid";
}
}
class customer{
public static void main(String []args)
{
restuatrant pyee=new restuatrant();
pyee.menu();
pyee.takeorder("3.wada");
System.out.println("served food is ="+pyee.servefood());
System.out.println("givenbill is is ="+pyee.givenbill());
System.out.println("customer payed="+pyee.payedbill(430));
}
}