package controladores;

import java.util.Date;
import dao.AdministracionDAO;
import dao.ClienteDAO;
import dao.PedidoDAO;
import dto.ClienteDTO;
import dto.PedidoDTO;
import entities.ClienteEntity;
import entities.PedidoEntity;
import entities.SucursalEntity;
import negocio.Pedido;


public class ControladorPedido {
	private static ControladorPedido instancia;
	private ControladorPedido(){}
	public static ControladorPedido getInstancia(){
		if(instancia==null){
			instancia=new ControladorPedido();
		}
		return instancia;
	}
	public Integer nuevoPedido(Integer idSucursal){
		SucursalEntity s=AdministracionDAO.getInstancia().getSucursal(idSucursal);
		PedidoEntity pedido=new PedidoEntity();
		pedido.setSucursal(s);
		pedido.setFechaCreacion(new Date());
		pedido.setEstado("En Verificaci�n");
		Integer id=PedidoDAO.getInstancia().nuevoPedido(pedido);
		return id;
	}
	public ClienteEntity ClienteDTO2Entity(ClienteDTO c){
		return ClienteDAO.getInstancia().getCliente(c.getId());
	}
	public void agregarPedido(Integer id){
		return;
	}
	public void confirmarPedido(PedidoDTO pedido){
		Pedido p=PedidoDAO.getInstancia().getPedido(pedido.getId());
		if(p.getEstado().equals("En Verificaci�n")){
			if(Obtenerlimitecr�dito(pedido.getCliente())<p.TotalPedido(pedido.getId())){
				if(p.ObtenerdisponibilidadporPrenda(pedido)){
					p.setEstado("Procesar Pedido");
				}
			}else{
				cancelarPedido(p.getId());
			}
		}
	}
	public float Obtenerlimitecr�dito(ClienteDTO c){
		ClienteEntity cli=ClienteDAO.getInstancia().getCliente(c.getId());
		return cli.getLimiteCredito();		
	}
	public String informarEstadoPedido(){
		return null;
	}
	public void cancelarPedido(Integer id){
        Pedido pe=PedidoDAO.getInstancia().getPedido(id);
		pe.setEstado("Cancelado");
		PedidoDAO.getInstancia().modificarPedido(pe);
	}

}
