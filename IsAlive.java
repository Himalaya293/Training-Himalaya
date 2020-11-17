package motivity;

public class IsAlive {

	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());
		System.out.println(t.getName());
		t.setName("Himalaya");
		System.out.println(t.getName());
	}

}
