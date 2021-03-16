package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class ObraSocial {
	int idObraSocial;
	String obraSocial;
	
	
	public ObraSocial(int idObraSocial, String obraSocial) {
		super();
		this.idObraSocial = idObraSocial;
		this.obraSocial = obraSocial;
	}


	public int getIdObraSocial() {
		return idObraSocial;
	}


	public void setIdObraSocial(int idObraSocial) {
		this.idObraSocial = idObraSocial;
	}


	public String getObraSocial() {
		return obraSocial;
	}


	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectObraSocial() {
		  BasicDBObject dbObjetcObraSocial = new BasicDBObject();
		  
		  dbObjetcObraSocial.append("idObraSocial", this.getIdObraSocial());
		  dbObjetcObraSocial.append("obraSocial", this.getObraSocial());

		  return dbObjetcObraSocial;
	  
	  }
	
}
