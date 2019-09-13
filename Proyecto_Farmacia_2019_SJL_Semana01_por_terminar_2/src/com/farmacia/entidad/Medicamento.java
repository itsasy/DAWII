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

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="tb_medicamento")
public class Medicamento implements Serializable{

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="cod_med")
private int codMedicamento;
@Column(name="nom_med")
private String nomMedicamento;
@Column(name="stock_med")
private int stockMedicamento;
@Column(name="pre_med")
private double preMedicamento;
@Column(name="fec_ven_med")
@Temporal(TemporalType.DATE)
private Date fechaVencimiento;//java.util

//Relacionando Medicamento con Laboratorio de muchos a uno
@ManyToOne
@JoinColumn(name="cod_lab")
//ahora crearmos un objeto basado Labaratorio
private Laboratorio laboratorio;

//Relacionando medicamento con detalleBoleta
//de uno a muchos
@OneToMany(mappedBy="medicamento")
private List<DetalleBoleta>listaMedicamentoDetalleBoleta;





public int getCodMedicamento() {
	return codMedicamento;
}
public void setCodMedicamento(int codMedicamento) {
	this.codMedicamento = codMedicamento;
}
public String getNomMedicamento() {
	return nomMedicamento;
}
public void setNomMedicamento(String nomMedicamento) {
	this.nomMedicamento = nomMedicamento;
}
public int getStockMedicamento() {
	return stockMedicamento;
}
public void setStockMedicamento(int stockMedicamento) {
	this.stockMedicamento = stockMedicamento;
}
public double getPreMedicamento() {
	return preMedicamento;
}
public void setPreMedicamento(double preMedicamento) {
	this.preMedicamento = preMedicamento;
}
public Date getFechaVencimiento() {
	return fechaVencimiento;
}
public void setFechaVencimiento(Date fechaVencimiento) {
	this.fechaVencimiento = fechaVencimiento;
}
public Laboratorio getLaboratorio() {
	return laboratorio;
}
public void setLaboratorio(Laboratorio laboratorio) {
	this.laboratorio = laboratorio;
}
public List<DetalleBoleta> getListaMedicamentoDetalleBoleta() {
	return listaMedicamentoDetalleBoleta;
}
public void setListaMedicamentoDetalleBoleta(List<DetalleBoleta> listaMedicamentoDetalleBoleta) {
	this.listaMedicamentoDetalleBoleta = listaMedicamentoDetalleBoleta;
}








	
	
	
	
	
	
}
