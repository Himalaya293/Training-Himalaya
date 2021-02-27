class multilevel{
void m1(){
System.out.println("This is multilevel inheritance using electronics");
}
}
class mi extends multilevel{
void m2(){
System.out.println("This is mi3pro");
m1();
}
}
class oneplus extends mi{
void m3(){
System.out.println("This is oneplus5pro");
m2();
}
}
class redmi{
public static void main(String []args){
oneplus sq=new oneplus();
sq.m3();
}
}