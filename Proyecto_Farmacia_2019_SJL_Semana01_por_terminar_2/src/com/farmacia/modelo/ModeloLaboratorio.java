package com.farmacia.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.farmacia.entidad.Laboratorio;

public class ModeloLaboratorio {

//Vamos a invocar al aributo PE QUE SE ENCUENTRA
	//PERSISTENCIA
EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("PE");

//Metodos para Registrar, actualizar, eliminar, buscar
//metodo para registrar
public void AdicionarLaboratorio(Laboratorio objLab){
//Invocando a la fabrica
EntityManager em=fabrica.createEntityManager();
try {
   em.getTransaction().begin();
   em.persist(objLab);//insert into
   em.getTransaction().commit();//exito
} catch (Exception e) {
 em.getTransaction().rollback();
 e.printStackTrace();
}finally{
 em.close();
 fabrica.close();
}

}


//Metodo para actualizar
public void ActualizarLaboratorio(Laboratorio objLab){
	EntityManager em=fabrica.createEntityManager();
	try {
	em.getTransaction().begin();
	em.merge(objLab);//igual a update
	em.getTransaction().commit();
	} catch (Exception e) {
	em.getTransaction().rollback();
	e.printStackTrace();
	}finally {
		em.close();
		fabrica.close();
	}
	
}

//Metodo para Eliminar

public void EliminarLaboratorio(int codigo){
	EntityManager em=fabrica.createEntityManager();
	try {
	Laboratorio lab=em.find(Laboratorio.class, codigo);
	em.getTransaction().begin();
	em.remove(lab);//igual a delete
	em.getTransaction().commit();
	} catch (Exception e) {
	em.getTransaction().rollback();
	e.printStackTrace();
	}finally {
		em.close();
		fabrica.close();
	}
	
}

//Metodo para buscar

public Laboratorio BuscarLaboratorio(int codigo){
	EntityManager em=fabrica.createEntityManager();
	Laboratorio lab=null;
	try {
	 lab=em.find(Laboratorio.class, codigo);	
	} catch (Exception e) {
	e.printStackTrace();
	}finally {
		em.close();
		fabrica.close();
	}
	return lab;
	
}












	
	
	
}
