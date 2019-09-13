package com.farmacia.medicamento;

import java.util.List;

import com.farmacia.entidad.Medicamento;
import com.farmacia.modelo.ModeloMedicamento;

public class ListadoMedicamentosxRangoStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Medicamento> lista = new ModeloMedicamento().ListadoMedicamentoxRangoStock(30, 80 );

		// Recuperar los datos e igualar la lista a m
		for (Medicamento m : lista) {
			System.out.println("C�digo: " + m.getCodMedicamento() + " - Nombre: " + m.getNomMedicamento()
					+ " - Precio: " + m.getStockMedicamento() + "- Laboratorio: " + m.getLaboratorio());
		}

	}

}
