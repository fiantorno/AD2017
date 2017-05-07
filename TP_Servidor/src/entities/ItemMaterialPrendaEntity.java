package entities;

import java.io.Serializable;

import javax.persistence.*;

public class ItemMaterialPrendaEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 592441283341549459L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int item_materialprenda;
	@ManyToOne
	@JoinColumn(name="idPrenda")
	private PrendaEntity prenda;
	private int cantidadutilizada;
	private float despedicio;
	@OneToOne
	@JoinColumn(name="id_codigomaterial")
	private MateriaPrimaEntity materiaprima;
	public ItemMaterialPrendaEntity() {
		super();
	}
	public int getItem_materialprenda() {
		return item_materialprenda;
	}
	public void setItem_materialprenda(int item_materialprenda) {
		this.item_materialprenda = item_materialprenda;
	}
	public PrendaEntity getPrenda() {
		return prenda;
	}
	public void setPrenda(PrendaEntity prenda) {
		this.prenda = prenda;
	}
	public int getCantidadutilizada() {
		return cantidadutilizada;
	}
	public void setCantidadutilizada(int cantidadutilizada) {
		this.cantidadutilizada = cantidadutilizada;
	}
	public float getDespedicio() {
		return despedicio;
	}
	public void setDespedicio(float despedicio) {
		this.despedicio = despedicio;
	}
	public MateriaPrimaEntity getMateriaprima() {
		return materiaprima;
	}
	public void setMateriaprima(MateriaPrimaEntity materiaprima) {
		this.materiaprima = materiaprima;
	}



}