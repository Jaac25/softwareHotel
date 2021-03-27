package Admin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import control.Control;
import crudHabitaciones.CrudHabitaciones;
import crudPersonas.CrudPersonas;
import crudProductos.CrudProductos;
import crudProductos.InicioProductos;
import crudRecepcionista.CrudRecepcionista;

public class CrudsAdmin extends JPanel{
	private JTabbedPane jtpPestaña;
	private CrudProductos productos;
	private CrudRecepcionista recepcionistas;
	private CrudHabitaciones habitaciones;
	private HistorialVentas ventas;
	
	public CrudsAdmin() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		jtpPestaña = new JTabbedPane();
		productos = new CrudProductos(); 
		recepcionistas = new CrudRecepcionista();
		habitaciones = new CrudHabitaciones();
		ventas = new HistorialVentas();
	}
	private void caracteristicas() {
		jtpPestaña.setBounds(0,0,800,680);
		jtpPestaña.add("Productos", productos);
		jtpPestaña.add("Recepcionistas", recepcionistas);
		jtpPestaña.add("Habitaciones", habitaciones);
		jtpPestaña.add("Ventas", ventas);
	}
	private void agregar() {
		add(jtpPestaña);
	}
	public void asignarControl(Control control) {
		productos.asignarControl(control);
		recepcionistas.asignarControl(control);
		habitaciones.asignarControl(control);
		ventas.asignarControl(control);
	}
	public void iniciar(String seccion) {
		//Producto
		if(seccion.equals("agregarProducto") || seccion.equals("modificarProducto") || seccion.equals("eliminarProducto") 
				|| seccion.equals("verProductos") || seccion.equals("crudProducto")) {
			productos.iniciar(seccion);
		}
		//Recepcionista
		if(seccion.equals("agregarRecepcionista") || seccion.equals("modificarRecepcionista") || seccion.equals("eliminarRecepcionista")
				|| seccion.equals("verRecepcionista") || seccion.equals("crudRecepcionista")){
			recepcionistas.iniciar(seccion);
		}
		//Habitación
		if(seccion.equals("crudHabitacion") || seccion.equals("agregarHabitacion") || seccion.equals("modificarHabitacion") 
				|| seccion.equals("eliminarHabitacion") || seccion.equals("verHabitaciones") 
				|| seccion.equals("mirarAgregarHabitacion")	|| seccion.equals("mirarModificarHabitacion") 
				|| seccion.equals("mirarEliminarHabitacion") 
				) {
			habitaciones.iniciar(seccion);
		}
		//Ventanas
		if(seccion.equals("verVentas") || seccion.equals("ventas")) {
			ventas.iniciar(seccion);
		}
	}
	public void salir(String seccion) {
		//Producto
		if(seccion.equals("crudProducto") || seccion.equals("atrasProducto")) {
			productos.salir(seccion);
		}
		//Recepcionista
		if(seccion.equals("crudRecepcionista") || seccion.equals("atrasRecepcionista")) {
			recepcionistas.salir(seccion);
		}
		//Habitaciones
		if(seccion.equals("crudHabitacion") || seccion.equals("atrasHabitacion")) {
			habitaciones.salir(seccion);
		}
		//Ventas
		if(seccion.equals("ventas") || seccion.equals("atrasVentas")) {
			ventas.salir(seccion);
		}
		this.repaint();
	}
	public String[] leer(String seccion) {
		String [] datos = null;
		//Productos
		if(seccion.equals("guardarProducto") || seccion.equals("buscarModificarProducto") || 
				seccion.equals("btnModificarProducto") || seccion.equals("buscarEliminarProducto") ||
				seccion.equals("btnEliminarProducto")){
			datos=productos.leer(seccion);
			return datos;
		}
		//Recepcionistas
		if(seccion.equals("guardarRecepcionista")  || seccion.equals("buscarModificarRecepcionista") 
				|| seccion.equals("buscarEliminarRecepcionista") || seccion.equals("btnModificarRecepcionista") || seccion.equals("btnEliminarRecepcionista")) {
			datos=recepcionistas.leer(seccion);
			return datos;
		}
		//Habitaciones
		if(seccion.equals("guardarHabitacion") || seccion.equals("buscarModificarHabitacion") || seccion.equals("buscarEliminarHabitacion") ||
				seccion.equals("btnModificarHabitacion") || seccion.equals("btnEliminarHabitacion")) {
			datos=habitaciones.leer(seccion);
			return datos;
		}
		return null;
	}
	public void escribir(String[][] entradas, String seccion) {
		//Productos
		if(seccion.equals("verProductos") || seccion.equals("buscarModificarProducto") || 
				seccion.equals("buscarEliminarProducto")) {
			productos.escribir(entradas, seccion);
		}
		//Recepcionistas
		if(seccion.equals("verRecepcionista") || seccion.equals("buscarModificarRecepcionista") || 
				seccion.equals("buscarEliminarRecepcionista")) {
			recepcionistas.escribir(entradas, seccion);
		}
		//Habitaciones
		if(seccion.equals("verHabitaciones") || seccion.equals("buscarModificarHabitacion") || 
				seccion.equals("buscarEliminarHabitacion")){
			habitaciones.escribir(entradas, seccion);
		}
		//Ventas
		if(seccion.equals("verVentas")) {
			ventas.escribir(entradas,seccion);
		}
	}
}
