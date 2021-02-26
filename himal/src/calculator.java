
public class calculator
	{
	    double powerInt(int num1,int num2)
		{
			return Math.pow(num1,num2);
		}
	    double powerdouble(int num1,int num2)
		{
			return Math.pow(num1,num2);
		}
	}
class cal{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator q=new calculator();
		q.powerInt(2, 2);
		q.powerdouble(2,3);

	}

}
