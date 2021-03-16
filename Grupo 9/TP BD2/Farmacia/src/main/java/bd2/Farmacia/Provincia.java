package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class Provincia {
	 int idProvincia;
	 String provincia;
	 
	public Provincia(int idProvincia, String provincia) {
		super();
		this.idProvincia = idProvincia;
		this.provincia = provincia;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectProvincia() {
		  BasicDBObject dbObjetcProvincia = new BasicDBObject();
		  
		  dbObjetcProvincia.append("idProvincia", this.getIdProvincia());
		  dbObjetcProvincia.append("provincia", this.getProvincia());

		  return dbObjetcProvincia;
	  } 

}
