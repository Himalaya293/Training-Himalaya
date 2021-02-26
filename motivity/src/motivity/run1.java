package motivity;

public class run1 extends Thread{
        public void run() {
        	for(int i=0;i<=5;i++) {
        		try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
        		System.out.println(i);
        	}
        }
	public static void main(String[] args) {
	  run1 r=new run1();
	  run1 r2=new run1();
	  //r.run();
	  //r2.run();
	  r.start();
	  r2.start();
	}

}
