package com.farmacia.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_laboratorio")

public class Laboratorio implements Serializable{
//Declarando los atributos
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="cod_lab")
private int codLaboratorio;

@Column(name="des_lab")
private String desLaboratorio;

//Relacionando la tabla Laboratorio con Medicamento
@OneToMany(mappedBy="laboratorio")
//vamos a declarar un objeto de tipo
//lista basado en Medicamento
private List<Medicamento>listaMedicamento;


public int getCodLaboratorio() {
	return codLaboratorio;
}

public void setCodLaboratorio(int codLaboratorio) {
	this.codLaboratorio = codLaboratorio;
}

public String getDesLaboratorio() {
	return desLaboratorio;
}

public void setDesLaboratorio(String desLaboratorio) {
	this.desLaboratorio = desLaboratorio;
}

public List<Medicamento> getListaMedicamento() {
	return listaMedicamento;
}

public void setListaMedicamento(List<Medicamento> listaMedicamento) {
	this.listaMedicamento = listaMedicamento;
}



	

	
	
}
