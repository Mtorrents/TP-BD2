package bd2.Farmacia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bson.Document;

import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;

public class Sistema {
	MongoClient mongoClient;
	MongoCollection<Document> collection;
		
	public MongoClient getMongoClient() {
		return mongoClient;
	}
	public void setMongoClient(MongoClient mongoClient) {
		this.mongoClient = mongoClient;
	}

	public MongoCollection<Document> getCollection() {
		return collection;
	}
	public void setCollection(MongoCollection<Document> collection) {
		this.collection = collection;
	}


	  public void conexion(String host, int port){
		    // Getting a connection 
		    this.mongoClient = new MongoClient(host, port);
		    
		    // Select the database and collection
		    this.collection = this.mongoClient.getDatabase("Farmacia").getCollection("Ventas");
	  }
	  
	public void argegarVenta(int numeroTicket, Cliente cliente , LocalDate fechaVenta , TipoPago formaPago ,
		Sucursal sucursalAsignada ,Empleado empleadoCobrador , Empleado emepladoAtendedor , List<DetalleVenta> listaDetalleVentas ){
	   	
		Document document = new Document();
		document.append("numeroTicket", numeroTicket);
		document.append("cliente", cliente.toDBObjectCliente());
		
		String fechaComoCadena = fechaVenta.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		document.append("fechaVenta", new Date(fechaComoCadena));
		
		document.append("formaPago", formaPago.toDBObjectTipoPago());
		document.append("sucursalAsignada", sucursalAsignada.toDBObjectSucrusal());
		document.append("empleadoCobrador", empleadoCobrador.toDBObjectEmpleado());
		document.append("emepladoAtendedor", emepladoAtendedor.toDBObjectEmpleado());
		
		List<DBObject> lista = new ArrayList<DBObject>();
		for (DetalleVenta dv : listaDetalleVentas) {
			lista.add(dv.toDBObjectDetalleVenta());
		}
		document.put("listaDetalleVentas", lista);
		
	    // Insert the document in the collection
		this.getCollection().insertOne(document);
	}
	
	
	public void desconexion() {
		    this.getMongoClient().close();
	}	

}
