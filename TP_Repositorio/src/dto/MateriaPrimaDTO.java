package dto;

import java.io.Serializable;

public class MateriaPrimaDTO implements Serializable{

	private static final long serialVersionUID = -697298117170348599L;
	
	private Integer codigo;
	private Float cantidadAComprar;
	private String nombre;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Float getCantidadAComprar() {
		return cantidadAComprar;
	}
	public void setCantidadAComprar(Float cantidadAComprar) {
		this.cantidadAComprar = cantidadAComprar;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
