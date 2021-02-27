class car{
void cost(){
System.out.println("No cost");
}
void millage(){
System.out.println("No millage");
}
}
class audi extends car{
void cost(){
System.out.println("Audi cost is 50 lakhs");
}
void millage(){
System.out.println("Audi millage is 10km");
}
}
class bwm extends car{
void cost(){
System.out.println("BWM cost is 40 lakhs");
}
void millage(){
System.out.println("BWM millage is 10km");
}
}
class methodoverriding{
public static void main(String []args){
car x=new car();
x.cost();
x.millage();
x=new audi();
x.cost();
x.millage();
x=new bwm();
x.cost();
x.millage();
}
}
