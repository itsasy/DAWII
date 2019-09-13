package com.farmacia.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.farmacia.entidad.Laboratorio;
import com.farmacia.entidad.Medicamento;


public class ModeloMedicamento {

////declara un objeto para invocar la unidad de persistencia 
	//que se encuentra en el archivo persistence.xml
	EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("PE");
	
	
//CREANDO METODOS DE MANTENIMIENTO
	public void AdicionarMedicamento(Medicamento med){
		EntityManager em=fabrica.createEntityManager();
		try {
		  em.getTransaction().begin();
		  em.persist(med);
		  em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
			fabrica.close();
		}
	}
	
public void ActualizarMedicamento(Medicamento med){
	EntityManager em=fabrica.createEntityManager();
	
	try {
	  em.getTransaction().begin();
	  em.merge(med);
	  em.getTransaction().commit();
	  
	} catch (Exception e) {
	  em.getTransaction().rollback();
	  e.printStackTrace();
	}
	finally {
		em.close();
		fabrica.close();
	}	
}
	
public void EliminarMedicamento(int codigo){
EntityManager em=fabrica.createEntityManager();
try {
  Medicamento med=em.find(Medicamento.class, codigo);
  em.getTransaction().begin();
  em.remove(med);
  em.getTransaction().commit();
} catch (Exception e) {
	em.getTransaction().rollback();
	e.printStackTrace();
}
	finally {
		em.close();
		fabrica.close();
	}
}



public Medicamento BuscarMedicamento(int codigo){
EntityManager em=fabrica.createEntityManager();
Medicamento med=null;
try {
 med=em.find(Medicamento.class, codigo);
} catch (Exception e) {
	e.printStackTrace();
}
	finally {
		em.close();
		fabrica.close();
	}
return med;
}

	
	
}
