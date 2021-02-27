class exedemo{
public static void main(String []args)
{
int a=10,b=0;
String s="hima";
System.out.println("Statement 1");
try{
System.out.println("Division is ="+a/b);
System.out.println("Statement 2");
}
catch(ArithmeticException ae){
System.out.println("Statement 3");
ae.printStackTrace();
System.out.println(ae.getMessage());
}
System.out.println("Statement 4");
System.out.println("Statement 5");
}
}
