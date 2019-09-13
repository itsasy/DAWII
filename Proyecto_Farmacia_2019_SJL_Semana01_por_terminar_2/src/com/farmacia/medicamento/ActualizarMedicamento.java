package com.farmacia.medicamento;
import java.text.SimpleDateFormat;
import com.farmacia.entidad.Laboratorio;
import com.farmacia.entidad.Medicamento;
import com.farmacia.modelo.ModeloMedicamento;

public class ActualizarMedicamento {

	public static void main(String[] args) {
	
		try {
			Laboratorio lab=new Laboratorio();
			lab.setCodLaboratorio(2);
			Medicamento me=new Medicamento();
			
			me.setCodMedicamento(7);
			
			
			me.setNomMedicamento("Genta");
			me.setStockMedicamento(5);
			me.setPreMedicamento(10.0);
      me.setFechaVencimiento(new SimpleDateFormat("yyyy-MM-dd").parse("2020-01-01"));
			me.setLaboratorio(lab);
			new ModeloMedicamento().ActualizarMedicamento(me);
			System.out.println("Actualizado correctamente");
		} catch (Exception e) {
       e.printStackTrace();
		}
	
		
		
	}

}
