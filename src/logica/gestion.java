package logica;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class gestion {
	//Atributos
		private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		private ArrayList<Persona> personas;
		private ArrayList<Producto> productos;
		private ArrayList<Habitacion> habitaciones;
		private ArrayList<Recepcionista> recepcionistas;
		private ArrayList<Reserva> reservas;
		private ArrayList<Factura> facturas;
		
	//Constructor
	public gestion() {
		personas=new ArrayList<Persona>();
		productos=new ArrayList<Producto>();
		habitaciones=new ArrayList<Habitacion>();
		recepcionistas=new ArrayList<Recepcionista>();
		reservas = new ArrayList<Reserva>();
		facturas = new ArrayList<Factura>();
	}
	//Metodos
		//Reserva
			public void agregarReserva(String codigo,Date fechaEntrada,String numeroPersonas, Habitacion habitacion) {
				Reserva reserva = new Reserva(codigo, fechaEntrada, numeroPersonas, habitacion);
				reservas.add(reserva);
			}
			public String[][] mostrarReservas() {
				String[][] datos = new String[reservas.size()][5];
				for (int i = 0; i < reservas.size(); i++) {
					datos[i][0] = reservas.get(i).getCodigo();
					datos[i][1] = formato.format(reservas.get(i).getFechaEntrada());
					datos[i][2] = reservas.get(i).getNumeroPersonas();
					datos[i][3] = "N° "+reservas.get(i).getHabitacion().getNumeroHabitacion();
					datos[i][4] = String.valueOf(i);
				}
				return datos;
			}
			public String[][] mostrarListaHabitaciones() {
				String[][] datosHabitaciones = new String[habitaciones.size()][5];
				for (int i = 0; i < habitaciones.size(); i++) {
					datosHabitaciones[i][0] = habitaciones.get(i).getNumeroHabitacion();
					datosHabitaciones[i][1] = habitaciones.get(i).getNumeroMaxUsuarios();
					datosHabitaciones[i][2] = String.valueOf(habitaciones.get(i).getPrecioPer());
					datosHabitaciones[i][3] = habitaciones.get(i).getOpcion();
					datosHabitaciones[i][4] = String.valueOf(i); 
				}
				return datosHabitaciones;
			}
			public void eliminarReserva(String posicion) {
				reservas.remove(Integer.parseInt(posicion));
			}
		//Facturacion
			public void agregarFactura(Date fechaSalida, int precioEstadia, int totalProductos, int total) {
				Factura factura = new Factura(fechaSalida,precioEstadia,totalProductos,total);
				facturas.add(factura);
			}
			public String[][] mostrarVentas() {
				String[][] datos = new String[facturas.size()][7];
				for (int i = 0; i < facturas.size(); i++) {
					datos[i][0] = formato.format(facturas.get(i).getFechaSalida());
 					datos[i][1] = String.valueOf(facturas.get(i).getPrecioEstadia());
 					datos[i][2] = String.valueOf(facturas.get(i).getTotalProductos());
  					datos[i][3] = String.valueOf(facturas.get(i).getTotal());
				}
				return datos;
			}
		//Persona
			public void agregarPersona(String documento, String nombre, String ciudad,String celular, Date fechaNacimiento,String nombreUsuario,String contraseña) {
				Persona persona = new Persona(documento,nombre, ciudad, celular, fechaNacimiento, nombreUsuario, contraseña);
				personas.add(persona);
			}
			public String[][] mostrarPersonas() {
				String[][] datosPersonas = new String[personas.size()][7];
				for (int i = 0; i < personas.size(); i++) {
					datosPersonas[i][0] = personas.get(i).getDocumento();
					datosPersonas[i][1] = personas.get(i).getNombre();
					datosPersonas[i][2] = personas.get(i).getCiudad();
					datosPersonas[i][3] = personas.get(i).getCelular();
					datosPersonas[i][4] = formato.format(personas.get(i).getFechaNacimiento());
					datosPersonas[i][5] = personas.get(i).getNombreUsuario();
					datosPersonas[i][6] = personas.get(i).getContraseña();
				}
				return datosPersonas;
			}
			public String[] cargarPersona(String documento) {
				int posicion=buscarPersona(documento);
				if (posicion != -1) {
					String datosProducto[] = {String.valueOf(posicion), personas.get(posicion).getDocumento(),
							personas.get(posicion).getNombre(),personas.get(posicion).getCiudad(),
									personas.get(posicion).getCelular(),formato.format(personas.get(posicion).getFechaNacimiento()),
									personas.get(posicion).getNombreUsuario(),personas.get(posicion).getContraseña()};
							
					return datosProducto;
				}
				else if(posicion==-1) {
					String [] error= {String.valueOf(posicion),"No existe el documento","","","","","",""};
					return error;
				}
				return null;
			}
			public int buscarPersona(String documento) {
				for (int i = 0; i < personas.size(); i++) {
					if(personas.get(i).getDocumento().equals(documento)) {
						return i;
					}
				}
				return -1;
			}
			public void modificarPersona(String posicion, String documento, String nombre, String ciudad, String celular,
					Date fechaNacimiento, String usuario, String contraseña) {
				Persona persona = new Persona(documento,nombre,ciudad,celular,fechaNacimiento,usuario,contraseña);
				personas.set(Integer.parseInt(posicion),persona);
			}
			public void eliminarPersona(String posicion) {
				personas.remove(Integer.parseInt(posicion));
			}
		//Productos
			public void agregarProducto(String codigo, String nombre, int cantidad, int precio){
				Producto producto = new Producto(codigo, nombre, cantidad, precio);
				productos.add(producto);
			}
			public String[][] mostrarProductos() {
				String[][] datosProductos = new String[productos.size()][4];
				for (int i = 0; i < productos.size(); i++) {
					datosProductos[i][0] = productos.get(i).getCodigo();
					datosProductos[i][1] = productos.get(i).getNombre();
					datosProductos[i][2] = String.valueOf(productos.get(i).getCantidad());
					datosProductos[i][3] = String.valueOf(productos.get(i).getPrecio());	
				}
				return datosProductos;
			}
			public String[] cargarProducto(String codigo) {
				int posicion=buscarProducto(codigo);
				if (posicion != -1) {
					String datosProducto[] = {String.valueOf(posicion), productos.get(posicion).getCodigo(),
							productos.get(posicion).getNombre(),String.valueOf(productos.get(posicion).getCantidad()),
									String.valueOf(productos.get(posicion).getPrecio())};
							
					return datosProducto;
				}
				else if(posicion==-1) {
					String [] error= {String.valueOf(posicion),"No existe el código","","",""};
					return error;
				}
				return null;
			}
			public int buscarProducto(String codigo) {
				for (int i = 0; i < productos.size(); i++) {
					if(productos.get(i).getCodigo().equals(codigo)) {
						return i;
					}
				}
				return -1;
			}
			public void eliminarProducto(String posicion) {
				productos.remove(Integer.parseInt(posicion));
			}
			public void modificarProductoDocumento(String posicion, String codigo, String nombre, int cantidad, int precio) {
				Producto producto = new Producto(codigo,nombre,cantidad,precio);
				productos.set(Integer.parseInt(posicion), producto);
				
			}
		//Recepcionistas	
			public void agregarRecepcionista(String documento,String nombre, String apellido, String telefono, String direccion) {
				Recepcionista recepcionista = new Recepcionista(documento, nombre, apellido, telefono, direccion);
				recepcionistas.add(recepcionista);
			}
			public String[][] mostrarRecepcionistas() {
				String[][] datosRecepcionistas = new String[recepcionistas.size()][5];
				for (int i = 0; i < recepcionistas.size(); i++) {
					datosRecepcionistas[i][0] = recepcionistas.get(i).getDocumento();
					datosRecepcionistas[i][1] = recepcionistas.get(i).getNombre();
					datosRecepcionistas[i][2] = recepcionistas.get(i).getApellido();
					datosRecepcionistas[i][3] = recepcionistas.get(i).getTelefono();
					datosRecepcionistas[i][4] = recepcionistas.get(i).getDireccion();
				}
				return datosRecepcionistas;
			}
			public String[] cargarRecepcionista(String documento) {
				int posicion=buscarRecepcionista(documento);
				if (posicion != -1) {
					String datosProducto[] = {String.valueOf(posicion), recepcionistas.get(posicion).getDocumento(),
							recepcionistas.get(posicion).getNombre(),recepcionistas.get(posicion).getApellido(),
							recepcionistas.get(posicion).getTelefono(),recepcionistas.get(posicion).getDireccion()};
					return datosProducto;
				}
				else if(posicion==-1) {
					String [] error= {String.valueOf(posicion),"No existe el documento","","","",""};
					return error;
				}
				return null;
			}
			public int buscarRecepcionista(String documento) {
				for (int i = 0; i < recepcionistas.size(); i++) {
					if(recepcionistas.get(i).getDocumento().equals(documento)) {
						return i;
					}
				}
				return -1;
			}
			public void modificarRecepcionista(String posicion, String documento, String nombre, String apellido,
					String telefono, String direccion) {
				Recepcionista recepcionista = new Recepcionista(documento,nombre,apellido,telefono,direccion);
				recepcionistas.set(Integer.parseInt(posicion), recepcionista);
			}
			public void eliminarRecepcionista(String posicion) {
				recepcionistas.remove(Integer.parseInt(posicion));
			}
		//Habitaciones	
			public void agregarHabitacion(String numeroHabitacion, String capacidad, int precioPersona, String opcion) {
				Habitacion habitacion = new Habitacion(numeroHabitacion, capacidad, precioPersona, opcion);
				habitaciones.add(habitacion);
			}
			public String[][] mostrarHabitaciones() {
				String[][] datosHabitaciones = new String[habitaciones.size()][4];
				for (int i = 0; i < habitaciones.size(); i++) {
					datosHabitaciones[i][0] = habitaciones.get(i).getNumeroHabitacion();
					datosHabitaciones[i][1] = habitaciones.get(i).getNumeroMaxUsuarios();
					datosHabitaciones[i][2] = String.valueOf(habitaciones.get(i).getPrecioPer());
					datosHabitaciones[i][3] = habitaciones.get(i).getOpcion();
				}
				return datosHabitaciones;
			}
			public String[] cargarHabitacion(String habitacionNum) {
				int posicion=buscarHabitacion(habitacionNum);
				if (posicion != -1) {
					String datosProducto[] = {String.valueOf(posicion), habitaciones.get(posicion).getNumeroHabitacion(),
							habitaciones.get(posicion).getNumeroMaxUsuarios(),String.valueOf(habitaciones.get(posicion).getPrecioPer()),
							habitaciones.get(posicion).getOpcion()};
					return datosProducto;
				}
				else if(posicion==-1) {
					String [] error= {String.valueOf(posicion),"No existe la habitación","","","",""};
					return error;
				}
				return null;
			}
		
			public int buscarHabitacion(String habitacionNum) {
				for (int i = 0; i < habitaciones.size(); i++) {
					if(habitacionNum.equals(habitaciones.get(i).getNumeroHabitacion())) {
						return i;
					}
				}
				return -1;
			}
			public void modificarHabitacion(String posicion, String numeroHabitacion, int capacidad, int precioPer,
					String opcion) {
				Habitacion habitacion = new Habitacion(numeroHabitacion,String.valueOf(capacidad),precioPer,opcion);
				habitaciones.set(Integer.parseInt(posicion), habitacion);
			}
			public void eliminarHabitacion(String posicion) {
				habitaciones.remove(Integer.parseInt(posicion));
			}

	//Getters/Setters
		public ArrayList<Persona> getPersonas() {
			return personas;
		}
		public ArrayList<Producto> getProductos() {
			return productos;
		}
		public ArrayList<Habitacion> getHabitaciones() {
			return habitaciones;
		}
		public ArrayList<Recepcionista> getRecepcionistas() {
			return recepcionistas;
		}
		public void setPersonas(ArrayList<Persona> personas) {
			this.personas = personas;
		}
		public void setProductos(ArrayList<Producto> arrayList) {
			this.productos = arrayList;
		}
		public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
			this.habitaciones = habitaciones;
		}
		public void setRecepcionistas(ArrayList<Recepcionista> recepcionistas) {
			this.recepcionistas = recepcionistas;
		}
		public ArrayList<Reserva> getReservas() {
			return reservas;
		}
		public void setReservas(ArrayList<Reserva> reservas) {
			this.reservas = reservas;
		}
		public ArrayList<Factura> getFacturas() {
			return facturas;
		}
		public void setFacturas(ArrayList<Factura> facturas) {
			this.facturas = facturas;
		}
}
