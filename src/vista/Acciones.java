package vista;

import control.Control;

public interface Acciones {
	//Login
		public static String VERIFICAR = "verificar";
		public static String SALIR = "salir";
		public static String SALIR_VERIFICAR = "salirVerificar";
		public static String LOGIN = "login";
	//Admin
		public static String CRUD_ADMIN = "admin";
		public static String GUARDAR_SALIR_ADMIN = "guardarSalirAdmin";
		//CrudProducto
			public static String CRUD_PRODUCTO = "crudProducto";
			public static String AGREGAR_PRODUCTO = "agregarProducto";
			public static String MODIFICAR_PRODUCTO = "modificarProducto";
			public static String ELIMINAR_PRODUCTO = "eliminarProducto";
			public static String VER_PRODUCTOS = "verProductos";
			public static String GUARDAR_PRODUCTO = "guardarProducto";
			public static String BUSCAR_MODIFICAR_PRODUCTO = "buscarModificarProducto";
			public static String BTN_MODIFICAR_PRODUCTO = "btnModificarProducto";
			public static String BUSCAR_ELIMINAR_PRODUCTO = "buscarEliminarProducto";
			public static String BTN_ELIMINAR_PRODUCTO = "btnEliminarProducto";
			public static String ATRAS_PRODUCTO = "atrasProducto";
			
		//CrudRecepcionista
			public static String CRUD_RECEPCIONISTA = "crudRecepcionista";
			public static String AGREGAR_RECEPCIONISTA = "agregarRecepcionista";
			public static String MODIFICAR_RECEPCIONISTA = "modificarRecepcionista";
			public static String ELIMINAR_RECEPCIONISTA = "eliminarRecepcionista";
			public static String VER_RECEPCIONISTA = "verRecepcionista";
			public static String GUARDAR_RECEPCIONISTA = "guardarRecepcionista";
			public static String BUSCAR_MODIFICAR_RECEPCIONISTA = "buscarModificarRecepcionista";
			public static String BTN_MODIFICAR_RECEPCIONISTA = "btnModificarRecepcionista";
			public static String BUSCAR_ELIMINAR_RECEPCIONISTA = "buscarEliminarRecepcionista";
			public static String BTN_ELIMINAR_RECEPCIONISTA = "btnEliminarRecepcionista";
			public static String ATRAS_RECEPCIONISTA = "atrasRecepcionista";

		//CrudHabitacion
			public static String CRUD_HABITACION = "crudHabitacion";
			public static String AGREGAR_HABITACION = "agregarHabitacion";
			public static String MODIFICAR_HABITACION = "modificarHabitacion";
			public static String ELIMINAR_HABITACION = "eliminarHabitacion";
			public static String VER_HABITACIONES = "verHabitaciones";
			public static String GUARDAR_HABITACION = "guardarHabitacion";
			public static String BUSCAR_MODIFICAR_HABITACION = "buscarModificarHabitacion";
			public static String BTN_MODIFICAR_HABITACION = "btnModificarHabitacion";
			public static String BUSCAR_ELIMINAR_HABITACION = "buscarEliminarHabitacion";
			public static String BTN_ELIMINAR_HABITACION = "btnEliminarHabitacion";
			public static String MIRAR_AGREGAR_HABITACION = "mirarAgregarHabitacion";
			public static String MIRAR_MODIFICAR_HABITACION = "mirarModificarHabitacion";
			public static String MIRAR_ELIMINAR_HABITACION = "mirarEliminarHabitacion";
			public static String ATRAS_HABITACION = "atrasHabitacion";
			
		//Ventas
			public static String VENTAS = "ventas";
			public static String VER_VENTAS = "verVentas";
			public static String ATRAS_VENTAS = "atrasVentas";
			
			
	//Recepcionista
		public static String CRUDS_RECEPCIONISTAS = "crudsRecepcionistas";
		
		//CrudPersonas
			public static String CRUD_PERSONAS = "crudPersonas";
			public static String ATRAS_PERSONA = "atrasPersona";
			public static String AGREGAR_PERSONA = "agregarPersona";
			public static String MODIFICAR_PERSONA = "modificarPersona";
			public static String ELIMINAR_PERSONA = "eliminarPersona";
			public static String VER_PERSONAS = "verPersonas";
			public static String GUARDAR_PERSONA = "guardarPersona";
			public static String BUSCAR_MODIFICAR_PERSONA = "buscarModificarPersona";
			public static String BUSCAR_ELIMINAR_PERSONA = "buscarEliminarPersona";
			public static String BTN_MODIFICAR_PERSONA = "btnModificarPersona";
			public static String BTN_ELIMINAR_PERSONA = "btnEliminarPersona";
			public static String GUARDAR_SALIR_RECEPCIONISTA = "guardarSalirRecepcionista";
			
		//Reservas	
			public static String RESERVA = "reserva";
			public static String ATRAS_RESERVA = "atrasReserva";
			public static String AGREGAR_RESERVA = "agregarReserva";
			public static String GUARDAR_RESERVA = "guardarReserva";
			public static String VER_RESERVAS = "verReservas";
		//Facturacion
			public static String FACTURACION = "facturacion";
			public static String GENERAR_FACTURA = "generarFactura";
			public static String ATRAS_FACTURAS = "atrasFacturacion";
			public static String SIGUIENTE_FACTURA = "siguienteFactura";
			public static String ATRAS_SIGUIENTE = "atrasSiguiente";
			public static String GUARDAR_FACTURA = "guardarFactura";
	//USUARIOS
		public static String VENTANA_USUARIOS = "ventanaUsuarios";
		public static String USUARIO = "usuario";
		public static String VER_FACTURA = "verFactura";
		public static String ATRAS_USUARIO = "atrasUsuario";
		public static String SALIR_USUARIO = "salirUsuario";
		public static String BARRA = "barra";
		public static String COMPRAR = "comprar";	
			
			
	public void asignarControl(Control control);
	public void iniciar(String seccion);
	public void salir(String seccion);
	public void escribir(String[][] entradas, String seccion);
	public String[]leer(String seccion);
}
