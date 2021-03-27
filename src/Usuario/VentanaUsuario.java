package Usuario;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import control.Control;

public class VentanaUsuario extends JPanel{
	
	private InicioUsuario inicio;
	private VentanaFactura factura;
	private VentanaBarra barra;
	
	public VentanaUsuario() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio = new InicioUsuario();
		factura = new VentanaFactura();
		barra = new VentanaBarra();
	}
	private void caracteristicas() {
		inicio.setBounds(0,0,800,680);
		factura.setBounds(0,0,800,680);
		barra.setBounds(0,0,800,680);
	}
	private void agregar() {
		add(inicio);
	}
	public void asignarControl(Control control) {
		inicio.getBtnFactura().addActionListener(control);
		inicio.getBtnBarra().addActionListener(control);
		inicio.getBtnSalir().addActionListener(control);
		
		factura.getBtnAtras().addActionListener(control);
		
		barra.getBtnAtras().addActionListener(control);
		barra.getBtnComprar().addActionListener(control);
	}
	public void iniciar(String seccion) {
		if(seccion.equals("verFactura")) {
			factura.setVisible(true);
			add(factura);
		}
		if(seccion.equals("usuario")) {
			inicio.setVisible(true);
			add(inicio);
		}
		if(seccion.equals("barra")) {
			barra.setVisible(true);
			add(barra);
		}
	}
	public void salir(String seccion) {
		if(seccion.equals("usuario")) {
			inicio.setVisible(false);
			remove(inicio);
		}
		if(seccion.equals("atrasUsuario")) {
			factura.setVisible(false);
			remove(factura);
			barra.setVisible(false);
			remove(barra);
		}
	}
	public void escrbir(String[][] entradas, String seccion) {
		if(seccion.equals("verFactura")) {
			factura.getTxtPrecioPersona().setText(entradas[0][0]);
			factura.getTxtPrecioEstadia().setText(entradas[0][1]);
			factura.getTxtAdicionales().setText(entradas[0][2]);
			factura.getTxtTotalProductos().setText(entradas[0][3]);
			factura.getTxtTotal().setText(entradas[0][4]);
		}	
		if(seccion.equals("barra")) {
			limpiarLista();
			for (int i = 0; i < entradas.length; i++) {
				barra.getModelLista().addElement("Nombre:  "+entradas[i][1]+"     Cantidad:   "+entradas[i][2]+"     Precio:   "+entradas[i][3]);
			}
		}
	}
	public void limpiarLista() {
		barra.getModelLista().removeAllElements();
	}
	public String[] leer(String seccion) {
		String [] datos=null;
		if(seccion.equals("comprar")) {
			datos = new String [ 3];
			datos[0] = ""+barra.getElegirProducto().getSelectedIndex();
		}
		return datos;
	}
}
