package com.generation;

import java.util.Iterator;

class MiHilo extends Thread{
	
	public MiHilo(String nombreHIlo) {
		super(nombreHIlo);
	}
	
	@Override
	
	public void run(){
		try {
			for (int i = 0; i<10; i++) {
				Thread.sleep(1000);
				System.out.println("valor de i " + i + " " 
			+ super.getName()+ "con id " +  super.getId());}
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		
	}	
}

public class ThreadWithExtend {
	
public static void main(String[] args) {
	
	MiHilo hilo1= new MiHilo("primero");
	MiHilo hilo2= new MiHilo("segundo");
	MiHilo hilo3= new MiHilo("tercero");
	
	hilo1.start();
	hilo2.start();
	hilo3.start();
	
		/*
		for (int i = 0; i<10; i++) 
			System.out.println("valor de i " + i);
		
		
		for (int j = 0; j<10; j++) 
			System.out.println("valor de i " + j);
		
		
		for (int k = 0; k<10;k++) 
			System.out.println("valor de i " + k);
		*/
		
	}
	

}