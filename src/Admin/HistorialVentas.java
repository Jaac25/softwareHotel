package Admin;

import javax.swing.JPanel;

import control.Control;

public class HistorialVentas extends JPanel{
	private InicioVentas inicio;
	private VerVentas ver;
	public HistorialVentas() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio= new InicioVentas();
		ver = new VerVentas();
	}
	private void caracteristicas() {
		inicio.setBounds(0,0,800,680);
		ver.setBounds(0,0,800,680);
	}
	private void agregar() {
		add(inicio);
	}
	public void asignarControl(Control control) {
		inicio.getBtnVer().addActionListener(control);
		inicio.getBtnGuardarSalir().addActionListener(control);
		
		ver.getBtnAtras().addActionListener(control);
	}
	public void iniciar(String seccion) {
		if(seccion.equals("verVentas")) {
			ver.setVisible(true);
			add(ver);
		}
		if(seccion.equals("ventas")) {
			inicio.setVisible(true);
			add(inicio);
		}
	}
	public void salir(String seccion) {
		if(seccion.equals("ventas")) {
			inicio.setVisible(false);
			remove(inicio);
		}
		if(seccion.equals("atrasVentas")) {
			ver.setVisible(false);
			remove(ver);
		}
	}
	public void escribir(String[][] entradas, String seccion) {
		if(seccion.equals("verVentas")) {
			limpiarTabla();
			for (int i = 0; i < entradas.length; i++) {
				ver.getModeloTabla().addRow(entradas[i]);
			}	
		}
	}
	public void limpiarTabla(){
		for (int i = 0; i < ver.getModeloTabla().getRowCount(); i++) {
			ver.getModeloTabla().removeRow(i);
			i--;
		}
	}
}
