abstract class person{
abstract void eat();
}
class nested{
  public static void main(String []args)
    {
        person rahul=new person(){
             void eat(){System.out.println("eating ");}
        };
System.out.println(rahul);
rahul.eat();
   }
}