interface vechicle{
void tyre();
void speed();
void start();
void imp();
}
abstract class bus implements vechicle{
public abstract void tyre();
public abstract void speed();
public void start(){System.out.println("this is abstracti ");}
}
class car extends bus{
public void tyre(){System.out.println("hello");}
public void speed(){System.out.println("hi");}
public void imp(){System.out.println("hehehe");}
}
class cycle implements vechicle{
public void tyre(){System.out.println("ello");}
public void speed(){System.out.println("hmmm");}
public void start(){System.out.println("eee");}
public void imp(){System.out.println("hehhhhh");}
}
class lorry{
public static void main(String []args){
vechicle x=new car();
x.tyre();
x.speed();
x.start();
x.imp();
x=new cycle();
x.tyre();
x.speed();
x.start();
}
}
