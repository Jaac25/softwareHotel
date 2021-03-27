package crudProductos;

import javax.swing.JPanel;

import control.Control;
import vista.ventanaLogin;

public class CrudProductos extends JPanel{
	private InicioProductos inicio;
	private AgregarProductos agregar;
	private ModificarProducto modificar;
	private EliminarProductos eliminar;
	private VerProducto ver;
	
	public CrudProductos() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio= new InicioProductos();
		agregar = new AgregarProductos();
		modificar = new ModificarProducto();
		eliminar = new EliminarProductos();
		ver = new VerProducto();
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
	public void limpiarTabla(){
		for (int i = 0; i < ver.getModeloTabla().getRowCount(); i++) {
			ver.getModeloTabla().removeRow(i);
			i--;
		}
	}
	public void iniciar(String seccion) {
		if(seccion.equals("crudProducto")) {
			inicio.setVisible(true);
			add(inicio);
		}
		if(seccion.equals("agregarProducto")) {
			agregar.setVisible(true);
			add(agregar);
		}
		if(seccion.equals("modificarProducto")) {
			modificar.setVisible(true);
			add(modificar);
		}
		if(seccion.equals("eliminarProducto")) {
			eliminar.setVisible(true);
			add(eliminar);
		}
		if(seccion.equals("verProductos")) {
			ver.setVisible(true);
			add(ver);
		}
	}

	public void salir(String seccion) {
		if(seccion.equals("crudProducto")) {
			inicio.setVisible(false);
			remove(inicio);
		}
		if(seccion.equals("atrasProducto")){
			agregar.setVisible(false);
			add(agregar);
			modificar.setVisible(false);
			add(modificar);
			eliminar.setVisible(false);
			add(eliminar);
			ver.setVisible(false);
			add(ver);
		}
	}
	public String[] leer(String seccion) {
		String[] datos = null;
		if (seccion.equals("guardarProducto")) {
			datos = new String[4];
			datos[0] = agregar.getTxtCodigo().getText();
			datos[1] = agregar.getTxtNombre().getText();
			datos[2] = agregar.getTxtCantidad().getText();
			datos[3] = agregar.getTxtPrecio().getText();
		}
		if(seccion.equals("buscarModificarProducto")) {
			datos = new String[1];
			datos[0]=modificar.getTxtCodigo().getText();
		}
		if(seccion.equals("btnModificarProducto")) {
			datos = new String[4];
			datos[0] = modificar.getTxtCodigo().getText();
			datos[1] = modificar.getTxtNombre().getText();
			datos[2] = modificar.getTxtCantidad().getText();
			datos[3] = modificar.getTxtPrecio().getText();
		}
		if(seccion.equals("buscarEliminarProducto")) {
			datos = new String[1];
			datos[0]=eliminar.getTxtCodigo().getText();
		}
		if(seccion.equals("btnEliminarProducto")) {
			datos =new String[1];
			datos[0]=eliminar.getTxtCodigo().getText();
		}
		return datos;
	}
	public void escribir(String[][] entradas, String seccion) {
		
		if(seccion.equals("verProductos")) {
			limpiarTabla();
			for (int i = 0; i < entradas.length; i++) {
				ver.getModeloTabla().addRow(entradas[i]);
			}	
		}
		if(seccion.equals("buscarModificarProducto")) {
			if(entradas[0].equals("-1")) {
			}
			else {
				modificar.getTxtCodigo().setText(entradas[0][1]);
				modificar.getTxtNombre().setText(entradas[0][2]);
				modificar.getTxtCantidad().setText(entradas[0][3]);
				modificar.getTxtPrecio().setText(entradas[0][4]);
			}
		}
		if(seccion.equals("buscarEliminarProducto")) {
			if(entradas[0].equals("-1")) {
			}
			else {
				eliminar.getTxtCodigo().setText(entradas[0][1]);
				eliminar.getTxtNombre().setText(entradas[0][2]);
				eliminar.getTxtCantidad().setText(entradas[0][3]);
				eliminar.getTxtPrecio().setText(entradas[0][4]);
			}
		}
	}	
	
}
