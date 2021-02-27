class allexecpdemo{
public static void main(String []args)
{
int a=10,b=0,i;
String s=null;
int c[]=new int[5];	
System.out.println("Statement 1");
try{
System.out.println("length ="+s.length());
System.out.println("Division is ="+a/b);
System.out.println("Statement 2");
c[10]=50;
i=Integer.parseInt(s);
System.out.println(c[10]);
System.out.println(i);
}
catch(ArithmeticException ae){
System.out.println("Statement 3");
ae.printStackTrace();
System.out.println(ae.getMessage());
}
catch(NullPointerException ae){
System.out.println("Statement 3");
ae.printStackTrace();
System.out.println(ae.getMessage());
}
catch(NumberFormatException ae){
ae.printStackTrace();
System.out.println(ae.getMessage());
}
catch(ArrayIndexOutOfBoundsException ae){
System.out.println("Statement 3");
ae.printStackTrace();
System.out.println(ae.getMessage());
}
System.out.println("Statement 4");
System.out.println("Statement 5");
}
}
