package com.farmacia.laboratorio;

import com.farmacia.entidad.Laboratorio;
import com.farmacia.modelo.ModeloLaboratorio;

public class ActualizarLaboratorio {

	public static void main(String[] args) {
	Laboratorio lab=new Laboratorio();
	
	lab.setCodLaboratorio(9);
	lab.setDesLaboratorio("SANALAB");
	new ModeloLaboratorio().ActualizarLaboratorio(lab);
	System.out.println("Actualizado correctamete");
		
	}

}
