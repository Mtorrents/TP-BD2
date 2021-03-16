package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class Sucursal {
	int idSucursal;
	int puntoVenta;
	Calle calle;
	Localidad localidad;
	Provincia provincia;
	
	
	public Sucursal(int idSucursal, int puntoVenta, Calle calle, Localidad localidad, Provincia provincia) {
		super();
		this.idSucursal = idSucursal;
		this.puntoVenta = puntoVenta;
		this.calle = calle;
		this.localidad = localidad;
		this.provincia = provincia;
	}
	
	
	public int getIdSucursal() {
		return idSucursal;
	}
	public void setIdSucursal(int idSucursal) {
		this.idSucursal = idSucursal;
	}
	public int getPuntoVenta() {
		return puntoVenta;
	}
	public void setPuntoVenta(int puntoVenta) {
		this.puntoVenta = puntoVenta;
	}
	public Calle getCalle() {
		return calle;
	}
	public void setCalle(Calle calle) {
		this.calle = calle;
	}
	public Localidad getLocalidad() {
		return localidad;
	}
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	  public BasicDBObject toDBObjectSucrusal() {
		  BasicDBObject dbObjetcSucursal = new BasicDBObject();
		  
		  dbObjetcSucursal.append("idSucursal", this.getIdSucursal());
		  dbObjetcSucursal.append("puntoVenta", this.getPuntoVenta());
		  dbObjetcSucursal.append("calle", this.getCalle().toDBObjectCalle());
		  dbObjetcSucursal.append("localidad", this.getLocalidad().toDBObjectLocalidad());
		  dbObjetcSucursal.append("provincia", this.getProvincia().toDBObjectProvincia());
		  
		  return dbObjetcSucursal;
	  }
}
