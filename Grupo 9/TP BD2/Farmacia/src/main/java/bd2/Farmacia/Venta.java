package bd2.Farmacia;

import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Venta {

	int numeroTicket;
	Cliente cliente;
	LocalDate fechaVenta;
	TipoPago formaPago;
	Sucursal sucursalAsignada;
	Empleado empleadoCobrador;
	Empleado emepladoAtendedor;
	List<DetalleVenta> listaDetalleVentas;
	
	
	public Venta(int numeroTicket, Cliente cliente, LocalDate fechaVenta, TipoPago formaPago,
			Sucursal sucursalAsignada, Empleado empleadoCobrador, Empleado emepladoAtendedor ,	List<DetalleVenta> listaDetalleVentas) {
		super();
		this.numeroTicket = numeroTicket;
		this.cliente = cliente;
		this.fechaVenta = fechaVenta;
		this.formaPago = formaPago;
		this.sucursalAsignada = sucursalAsignada;
		this.empleadoCobrador = empleadoCobrador;
		this.emepladoAtendedor = emepladoAtendedor;
		this.listaDetalleVentas = listaDetalleVentas;
	}

	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}



	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}





	public LocalDate getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}





	public TipoPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(TipoPago formaPago) {
		this.formaPago = formaPago;
	}





	public Sucursal getSucursalAsignada() {
		return sucursalAsignada;
	}

	public void setSucursalAsignada(Sucursal sucursalAsignada) {
		this.sucursalAsignada = sucursalAsignada;
	}


	public Empleado getEmpleadoCobrador() {
		return empleadoCobrador;
	}
	public void setEmpleadoCobrador(Empleado empleadoCobrador) {
		this.empleadoCobrador = empleadoCobrador;
	}

	public Empleado getEmepladoAtendedor() {
		return emepladoAtendedor;
	}
	public void setEmepladoAtendedor(Empleado emepladoAtendedor) {
		this.emepladoAtendedor = emepladoAtendedor;
	}

	public List<DetalleVenta> getListaDetalleVentas() {
		return listaDetalleVentas;
	}

	public void setListaDetalleVentas(List<DetalleVenta> listaDetalleVentas) {
		this.listaDetalleVentas = listaDetalleVentas;
	}

	


	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	/*
	  public BasicDBObject toDBObjectVenta() {
		  BasicDBObject dbObjetcVenta = new BasicDBObject();
		  
		  
		  dbObjetcVenta.append("numeroTicket", this.getNumeroTicket());
		  dbObjetcVenta.append("cliente", this.getCliente().toDBObjectCliente());
		  
		  String fechaComoCadena = this.getFechaVenta().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
		  dbObjetcVenta.append("fechaVenta", fechaComoCadena );
		  
		  dbObjetcVenta.append("formaPago", this.getFormaPago().toDBObjectTipoPago());
		  dbObjetcVenta.append("sucursalAsignada", this.getSucursalAsignada().toDBObjectSucrusal());
		  dbObjetcVenta.append("empleadoCobrador", this.getEmpleadoCobrador().toDBObjectEmpleado());
		  dbObjetcVenta.append("empleadoAtendedor", this.getEmepladoAtendedor().toDBObjectEmpleado());

		  
		  return dbObjetcVenta;
	  }
	*/
}
