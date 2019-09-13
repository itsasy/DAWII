package com.farmacia.laboratorio;

import com.farmacia.entidad.Laboratorio;
import com.farmacia.modelo.ModeloLaboratorio;

public class BuscarLaboratorio {

	public static void main(String[] args) {

	Laboratorio lab=new ModeloLaboratorio().BuscarLaboratorio(15);
	System.out.println("Codigo......:"+lab.getCodLaboratorio());
	System.out.println("Nombre......."+lab.getDesLaboratorio());

	}

}
