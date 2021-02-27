class isa{
void m1(){
System.out.println("This is Is-A relationship");
}
}
class a extends isa{
void m2(){
System.out.println("This is audi costs 1 core");
m1();
}
}
class b{
public static void main(String []args){
a sq=new a();
sq.m2();
}
}