package com.farmacia.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_detalle_has_boleta")

public class DetalleBoleta implements Serializable{

	//?
	@EmbeddedId
	private DetalleBoletaPK pk;
	
	@Column(name="can")
	private int cantidad;
	
	@Column(name="pre")
	private double precio;
	
		
	
	//Relacionando detalleboleta con boleta
	@ManyToOne
	@JoinColumn(name="num_bol", referencedColumnName="num_bol",insertable=false,updatable=false)
	private Boleta boleta;
	
	
	//Relacionando DetalleBoleta con medicamento
	//muchos a uno
	@ManyToOne
	@JoinColumn(name="cod_med", referencedColumnName="cod_med",insertable=false,updatable=false)
	private Medicamento medicamento;


	public DetalleBoletaPK getPk() {
		return pk;
	}


	public void setPk(DetalleBoletaPK pk) {
		this.pk = pk;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Boleta getBoleta() {
		return boleta;
	}


	public void setBoleta(Boleta boleta) {
		this.boleta = boleta;
	}


	public Medicamento getMedicamento() {
		return medicamento;
	}


	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	
	
	
}
