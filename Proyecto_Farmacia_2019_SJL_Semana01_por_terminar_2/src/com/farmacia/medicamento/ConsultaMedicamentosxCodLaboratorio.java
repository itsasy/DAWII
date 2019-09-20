package com.farmacia.medicamento;

import java.util.List;

import com.farmacia.entidad.Medicamento;
import com.farmacia.modelo.ModeloMedicamento;

public class ConsultaMedicamentosxCodLaboratorio {

	public static void main(String[] args) {
		List<Medicamento> lista = new ModeloMedicamento().ListadoMedicamentoxLaboratorio(1);
	
		for(Medicamento m :lista ){
			System.out.println("Código: " + m.getCodMedicamento() + " - Nombre: " + m.getNomMedicamento() + " - Precio: " + m.getPreMedicamento());
		}
	}

}
