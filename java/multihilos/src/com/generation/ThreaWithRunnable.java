package com.generation;


class MiHiloRunnable implements Runnable{
	
	private String name;
	
	public MiHiloRunnable(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {
		return Thread.currentThread().getId();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i<10; i++) {
				Thread.sleep(1000);
				System.out.println("valor de i " + i + " " 
			+ this.getName()+ "con id " +  this.getId());}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
	
}




public class ThreaWithRunnable {
	
public static void main(String[] args) {
	
	MiHiloRunnable myThread= new MiHiloRunnable("PrimerHilo");
	
	Thread hilo1= new Thread(myThread);
	Thread hilo2= new Thread(new MiHiloRunnable("segundohilo"));
	Thread hilo3= new Thread(new MiHiloRunnable("tercerhilo"));
	
	hilo1.start();
	hilo2.start();
	hilo3.start();
}

}
