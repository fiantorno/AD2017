package dao;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import entities.PedidoEntity;
import entities.PrendaEntity;
import hbt.HibernateUtil;
import negocio.Pedido;
import negocio.Prenda;

public class PedidoDAO {
	private static PedidoDAO instancia;
	private static SessionFactory sf=null;
	private PedidoDAO(){
		sf=HibernateUtil.getSessionFactory();
	}
	public static PedidoDAO getInstancia(){
		if(instancia==null){
			instancia=new PedidoDAO();
		}
		return instancia;
	}
	public Integer nuevoPedido(Pedido pedido){
		try{
			Integer id;
			Session session=sf.openSession();
			session.beginTransaction();
			PedidoEntity pe=new PedidoEntity();
			pe.setSucursal(pedido.getSucursal());
			pe.setFechaCreacion(pedido.getFechaCreacion());
			pe.setEstado(pedido.getEstado());
			id=(Integer) session.save(pe);
			session.getTransaction();
			session.close();
			return id;
		}catch(Exception e){			
			e.printStackTrace();
			System.out.println("Error PedidoDAO. Nuevo Pedido");
		}
		return null;
	}
	public Pedido getPedido(Integer idpedido){
		try{
			Session session=sf.openSession();
			session.beginTransaction();
			PedidoEntity pedido=(PedidoEntity) session.get(PedidoEntity.class, idpedido);
			session.getTransaction().commit();
			session.close();
			return new Pedido(pedido);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error PedidoDAO. Get IDPedido");
		}
		return null;
	}
	public Prenda getPrenda(int codigo){
		try{
			Session session=sf.openSession();
			session.beginTransaction();
			PrendaEntity prenda=(PrendaEntity) session.get(PrendaEntity.class,codigo);
			session.getTransaction().commit();
			session.close();
			Prenda p = new Prenda(prenda);
			return p;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error PedidoDAO. Get Prenda");
		}
		return null;
	}
	public void ModificarPedido(Pedido pedido){
		try{
			Session session=sf.openSession();
			session.beginTransaction();
			PedidoEntity pe=new PedidoEntity();
			pe.setCliente(pedido.getCliente());
			pe.setEstado(pedido.getEstado());
			pe.setFechaCreacion(pedido.getFechaCreacion());
			pe.setFechaprobableDespacho(pedido.getFechaprobableDespacho());
			pe.setFecharealDespacho(pedido.getFecharealDespacho());
			pe.setSucursal(pedido.getSucursal());
			session.update(pe);
			session.getTransaction().commit();
			session.close();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Error PedidoDAO. Modificar Pedido");
		}
	}

}