package com.farmacia.boleta;

import com.farmacia.entidad.Boleta;
import com.farmacia.entidad.Cliente;
import com.farmacia.entidad.Empleado;

public class RegistraBoletaVenta {

	public static void main(String[] args) {
		// Declarar objetos
		Boleta bol = new Boleta();
		Cliente cli = new Cliente();
		cli.setCodCliente(2);
		bol.setClienteBoleta(cli);
		Empleado emp = new Empleado();
		emp.setCodEmpleado(1);
		bol.setEmpleadoBoleta(emp);
	}

}
