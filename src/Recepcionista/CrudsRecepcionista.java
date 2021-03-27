package Recepcionista;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import Facturacion.VentanaFacturacion;
import Reservas.VentanaReservas;
import control.Control;
import crudPersonas.CrudPersonas;

public class CrudsRecepcionista extends JPanel{
	private JTabbedPane jtpPestaña;
	private CrudPersonas personas;
	private VentanaReservas reservas;
	private VentanaFacturacion facturas;
	
	public CrudsRecepcionista() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		jtpPestaña = new JTabbedPane();
		personas = new CrudPersonas();
		reservas = new VentanaReservas();
		facturas = new VentanaFacturacion();
	}
	private void caracteristicas() {
		jtpPestaña.setBounds(0,0,800,680);
		jtpPestaña.add("Clientes", personas);
		jtpPestaña.add("Reservas", reservas);
		jtpPestaña.add("Facturación", facturas);
	}
	private void agregar() {
		add(jtpPestaña);
	}
	
	public void asignarControl(Control control) {
		personas.asignarControl(control);
		reservas.asignarControl(control);
		facturas.asignarControl(control);
	}
	
	
	public void iniciar(String seccion) {
		//Persona
		if(seccion.equals("agregarPersona") || seccion.equals("modificarPersona") || seccion.equals("eliminarPersona") || 
				seccion.equals("crudPersonas") || seccion.equals("verPersonas")) {
			personas.iniciar(seccion);
		}
		//Reserva
		if(seccion.equals("agregarReserva") || seccion.equals("reserva") || seccion.equals("verReservas")) {
			reservas.iniciar(seccion);
		}
		//Facturacion
		if(seccion.equals("generarFactura") || seccion.equals("facturacion") || seccion.equals("siguienteFactura")) {
			facturas.iniciar(seccion);
		}
	}
	public void salir(String seccion) {
		//Personas
		if(seccion.equals("crudPersonas") || seccion.equals("atrasPersona")) {
			personas.salir(seccion);
		}
		//Reservas
		if(seccion.equals("reserva") || seccion.equals("atrasReserva")) {
			reservas.salir(seccion);	
		}
		//Facturacion
		if(seccion.equals("facturacion") ||  seccion.equals("atrasFacturacion") || seccion.equals("generarFactura") || seccion.equals("atrasSiguiente")){
			facturas.salir(seccion);
		}
		this.repaint();
	}
	public String[] leer(String seccion) {
		String [] datos = null;
		//Persona
		if(seccion.equals("guardarPersona") || seccion.equals("buscarModificarPersona") || seccion.equals("buscarEliminarPersona") || 
				seccion.equals("btnModificarPersona") || seccion.equals("btnEliminarPersona")) {
			datos=personas.leer(seccion);
			return datos;
		}
		//Reserva
		if(seccion.equals("guardarReserva")){
			datos=reservas.leer(seccion);
			return datos;
		}
		//Facturacion
		if(seccion.equals("siguienteFactura") || seccion.equals("guardarFactura")) {
			datos=facturas.leer(seccion);
			return datos;
		}
		return datos;
	}
	public void escribir(String[][] entradas, String seccion) {
		//Personas
		if(seccion.equals("verPersonas") || seccion.equals("buscarModificarPersona") || seccion.equals("buscarEliminarPersona")) {
			personas.escribir(entradas, seccion);
		}
		//Reservas
		if(seccion.equals("agregarReserva") || seccion.equals("verReservas")) {
			reservas.escribir(entradas, seccion);
		}
		//Facturacion
		if(seccion.equals("generarFactura") || seccion.equals("siguienteFactura")) {
			facturas.escribir(entradas,seccion);
		}
	}
}
