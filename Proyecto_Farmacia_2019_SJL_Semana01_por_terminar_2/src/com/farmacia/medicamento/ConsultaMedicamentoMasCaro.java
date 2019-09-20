package com.farmacia.medicamento;

import com.farmacia.entidad.Medicamento;
import com.farmacia.modelo.ModeloMedicamento;

public class ConsultaMedicamentoMasCaro {

	public static void main(String[] args) {
		Medicamento m = new ModeloMedicamento().ListaMedicamentoMasCaro();
		System.out.println(m.getCodMedicamento() + "-" + m.getNomMedicamento());
	}

}
