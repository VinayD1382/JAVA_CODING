package CODINGG;

public  class multiplethreads extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Thread thread = new Thread(() -> {
			for(int i=0;i<15;i++) {
				if(i%2==0) {
					System.out.println(i + " ");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
   
    	Thread thread1 = new Thread(() -> {
			for(int i=0;i<15;i++) {
				if(i%2!=0) {
					System.out.print(i + " ");
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
    	thread.start();
    	thread1.start();
	}
	}
