package negocio;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
	private Integer id;
	private String nombre;
	private String direccion;
	private String provincia;
	private String localidad;
	private String codigoPostal;
	private String telefono;
	private Empleado gerente; 
	private Empleado recepcionPedidos;
	private List<Empleado> empleados;
	public Sucursal(){
		empleados=new ArrayList<Empleado>();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Empleado getGerente() {
		return gerente;
	}
	public void setGerente(Empleado gerente) {
		this.gerente = gerente;
	}
	public Empleado getRecepcionPedidos() {
		return recepcionPedidos;
	}
	public void setRecepcionPedidos(Empleado recepcionPedidos) {
		this.recepcionPedidos = recepcionPedidos;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
