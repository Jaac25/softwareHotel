package vista;

import javax.swing.JFrame;

import Admin.CrudsAdmin;
import Recepcionista.CrudsRecepcionista;
import Usuario.VentanaUsuario;
import control.Control;
import vista.Acciones;

public class VentanaPrincipal extends JFrame implements Acciones{
	private ventanaLogin ventanaLogin;
	private CrudsAdmin crudAdmin;
	private CrudsRecepcionista crudRecepcionista;
	private VentanaUsuario usuario;
	
	public VentanaPrincipal() {
		this.setSize(800, 680);
		this.setLocation(280, 50);
	    this.setTitle("Hotel");
	    this.setDefaultCloseOperation(0);
	    this.setResizable(false);
	    inicializar();
	    caracteristicas();
	    agregar();
	}
	 
	private void inicializar() {
		ventanaLogin = new ventanaLogin();
		crudAdmin = new CrudsAdmin();
		crudRecepcionista = new CrudsRecepcionista();
		usuario = new VentanaUsuario();
	}
	private void caracteristicas() {
		ventanaLogin.setBounds(0,0,800,680);
	}
	private void agregar() {
		add(ventanaLogin);
	}

	public void asignarControl(Control control) {
		ventanaLogin.getBtnVerificar().addActionListener(control);
		ventanaLogin.getBtnSalir().addActionListener(control);
		
		crudAdmin.asignarControl(control);
		
		crudRecepcionista.asignarControl(control);
		
		usuario.asignarControl(control);
	}

	@Override
	public void iniciar(String seccion) {
		if(seccion.equals("login")) {
			ventanaLogin.setVisible(true);
			add(ventanaLogin);
		}
		//Admin
			if((seccion.equals("admin"))) {
				crudAdmin.setVisible(true);
				add(crudAdmin);
			}
			//Producto
			if(seccion.equals("agregarProducto") || seccion.equals("modificarProducto") || seccion.equals("eliminarProducto") 
					|| seccion.equals("verProductos") || seccion.equals("crudProducto")) {
				crudAdmin.iniciar(seccion);
			}
			//Recepcionista
			if(seccion.equals("agregarRecepcionista") || seccion.equals("modificarRecepcionista") || seccion.equals("eliminarRecepcionista") 
					|| seccion.equals("verRecepcionista") || seccion.equals("crudRecepcionista")){
				crudAdmin.iniciar(seccion);
			}
			//Habitacion
			if(seccion.equals("crudHabitacion") || seccion.equals("agregarHabitacion") || seccion.equals("modificarHabitacion") 
					|| seccion.equals("eliminarHabitacion") || seccion.equals("verHabitaciones") || seccion.equals("mirarAgregarHabitacion") 
					|| seccion.equals("mirarModificarHabitacion") || seccion.equals("mirarEliminarHabitacion")) {
				crudAdmin.iniciar(seccion);
			}
			//Ventas
			if(seccion.equals("verVentas") || seccion.equals("ventas")) {
				crudAdmin.iniciar(seccion);
			}
		//Recepcionista
			if(seccion.equals("crudsRecepcionistas")) {
				crudRecepcionista.setVisible(true);
				add(crudRecepcionista);
				
			}
				//Persona
				if(seccion.equals("agregarPersona") || seccion.equals("modificarPersona") || seccion.equals("eliminarPersona") || 
						seccion.equals("crudPersonas") || seccion.equals("verPersonas")) {
					crudRecepcionista.iniciar(seccion);
				}
				//Reservas
				if(seccion.equals("agregarReserva") || seccion.equals("reserva") || seccion.equals("verReservas")) {
					crudRecepcionista.iniciar(seccion);
				}
				//Facturacion
				if(seccion.equals("generarFactura") || seccion.equals("facturacion") || seccion.equals("siguienteFactura")) {
					crudRecepcionista.iniciar(seccion);
				}
		//USUARIOS
			if(seccion.equals("ventanaUsuarios")) {
				usuario.setVisible(true);
				add(usuario);
			}
			if(seccion.equals("verFactura") || seccion.equals("usuario") || seccion.equals("barra")) {
				usuario.iniciar(seccion);
			}
	}

