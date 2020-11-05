class exceptiondemo{
public static void main(String []args)throws Exception{
int age=17;
if(age>=18)
System.out.print("eligible for voting");
else
throw new Exception("not eligible for working");
}
}
