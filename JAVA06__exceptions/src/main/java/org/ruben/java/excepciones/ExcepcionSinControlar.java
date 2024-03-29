package org.ruben.java.excepciones;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExcepcionSinControlar {

	private static String NUMERO = "123213";
	
	
	public static void main(String[] args) {
		
		
		ExcepcionSinControlar main = new ExcepcionSinControlar();
		main.tratarExcepcionesControladas(NUMERO);
		main.tratarExcepcionesNoControladas(NUMERO);
	}
	

	private void tratarExcepcionesControladas(String numero){
		try {
			this.parseExcepcionControlada(numero);
		} catch (ParseException e) {
			System.out.println("Error al convertir el String en int");
			e.printStackTrace(); 
		}
	}


	private void tratarExcepcionesNoControladas(String numero){
			this.parseExcepcionNoControlada(numero);
	}
	
	
	private void parseExcepcionNoControlada(String numero) {
		//lanza runtime excepcion unchecked runtime
		//cuando estamos seguros de lo que queremos parsear
		//por ejemplo una constante
		
		System.out.println(Integer.parseInt(numero));
	}
	
	private void parseExcepcionControlada(String numero) throws ParseException{	
		//lanza excepcion controlada compile
		//se usar cuando no estamos seguros de lo que queremos parsear
		//por ejemplo la entrada de un usuario
		NumberFormat nf = NumberFormat.getInstance();
		int num = (int) nf.parseObject(numero);
		System.out.println(num);
	}
	
	
}
