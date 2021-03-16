package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class Cliente {
	
	 String dni;
	 String apellido;
	 String nombre;
	 String numeroAfiliado;
	 ObraSocial obraSocial;
	 Calle calle;
	 Localidad localidad;
	 Provincia provincia;
	 
	 
	public Cliente(String dni, String nombre, String apellido, String numeroAfiliado, ObraSocial obraSocial,
			Calle calle, Localidad localidad, Provincia provincia) {
		super();
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.numeroAfiliado = numeroAfiliado;
		this.obraSocial = obraSocial ;
		this.calle = calle;
		this.localidad = localidad;
		this.provincia = provincia;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumeroAfiliado() {
		return numeroAfiliado;
	}


	public void setNumeroAfiliado(String numeroAfiliado) {
		this.numeroAfiliado = numeroAfiliado;
	}


	public ObraSocial getObraSocial() {
		return obraSocial;
	}


	public void setObraSocial(ObraSocial obraSocial) {
		this.obraSocial = obraSocial;
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
	 
	
	//TRANSFORMO UN OBJETO JAVA A UNO PARA MONGODB
	  public BasicDBObject toDBObjectCliente() {
		  BasicDBObject dbObjetoCliente = new BasicDBObject();
		  
		  dbObjetoCliente.append("dni", this.getDni());
		  dbObjetoCliente.append("apellido", this.getApellido());
		  dbObjetoCliente.append("nombre", this.getNombre());
		  dbObjetoCliente.append("numeroAfiliado", this.getNumeroAfiliado());
		  dbObjetoCliente.append("calle", this.getCalle().toDBObjectCalle());
		  dbObjetoCliente.append("localidad", this.getLocalidad().toDBObjectLocalidad());
		  dbObjetoCliente.append("provincia", this.getProvincia().toDBObjectProvincia());
		  if(this.getObraSocial() != null) dbObjetoCliente.append("obraSocial", this.getObraSocial().toDBObjectObraSocial());

		  return dbObjetoCliente;
	  }
	 
}
