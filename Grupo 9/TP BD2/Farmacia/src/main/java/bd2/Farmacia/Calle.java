package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class Calle {
	 int idCalle;
	 String calle;
	 
	 
	public Calle(int idCalle, String calle) {
		super();
		this.idCalle = idCalle;
		this.calle = calle;
	}


	public int getIdCalle() {
		return idCalle;
	}


	public void setIdCalle(int idCalle) {
		this.idCalle = idCalle;
	}


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectCalle() {
		  BasicDBObject dbObjetcCalle = new BasicDBObject();
		  
		  dbObjetcCalle.append("idCalle", this.getIdCalle());
		  dbObjetcCalle.append("calle", this.getCalle());

		  return dbObjetcCalle;
	  }
}
