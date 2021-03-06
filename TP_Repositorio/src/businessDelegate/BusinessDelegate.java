package businessDelegate;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import dto.ClienteDTO;
import dto.EmpleadoDTO;
import dto.PedidoDTO;
import dto.SucursalDTO;
import dto.TalleDTO;
import interfazRemota.IAdmSucursalesControlador;
import interfazRemota.IClienteControlador;
import interfazRemota.IPuntoDeVentaControlador;

public class BusinessDelegate {
	private IPuntoDeVentaControlador interfazRemotaPuntoVenta;
	private IAdmSucursalesControlador interfazRemotaSucursales;
	private IClienteControlador interfazRemotaClientes;
	private static BusinessDelegate instancia;

	public static BusinessDelegate getInstancia(){
		if(instancia==null){
			instancia=new BusinessDelegate();
		}
		return instancia;
	}    
	public BusinessDelegate() { 
		try{
			interfazRemotaPuntoVenta=(IPuntoDeVentaControlador) Naming.lookup("//localhost/GestionPuntoVenta");
			interfazRemotaSucursales=(IAdmSucursalesControlador) Naming.lookup("//localhost/GestionSucursal");
			interfazRemotaClientes=(IClienteControlador) Naming.lookup("//localhost/GestionCliente");
		}catch(RemoteException e){
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*FRAN*/
	public void modificarCliente(ClienteDTO c) throws RemoteException{
		interfazRemotaClientes.modificarCliente(c);
	}
	public void bajaCliente(Integer idCliente) throws RemoteException{
		interfazRemotaClientes.bajaCliente(idCliente);
	}
	public ClienteDTO buscarCliente(Integer id) throws RemoteException{
		return interfazRemotaClientes.buscarCliente(id);
	}
	public List<ClienteDTO> obtenerClientes() throws RemoteException{
		return interfazRemotaClientes.obtenerClientes();
	}	
	public Integer altaCliente(ClienteDTO cliDTO) throws RemoteException{
		return interfazRemotaClientes.altaCliente(cliDTO);
	}
	public void crearSucursal(SucursalDTO s)throws RemoteException{
		interfazRemotaSucursales.crearSucursal(s);
	}	
	public void crearEmpleado(EmpleadoDTO e)throws RemoteException{
		interfazRemotaSucursales.crearEmpleado(e);
	}



	/*PEDIDO*/
	public int nuevoPedido(PedidoDTO pedidoDTO,int idSucursal) throws RemoteException{
		return interfazRemotaPuntoVenta.nuevoPedido(pedidoDTO,idSucursal);
	}
	public PedidoDTO obtenerPedido(int idPedido) throws RemoteException{
		return interfazRemotaPuntoVenta.obtenerPedido(idPedido);
	}
	
	public void confirmarPedido(Integer IdPedido) throws RemoteException{
		interfazRemotaPuntoVenta.confirmarPedido(IdPedido);
	}
	/*
	public void cancelarPedido(Integer id);
	//MAU
	public List<FacturaDTO> getFacturas();	
	public void generarFactura(PedidoDTO p);
	 */
	public List<PedidoDTO> listarPedidosPendientesDeValidacion() throws RemoteException{
		return interfazRemotaPuntoVenta.listarPedidosPendientesDeValidacion();
	}
	public void altaTalle(TalleDTO talleDTO) throws RemoteException{
		interfazRemotaPuntoVenta.altaTalle(talleDTO);
	}
}
