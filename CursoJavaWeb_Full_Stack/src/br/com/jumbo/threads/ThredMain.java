package br.com.jumbo.threads;

import java.lang.*;


public class ThredMain {
	public static void main(String[] args) throws Exception {
		
		new Thread(){
	
			public void run() {
			//Dentro vai o c�digo da rotina
				
				//C�digo da rotina rodando em paralelo 
				for(int pos = 0 ; pos <10; pos++) {
					
					
					//Executar com tempo de parada, ou tempo determinado;
					System.out.println("Executando rotinas, Email, exemplo");
					Thread.sleep(1000);
				}

			
			
		}.start();//liga a Thread que fica processando em paralelo
		
	
		
		//C�digo do usu�rio no fluxo de trabalho
		System.out.println("Codigo ");
		
		
	}


