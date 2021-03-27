package crudRecepcionista;

import javax.swing.JPanel;

import control.Control;
import crudProductos.AgregarProductos;
import crudProductos.InicioProductos;

public class CrudRecepcionista extends JPanel{
	private InicioRecepcionista inicio;
	private AgregarRecepcionista agregar;
	private ModificarRecepcionista modificar;
	private EliminarRecepcionista eliminar;
	private VerRecepcionista ver;
	
	public CrudRecepcionista() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio= new InicioRecepcionista();
		agregar = new AgregarRecepcionista();
		modificar = new ModificarRecepcionista();
		eliminar = new EliminarRecepcionista();
		ver = new VerRecepcionista();
	}
	private void caracteristicas() {
		inicio.setBounds(0, 0, 800, 680);
		agregar.setBounds(0, 0, 800, 680);
		modificar.setBounds(0, 0, 800, 680);
		eliminar.setBounds(0, 0, 800, 680);
		ver.setBounds(0, 0, 800, 680);
	}
	private void agregar() {
		add(inicio);
	}
	
	public void asignarControl(Control control) {
		inicio.getBtnAgregar().addActionListener(control);
		inicio.getBtnModificar().addActionListener(control);
		inicio.getBtnEliminar().addActionListener(control);
		inicio.getBtnVer().addActionListener(control);
		inicio.getBtnGuardarSalir().addActionListener(control);
		
		agregar.getBtnAtras().addActionListener(control);
		agregar.getBtnGuardar().addActionListener(control);
		
		modificar.getBtnAtras().addActionListener(control);
		modificar.getBtnModificar().addActionListener(control);
		modificar.getBtnBuscar().addActionListener(control);
		
		eliminar.getBtnAtras().addActionListener(control);
		eliminar.getBtnEliminar().addActionListener(control);
		eliminar.getBtnBuscar().addActionListener(control);
		
		ver.getBtnAtras().addActionListener(control);
	}
	public void limpiarTabla() {
		for (int i = 0; i < ver.getModeloTabla().getRowCount(); i++) {
			ver.getModeloTabla().removeRow(i);
			i--;
		}
	}	
	public void iniciar(String seccion) {
		if(seccion.equals("agregarRecepcionista")){
			agregar.setVisible(true);
			add(agregar);
		}
		if(seccion.equals("modificarRecepcionista")) {
			modificar.setVisible(true);
			add(modificar);
		}
		if(seccion.equals("eliminarRecepcionista")) {
			eliminar.setVisible(true);
			add(eliminar);
		}
		if(seccion.equals("verRecepcionista")) {
			ver.setVisible(true);
			add(ver);
		}
		if(seccion.equals("crudRecepcionista")) {
			inicio.setVisible(true);
			add(inicio);
		}
	}

	public void salir(String seccion) {
		if(seccion.equals("crudRecepcionista")) {
			inicio.setVisible(false);
			remove(inicio);
		}
		if(seccion.equals("atrasRecepcionista")) {
			agregar.setVisible(false);
			remove(agregar);
			modificar.setVisible(false);
			remove(modificar);
			eliminar.setVisible(false);
			remove(eliminar);
			ver.setVisible(false);
			remove(ver);
		}
	}
	public void escribir(String[][] entradas, String seccion) {
		limpiarTabla();
		if(seccion.equals("verRecepcionista")) {
			for (int i = 0; i < entradas.length; i++) {
				ver.getModeloTabla().addRow(entradas[i]);
			}	
		}
		if(seccion.equals("buscarModificarRecepcionista")){
			if(entradas[0].equals("-1")) {
			}
			else {
				modificar.getTxtDocumento().setText(entradas[0][1]);
				modificar.getTxtNombre().setText(entradas[0][2]);
				modificar.getTxtApellido().setText(entradas[0][3]);
				modificar.getTxtTelefono().setText(entradas[0][4]);
				modificar.getTxtDireccion().setText(entradas[0][5]);
			}
		}
		if(seccion.equals("buscarEliminarRecepcionista")) {
			if(entradas[0].equals("-1")) {
			}
			else {
				eliminar.getTxtDocumento().setText(entradas[0][1]);
				eliminar.getTxtNombre().setText(entradas[0][2]);
				eliminar.getTxtApellido().setText(entradas[0][3]);
				eliminar.getTxtTelefono().setText(entradas[0][4]);
				eliminar.getTxtDireccion().setText(entradas[0][5]);
			}
		}
	}	

	public String[] leer(String seccion) {
		String[] datosRecepcionista = null;
		if (seccion.equals("guardarRecepcionista")) {
			datosRecepcionista = new String[5];
			datosRecepcionista[0] = agregar.getTxtDocumento().getText();
			datosRecepcionista[1] = agregar.getTxtNombre().getText();
			datosRecepcionista[2] = agregar.getTxtApellido().getText();
			datosRecepcionista[3] = agregar.getTxtTelefono().getText();
			datosRecepcionista[4] = agregar.getTxtDireccion().getText();
		}
		if(seccion.equals("buscarModificarRecepcionista")) {
			datosRecepcionista = new String[1];
			datosRecepcionista[0]=modificar.getTxtDocumento().getText();
		}
		if(seccion.equals("btnModificarRecepcionista")) {
			datosRecepcionista = new String[5];
			datosRecepcionista[0] = modificar.getTxtDocumento().getText();
			datosRecepcionista[1] = modificar.getTxtNombre().getText();
			datosRecepcionista[2] = modificar.getTxtApellido().getText();
			datosRecepcionista[3] = modificar.getTxtTelefono().getText();
			datosRecepcionista[4] = modificar.getTxtDireccion().getText();
		}
		if(seccion.equals("buscarEliminarRecepcionista")) {
			datosRecepcionista = new String[1];
			datosRecepcionista[0]=eliminar.getTxtDocumento().getText();
		}
		if(seccion.equals("btnEliminarRecepcionista")) {
			datosRecepcionista =new String[1];
			datosRecepcionista[0]=eliminar.getTxtDocumento().getText();
		}
		return datosRecepcionista;
	}	
}
