package net.tecgurus.entities;
// Generated 22/07/2017 09:27:40 AM by Hibernate Tools 5.2.3.Final

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Movimiento generated by hbm2java
 */
@Entity
@Table(name = "movimiento", catalog = "tec_gurus_frameworks")
public class Movimiento implements java.io.Serializable {

	private Integer idMovimiento;
	private Cuenta cuenta;
	private Tipomovimiento tipomovimiento;
	private Date fecha;
	private BigDecimal monto;

	public Movimiento() {
	}

	public Movimiento(Cuenta cuenta, Tipomovimiento tipomovimiento, Date fecha, BigDecimal monto) {
		this.cuenta = cuenta;
		this.tipomovimiento = tipomovimiento;
		this.fecha = fecha;
		this.monto = monto;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idMovimiento", unique = true, nullable = false)
	public Integer getIdMovimiento() {
		return this.idMovimiento;
	}

	public void setIdMovimiento(Integer idMovimiento) {
		this.idMovimiento = idMovimiento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCuenta", nullable = false)
	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoMovimiento", nullable = false)
	public Tipomovimiento getTipomovimiento() {
		return this.tipomovimiento;
	}

	public void setTipomovimiento(Tipomovimiento tipomovimiento) {
		this.tipomovimiento = tipomovimiento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "monto", nullable = false, precision = 9)
	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
