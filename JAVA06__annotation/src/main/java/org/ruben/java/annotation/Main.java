package org.ruben.java.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.ruben.java.annotation.dominio.ImportantString;
import org.ruben.java.annotation.dominio.Persona;
import org.ruben.java.annotation.dominio.RunImmediately;
import org.ruben.java.annotation.dominio.VeryImportant;

public class Main {
	//https://docs.oracle.com/javase/tutorial/java/annotations/basics.html
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
		//anotacion para quitar warnings
		@SuppressWarnings("unused")
		Persona persona = new Persona("Ana",25);
		

		ejemploNotacionTipoSource();
		verAnotacionDeLaClase(persona);
		ejecutarMetodoRunImmediatelyVariasVeces(persona);

		
		for(Field field: persona.getClass().getDeclaredFields()) {
			if (field.isAnnotationPresent(ImportantString.class)) {
				Object object = field.get(persona);
				if (object instanceof String) {
					String stringObject = (String) object;
					System.out.println(stringObject);
				}
			}
		}
		

	}

	private static void ejemploNotacionTipoSource() {
		@SuppressWarnings("unused")
		Persona persona = new Persona("Ana",25);
	}

	private static void verAnotacionDeLaClase(Persona persona) {
		if (persona.getClass().isAnnotationPresent(VeryImportant.class)) {
			System.out.println("Esto es importante.");
		} else {
			System.out.println("Esto no es importante.");
		}
	}

	private static void ejecutarMetodoRunImmediatelyVariasVeces(Persona persona) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for(Method method: persona.getClass().getDeclaredMethods()) {
			if (method.isAnnotationPresent(RunImmediately.class)) {
				RunImmediately runImmediately = method.getAnnotation(RunImmediately.class);		
				for(int i = 0;i < runImmediately.veces();i++){
					method.invoke(persona);
				}
			}
		}	
	}
	
	
	
	
	
	
	
	

}
