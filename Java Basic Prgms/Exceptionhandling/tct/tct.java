class tct{
public static void main(String []args)
{
int a=10,b=0;
String s=null;
System.out.println("Statement 1");
try{
      System.out.println("Division is ="+a/b);
}
catch(NullPointerException ae){
System.out.println("Statement 3");
ae.printStackTrace();
System.out.println(ae.getMessage());
     try{
            System.out.println("Division is ="+a/b);
        }
         catch(ArithmeticException ap){
         ae.printStackTrace();
         System.out.println(ap.getMessage());
        }
}
System.out.println("Statement 4");
System.out.println("Statement 5");
}
}
