package com.farmacia.laboratorio;

import com.farmacia.entidad.Laboratorio;
import com.farmacia.modelo.ModeloLaboratorio;

public class AdicionarLaboratorio {

	public static void main(String[] args) {
		//Primero debemos invocar al objeto
		Laboratorio lab=new Laboratorio();
		lab.setDesLaboratorio("XXXXMEN");
		new ModeloLaboratorio().AdicionarLaboratorio(lab);
		System.out.println("Registrado correctamente");
		

	}

}
