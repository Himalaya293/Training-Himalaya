abstract class abs{
abstract void start();
abs(){
System.out.println("start with a key");
}
}
class bwm extends abs{
void start(){
System.out.println("BWM cost is 40 lakhs");
}
}
class abstraction{
public static void main(String []args){
abs x=new bwm();
x.start();
}
}
