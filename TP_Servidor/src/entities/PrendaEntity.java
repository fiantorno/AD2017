package entities;

import java.io.Serializable;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="prenda")
public class PrendaEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2773817217273075770L;
	@Embedded
	private PrendaId idPrenda;
	private String descripcion;
	@ManyToMany
	@JoinColumn(name="idcolor")
	private Set<ColorEntity> colores=new HashSet<ColorEntity>();
	@ManyToMany
	@JoinColumn(name="idtalle")
	private Set<TalleEntity> talles=new HashSet<TalleEntity>();
	@OneToMany
	@JoinColumn(name="idPrenda")
	private HashSet<ItemMaterialPrendaEntity> itemMaterialPrenda=new HashSet<ItemMaterialPrendaEntity>();
	private boolean vigente;
	private float costoProduccion;
	private float costoProduccionActual;
	private float porcentajeGanancia;
	public PrendaId getIdPrenda() {
		return idPrenda;
	}
	public void setIdPrenda(PrendaId idPrenda) {
		this.idPrenda = idPrenda;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Set<ColorEntity> getColores() {
		return colores;
	}
	public void setColores(HashSet<ColorEntity> colores) {
		this.colores = colores;
	}
	public Set<TalleEntity> getTalles() {
		return talles;
	}
	public void setTalles(HashSet<TalleEntity> talles) {
		this.talles = talles;
	}
	public HashSet<ItemMaterialPrendaEntity> getItemMaterialPrenda() {
		return itemMaterialPrenda;
	}
	public void setItemMaterialPrenda(HashSet<ItemMaterialPrendaEntity> itemMaterialPrenda) {
		this.itemMaterialPrenda = itemMaterialPrenda;
	}
	public boolean isVigente() {
		return vigente;
	}
	public void setVigente(boolean vigente) {
		this.vigente = vigente;
	}
	public float getCostoProduccion() {
		return costoProduccion;
	}
	public void setCostoProduccion(float costoProduccion) {
		this.costoProduccion = costoProduccion;
	}
	public float getCostoProduccionActual() {
		return costoProduccionActual;
	}
	public void setCostoProduccionActual(float costoProduccionActual) {
		this.costoProduccionActual = costoProduccionActual;
	}
	public float getPorcentajeGanancia() {
		return porcentajeGanancia;
	}
	public void setPorcentajeGanancia(float porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

}