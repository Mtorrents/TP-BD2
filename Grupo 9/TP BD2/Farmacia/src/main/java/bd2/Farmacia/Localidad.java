package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class Localidad {
	 int idLocalidad;
	 String localidad;
	 
	public Localidad(int idLocalidad, String localidad) {
		super();
		this.idLocalidad = idLocalidad;
		this.localidad = localidad;
	}

	public int getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(int idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	 
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectLocalidad() {
		  BasicDBObject dbObjetcLocalidad = new BasicDBObject();
		  
		  dbObjetcLocalidad.append("idLocalidad", this.getIdLocalidad());
		  dbObjetcLocalidad.append("localidad", this.getLocalidad());

		  return dbObjetcLocalidad;
	  } 

}
