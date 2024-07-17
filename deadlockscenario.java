package CODINGG;

public class deadlockscenario {
	private static final Object lock1 = new Object();
	private static final Object lock2 = new Object();
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(() -> {
			synchronized(lock1) {
				System.out.println(Thread.currentThread().getName() + " Alica in Room A");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			synchronized(lock2) {
				System.out.println("Alica in Romm B");
			}
		}
			
		});
		Thread thread2 = new Thread(() -> {
			synchronized(lock1) {
				System.out.println(Thread.currentThread().getName() + " Bob in Room B");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
			synchronized(lock2) {
				System.out.println("Bob in Romm A");
			}
			}
			
		});
		thread1.start();
		thread2.start();

	}

}
