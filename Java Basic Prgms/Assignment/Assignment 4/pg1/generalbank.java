abstract class generalbank{
abstract void getsavingsinterestrate();
abstract void getfixeddepositinterestrate();
}
class icicibank extends generalbank{
void getsavingsinterestrate(){System.out.println("Savings 4% ");}
void getfixeddepositinterestrate(){System.out.println("Fixed 8.5%");}
}
class kotambank extends generalbank{
void getsavingsinterestrate(){System.out.println("Savings 6% ");}
void getfixeddepositinterestrate(){System.out.println("Fixed 9%");}
}
class sm{
public static void main(String []args)
{
generalbank gb=new icicibank();
gb.getsavingsinterestrate();
gb.getfixeddepositinterestrate();
generalbank gl=new kotambank();
gl.getsavingsinterestrate();
gl.getfixeddepositinterestrate();
}
}