package entities;

import java.io.Serializable;

import javax.persistence.*;

@Embeddable
public class ItemPrendaId implements Serializable{
	private static final long serialVersionUID = -6109442483529088615L;

	@ManyToOne
	@JoinColumn(name="idTalle",nullable=false)
	private TalleEntity talle;
	
	@ManyToOne
	@JoinColumn(name="idColor",nullable=false)
	private ColorEntity color;
	
	@ManyToOne
	@JoinColumn(name="IdPrenda",nullable=false)
	private PrendaEntity prenda;
	
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((talle == null) ? 0 : talle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPrendaId other = (ItemPrendaId) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (talle == null) {
			if (other.talle != null)
				return false;
		} else if (!talle.equals(other.talle))
			return false;
		return true;
	}
	public PrendaEntity getPrenda() {
		return prenda;
	}
	public void setPrenda(PrendaEntity prenda) {
		this.prenda = prenda;
	}	
	
}