	public void salir(String seccion) {
		if(seccion.equals("salir")) {
			System.exit(0);
		}
		if(seccion.equals("salirVerificar")) {
			ventanaLogin.setVisible(false);
			remove(ventanaLogin);
		}
		//Admin
			//Producto
			if(seccion.equals("crudProducto") || seccion.equals("atrasProducto")) {
				crudAdmin.salir(seccion);
			}
			//Recepcionista
			if(seccion.equals("crudRecepcionista") || seccion.equals("atrasRecepcionista")) {
				crudAdmin.salir(seccion);
			}
			//Habitacion
			if(seccion.equals("crudHabitacion") || seccion.equals("atrasHabitacion")) {
				crudAdmin.salir(seccion);
			}
			//Ventas
			if(seccion.equals("ventas") || seccion.equals("atrasVentas")) {
				crudAdmin.salir(seccion);
			}
			//Salir
			if(seccion.equals("guardarSalirAdmin")) {
				crudAdmin.setVisible(false);
				remove(crudAdmin);
			}
		//Recepcionista
			//Personas
			if(seccion.equals("crudPersonas") || seccion.equals("atrasPersona")) {
				crudRecepcionista.salir(seccion);
			}
			//Reservas
			if(seccion.equals("reserva") || seccion.equals("atrasReserva")) {
				crudRecepcionista.salir(seccion);
			}
			//Facturacion
			if(seccion.equals("facturacion") || seccion.equals("atrasFacturacion") || seccion.equals("generarFactura") || seccion.equals("atrasSiguiente")){
				crudRecepcionista.salir(seccion);
			}
			//Salir
			if(seccion.equals("guardarSalirRecepcionista")) {
				crudRecepcionista.setVisible(false);
				remove(crudRecepcionista);
			}
		//USUARIO
			if(seccion.equals("usuario") || seccion.equals("atrasUsuario")) {
				usuario.salir(seccion);
			}
			//Salir
			if(seccion.equals("ventanaUsuarios")) {
				usuario.setVisible(false);
				remove(usuario);
			}
		this.repaint();
	}

	public void escribir(String[][] entradas, String seccion) {
		//ADMIN
			//Productos
			if(seccion.equals("verProductos") || seccion.equals("buscarModificarProducto") || seccion.equals("buscarEliminarProducto")) {
				crudAdmin.escribir(entradas, seccion);
			}
			//Recepcionistas
			if(seccion.equals("verRecepcionista") || seccion.equals("buscarModificarRecepcionista") || seccion.equals("buscarEliminarRecepcionista") ) {
				crudAdmin.escribir(entradas, seccion);
			}
			//Habitaciones
			if(seccion.equals("verHabitaciones") || seccion.equals("buscarModificarHabitacion") || seccion.equals("buscarEliminarHabitacion") ) {
				crudAdmin.escribir(entradas, seccion);
			}
			//Ventas
			if(seccion.equals("verVentas")) {
				crudAdmin.escribir(entradas, seccion);
			}
		//RECEPCIONISTA
			//Personas
				if(seccion.equals("verPersonas") || seccion.equals("buscarModificarPersona") || seccion.equals("buscarEliminarPersona")) {
					crudRecepcionista.escribir(entradas, seccion);
				}
			//Reservas
				if(seccion.equals("agregarReserva") || seccion.equals("verReservas")) {
					crudRecepcionista.escribir(entradas, seccion);
				}
			//Facturacion
				if(seccion.equals("generarFactura") || seccion.equals("siguienteFactura")) {
					crudRecepcionista.escribir(entradas, seccion);
				}	
		//Usuario
			if(seccion.equals("verFactura") || seccion.equals("barra")) {
				usuario.escrbir(entradas,seccion);
			}
	}

	public String[] leer(String seccion) {
		String[] datos = null;
		if (seccion.equals("verificar")){
			datos = new String[2];
			datos[0] = ventanaLogin.getTxtUsuario().getText();
			 char [] contraseña = ventanaLogin.getContraseña().getPassword();
			String password="";
			for(int i=0;i<contraseña.length;i++) {
				password = password + contraseña[i];
			}
			datos[1] = password;
			return datos;
		}
		//Admin
			//Producto
			if(seccion.equals("guardarProducto") || seccion.equals("buscarModificarProducto") || 
					seccion.equals("btnModificarProducto") || seccion.equals("buscarEliminarProducto") ||
					seccion.equals("btnEliminarProducto")) {
				datos=crudAdmin.leer(seccion);
				return datos;		
			}
			//Recepcionista
			if(seccion.equals("guardarRecepcionista") || seccion.equals("buscarModificarRecepcionista") || seccion.equals("buscarEliminarRecepcionista") ||
					seccion.equals("btnModificarRecepcionista") || seccion.equals("btnEliminarRecepcionista")) {
				datos=crudAdmin.leer(seccion);
				return datos;		
			}
			//Habitaciones
			if(seccion.equals("guardarHabitacion") || seccion.equals("buscarModificarHabitacion") || seccion.equals("buscarEliminarHabitacion") ||
					seccion.equals("btnModificarHabitacion") || seccion.equals("btnEliminarHabitacion")) {
				datos=crudAdmin.leer(seccion);
				return datos;		
			}
		//Recepcionista
			//Persona
			if(seccion.equals("guardarPersona") || seccion.equals("buscarModificarPersona") || seccion.equals("buscarEliminarPersona") || 
					seccion.equals("btnModificarPersona") || seccion.equals("btnEliminarPersona")) {
				datos=crudRecepcionista.leer(seccion);
				return datos;
			}
			//Reserva
			if(seccion.equals("guardarReserva")){
				datos=crudRecepcionista.leer(seccion);
				return datos;
			}
			//Facturacion
			if(seccion.equals("siguienteFactura") || seccion.equals("guardarFactura")) {
				datos=crudRecepcionista.leer(seccion);
				return datos;
			}
		//Usuario
			if(seccion.equals("comprar")) {
				datos=usuario.leer(seccion);
				return datos;
			}
		return null;
	}
}
