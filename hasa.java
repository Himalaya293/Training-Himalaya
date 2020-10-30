class hasa{
void m1(){
System.out.println("This is has-A relationship");
}
}
class a {
void m2(){
System.out.println("creating object without using extends");
hasa sq=new hasa();
sq.m1();
}
}
class b{
public static void main(String []args){
a s=new a();
s.m2();
}
}
