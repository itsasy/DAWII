package com.farmacia.medicamento;

import java.text.SimpleDateFormat;
import com.farmacia.entidad.Laboratorio;
import com.farmacia.entidad.Medicamento;
import com.farmacia.modelo.ModeloMedicamento;


public class AdicionarMedicamento {

	public static void main(String[] args) {

		try {
			Laboratorio lab=new Laboratorio();
			lab.setCodLaboratorio(2);
			
			
			Medicamento me=new Medicamento();
			me.setNomMedicamento("Gentamicina");
			me.setStockMedicamento(100);
			me.setPreMedicamento(10.6);
			me.setFechaVencimiento(new SimpleDateFormat("yyyy-MM-dd").parse("2021-03-03"));
			me.setLaboratorio(lab);

			new ModeloMedicamento().AdicionarMedicamento(me);
			System.out.println("Registrado correctamente");

				} catch (Exception e) {
					e.printStackTrace();
				}


	}

}
