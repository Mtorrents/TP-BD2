package bd2.Farmacia;

import com.mongodb.BasicDBObject;

public class Empleado {
	String cuil;
	String dni;
	String apellido;
	String nombre;
	String categoria;
	Sucursal sucursalAsginada;
	String numeroAfiliado;
	ObraSocial obraSocial;
	Calle calle;
	Localidad localidad;
	Provincia provincia;
	
	
	public Empleado(String cuil, String dni, String apellido, String nombre, String categoria,
			Sucursal sucursalAsginada, String numeroAfiliado, ObraSocial obraSocial, Calle calle, Localidad localidad,
			Provincia provincia) {
		super();
		this.cuil = cuil;
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.categoria = categoria;
		this.sucursalAsginada = sucursalAsginada;
		this.numeroAfiliado = numeroAfiliado;
		this.obraSocial = obraSocial;
		this.calle = calle;
		this.localidad = localidad;
		this.provincia = provincia;
	}


	public String getCuil() {
		return cuil;
	}


	public void setCuil(String cuil) {
		this.cuil = cuil;
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


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Sucursal getSucursalAsginada() {
		return sucursalAsginada;
	}


	public void setSucursalAsginada(Sucursal sucursalAsginada) {
		this.sucursalAsginada = sucursalAsginada;
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
	  public BasicDBObject toDBObjectEmpleado() {
		  BasicDBObject dbObjetcEmpleado = new BasicDBObject();
		  
		  dbObjetcEmpleado.append("cuil", this.getCuil());
		  dbObjetcEmpleado.append("dni", this.getDni());
		  dbObjetcEmpleado.append("apellido", this.getApellido());
		  dbObjetcEmpleado.append("nombre", this.getNombre());
		  dbObjetcEmpleado.append("categoria", this.getCategoria());
		  dbObjetcEmpleado.append("sucursalAsignada", this.getSucursalAsginada().toDBObjectSucrusal());
		  dbObjetcEmpleado.append("numeroAfiliado", this.getNumeroAfiliado());
		  dbObjetcEmpleado.append("obraSocial", this.getObraSocial().toDBObjectObraSocial());
		  dbObjetcEmpleado.append("calle", this.getCalle().toDBObjectCalle());
		  dbObjetcEmpleado.append("localidad", this.getLocalidad().toDBObjectLocalidad());
		  dbObjetcEmpleado.append("provincia", this.getProvincia().toDBObjectProvincia());

		  return dbObjetcEmpleado;
	  }

}
