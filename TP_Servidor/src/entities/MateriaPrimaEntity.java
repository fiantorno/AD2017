package entities;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="materiasprimas")
public class MateriaPrimaEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6617885206957270077L;
	@Id
	@JoinColumn(name="IdPrenda")
	private int codigomateriaprima;
	private float cantidadAComprar;
	private String nombre;
	private String estado;
	public int getCodigomateriaprima() {
		return codigomateriaprima;
	}
	public void setCodigomateriaprima(int codigomateriaprima) {
		this.codigomateriaprima = codigomateriaprima;
	}
	public float getCantidadAComprar() {
		return cantidadAComprar;
	}
	public void setCantidadAComprar(float cantidadAComprar) {
		this.cantidadAComprar = cantidadAComprar;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}