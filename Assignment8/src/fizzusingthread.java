/*2) Implement a multithreaded version of FizzBuzz with four threads. The same instance of FizzBuzz will be passed to four different threads:
1.	Thread A will call fizz() to check for divisibility of 3 and outputs fizz.
2.	Thread B will call buzz() to check for divisibility of 5 and outputs buzz.
3.	Thread C will call fizzbuzz() to check for divisibility of 3 and 5 and outputs fizzbuzz.
4.	Thread D will call number() which should only output the numbers.*/

import java.util.*;
import java.util.Scanner;

class Test1 extends Thread {
	void fizz() {
		{System.out.println("fizz");}
	}
}
class Test2 extends Thread {
	void buzz() {
		{System.out.println("Buzz");}
	}
}
class Test3 extends Thread {
	void fizzbuzz() {
		{System.out.println("fizzBuzz");}
	}
}
class Test4 extends Thread {
	void number(int i)  {
		{System.out.println(i);}
	}
}
public class fizzusingthread {

	public static void main(String[] args) {
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		Test3 t3=new Test3();
		Test4 t4=new Test4();
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the value of n");
	     int n=sc.nextInt();
	     for(int i=0;i<=n;i++)
	        {
	             if(i%3!=0&i%5!=0){t4.number(i);}
	             if(i%3==0&i!=0&i!=n){t1.fizz();}
	             if(i%5==0&i!=0&i!=n) {t2.buzz();}
	             if(i%5==0&i%3==0&i!=0){t3.fizzbuzz();}
	             
	        }

	}

}
