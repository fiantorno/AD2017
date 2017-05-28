package entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="itemprenda")
public class ItemPrendaEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3013620458553400990L;
	@EmbeddedId
	private ItemPrendaId id;
	@ManyToOne
	@JoinColumn(name="IdPrenda")
	private PrendaEntity prenda;
	@OneToOne
	@JoinColumn(name="idtalle")
	private TalleEntity talle;
	@OneToOne
	@JoinColumn(name="idColor")
	private ColorEntity color;
	public ItemPrendaEntity(){
	}
	public ItemPrendaId getId() {
		return id;
	}
	public void setId(ItemPrendaId id) {
		this.id = id;
	}
	public PrendaEntity getPrenda() {
		return prenda;
	}
	public void setPrenda(PrendaEntity prenda) {
		this.prenda = prenda;
	}
	public TalleEntity getTalle() {
		return talle;
	}
	public void setTalle(TalleEntity talle) {
		this.talle = talle;
	}
	public ColorEntity getColor() {
		return color;
	}
	public void setColor(ColorEntity color) {
		this.color = color;
	}
	
}