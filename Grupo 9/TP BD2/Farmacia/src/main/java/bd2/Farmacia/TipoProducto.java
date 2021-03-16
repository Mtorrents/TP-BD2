package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class TipoProducto {
	int idTipoProducto;
	String producto;
	
	
	public TipoProducto(int idTipoProducto, String producto) {
		super();
		this.idTipoProducto = idTipoProducto;
		this.producto = producto;
	}
	
	
	public int getIdTipoProducto() {
		return idTipoProducto;
	}
	public void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectTipoProducto() {
		  BasicDBObject dbObjetcTipoProducto = new BasicDBObject();
		  
		  dbObjetcTipoProducto.append("idTipoProducto", this.getIdTipoProducto());
		  dbObjetcTipoProducto.append("producto", this.getProducto());

		  return dbObjetcTipoProducto;
	  }
	  
}
