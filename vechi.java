interface vechi{
void cost();
void millage();
}
abstract class car implements vechi{
public abstract void cost();
}
abstract class bike implements vechi{
public abstract void millage();
}
class audi extends car{
public void cost(){System.out.println("hello");}
public void millage(){System.out.println("hi");}
}
class bwm extends car{
public void cost(){System.out.println("ello");}
public void millage(){System.out.println("eee");}
}
class fz extends bike{
public void cost(){System.out.println("hehehe");}
public void millage(){System.out.println("iiiii");}
}
class apache extends bike{
public void cost(){System.out.println("hihihi");}
public void millage(){System.out.println("hmmm");}
}
class lorry{
public static void main(String []args){
vechi x=new audi();
x.cost();
x.millage();
x=new bwm();
x.cost();
x.millage();
x=new fz();
x.cost();
x.millage();
x=new apache();
x.cost();
x.millage();
}
}
