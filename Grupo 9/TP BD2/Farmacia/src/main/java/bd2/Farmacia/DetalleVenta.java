package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class DetalleVenta {
	
	Producto producto;
	int cantidad;
	double precioUnitario;
	double total;
	
	public DetalleVenta(Producto producto, int cantidad, double precioUnitario) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.total = this.precioUnitario * this.cantidad;
	}
	
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}


	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectDetalleVenta() {
		  BasicDBObject dbObjetcDetalleVenta = new BasicDBObject();
		  
		  dbObjetcDetalleVenta.append("producto", this.getProducto().toDBObjectProducto());
		  dbObjetcDetalleVenta.append("cantidad", this.getCantidad());
		  dbObjetcDetalleVenta.append("precioUnitario", this.getPrecioUnitario());
		  dbObjetcDetalleVenta.append("total", this.getTotal());
		  
		  return dbObjetcDetalleVenta;
	  }
	  
}
