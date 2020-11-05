class trycc1{
public static void main(String []args)
{
int a=10,b=0,i;
String s="hima";
int c[]=new int[5];
System.out.println("Statement 1");
try{
c[10]=50;
i=Integer.parseInt(s);
System.out.println(c[10]);
System.out.println(i);
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
