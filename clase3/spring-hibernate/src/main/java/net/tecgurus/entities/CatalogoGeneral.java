package net.tecgurus.entities;
// Generated 09-sep-2016 18:21:54 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CatalogoGeneral generated by hbm2java
 */
@Entity
@Table(name = "catalogo_general", catalog = "tec_gurus")
public class CatalogoGeneral implements java.io.Serializable {

	private int idCat;
	private String dscCorCat;
	private String dscComCat;
	private Integer idEstCat;
	private Date fchCre;
	private Date fchMod;

	public CatalogoGeneral() {
	}

	public CatalogoGeneral(int idCat) {
		this.idCat = idCat;
	}

	public CatalogoGeneral(int idCat, String dscCorCat, String dscComCat, Integer idEstCat, Date fchCre, Date fchMod) {
		this.idCat = idCat;
		this.dscCorCat = dscCorCat;
		this.dscComCat = dscComCat;
		this.idEstCat = idEstCat;
		this.fchCre = fchCre;
		this.fchMod = fchMod;
	}

	@Id

	@Column(name = "id_cat", unique = true, nullable = false)
	public int getIdCat() {
		return this.idCat;
	}

	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}

	@Column(name = "dsc_cor_cat", length = 20)
	public String getDscCorCat() {
		return this.dscCorCat;
	}

	public void setDscCorCat(String dscCorCat) {
		this.dscCorCat = dscCorCat;
	}

	@Column(name = "dsc_com_cat", length = 50)
	public String getDscComCat() {
		return this.dscComCat;
	}

	public void setDscComCat(String dscComCat) {
		this.dscComCat = dscComCat;
	}

	@Column(name = "id_est_cat")
	public Integer getIdEstCat() {
		return this.idEstCat;
	}

	public void setIdEstCat(Integer idEstCat) {
		this.idEstCat = idEstCat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fch_cre", length = 19)
	public Date getFchCre() {
		return this.fchCre;
	}

	public void setFchCre(Date fchCre) {
		this.fchCre = fchCre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fch_mod", length = 19)
	public Date getFchMod() {
		return this.fchMod;
	}

	public void setFchMod(Date fchMod) {
		this.fchMod = fchMod;
	}

}
