package org.ruben.java.record;

import org.ruben.java.record.dominio.EmpleadoBean;
import org.ruben.java.record.dominio.EmpleadoRecord;

public class Main {

	public static void main(String[] args) {
		EmpleadoBean eb = new EmpleadoBean("Maria",27);
		System.out.println(eb);
		System.out.println(eb.getNombre());
		
		EmpleadoRecord er = new EmpleadoRecord("Maria",27);
		System.out.println(er);
		System.out.println(er.nombre());
		
//		Salida:
//		Empleado [nombre=Maria, numero=27]
//		Maria
//		EmpleadoRecord[nombre=Maria, numero=27]
//		Maria
		
	}

}
