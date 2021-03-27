package Facturacion;

import java.text.SimpleDateFormat;

import javax.swing.JPanel;

import control.Control;

public class VentanaFacturacion extends JPanel{
	
	private InicioFacturacion inicio;
	private GenerarFacturas generar;
	private SiguienteFactura siguiente;
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public VentanaFacturacion() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	
	private void inicializar() {
		inicio = new InicioFacturacion();
		generar = new GenerarFacturas();
		siguiente = new SiguienteFactura();
	}
	private void caracteristicas() {
		inicio.setBounds(0, 0, 800, 680);
		generar.setBounds(0, 0, 800, 680);
		siguiente.setBounds(0, 0, 800, 680);
	}
	private void agregar() {
		add(inicio);
	}
	
	public void asignarControl(Control control) {
		inicio.getBtnGenerarFacturas().addActionListener(control);
		inicio.getBtnGuardarSalir().addActionListener(control);
		
		generar.getBtnAtras().addActionListener(control);
		generar.getBtnSiguiente().addActionListener(control);
		
		siguiente.getBtnAtras().addActionListener(control);
		siguiente.getBtnCobrar().addActionListener(control);
	}

	public void iniciar(String seccion) {
		if(seccion.equals("generarFactura")) {
			generar.setVisible(true);
			add(generar);
		}
		if(seccion.equals("facturacion")) {
			inicio.setVisible(true);
			add(inicio);
		}
		if(seccion.equals("siguienteFactura")) {
			siguiente.setVisible(true);
			add(siguiente);
		}
	}

	public void salir(String seccion) {
		if(seccion.equals("facturacion")){
			inicio.setVisible(false);
			remove(inicio);
		}
		if(seccion.equals("atrasFacturacion")) {
			generar.setVisible(false);
			remove(generar);
			siguiente.setVisible(false);
			remove(siguiente);
		}
		if(seccion.equals("generarFactura")) {
			generar.setVisible(false);
			remove(generar);
		}
		if(seccion.equals("atrasSiguiente")) {
			siguiente.setVisible(false);
			remove(siguiente);
		}
	}

	public void escribir(String[][] entradas, String seccion) {
		if(seccion.equals("generarFactura")) {
			limpiarLista();
			for (int i = 0; i < entradas.length; i++) {
				generar.getModelLista().add(Integer.parseInt(entradas[i][4]), "Código:  "+entradas[i][0]+"     Fecha de Ingreso:   "+entradas[i][1]+"     Personas:   "+entradas[i][2]+ "     Habitación   " +entradas[i][3] );
			}
		}
		if(seccion.equals("siguienteFactura")) {
			siguiente.getTxtPrecioPersona().setText(entradas[0][0]);
			siguiente.getTxtPrecioEstadia().setText(entradas[0][1]);
			siguiente.getTxtAdicionales().setText(entradas[0][2]);
			siguiente.getTxtTotalProductos().setText(entradas[0][3]);
			siguiente.getTxtTotal().setText(entradas[0][4]);
			siguiente.getTxtReserva().setText(entradas[0][5]);
		}
	}
	private void limpiarLista() {
		generar.getModelLista().removeAllElements();
	}

	public String[] leer(String seccion) {
		String[] datos = null;
		if(seccion.equals("siguienteFactura")) {
			datos=new String[2];
			datos[0]=String.valueOf(generar.getVerReservas().getSelectedIndex());
			datos[1]=formato.format(generar.getFechaSalida().getDate());	
		}
		if(seccion.equals("guardarFactura")) {
			datos=new String[6];
			datos[0] = siguiente.getTxtReserva().getText();
			datos[1] = String.valueOf(siguiente.getTxtPrecioEstadia().getText());
			datos[2] = String.valueOf(siguiente.getTxtTotalProductos().getText());
			datos[3] = String.valueOf(siguiente.getTxtTotal().getText());
			datos[4] = formato.format(generar.getFechaSalida().getDate());
			datos[5] = String.valueOf(generar.getVerReservas().getSelectedIndex());
		}
		return datos;
	}
}
