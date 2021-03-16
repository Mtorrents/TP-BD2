package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class Producto {
	
	int codigoProducto;
	TipoProducto tipoProducto;
	Laboratorio laboratorioProduccion;
	String descripcion;
	double precio;
	
	
	public Producto(int codigoProducto, TipoProducto tipoProducto, Laboratorio laboratorioProduccion,
			String descripcion, double precio) {
		super();
		this.codigoProducto = codigoProducto;
		this.tipoProducto = tipoProducto;
		this.laboratorioProduccion = laboratorioProduccion;
		this.descripcion = descripcion;
		this.precio = precio;
	}


	public int getCodigoProducto() {
		return codigoProducto;
	}


	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}


	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}


	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}


	public Laboratorio getLaboratorioProduccion() {
		return laboratorioProduccion;
	}


	public void setLaboratorioProduccion(Laboratorio laboratorioProduccion) {
		this.laboratorioProduccion = laboratorioProduccion;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectProducto() {
		  BasicDBObject dbObjetcProducto = new BasicDBObject();
		  
		  dbObjetcProducto.append("codigoProducto", this.getCodigoProducto());
		  dbObjetcProducto.append("tipoProducto", this.getTipoProducto().toDBObjectTipoProducto());
		  dbObjetcProducto.append("laboratorioProduccion", this.getLaboratorioProduccion().toDBObjectLaboratorio());
		  dbObjetcProducto.append("descripcion", this.getDescripcion());
		  dbObjetcProducto.append("precio", this.getPrecio());

		  return dbObjetcProducto;
	  }
	  

}
