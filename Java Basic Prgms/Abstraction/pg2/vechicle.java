abstract class vechicle{
abstract void cost();
void start(){
System.out.println("start with a key");
}
}
class bike extends vechicle{
void cost(){
System.out.println("BWM cost is 40 lakhs");
}
}
class abstraction{
public static void main(String []args){
vechicle x=new bike();
x.cost();
x.start();
x=new bike();
x.cost();
}
}
