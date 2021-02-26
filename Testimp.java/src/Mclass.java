
public class Mclass {
	
	void m1(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
}	
	class b extends Mclass{
	void m1(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		b b1=new b();
		b1.m1(1,2);
		Mclass c=new b();
		c.m1(1,2);
	}

}
