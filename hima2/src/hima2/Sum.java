package hima2;

public class Sum {


	public static void main(String[] args) {

		sum1 t=new sum1();
		System.out.println(t.m(1, 2));
		
	}

}
class sum1{
	int a;
	int b;
	int m(int c,int d) {
		int sum=c+d;
		System.out.print(sum);
		return c;
	}
}