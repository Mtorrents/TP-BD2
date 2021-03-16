package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class Laboratorio {
	int idLaboratorio;
	String laboratorio;
	
	
	public Laboratorio(int idLaboratorio, String laboratorio) {
		super();
		this.idLaboratorio = idLaboratorio;
		this.laboratorio = laboratorio;
	}


	public int getIdLaboratorio() {
		return idLaboratorio;
	}


	public void setIdLaboratoria(int idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}


	public String getLaboratorio() {
		return laboratorio;
	}


	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectLaboratorio() {
		  BasicDBObject dbObjetcLaboratorio = new BasicDBObject();
		  
		  dbObjetcLaboratorio.append("idLaboratorio", this.getIdLaboratorio());
		  dbObjetcLaboratorio.append("laboratorio", this.getLaboratorio());

		  return dbObjetcLaboratorio;
	  } 
}
