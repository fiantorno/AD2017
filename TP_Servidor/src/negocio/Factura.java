package negocio;

import java.util.Collection;
import java.util.Date;

public class Factura {
	
	private int nro;
	private Date fechaEmision;
	private Date fechaVencimiento;
	private Cliente cliente;
	private Collection<ItemFactura> itemsFactura;
	private float total;
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Collection<ItemFactura> getItemsFactura() {
		return itemsFactura;
	}
	public void setItemsFactura(Collection<ItemFactura> itemsFactura) {
		this.itemsFactura = itemsFactura;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}

	
}
