package com.farmacia.boleta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.farmacia.entidad.Boleta;
import com.farmacia.entidad.Cliente;
import com.farmacia.entidad.DetalleBoleta;
import com.farmacia.entidad.DetalleBoletaPK;
import com.farmacia.entidad.Empleado;
import com.farmacia.modelo.ModeloBoleta;

public class RegistraBoletaVenta {

	public static void main(String[] args) {
		// Declarar objetos para la boleta
		Boleta bol = new Boleta();

		Cliente cli = new Cliente();
		cli.setCodCliente(2);
		bol.setClienteBoleta(cli);

		Empleado emp = new Empleado();
		emp.setCodEmpleado(2);

		bol.setEmpleadoBoleta(emp);
		bol.setFechaEmision(new Date());
		bol.setMontoBoleta(500);

		// Enviamos los datos al detalle
		List<DetalleBoleta> listarDatos = new ArrayList<DetalleBoleta>();

		DetalleBoleta detabol = new DetalleBoleta();
		DetalleBoletaPK detabolPK = new DetalleBoletaPK();

		// Enviando los datos
		detabol.setCantidad(10); // Cantidad del medicamento
		detabol.setPrecio(13.0); // Precio del medicamento
		detabolPK.setCodMedicamento(4); // Medicamento

		// Enviando los datos del detalle
		detabol.setPk(detabolPK);

		// Agregando los datos a la colección
		listarDatos.add(detabol);
		bol.setListadetalleBoleta(listarDatos);

		// llamando al modelo
		new ModeloBoleta().RegistraBoletaVenta(bol);
		System.out.println("Registrado correctamente");

	}

}
