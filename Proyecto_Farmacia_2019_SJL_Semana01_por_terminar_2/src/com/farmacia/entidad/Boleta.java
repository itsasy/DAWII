package com.farmacia.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_boleta")
public class Boleta implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_bol")
	private int numBoleta;
	
	@Column(name="fec_emi_bol")
	@Temporal(TemporalType.DATE)
	private Date fechaEmision;
	
	@Column(name="monto_bol")
	private double montoBoleta;
	
	//Relacionando boleta con cliente
	//de muchos a uno
	@ManyToOne
	@JoinColumn(name="cod_cli")//fk
	private Cliente clienteBoleta;
	
	//Relacionando Boleta con Empleado
	//de muchos a uno
	@ManyToOne
	@JoinColumn(name="cod_emp")
	private Empleado empleadoBoleta;
	
	//Relacionando
	//Boleta con detalle boleta
	//de uno a muchos
	@OneToMany(mappedBy="boleta")
	private List<DetalleBoleta>listadetalleBoleta;

	public int getNumBoleta() {
		return numBoleta;
	}

	public void setNumBoleta(int numBoleta) {
		this.numBoleta = numBoleta;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public double getMontoBoleta() {
		return montoBoleta;
	}

	public void setMontoBoleta(double montoBoleta) {
		this.montoBoleta = montoBoleta;
	}

	public Cliente getClienteBoleta() {
		return clienteBoleta;
	}

	public void setClienteBoleta(Cliente clienteBoleta) {
		this.clienteBoleta = clienteBoleta;
	}

	public Empleado getEmpleadoBoleta() {
		return empleadoBoleta;
	}

	public void setEmpleadoBoleta(Empleado empleadoBoleta) {
		this.empleadoBoleta = empleadoBoleta;
	}

	public List<DetalleBoleta> getListadetalleBoleta() {
		return listadetalleBoleta;
	}

	public void setListadetalleBoleta(List<DetalleBoleta> listadetalleBoleta) {
		this.listadetalleBoleta = listadetalleBoleta;
	}
	
	
	
	
}
