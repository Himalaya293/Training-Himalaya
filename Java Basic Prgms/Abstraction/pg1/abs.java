abstract class abs{
abstract void cost();
abstract void millage();
void start(){
System.out.println("start with a key");
}
}
class audi extends abs{
void cost(){
System.out.println("Audi cost is 50 lakhs");
}
void millage(){
System.out.println("Audi millage is 10km");
}
}
class bwm extends abs{
void cost(){
System.out.println("BWM cost is 40 lakhs");
}
void millage(){
System.out.println("BWM millage is 10km");
}
}
class abstraction{
public static void main(String []args){
abs x=new audi();
x.cost();
x.millage();
x.start();
x=new bwm();
x.cost();
x.millage();
}
}
