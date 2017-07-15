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
 * CuentasCliente generated by hbm2java
 */
@Entity
@Table(name = "cuentas_cliente", catalog = "tec_gurus")
public class CuentasCliente implements java.io.Serializable {

	private int idCtaCte;
	private Integer idCta;
	private Integer idCte;
	private Date fchCre;
	private Integer idEdoCtaCte;
	private String cmntCtaCte;
	private Integer idTipCtaCte;

	public CuentasCliente() {
	}

	public CuentasCliente(int idCtaCte) {
		this.idCtaCte = idCtaCte;
	}

	public CuentasCliente(int idCtaCte, Integer idCta, Integer idCte, Date fchCre, Integer idEdoCtaCte,
			String cmntCtaCte, Integer idTipCtaCte) {
		this.idCtaCte = idCtaCte;
		this.idCta = idCta;
		this.idCte = idCte;
		this.fchCre = fchCre;
		this.idEdoCtaCte = idEdoCtaCte;
		this.cmntCtaCte = cmntCtaCte;
		this.idTipCtaCte = idTipCtaCte;
	}

	@Id

	@Column(name = "id_cta_cte", unique = true, nullable = false)
	public int getIdCtaCte() {
		return this.idCtaCte;
	}

	public void setIdCtaCte(int idCtaCte) {
		this.idCtaCte = idCtaCte;
	}

	@Column(name = "id_cta")
	public Integer getIdCta() {
		return this.idCta;
	}

	public void setIdCta(Integer idCta) {
		this.idCta = idCta;
	}

	@Column(name = "id_cte")
	public Integer getIdCte() {
		return this.idCte;
	}

	public void setIdCte(Integer idCte) {
		this.idCte = idCte;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fch_cre", length = 19)
	public Date getFchCre() {
		return this.fchCre;
	}

	public void setFchCre(Date fchCre) {
		this.fchCre = fchCre;
	}

	@Column(name = "id_edo_cta_cte")
	public Integer getIdEdoCtaCte() {
		return this.idEdoCtaCte;
	}

	public void setIdEdoCtaCte(Integer idEdoCtaCte) {
		this.idEdoCtaCte = idEdoCtaCte;
	}

	@Column(name = "cmnt_cta_cte", length = 50)
	public String getCmntCtaCte() {
		return this.cmntCtaCte;
	}

	public void setCmntCtaCte(String cmntCtaCte) {
		this.cmntCtaCte = cmntCtaCte;
	}

	@Column(name = "id_tip_cta_cte")
	public Integer getIdTipCtaCte() {
		return this.idTipCtaCte;
	}

	public void setIdTipCtaCte(Integer idTipCtaCte) {
		this.idTipCtaCte = idTipCtaCte;
	}

}
