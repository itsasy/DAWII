package com.farmacia.modelo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.farmacia.entidad.Laboratorio;
import com.farmacia.entidad.Medicamento;

public class ModeloMedicamento {

	//// declara un objeto para invocar la unidad de persistencia
	// que se encuentra en el archivo persistence.xml
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("PE");

	// CREANDO METODOS DE MANTENIMIENTO
	public void AdicionarMedicamento(Medicamento med) {
		EntityManager em = fabrica.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(med);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			em.close();
			fabrica.close();
		}
	}

	public void ActualizarMedicamento(Medicamento med) {
		EntityManager em = fabrica.createEntityManager();

		try {
			em.getTransaction().begin();
			em.merge(med);
			em.getTransaction().commit();

		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			em.close();
			fabrica.close();
		}
	}

	public void EliminarMedicamento(int codigo) {
		EntityManager em = fabrica.createEntityManager();
		try {
			Medicamento med = em.find(Medicamento.class, codigo);
			em.getTransaction().begin();
			em.remove(med);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			em.close();
			fabrica.close();
		}
	}

	public Medicamento BuscarMedicamento(int codigo) {
		EntityManager em = fabrica.createEntityManager();
		Medicamento med = null;
		try {
			med = em.find(Medicamento.class, codigo);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			fabrica.close();
		}
		return med;
	}

	// HQL => Trabajando con objetos

	// Realizando consultas

	// CASO 01
	// Listado MedicamentosxNombre
	public List<Medicamento> ListadoMedicamentosxNombre(String nom) {
		// Fabrica
		EntityManager em = fabrica.createEntityManager();
		// Listado de medicamentos
		List<Medicamento> listado = null;
		TypedQuery<Medicamento> result = null;
		try {
			// Recuperar la consulta desde MEDICAMENTO
			String hql = "select m from Medicamento m where m.nomMedicamento like concat(:param, '%')";

			// utlizar result, usando la variable hql de la consulta y la clase
			// medicamento
			result = em.createQuery(hql, Medicamento.class);
			result.setParameter("param", nom);
			// Guardando los datos en la lista
			listado = result.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			fabrica.close();
		}
		return listado;
	}

	// CASO 02 - RANGO DE STOCK
	public List<Medicamento> ListadoMedicamentoxRangoStock(int stk1, int stk2) {
		// Fabrica
		EntityManager em = fabrica.createEntityManager();
		// Listado de medicamentos
		List<Medicamento> listado = null;
		TypedQuery<Medicamento> result = null;
		try {
			// Recuperar la consulta desde MEDICAMENTO
			String hql = "select m from Medicamento m where m.stockMedicamento >=?1 and m.stockMedicamento<=?2";

			// utlizar result, usando la variable hql de la consulta y la clase
			// medicamento
			result = em.createQuery(hql, Medicamento.class);
			result.setParameter(1, stk1);
			result.setParameter(2, stk2);
			// Guardando los datos en la lista
			listado = result.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
			fabrica.close();
		}
		return listado;
	}

}
