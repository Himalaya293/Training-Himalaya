package blocks;

class a {
	static {
		System.out.print("This is static block");
	}
    a()
    {
       System.out.print("This is static block in constructor");
    }}
    class b{
    	static {
    		System.out.print("This is static block");
    	}
        b()
        {
           System.out.print("This is static block in constructor");
        }
    }
public class test {

	public static void main(String[] args) throws Exception {
		System.out.println("Static method");
	    //Class c=Class.forName(args[0]);
	    //System.out.println(c.getName());
	}

}
