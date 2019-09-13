package com.farmacia.medicamento;

import java.util.List;

import com.farmacia.entidad.Medicamento;
import com.farmacia.modelo.ModeloMedicamento;

public class ListadoMedicamentosxNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Medicamento> lista = new ModeloMedicamento().ListadoMedicamentosxNombre("a");

		// Recuperar los datos e igualar la lista a m
		for (Medicamento m : lista) {
			System.out.println("Código: " + m.getCodMedicamento() + " - Nombre: " + m.getNomMedicamento()
					+ " - Precio: " + m.getPreMedicamento() + "- Laboratorio: " + m.getLaboratorio());
		}

	}

}
