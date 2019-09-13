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
@Table(name="tb_empleado")
public class Empleado implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_emp")
	private int codEmpleado;
	@Column(name="nom_emp")
	private String nomEmpleado;
	@Column(name="ape_emp")
	private String apeEmpleado;
	
	@Column(name="sex_emp")
	private String sexoEmpleado;
	
	@Column(name="fec_reg_emp")
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@Column(name="fec_nac_emp")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
			
	@Column(name="dir_emp")
	private String dirEmpleado;
	//Relacionando empleado con distrito
	//de muchos a uno
	@ManyToOne
	@JoinColumn(name="cod_dis_emp")
	private Distrito distritoEmpleado;
	
	//Relacioando empleado con Boleta
	//uno a muchos
	@OneToMany(mappedBy="empleadoBoleta")
	private List<Boleta>listaEmpleadoBoleta;

	public int getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(int codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public String getNomEmpleado() {
		return nomEmpleado;
	}

	public void setNomEmpleado(String nomEmpleado) {
		this.nomEmpleado = nomEmpleado;
	}

	public String getApeEmpleado() {
		return apeEmpleado;
	}

	public void setApeEmpleado(String apeEmpleado) {
		this.apeEmpleado = apeEmpleado;
	}

	public String getSexoEmpleado() {
		return sexoEmpleado;
	}

	public void setSexoEmpleado(String sexoEmpleado) {
		this.sexoEmpleado = sexoEmpleado;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDirEmpleado() {
		return dirEmpleado;
	}

	public void setDirEmpleado(String dirEmpleado) {
		this.dirEmpleado = dirEmpleado;
	}

	public Distrito getDistritoEmpleado() {
		return distritoEmpleado;
	}

	public void setDistritoEmpleado(Distrito distritoEmpleado) {
		this.distritoEmpleado = distritoEmpleado;
	}

	public List<Boleta> getListaEmpleadoBoleta() {
		return listaEmpleadoBoleta;
	}

	public void setListaEmpleadoBoleta(List<Boleta> listaEmpleadoBoleta) {
		this.listaEmpleadoBoleta = listaEmpleadoBoleta;
	}
	
	
	
}
