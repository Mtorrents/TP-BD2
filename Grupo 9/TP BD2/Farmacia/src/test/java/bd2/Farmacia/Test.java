package bd2.Farmacia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calle calle1 = new Calle(1, "Golondrina");
		Calle calle2 = new Calle(2, "Republica Argentina");
		Calle calle3 = new Calle(3, "Lomas de Zamora");

		
		Localidad l1 = new Localidad(1, "Temperley");
		Localidad l2 = new Localidad(2, "Banfield");
		
		Provincia p1 = new Provincia(1, "Buenos Aires");
		
		ObraSocial oa1 = new ObraSocial(1, "Hermanos S.A");
		ObraSocial oa2 = new ObraSocial(2, "AFIP");
		
		//CLIENTES
		Cliente c1 = new Cliente("41767737", "Jorge", "Perez", null, null, calle2, l2, p1);
		Cliente c2 = new Cliente("31321345", "Manuel", "Grecco", null, null, calle1, l1, p1);
		Cliente c3 = new Cliente("36789654", "Mario", "Lopez", "1111", oa1, calle2, l2, p1);
		Cliente c4 = new Cliente("40123432", "Tomas", "Trotta", "2222", oa1, calle3, l2, p1);
		Cliente c5 = new Cliente("42567432", "Juan", "Soler", null, null, calle3, l2, p1);
		Cliente c6 = new Cliente("39654321", "Lucas", "Segovia", null, null, calle1, l1, p1);
		Cliente c7 = new Cliente("38567432", "Mauro", "Lopez", null, null, calle3, l2, p1);
		Cliente c8 = new Cliente("34567321", "Agustin", "Sotto", "3333", oa2, calle2, l2, p1);
		Cliente c9 = new Cliente("37654211", "Enrique", "Perez", "4444", oa2, calle2, l2, p1);
	    Cliente c10 = new Cliente("38666544", "Martin", "Esposito", "5555", oa1, calle1, l1, p1);

	   TipoProducto tp1 = new TipoProducto(1, "Medicamento");
	   TipoProducto tp2 = new TipoProducto(2, "Producto de perfumeria");

	   Laboratorio lab1 = new Laboratorio(1, "Richmond");
	   Laboratorio lab2 = new Laboratorio(2, "Eurolab");
	   
	   //PRODUCTOS
	   Producto pro1 = new Producto(1010, tp2, lab2, "Axel" , 125);
	   Producto pro2 = new Producto(1111, tp2, lab1, "Rexonna" , 100);
	   Producto pro3 = new Producto(1212, tp2, lab1, "Pacco" , 73);
	   Producto pro4 = new Producto(1313, tp1, lab2, "Morfina" , 325);
	   Producto pro5 = new Producto(1414, tp1, lab2, "Manitol" , 300);
	   Producto pro6 = new Producto(1515, tp1, lab1, "Isoprotenerol" , 415);
	   Producto pro7 = new Producto(1616, tp1, lab1, "Dopamina" , 245);
	   Producto pro8 = new Producto(1717, tp1, lab1, "Atropina" , 350);
	   Producto pro9 = new Producto(1818, tp1, lab2, "Propofol" , 510);
	   Producto pro10 = new Producto(1919, tp1, lab2, "Omeprazol" , 480);
	  
	  //SUCURSALES
	  Sucursal suc1 = new Sucursal(1, 1, calle1, l1, p1);
	  Sucursal suc2= new Sucursal(2, 5, calle2, l2, p1);
	  Sucursal suc3 = new Sucursal(3, 7, calle3, l2, p1);

	  //EMPLEADOS
	  Empleado e1 = new Empleado("20111111110", "11111111", "Fernandez", "Facundo", "Empleado", suc2, "1111", oa1, calle2, l2, p1);
	  Empleado e2 = new Empleado("21222222220", "22222222", "Rivera", "Jorge", "Encargado Sucursal", suc2, "2222", oa2, calle1, l1, p1);
	  Empleado e3 = new Empleado("22333333330", "33333333", "Grecco", "Sebastian", "Empleado", suc2, "3333", oa2, calle3, l2, p1);
	  Empleado e4 = new Empleado("20444444440", "44444444", "Lopez", "Leandro", "Encargado Sucursal", suc1, "4444", oa2, calle2, l2, p1);
	  Empleado e5 = new Empleado("23555555550", "55555555", "Morandi", "Lucas", "Empleado", suc1, "5555", oa2, calle1, l1, p1);
	  Empleado e6 = new Empleado("21666666660", "66666666", "Suarez", "Alejo", "Empleado", suc1, "6666", oa1, calle1, l1, p1);
	  Empleado e7 = new Empleado("21777777770", "77777777", "Guzman", "Roberto", "Empleado", suc3, "7777", oa2, calle3, l2, p1);
	  Empleado e8 = new Empleado("21888888880", "88888888", "Vazques", "Julian", "Encargado Sucursal", suc3, "8888", oa1, calle3, l2, p1);
	  Empleado e9 = new Empleado("21999999990", "99999999", "Sotto", "Mariano", "Empleado", suc3, "9999", oa2, calle2, l2, p1);

	//TIPO DE PAGO
	  TipoPago tpag1 = new TipoPago(1, "Efectivo");
	  TipoPago tpag2 = new TipoPago(2, "Tarjeta");
	  TipoPago tpag3 = new TipoPago(3, "Debito");
	  
	  //DETALLE VENTA SUCURSAL 1
	  DetalleVenta dv1 = new DetalleVenta(pro5, 5, pro5.getPrecio());
	  DetalleVenta dv2 = new DetalleVenta(pro1, 4, pro1.getPrecio());
	  DetalleVenta dv3 = new DetalleVenta(pro2, 3, pro2.getPrecio());
	  DetalleVenta dv4 = new DetalleVenta(pro5, 2, pro5.getPrecio());
	  DetalleVenta dv5 = new DetalleVenta(pro3, 10, pro3.getPrecio());
	  DetalleVenta dv6 = new DetalleVenta(pro1, 5, pro1.getPrecio());
	  DetalleVenta dv7 = new DetalleVenta(pro1, 8, pro1.getPrecio());
	  DetalleVenta dv8 = new DetalleVenta(pro2, 8, pro2.getPrecio());
	  DetalleVenta dv9 = new DetalleVenta(pro6, 7, pro6.getPrecio());
	  DetalleVenta dv10 = new DetalleVenta(pro7, 6, pro7.getPrecio());
	  DetalleVenta dv11 = new DetalleVenta(pro8, 5, pro8.getPrecio());
	  DetalleVenta dv12 = new DetalleVenta(pro9, 2, pro9.getPrecio());
	  DetalleVenta dv13 = new DetalleVenta(pro10, 1, pro10.getPrecio());
	  DetalleVenta dv14 = new DetalleVenta(pro1,  2, pro1.getPrecio());
	  DetalleVenta dv15 = new DetalleVenta(pro2,  3, pro2.getPrecio());
	  DetalleVenta dv16 = new DetalleVenta(pro2,  4, pro2.getPrecio());
	  DetalleVenta dv17 = new DetalleVenta(pro3,  7, pro3.getPrecio());
	  DetalleVenta dv18 = new DetalleVenta(pro1,  9, pro1.getPrecio());
	  DetalleVenta dv19 = new DetalleVenta(pro6,  6, pro6.getPrecio());
	  DetalleVenta dv20 = new DetalleVenta(pro5, 9, pro5.getPrecio());
	  DetalleVenta dv21 = new DetalleVenta(pro8,  10, pro8.getPrecio());
	  DetalleVenta dv22 = new DetalleVenta(pro9,  5, pro9.getPrecio());
	  DetalleVenta dv23 = new DetalleVenta(pro10,  5, pro10.getPrecio());
	  DetalleVenta dv24 = new DetalleVenta(pro2,  7, pro2.getPrecio());
	  DetalleVenta dv25 = new DetalleVenta(pro3,  3, pro3.getPrecio());
	  DetalleVenta dv26 = new DetalleVenta(pro1,  3, pro1.getPrecio());
	  DetalleVenta dv27 = new DetalleVenta(pro4,  2, pro4.getPrecio());
	  DetalleVenta dv28 = new DetalleVenta(pro4,  2, pro4.getPrecio());
	  DetalleVenta dv29 = new DetalleVenta(pro5,  1, pro5.getPrecio());
	  DetalleVenta dv30 = new DetalleVenta(pro6,  3, pro6.getPrecio());
	  DetalleVenta dv31 = new DetalleVenta(pro7,  5, pro7.getPrecio());
	  DetalleVenta dv32 = new DetalleVenta(pro7,  6, pro7.getPrecio());
	  DetalleVenta dv33 = new DetalleVenta(pro4,  7, pro4.getPrecio());
	  DetalleVenta dv34 = new DetalleVenta(pro4,  8, pro4.getPrecio());
	  DetalleVenta dv35 = new DetalleVenta(pro4,  9, pro4.getPrecio());
	  DetalleVenta dv36 = new DetalleVenta(pro5,  10, pro5.getPrecio());
	  DetalleVenta dv37 = new DetalleVenta(pro1,  11, pro1.getPrecio());
	  DetalleVenta dv38 = new DetalleVenta(pro2, 5, pro2.getPrecio());
	  DetalleVenta dv39 = new DetalleVenta(pro3, 7, pro3.getPrecio());
	  DetalleVenta dv40 = new DetalleVenta(pro5, 8, pro5.getPrecio());
	  DetalleVenta dv41 = new DetalleVenta(pro4, 9, pro4.getPrecio());
	  DetalleVenta dv42 = new DetalleVenta(pro3,6, pro3.getPrecio());
	  DetalleVenta dv43 = new DetalleVenta(pro3, 2, pro3.getPrecio());
	  DetalleVenta dv44 = new DetalleVenta(pro4, 3, pro4.getPrecio());
	  DetalleVenta dv45 = new DetalleVenta(pro3, 5, pro3.getPrecio());
	  DetalleVenta dv46 = new DetalleVenta(pro6, 6, pro6.getPrecio());
	  DetalleVenta dv47 = new DetalleVenta(pro6, 8, pro6.getPrecio());
	  DetalleVenta dv48 = new DetalleVenta(pro10,2, pro10.getPrecio());
	  DetalleVenta dv49 = new DetalleVenta(pro10,5, pro10.getPrecio());
	  
	  //DETALLE VENTA SUCURSAL 2
	  DetalleVenta dv50 = new DetalleVenta(pro1, 5, pro1.getPrecio());
	  DetalleVenta dv51 = new DetalleVenta(pro2,  6, pro2.getPrecio());
	  DetalleVenta dv52 = new DetalleVenta(pro3,  6, pro3.getPrecio());
	  DetalleVenta dv53 = new DetalleVenta(pro4,  5, pro4.getPrecio());
	  DetalleVenta dv54 = new DetalleVenta(pro5,  4, pro5.getPrecio());
	  DetalleVenta dv55 = new DetalleVenta(pro1,  4, pro1.getPrecio());
	  DetalleVenta dv56 = new DetalleVenta(pro2,  3, pro2.getPrecio());
	  DetalleVenta dv57 = new DetalleVenta(pro6,  1, pro6.getPrecio());
	  DetalleVenta dv58 = new DetalleVenta(pro5,  2, pro5.getPrecio());
	  DetalleVenta dv59 = new DetalleVenta(pro8,  2, pro8.getPrecio());
	  DetalleVenta dv60 = new DetalleVenta(pro7,  2, pro7.getPrecio());
	  DetalleVenta dv61 = new DetalleVenta(pro8, 10, pro8.getPrecio());
	  DetalleVenta dv62 = new DetalleVenta(pro6,  7, pro6.getPrecio());
	  DetalleVenta dv63 = new DetalleVenta(pro1,  7, pro1.getPrecio());
	  DetalleVenta dv64 = new DetalleVenta(pro2,  8, pro2.getPrecio());
	  DetalleVenta dv65 = new DetalleVenta(pro3, 9, pro3.getPrecio());
	  DetalleVenta dv66 = new DetalleVenta(pro4,  9, pro4.getPrecio());
	  DetalleVenta dv67 = new DetalleVenta(pro5,  8, pro5.getPrecio());
	  DetalleVenta dv68 = new DetalleVenta(pro9,  8, pro9.getPrecio());
	  DetalleVenta dv69 = new DetalleVenta(pro8, 5, pro8.getPrecio());
	  DetalleVenta dv70 = new DetalleVenta(pro7,  4, pro7.getPrecio());
	  DetalleVenta dv71 = new DetalleVenta(pro7, 4, pro7.getPrecio());
	  DetalleVenta dv72 = new DetalleVenta(pro6,  3, pro6.getPrecio());
	  DetalleVenta dv73 = new DetalleVenta(pro5,  3, pro5.getPrecio());
	  DetalleVenta dv74 = new DetalleVenta(pro2,  2, pro2.getPrecio());
	  DetalleVenta dv75 = new DetalleVenta(pro3,  1, pro3.getPrecio());
	  DetalleVenta dv76 = new DetalleVenta(pro4, 2, pro4.getPrecio());
	  DetalleVenta dv77 = new DetalleVenta(pro8,  2, pro8.getPrecio());
	  DetalleVenta dv78 = new DetalleVenta(pro9,  2, pro9.getPrecio());
	  DetalleVenta dv79 = new DetalleVenta(pro10, 2, pro10.getPrecio());
	  DetalleVenta dv80 = new DetalleVenta(pro10,  6, pro10.getPrecio());
	  DetalleVenta dv81 = new DetalleVenta(pro10,  6, pro10.getPrecio());
	  DetalleVenta dv82 = new DetalleVenta(pro10,  7, pro10.getPrecio());
	  DetalleVenta dv83 = new DetalleVenta(pro9,  8, pro9.getPrecio());
	  DetalleVenta dv84 = new DetalleVenta(pro8,  8, pro8.getPrecio());
	  DetalleVenta dv85 = new DetalleVenta(pro6,  9, pro6.getPrecio());
	  DetalleVenta dv86 = new DetalleVenta(pro5,  12, pro5.getPrecio());
	  DetalleVenta dv87 = new DetalleVenta(pro2,  4, pro2.getPrecio());
	  DetalleVenta dv88 = new DetalleVenta(pro3,  5, pro3.getPrecio());
	  DetalleVenta dv89 = new DetalleVenta(pro2, 4, pro2.getPrecio());
	  DetalleVenta dv90 = new DetalleVenta(pro5, 5, pro5.getPrecio());
	  DetalleVenta dv91 = new DetalleVenta(pro7,  2, pro7.getPrecio());
	  DetalleVenta dv92 = new DetalleVenta(pro8,  2, pro8.getPrecio());
	  DetalleVenta dv93 = new DetalleVenta(pro7,  3, pro7.getPrecio());
	  DetalleVenta dv94 = new DetalleVenta(pro4,  3, pro4.getPrecio());
	  DetalleVenta dv95 = new DetalleVenta(pro5,   4, pro5.getPrecio());
	  DetalleVenta dv96 = new DetalleVenta(pro1,   5, pro1.getPrecio());
	  DetalleVenta dv97 = new DetalleVenta(pro2,   6, pro2.getPrecio());
	  DetalleVenta dv98 = new DetalleVenta(pro3,   8, pro3.getPrecio());
	  DetalleVenta dv99 = new DetalleVenta(pro4,   9, pro4.getPrecio());
	  DetalleVenta dv100 = new DetalleVenta(pro5,  5, pro5.getPrecio());
	  DetalleVenta dv101 = new DetalleVenta(pro2,  8, pro2.getPrecio());
	  DetalleVenta dv102 = new DetalleVenta(pro3,  9, pro3.getPrecio());
	  DetalleVenta dv103 = new DetalleVenta(pro4,  4, pro4.getPrecio());
	  DetalleVenta dv104 = new DetalleVenta(pro6,  5, pro6.getPrecio());
	  DetalleVenta dv105 = new DetalleVenta(pro8,  6, pro8.getPrecio());
	  DetalleVenta dv106 = new DetalleVenta(pro7,  5, pro7.getPrecio());
	  DetalleVenta dv107 = new DetalleVenta(pro6,  5, pro6.getPrecio());
	  DetalleVenta dv108 = new DetalleVenta(pro1,  3, pro1.getPrecio());
	  DetalleVenta dv109 = new DetalleVenta(pro2,  3, pro2.getPrecio());
	  DetalleVenta dv110 = new DetalleVenta(pro1,  2, pro1.getPrecio());
	  DetalleVenta dv111 = new DetalleVenta(pro3,  5, pro3.getPrecio());
	  DetalleVenta dv112 = new DetalleVenta(pro10, 8, pro10.getPrecio());
	  DetalleVenta dv113 = new DetalleVenta(pro8,  8, pro8.getPrecio());
	  
	  //DETALLE VENTA SUCURSAL 3
	  DetalleVenta dv114 = new DetalleVenta(pro5,  3, pro5.getPrecio());
	  DetalleVenta dv115 = new DetalleVenta(pro1,  4, pro1.getPrecio());
	  DetalleVenta dv116 = new DetalleVenta(pro2,  2, pro2.getPrecio());
	  DetalleVenta dv117 = new DetalleVenta(pro3,  7, pro3.getPrecio());
	  DetalleVenta dv118 = new DetalleVenta(pro4,  8, pro4.getPrecio());
	  DetalleVenta dv119 = new DetalleVenta(pro6,  5, pro6.getPrecio());
	  DetalleVenta dv120 = new DetalleVenta(pro5,  3, pro5.getPrecio());
	  DetalleVenta dv121 = new DetalleVenta(pro8,  4, pro8.getPrecio());
	  DetalleVenta dv122 = new DetalleVenta(pro8,  2, pro8.getPrecio());
	  DetalleVenta dv123 = new DetalleVenta(pro9,  1, pro9.getPrecio());
	  DetalleVenta dv124 = new DetalleVenta(pro10, 7, pro10.getPrecio());
	  DetalleVenta dv125 = new DetalleVenta(pro5,  6, pro5.getPrecio());
	  DetalleVenta dv126 = new DetalleVenta(pro3,  9, pro3.getPrecio());
	  DetalleVenta dv127 = new DetalleVenta(pro2,  8, pro2.getPrecio());
	  DetalleVenta dv128 = new DetalleVenta(pro4,  7, pro4.getPrecio());
	  DetalleVenta dv129 = new DetalleVenta(pro10, 6, pro10.getPrecio());
	  DetalleVenta dv130 = new DetalleVenta(pro9,  4, pro9.getPrecio());
	  DetalleVenta dv131 = new DetalleVenta(pro4,  3, pro4.getPrecio());
	  DetalleVenta dv132 = new DetalleVenta(pro2,  4, pro2.getPrecio());
	  DetalleVenta dv133 = new DetalleVenta(pro1,  2, pro1.getPrecio());
	  DetalleVenta dv134 = new DetalleVenta(pro2,  3, pro2.getPrecio());
	  DetalleVenta dv135 = new DetalleVenta(pro3,  7, pro3.getPrecio());
	  DetalleVenta dv136 = new DetalleVenta(pro5,  9, pro5.getPrecio());
	  DetalleVenta dv137 = new DetalleVenta(pro6,  10, pro6.getPrecio());
	  DetalleVenta dv138 = new DetalleVenta(pro2, 11, pro2.getPrecio());
	  DetalleVenta dv139 = new DetalleVenta(pro3,  3, pro3.getPrecio());
	  DetalleVenta dv140 = new DetalleVenta(pro10, 4, pro10.getPrecio());
	  DetalleVenta dv141 = new DetalleVenta(pro7,  3 , pro7.getPrecio());
	  DetalleVenta dv142 = new DetalleVenta(pro1,  2, pro1.getPrecio());
	  DetalleVenta dv143 = new DetalleVenta(pro4,  9, pro4.getPrecio());
	  DetalleVenta dv144 = new DetalleVenta(pro5,  4, pro5.getPrecio());
	  DetalleVenta dv145 = new DetalleVenta(pro6,  3, pro6.getPrecio());
	  DetalleVenta dv146 = new DetalleVenta(pro7,  5, pro7.getPrecio());
	  DetalleVenta dv147 = new DetalleVenta(pro6,  7, pro6.getPrecio());
	  DetalleVenta dv148 = new DetalleVenta(pro6,  10, pro6.getPrecio());
	  DetalleVenta dv149 = new DetalleVenta(pro7,  3, pro7.getPrecio());
	  DetalleVenta dv150 = new DetalleVenta(pro8,  4, pro8.getPrecio());
	  DetalleVenta dv151 = new DetalleVenta(pro9,  5, pro9.getPrecio());
	  DetalleVenta dv152 = new DetalleVenta(pro10, 7, pro10.getPrecio());
	  DetalleVenta dv153 = new DetalleVenta(pro1,  6, pro1.getPrecio());
	  DetalleVenta dv154 = new DetalleVenta(pro2,  8, pro2.getPrecio());
	  DetalleVenta dv155 = new DetalleVenta(pro3,  5, pro3.getPrecio());
	  DetalleVenta dv156 = new DetalleVenta(pro4,  5, pro4.getPrecio());
	  DetalleVenta dv157 = new DetalleVenta(pro5,  5, pro5.getPrecio());
	  DetalleVenta dv158 = new DetalleVenta(pro6,  4, pro6.getPrecio());
	  DetalleVenta dv159 = new DetalleVenta(pro7,  3, pro7.getPrecio());
	  DetalleVenta dv160 = new DetalleVenta(pro6,  2, pro6.getPrecio());
	  DetalleVenta dv161 = new DetalleVenta(pro7,  5, pro7.getPrecio());
	  DetalleVenta dv162 = new DetalleVenta(pro8,  7, pro8.getPrecio());
	  DetalleVenta dv163 = new DetalleVenta(pro9,  6, pro9.getPrecio());
	  DetalleVenta dv164 = new DetalleVenta(pro10, 7, pro10.getPrecio());
	  DetalleVenta dv165 = new DetalleVenta(pro1,  5, pro1.getPrecio());
	  DetalleVenta dv166 = new DetalleVenta(pro2,  6, pro2.getPrecio());
	  DetalleVenta dv167 = new DetalleVenta(pro3,  8, pro3.getPrecio());
	  DetalleVenta dv168 = new DetalleVenta(pro4,  9, pro4.getPrecio());
	  DetalleVenta dv169 = new DetalleVenta(pro5,  4, pro5.getPrecio());
	  DetalleVenta dv170 = new DetalleVenta(pro4,  2, pro4.getPrecio());
	  DetalleVenta dv171 = new DetalleVenta(pro6,  3, pro6.getPrecio());
	  DetalleVenta dv172 = new DetalleVenta(pro7,  5, pro7.getPrecio());
	  DetalleVenta dv173 = new DetalleVenta(pro1,  3, pro1.getPrecio());
	  DetalleVenta dv174 = new DetalleVenta(pro2,  3, pro2.getPrecio());
	  DetalleVenta dv175 = new DetalleVenta(pro3,  7, pro3.getPrecio());
	  DetalleVenta dv176 = new DetalleVenta(pro5,  6, pro5.getPrecio());
	  DetalleVenta dv177 = new DetalleVenta(pro5,  6, pro5.getPrecio());
	  DetalleVenta dv178 = new DetalleVenta(pro6,  6, pro6.getPrecio());
	  DetalleVenta dv179 = new DetalleVenta(pro7,  7, pro7.getPrecio());
	  DetalleVenta dv180 = new DetalleVenta(pro8,  5, pro8.getPrecio());
	  DetalleVenta dv181 = new DetalleVenta(pro9,  6, pro9.getPrecio());
	  DetalleVenta dv182 = new DetalleVenta(pro10, 4, pro10.getPrecio());
	  DetalleVenta dv183 = new DetalleVenta(pro1,  4, pro1.getPrecio());
	  DetalleVenta dv184 = new DetalleVenta(pro2,  4, pro2.getPrecio());
	  DetalleVenta dv185 = new DetalleVenta(pro3,  4, pro3.getPrecio());
	  DetalleVenta dv186 = new DetalleVenta(pro1,  5, pro1.getPrecio());
	  DetalleVenta dv187 = new DetalleVenta(pro2,  5, pro2.getPrecio());
	  DetalleVenta dv188 = new DetalleVenta(pro3,  3, pro3.getPrecio());
	  DetalleVenta dv189 = new DetalleVenta(pro3,  7, pro3.getPrecio());
	  DetalleVenta dv190 = new DetalleVenta(pro4,  8, pro4.getPrecio());
	  DetalleVenta dv191 = new DetalleVenta(pro5,  4, pro5.getPrecio());
	  DetalleVenta dv192 = new DetalleVenta(pro6,  6, pro6.getPrecio());
	  
	 //LISTAS PARA DetalleVenta
	  List<DetalleVenta> v1 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v2 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v3 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v4 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v5 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v6 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v7 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v8 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v9 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v10 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v11 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v12 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v13 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v14 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v15 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v16 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v17 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v18 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v19 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v20 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v21 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v22 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v23 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v24 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v25 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v26 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v27 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v28 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v29 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v30 = new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v31= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v32= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v33= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v34= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v35= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v36= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v37= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v38= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v39= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v40= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v41= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v42= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v43= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v44= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v45= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v46= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v47= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v48= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v49= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v50= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v51= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v52= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v53= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v54= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v55= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v56= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v57= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v58= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v59= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v60= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v61= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v62= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v63= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v64= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v65= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v66= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v67= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v68= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v69= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v70= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v71= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v72= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v73= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v74= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v75= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v76= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v77= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v78= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v79= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v80= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v81= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v82= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v83= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v84= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v85= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v86= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v87= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v88= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v89= new ArrayList<DetalleVenta>();
	  List<DetalleVenta> v90= new ArrayList<DetalleVenta>();
	  

	  /****************SUCURSAL 1**********************/
	  v1.add(dv1);v1.add(dv2); v1.add(dv3);
	  v2.add(dv4); v2.add(dv5);
	  v3.add(dv6);
	  v4.add(dv7); v4.add(dv8); v4.add(dv9);
	  v5.add(dv10); v5.add(dv11); v5.add(dv12);
	  v6.add(dv13); v6.add(dv14); v6.add(dv15);
	  v7.add(dv16); v7.add(dv17);
	  v8.add(dv18);
	  v9.add(dv19);
	  v10.add(dv20);
	  v11.add(dv21); v11.add(dv22); v11.add(dv23);
	  v12.add(dv24); v12.add(dv25);
	  v13.add(dv26);
	  v14.add(dv27);
	  v15.add(dv28); v15.add(dv29);
	  v16.add(dv30);
	  v17.add(dv31);
	  v18.add(dv32); v18.add(dv33);
	  v19.add(dv34);
	  v20.add(dv35);
	  v21.add(dv36);
	  v22.add(dv37);
	  v23.add(dv38); v23.add(dv39); v23.add(dv40);
	  v24.add(dv41);
	  v25.add(dv42);
	  v26.add(dv43); v26.add(dv44);
	  v27.add(dv45);
	  v28.add(dv46);
	  v29.add(dv47); v29.add(dv48); 
	  v30.add(dv49);
	  /*****************************SUCURSAL 2**************************/
	  v31.add(dv50); v31.add(dv51); v31.add(dv52);
	  v32.add(dv53);
	  v33.add(dv54); v33.add(dv55);
	  v34.add(dv56); v34.add(dv57);
	  v35.add(dv58); v35.add(dv59);
	  v36.add(dv60); v36.add(dv61); v36.add(dv62);
	  v37.add(dv63); v37.add(dv64);
	  v38.add(dv65);
	  v39.add(dv66);
	  v40.add(dv67); v40.add(dv68);
	  v41.add(dv69);
	  v42.add(dv70); v42.add(dv71);
	  v43.add(dv72);
	  v44.add(dv73); v44.add(dv74); v44.add(dv75);
	  v45.add(dv76); v45.add(dv77); 
	  v46.add(dv78); 
	  v47.add(dv79); v47.add(dv80); 
	  v48.add(dv81); 
	  v49.add(dv82); 
	  v50.add(dv83); v50.add(dv84); v50.add(dv85);
	  v51.add(dv86);v51.add(dv112);v51.add(dv113);
	  v52.add(dv87);
	  v53.add(dv88); v53.add(dv89); v53.add(dv90);
	  v54.add(dv91); 
	  v55.add(dv92); v55.add(dv93);
	  v56.add(dv94); v56.add(dv95); v56.add(dv96);
	  v57.add(dv97); v57.add(dv98); v57.add(dv99);
	  v58.add(dv100); v58.add(dv101); v58.add(dv102);
	  v59.add(dv103); v59.add(dv104); v59.add(dv105);v59.add(dv106); v59.add(dv107); v59.add(dv108);
	  v60.add(dv109); v60.add(dv110); v60.add(dv111);
	  /***************************SUCURSAL 3**************************/
	  v61.add(dv114); v61.add(dv115); v61.add(dv116);
	  v62.add(dv117); v62.add(dv117); v62.add(dv118);
	  v63.add(dv119); v63.add(dv120); v63.add(dv121);
	  v64.add(dv122); v64.add(dv123); v64.add(dv124);
	  v65.add(dv125); v65.add(dv126); v65.add(dv127);
	  v66.add(dv128); v66.add(dv129); v66.add(dv130);
	  v67.add(dv131); v67.add(dv132); v67.add(dv133);
	  v68.add(dv134); v68.add(dv135); v68.add(dv136);
	  v69.add(dv137); v69.add(dv138); v69.add(dv139);
	  v70.add(dv140); v70.add(dv141); v70.add(dv142);
	  v71.add(dv143); v71.add(dv144); v71.add(dv145);
	  v72.add(dv146); v72.add(dv147); v72.add(dv148);
	  v73.add(dv149); v73.add(dv150); v73.add(dv151);
	  v74.add(dv152); v74.add(dv153); v74.add(dv154);
	  v75.add(dv155); v75.add(dv156); v75.add(dv157);
	  v76.add(dv158); v76.add(dv159); v76.add(dv160);
	  v77.add(dv161); v77.add(dv162); v77.add(dv163);
	  v78.add(dv164); v78.add(dv165); v78.add(dv166);
	  v79.add(dv167); v79.add(dv168); v79.add(dv169);
	  v80.add(dv170); v80.add(dv171);
	  v81.add(dv172); v81.add(dv173);
	  v82.add(dv174); v82.add(dv175);
	  v83.add(dv176); v83.add(dv177);
	  v84.add(dv178); v84.add(dv179);
	  v85.add(dv180); v85.add(dv181);
	  v86.add(dv182); v86.add(dv183);
	  v87.add(dv184); v87.add(dv185);
	  v88.add(dv186); v88.add(dv187);
	  v89.add(dv188); v89.add(dv189);
	  v90.add(dv190); v90.add(dv191);v90.add(dv192);
	  
	  //INICALIZACION DE LA CLASE QUE INTERACTUA CON MONGO 
	  Sistema sistema = new Sistema();
	  
	  //CONEXION AL SERVER DE MONGO DB
	  sistema.conexion("localhost", 27017);
	 
 	   //VENTAS SUCURSAL 1
	  sistema.argegarVenta(0001100, c1, LocalDate.of(2020,4,9), tpag1, suc1, e1, e3 ,v1);
	  sistema.argegarVenta(0001101, c1, LocalDate.of(2020,4,10), tpag1, suc1, e1, e3 ,v2);
	  sistema.argegarVenta(0001102, c1, LocalDate.of(2020,4,10), tpag1, suc1, e3, e4 ,v3);
	  sistema.argegarVenta(0001103, c2, LocalDate.of(2020,04,11), tpag1, suc1, e3, e1, v4);
	  sistema.argegarVenta(0001104, c2, LocalDate.of(2020,04,12), tpag3, suc1, e3, e1, v5);
	  sistema.argegarVenta(0001105, c2, LocalDate.of(2020,04,15), tpag3, suc1, e3, e1, v6);
	  sistema.argegarVenta(0001106, c2, LocalDate.of(2020,04,16), tpag3, suc1, e3, e1, v7);
	  sistema.argegarVenta(0001107, c3, LocalDate.of(2020,04,16), tpag3, suc1, e3, e1, v8);
	  sistema.argegarVenta(0001110, c3, LocalDate.of(2020,04,17), tpag2, suc1, e3, e1, v9);
	  sistema.argegarVenta(0001111, c3, LocalDate.of(2020,04,17), tpag2, suc1, e3, e1, v10);
	  sistema.argegarVenta(0001112, c3, LocalDate.of(2020,04,17), tpag2, suc1, e3, e4, v11);
	  sistema.argegarVenta(0001113, c3, LocalDate.of(2020,04,17), tpag2, suc1, e3, e4, v12);
	  sistema.argegarVenta(0001114, c4, LocalDate.of(2020,04,17), tpag2, suc1, e3, e4, v13);
	  sistema.argegarVenta(0001115, c4, LocalDate.of(2020,04,18), tpag2, suc1, e3, e4, v14);
	  sistema.argegarVenta(0001116, c4, LocalDate.of(2020,04,18), tpag1, suc1, e3, e4, v15);
	  sistema.argegarVenta(0001117, c5, LocalDate.of(2020,04,18), tpag1, suc1, e3, e4, v16);
	  sistema.argegarVenta(0001120, c5, LocalDate.of(2020,05,19), tpag1, suc1, e3, e4, v17);
	  sistema.argegarVenta(0001121, c6, LocalDate.of(2020,05,20), tpag1, suc1, e1, e3, v18);
	  sistema.argegarVenta(0001122, c6, LocalDate.of(2020,05,20), tpag1, suc1, e1, e3, v19);
	  sistema.argegarVenta(0001123, c6, LocalDate.of(2020,05,20), tpag1, suc1, e1, e3, v20); 
	  sistema.argegarVenta(0001124, c6, LocalDate.of(2020,05,21), tpag3, suc1, e1, e3, v21);
	  sistema.argegarVenta(0001125, c6, LocalDate.of(2020,05,22), tpag3, suc1, e1, e3, v22);
	  sistema.argegarVenta(0001126, c7, LocalDate.of(2020,05,22), tpag3, suc1, e1, e3, v23);
	  sistema.argegarVenta(0001127, c7, LocalDate.of(2020,05,22), tpag2, suc1, e4, e3, v24);
	  sistema.argegarVenta(0001130, c8, LocalDate.of(2020,05,24), tpag2, suc1, e4, e1, v25);
	  sistema.argegarVenta(0001131, c8, LocalDate.of(2020,05,26), tpag2, suc1, e4, e1, v26);
	  sistema.argegarVenta(0001132, c9, LocalDate.of(2020,05,26), tpag3, suc1, e4, e1, v27);
	  sistema.argegarVenta(0001133, c9, LocalDate.of(2020,05,27), tpag1, suc1, e4, e1, v28);
	  sistema.argegarVenta(0001134, c10,LocalDate.of(2020,05,28), tpag1, suc1, e4, e1, v29);
	  sistema.argegarVenta(0001135, c10,LocalDate.of(2020,06, 5), tpag1, suc1, e4, e1, v30);
	  
	  //VENTAS SUCURSAL 2
	  sistema.argegarVenta(0005200, c1, LocalDate.of(2020,04,10), tpag1, suc2, e8, e5, v31);
	  sistema.argegarVenta(0005201, c1, LocalDate.of(2020,04,11), tpag1, suc2, e8, e5, v32);
	  sistema.argegarVenta(0005202, c2, LocalDate.of(2020,04,12), tpag1, suc2, e5, e8, v33);
	  sistema.argegarVenta(0005203, c2, LocalDate.of(2020,04,12), tpag1, suc2, e5, e8, v34);
	  sistema.argegarVenta(0005204, c2, LocalDate.of(2020,04,12), tpag3, suc2, e5, e8, v35);
	  sistema.argegarVenta(0005205, c2, LocalDate.of(2020,04,15), tpag3, suc2, e5, e9, v36);
	  sistema.argegarVenta(0005206, c2, LocalDate.of(2020,04,15), tpag3, suc2, e5, e9, v37);
	  sistema.argegarVenta(0005207, c3, LocalDate.of(2020,04,15), tpag3, suc2, e5, e9, v38);
	  sistema.argegarVenta(0005210, c3, LocalDate.of(2020,04,15), tpag2, suc2, e5, e9, v39);
	  sistema.argegarVenta(0005211, c3, LocalDate.of(2020,04,18), tpag2, suc2, e5, e9, v40);
	  sistema.argegarVenta(0005212, c3, LocalDate.of(2020,04,19), tpag2, suc2, e5, e9, v41);
	  sistema.argegarVenta(0005213, c3, LocalDate.of(2020,04,25), tpag2, suc2, e5, e9, v42);
	  sistema.argegarVenta(0005214, c4, LocalDate.of(2020,04,25), tpag2, suc2, e5, e9, v43);
	  sistema.argegarVenta(0005215, c5, LocalDate.of(2020,04,27), tpag2, suc2, e5, e9, v44);
	  sistema.argegarVenta(0005216, c5, LocalDate.of(2020,04,28), tpag1, suc2, e5, e8, v45);
	  sistema.argegarVenta(0005217, c5, LocalDate.of(2020,04,28), tpag1, suc2, e5, e8, v46);
	  sistema.argegarVenta(0005220, c5, LocalDate.of(2020,04,28), tpag1, suc2, e5, e8, v47);
	  sistema.argegarVenta(0005221, c5, LocalDate.of(2020,04,29), tpag1, suc2, e9, e8, v48);
	  sistema.argegarVenta(0005222, c5, LocalDate.of(2020,05,11), tpag1, suc2, e9, e8, v49);
	  sistema.argegarVenta(0005223, c6, LocalDate.of(2020,05,11), tpag1, suc2, e9, e8, v50);
	  sistema.argegarVenta(0005224, c6, LocalDate.of(2020,05,11), tpag3, suc2, e9, e8, v51);
	  sistema.argegarVenta(0005225, c6, LocalDate.of(2020,05,11), tpag3, suc2, e9, e5, v52);
	  sistema.argegarVenta(0005226, c7, LocalDate.of(2020,05,11), tpag3, suc2, e9, e5, v53);
	  sistema.argegarVenta(0005227, c7, LocalDate.of(2020,05,16), tpag2, suc2, e9, e5, v54);
	  sistema.argegarVenta(0005230, c8, LocalDate.of(2020,05,16), tpag2, suc2, e8, e5, v55);
	  sistema.argegarVenta(0005231, c8, LocalDate.of(2020,05,16), tpag2, suc2, e8, e9, v56);
	  sistema.argegarVenta(0005232, c9, LocalDate.of(2020,05,19), tpag3, suc2, e8, e9, v57);
	  sistema.argegarVenta(0005233, c9, LocalDate.of(2020,05,19), tpag1, suc2, e8, e9, v58);
	  sistema.argegarVenta(0005234, c10,LocalDate.of(2020,05,19), tpag1, suc2, e8, e9, v59);
	  sistema.argegarVenta(0005235, c10,LocalDate.of(2020,05,21), tpag1, suc2, e8, e2, v60);
	 
	  //VENTAS SUCURSAL 3 
	  sistema.argegarVenta(0007600, c1, LocalDate.of(2020,04,18), tpag1, suc3, e2, e7, v61);
	  sistema.argegarVenta(0007601, c1, LocalDate.of(2020,04,19), tpag1, suc3, e2, e7, v62);
	  sistema.argegarVenta(0007602, c1, LocalDate.of(2020,04,20), tpag1, suc3, e2, e7, v63);
	  sistema.argegarVenta(0007603, c2, LocalDate.of(2020,04,21), tpag1, suc3, e2, e7, v64);
	  sistema.argegarVenta(0007604, c2, LocalDate.of(2020,04,21), tpag3, suc3, e2, e7, v65);
	  sistema.argegarVenta(0007632, c9, LocalDate.of(2020,04,21), tpag3, suc3, e6, e9, v66);
	  sistema.argegarVenta(0007633, c9, LocalDate.of(2020,04,25), tpag1, suc3, e6, e9, v67);
	  sistema.argegarVenta(0007634, c10, LocalDate.of(2020,04,26), tpag1, suc3, e6, e9, v68);
	  sistema.argegarVenta(0007635, c10, LocalDate.of(2020,04,27), tpag1, suc3, e7, e2, v69);
	  sistema.argegarVenta(0007605, c2, LocalDate.of(2020,04,27), tpag3, suc3, e2, e7, v70);
	  sistema.argegarVenta(0007606, c2, LocalDate.of(2020,04,27), tpag3, suc3, e2, e6, v71);
	  sistema.argegarVenta(0007607, c3, LocalDate.of(2020,04,28), tpag3, suc3, e2, e6, v72);
	  sistema.argegarVenta(0007610, c3, LocalDate.of(2020,04,29), tpag2, suc3, e2, e6, v73);
	  sistema.argegarVenta(0007611, c3, LocalDate.of(2020,04,30), tpag2, suc3, e2, e6, v74);
	  sistema.argegarVenta(0007612, c3, LocalDate.of(2020,05,18), tpag2, suc3, e2, e6, v75);
	  sistema.argegarVenta(0007613, c3, LocalDate.of(2020,05,18), tpag2, suc3, e2, e6, v76);
	  sistema.argegarVenta(0007614, c4, LocalDate.of(2020,05,18), tpag2, suc3, e2, e6, v77);
	  sistema.argegarVenta(0007615, c4, LocalDate.of(2020,05,18), tpag2, suc3, e7, e6, v78);
	  sistema.argegarVenta(0007616, c4, LocalDate.of(2020,05,18), tpag1, suc3, e7, e6, v79);
	  sistema.argegarVenta(0007617, c5, LocalDate.of(2020,05,19), tpag1, suc3, e7, e6, v80);
	  sistema.argegarVenta(0007620, c5, LocalDate.of(2020,05,19), tpag1, suc3, e7, e6, v81);
	  sistema.argegarVenta(0007621, c6, LocalDate.of(2020,05,20), tpag1, suc3, e7, e6, v82);
	  sistema.argegarVenta(0007622, c6, LocalDate.of(2020,05,20), tpag1, suc3, e6, e7, v83);
	  sistema.argegarVenta(0007623, c6, LocalDate.of(2020,05,20), tpag1, suc3, e6, e7, v84); 
	  sistema.argegarVenta(0007624, c6, LocalDate.of(2020,05,21), tpag3, suc3, e6, e2, v85);
	  sistema.argegarVenta(0007625, c6, LocalDate.of(2020,05,21), tpag3, suc3, e6, e2, v86);
	  sistema.argegarVenta(0007626, c7, LocalDate.of(2020,05,21), tpag3, suc3, e6, e2, v87);
	  sistema.argegarVenta(0007627, c7, LocalDate.of(2020,05,23), tpag2, suc3, e6, e2, v88);
	  sistema.argegarVenta(0007630, c8, LocalDate.of(2020,05,25), tpag2, suc3, e6, e2, v89);
	  sistema.argegarVenta(0007631, c8, LocalDate.of(2020,05,26), tpag2, suc3, e2, e9, v90);
	
	  
	  /*---------------------------------------------------------------------------------------------------------------------------*/
	  /*
		try {
		  
		  //PASO 4 METEMOS LOS OBJETOS VENTAS (DOCUMENTOS EN MONGO) EN LA COLECCION colectionVentas 
		  
		  for(Venta vent : sistema.getListaVentas() ) {
			  collectionVentas.insert(vent.toDBObjectVenta());
		  }
		  
		 
		 //PASO 5 METEMOS LOS OBJETOS DETALLE VENTAS (DOCUMENTOS EN MONGO) EN LA COLECCION colectionDetalleVentas 
		  for(DetalleVenta dv : detalleVentas) {
			  collectionDetalleVentas.insert(dv.toDBObjectDetalleVenta());
		   }
		  
		  
		  //PASO 6 LEEMOS TODOS LOS DOCUMENTOS DE LAS DOS COLECCIONES EN LA BASE DE DATOS  
		  //VOY A RECORRER TODOS LOS DOCUMENTOS A TRAVEZ DE UN CURSOR
		  DBCursor cursorVentas = collectionVentas.find();
		  DBCursor cursorDetalleVentas = collectionDetalleVentas.find();

		  try {
			  
			  while(cursorVentas.hasNext()) {
				  System.out.println(cursorVentas.next().toString());
			  }
		  }finally {
			cursorVentas.close(); //liberamos la memoria ultilizada por el cursor
		  }
		  System.out.println("/n/n");
		 
		  try {
			  
			  while(cursorDetalleVentas.hasNext()) {
				  System.out.println(cursorDetalleVentas.next().toString());
			  } 
		  }finally {
			cursorDetalleVentas.close(); //liberamos la memoria ultilizada por el cursor
		  }
		  
		  
		  //CIERRO LA CONEXION
		  mongoClient.close();
	  }
	  catch (UnknownHostException ex) {
		System.out.println("Error al conectar al server de MongoDB: " + ex.getMessage());
	  }

	  */
	  
		  
	  //DESCONEXION DEL SERVER DE MONGO	  
	  sistema.desconexion();
	}
}
