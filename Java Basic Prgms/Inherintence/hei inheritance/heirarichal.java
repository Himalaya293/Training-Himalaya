class heirarichal{
void m1(){
System.out.println("This is heirarichal inheritance using cars");
}
}
class audi extends heirarichal{
void m2(){
System.out.println("This is audi costs 1 core");
}
}
class ferrari extends heirarichal{
void m3(){
System.out.println("This is ferrari costs 2 core");
m1();
}
}
class torch{
public static void main(String []args){
ferrari sq=new ferrari();
sq.m3();
}
}