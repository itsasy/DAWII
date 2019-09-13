package com.farmacia.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.farmacia.entidad.Boleta;
import com.farmacia.entidad.DetalleBoleta;
import com.farmacia.entidad.DetalleBoletaPK;

public class ModeloBoleta {
	// primero comunicarnos con persistence
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("PE");

	// Método para registrar a la tabla boleta y su detalle

	public void RegistraBoletaVenta(Boleta objBol) {
		EntityManager em = fabrica.createEntityManager();

		try {
			// Primero registramos los datos a la tabla boleta
			em.getTransaction().begin();
			em.persist(objBol);
			// Fin del registro

			// Grabar el detalle
			for (DetalleBoleta db : objBol.getListadetalleBoleta()) {
				DetalleBoletaPK detaPK = new DetalleBoletaPK();

				// Obtener el número y código del medicamento
				detaPK.setNumBoleta(objBol.getNumBoleta());
				detaPK.setCodMedicamento(db.getPk().getCodMedicamento());
				// Enviar el número de boleta y código de medicamento al DetalleBoleta
				db.setPk(detaPK);
				em.persist(db);
			}
			// Fin del For para grabar el detalle

			em.getTransaction().commit(); // éxito
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			em.close();
			fabrica.close();
		}
	}
}
