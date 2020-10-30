interface inte{
void cost();
}
class inter implements inte{
public void cost(){
System.out.println("Audi cost is 50 lakhs");
}
public static void main(String []args){
inter x=new inter();
x.cost();
}
}
