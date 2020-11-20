package motivity;

public class threadpriority extends Thread {
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		  
		  }   
	
	public static void main(String[] args) {
		threadpriority p=new threadpriority();
		threadpriority p1=new threadpriority();
		p.setPriority(Thread.MIN_PRIORITY);  
	    p1.setPriority(Thread.MAX_PRIORITY);  
	    p.start();
	    p1.start();
		

	}

}
