package entities;

import java.io.Serializable;

import javax.persistence.*;



@Entity
@Table(name="ItemPedido")
public class ItemPedidoEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6161471348651036527L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int item_pedido;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="numeropedido")
	private PedidoEntity pedido;
	private int cantidad;
	@OneToOne
	@JoinColumn(name="codigoprenda")
	private PrendaEntity prenda;
	@OneToOne
	@JoinColumn(name="codigotalle")
	private String talle;
	@OneToOne
	@JoinColumn(name="codigocolor")
	private String color;
	private int importe;
	public ItemPedidoEntity(){}
	public int getItem_pedido() {
		return item_pedido;
	}
	public void setItem_pedido(int item_pedido) {
		this.item_pedido = item_pedido;
	}
	public PedidoEntity getPedido() {
		return pedido;
	}
	public void setPedido(PedidoEntity pedido) {
		this.pedido = pedido;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public PrendaEntity getPrenda() {
		return prenda;
	}
	public void setPrenda(PrendaEntity prenda) {
		this.prenda = prenda;
	}
	public String getTalle() {
		return talle;
	}
	public void setTalle(String talle) {
		this.talle = talle;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
}

