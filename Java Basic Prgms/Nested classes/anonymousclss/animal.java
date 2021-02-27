abstract class animal{
abstract void dog();
}
class nested{
public static void main(String []args)
{
animal ani=new animal(){
    void dog(){System.out.println("it barks");}
    };
System.out.println(ani);
ani.dog();
}
}
