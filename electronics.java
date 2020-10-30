class electronics{
void cost(){
System.out.println("No cost");
}
void ram(){
System.out.println("No millage");
}
}
class mobile extends electronics{
void cost(){
System.out.println("Mobile cost is 50 lakhs");
}
void ram(){
System.out.println("mobile ram is 15Gb");
}
}
class lapi extends electronics{
void cost(){
System.out.println("lapi cost is 40 lakhs");
}
void ram(){
System.out.println("lapi millage is 20Gb");
}
}
class methodoverriding{
public static void main(String []args){
electronics x=new electronics();
x.cost();
x.ram();
x=new mobile();
x.cost();
x.ram();
x=new lapi();
x.cost();
x.ram();
}
}
