package com.farmacia.medicamento;
import com.farmacia.entidad.Medicamento;
import com.farmacia.modelo.ModeloMedicamento;

public class BuscarMedicamento {

	public static void main(String[] args) {
		
		Medicamento med=new ModeloMedicamento().BuscarMedicamento(6);
		System.out.println("Codigo........:"+med.getCodMedicamento());
		System.out.println("Nombre........:"+med.getNomMedicamento());
		System.out.println("Laboratorio...:"+med.getLaboratorio().getDesLaboratorio());
		System.out.println("Stock.........:"+med.getStockMedicamento());
		System.out.println("Precio........:"+med.getPreMedicamento());
		System.out.println("FVencimiento..:"+med.getFechaVencimiento());


	}

}
