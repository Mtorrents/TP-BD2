package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class TipoPago {
	int idTipoPago;
	String formaPago;
	
	
	public TipoPago(int idTipoPago, String formaPago) {
		super();
		this.idTipoPago = idTipoPago;
		this.formaPago = formaPago;
	}


	public int getIdTipoPago() {
		return idTipoPago;
	}


	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}


	public String getFormaPago() {
		return formaPago;
	}


	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectTipoPago() {
		  BasicDBObject dbObjetcTipoPago = new BasicDBObject();
		  
		  dbObjetcTipoPago.append("idTipoPago", this.getIdTipoPago());
		  dbObjetcTipoPago.append("formaPago", this.getFormaPago());

		  return dbObjetcTipoPago;
	  }
	
}
