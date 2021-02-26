package motivity;

public class join1 extends Thread {
	public void run() {
    	for(int i=0;i<=5;i++) {
    		try{Thread.sleep(5);}catch(InterruptedException e){System.out.println(e);}
    		System.out.println(i);
    	}
    }
	public static void main(String[] args) {
	  run1 r=new run1();
	  run1 r2=new run1();
	  r.start();
	  try {
		r.join(1500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	  r2.start();
	}

	}


