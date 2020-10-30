class singlelevel{
void m1(){
System.out.println("This is used for squaring of two objects");
}
}
class sum extends singlelevel{
void m2(){
System.out.println("This is used for summation of two objects");
m1();
}
}
class division{
public static void main(String []args){
sum sq=new sum();
sq.m2();
}
}