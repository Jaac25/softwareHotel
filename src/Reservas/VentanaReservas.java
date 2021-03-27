package Reservas;

import java.text.SimpleDateFormat;

import javax.swing.JPanel;

import control.Control;
import logica.gestion;

public class VentanaReservas extends JPanel{
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private InicioReserva inicio;
	private AgregarReserva agregar;
	private VerReserva ver;
	
	public VentanaReservas() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio = new InicioReserva();
		agregar = new AgregarReserva();
		ver = new VerReserva();
	}
	private void caracteristicas() {
		inicio.setBounds(0, 0, 800, 680);
		agregar.setBounds(0, 0, 800, 680);
		ver.setBounds(0, 0, 800, 680);
	}
	private void agregar() {
		add(inicio);
	}
	public void asignarControl(Control control) {
		inicio.getBtnAgregar().addActionListener(control);
		inicio.getBtnVer().addActionListener(control);
		inicio.getBtnGuardarSalir().addActionListener(control);
		
		agregar.getBtnAtras().addActionListener(control);
		agregar.getBtnGuardar().addActionListener(control);
		
		ver.getBtnAtras().addActionListener(control);
	}
	public void iniciar(String seccion) {
		if(seccion.equals("agregarReserva")) {
			agregar.setVisible(true);
			add(agregar);
		}
		if(seccion.equals("reserva")) {
			inicio.setVisible(true);
			add(inicio);
		}
		if(seccion.equals("verReservas")) {
			ver.setVisible(true);
			add(ver);
		}
	}
	public void salir(String seccion) {
		if(seccion.equals("reserva")) {
			inicio.setVisible(false);
			remove(inicio);
		}
		if(seccion.equals("atrasReserva")) {
			agregar.setVisible(false);
			remove(agregar);
			ver.setVisible(false);
			remove(ver);
		}
	}
	public void escribir(String[][] entradas, String seccion) {
		if(seccion.equals("agregarReserva")) {
			limpiarLista();
			for (int i = 0; i < entradas.length; i++) {
				agregar.getModelLista().addElement("N° "+entradas[i][0]+"   Capacidad "+entradas[i][1]+"   Precio por Persona:   "+entradas[i][2]+ "      " +entradas[i][3] );
			}
		}
		if(seccion.equals("verReservas")) {
			limpiarTabla();
			for (int i = 0; i < entradas.length; i++) {
				ver.getModeloTabla().addRow(entradas[i]);
			}
		}
	}
	public String[] leer(String seccion) {
		String[] datos = null;
		if(seccion.equals("guardarReserva")){
			datos = new String [4];
			datos[0]=agregar.getTxtCodigo().getText();
			datos[1]=agregar.getTxtNumeoPersonas().getText();
			datos[2]=formato.format(agregar.getFechaEntrada().getDate());
			datos[3]=String.valueOf(agregar.getElegirHabitacion().getSelectedIndex());
		}
		return datos;
	}
	private void limpiarTabla() {
		for (int i = 0; i < ver.getModeloTabla().getRowCount(); i++) {
			ver.getModeloTabla().removeRow(i);
			i--;
		}
	}
	private void limpiarLista() {
		agregar.getModelLista().removeAllElements();
	}
	
}
