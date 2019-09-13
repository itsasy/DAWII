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
@Table(name="tb_cliente")
public class Cliente implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_cli")
	private int codCliente;
	@Column(name="nom_cli")
	private String nomCliente;
	@Column(name="ape_cli")
	private String apeCliente;
	
	@Column(name="sex_cli")
	private String sexoCliente;
	
	@Column(name="fec_reg_cli")
	@Temporal(TemporalType.DATE)
	private Date fechaRegistro;
	
	@Column(name="dir_cli")
	private String dirCliente;
	
	//no se declara fk por favorrrrrrrrrrrrrrrrrrrrrrrrrr
	
	//vamos a relacionar de muchos a uno Cliente y Distrito
	@ManyToOne
	@JoinColumn(name="cod_dis_cli")//esto es fk
	private Distrito distritoCliente;//nombre del mapeo
	
	//Relacionando cliente con boleta
	//de uno a muchos
	@OneToMany(mappedBy="clienteBoleta")
	private List<Boleta>listaClienteBoleta;

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNomCliente() {
		return nomCliente;
	}

	public void setNomCliente(String nomCliente) {
		this.nomCliente = nomCliente;
	}

	public String getApeCliente() {
		return apeCliente;
	}

	public void setApeCliente(String apeCliente) {
		this.apeCliente = apeCliente;
	}

	public String getSexoCliente() {
		return sexoCliente;
	}

	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getDirCliente() {
		return dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}

	public Distrito getDistritoCliente() {
		return distritoCliente;
	}

	public void setDistritoCliente(Distrito distritoCliente) {
		this.distritoCliente = distritoCliente;
	}

	public List<Boleta> getListaClienteBoleta() {
		return listaClienteBoleta;
	}

	public void setListaClienteBoleta(List<Boleta> listaClienteBoleta) {
		this.listaClienteBoleta = listaClienteBoleta;
	}
	
	
	
	
	
}
