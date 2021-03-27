package crudHabitaciones;

import javax.swing.JPanel;

import control.Control;
import crudProductos.AgregarProductos;
import crudProductos.InicioProductos;

public class CrudHabitaciones extends JPanel{
	private InicioHabitaciones inicio;
	private AgregarHabitaciones agregar;
	private ModificarHabitacion modificar;
	private EliminarHabitacion eliminar;
	private VerHabitacion ver;
	
	public CrudHabitaciones() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio= new InicioHabitaciones();
		agregar = new AgregarHabitaciones();
		modificar = new ModificarHabitacion();
		eliminar = new EliminarHabitacion();
		ver = new VerHabitacion();
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
		agregar.getBtnMirar().addActionListener(control);
		
		modificar.getBtnMirar().addActionListener(control);
		modificar.getBtnAtras().addActionListener(control);
		modificar.getBtnBuscar().addActionListener(control);
		modificar.getBtnModificar().addActionListener(control);
		
		eliminar.getBtnEliminar().addActionListener(control);
		eliminar.getBtnAtras().addActionListener(control);
		eliminar.getBtnBuscar().addActionListener(control);
		eliminar.getBtnMirar().addActionListener(control);
		
		ver.getBtnAtras().addActionListener(control);
	}
	
	public void limpiarTabla(){
		for (int i = 0; i < ver.getModeloTabla().getRowCount(); i++) {
			ver.getModeloTabla().removeRow(i);
			i--;
		}
	}
	
	public void iniciar(String seccion) {
		if(seccion.equals("crudHabitacion")) {
			inicio.setVisible(true);
			add(inicio);
		}
		if(seccion.equals("agregarHabitacion")) {
			add(agregar);
			agregar.setVisible(true);
		}
		if(seccion.equals("modificarHabitacion")) {
			modificar.setVisible(true);
			add(modificar);
		}
		if(seccion.equals("eliminarHabitacion")) {
			eliminar.setVisible(true);
			add(eliminar);
		}
		if(seccion.equals("verHabitaciones")) {
			ver.setVisible(true);
			add(ver);
		}
		if(seccion.equals("mirarAgregarHabitacion")) {
			if(agregar.getBarra().isSelected()==true) {
				agregar.add(agregar.getLblBarra());
				agregar.remove(agregar.getLblAire());
				agregar.remove(agregar.getLblTelevision());
				agregar.remove(agregar.getLblJacuzzi());
			}
			else if(agregar.getAire().isSelected()==true) {
				agregar.add(agregar.getLblAire());
				agregar.remove(agregar.getLblBarra());
				agregar.remove(agregar.getLblTelevision());
				agregar.remove(agregar.getLblJacuzzi());
			}
			else if(agregar.getTelevision().isSelected()==true) {
				agregar.add(agregar.getLblTelevision());
				agregar.remove(agregar.getLblAire());
				agregar.remove(agregar.getLblBarra());
				agregar.remove(agregar.getLblJacuzzi());
			}
			else if(agregar.getJacuzzi().isSelected()==true) {
				agregar.add(agregar.getLblJacuzzi());
				agregar.remove(agregar.getLblTelevision());
				agregar.remove(agregar.getLblAire());
				agregar.remove(agregar.getLblBarra());
			}
		}
		if(seccion.equals("mirarModificarHabitacion")) {
			//modificar.radio();
			if(modificar.getBarra().isSelected()) {
				modificar.add(modificar.getLblBarra());
				modificar.remove(modificar.getLblAire());
				modificar.remove(modificar.getLblTelevision());
				modificar.remove(modificar.getLblJacuzzi());
				add(modificar);
			}
			else if(modificar.getAire().isSelected()) {
				modificar.add(modificar.getLblAire());
				modificar.remove(modificar.getLblBarra());
				modificar.remove(modificar.getLblTelevision());
				modificar.remove(modificar.getLblJacuzzi());
			}
			else if(modificar.getTelevision().isSelected()) {
				modificar.add(modificar.getLblTelevision());
				modificar.remove(modificar.getLblAire());
				modificar.remove(modificar.getLblBarra());
				modificar.remove(modificar.getLblJacuzzi());
			}
			else if(modificar.getJacuzzi().isSelected()) {
				modificar.add(modificar.getLblJacuzzi());
				modificar.remove(modificar.getLblTelevision());
				modificar.remove(modificar.getLblAire());
				modificar.remove(modificar.getLblBarra());
			}
		}
		if(seccion.equals("mirarEliminarHabitacion")) {
			if(eliminar.getBarra().isSelected()) {
				eliminar.add(eliminar.getLblBarra());
				eliminar.remove(eliminar.getLblAire());
				eliminar.remove(eliminar.getLblTelevision());
				eliminar.remove(eliminar.getLblJacuzzi());
			}
			else if(eliminar.getAire().isSelected()) {
				eliminar.add(eliminar.getLblAire());
				eliminar.remove(eliminar.getLblBarra());
				eliminar.remove(eliminar.getLblTelevision());
				eliminar.remove(eliminar.getLblJacuzzi());
			}
			else if(eliminar.getTelevision().isSelected()) {
				eliminar.add(eliminar.getLblTelevision());
				eliminar.remove(eliminar.getLblAire());
				eliminar.remove(eliminar.getLblBarra());
				eliminar.remove(eliminar.getLblJacuzzi());
			}
			else if(eliminar.getJacuzzi().isSelected()) {
				eliminar.add(eliminar.getLblJacuzzi());
				eliminar.remove(eliminar.getLblTelevision());
				eliminar.remove(eliminar.getLblAire());
				eliminar.remove(eliminar.getLblBarra());
			}
		}
	}

	public void salir(String seccion) {
		if(seccion.equals("crudHabitacion")) {
			inicio.setVisible(false);
			remove(inicio);
		}
		if(seccion.equals("atrasHabitacion")) {
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
		if(seccion.equals("verHabitaciones")){
			for (int i = 0; i < entradas.length; i++) {
				ver.getModeloTabla().addRow(entradas[i]);
			}
		}
		if(seccion.equals("buscarModificarHabitacion")){
			if(entradas[0].equals("-1")) {
			}
			else {
				modificar.getTxtNumeroHabitacion().setText(entradas[0][1]);
				modificar.getTxtCapacidadPersonas().setText(entradas[0][2]);
				modificar.getTxtPrecioPersona().setText(entradas[0][3]);
				if(entradas[0][4].equals("Jacuzzi")) {
					modificar.getJacuzzi().setSelected(true);
				}
				else if(entradas[0][4].equals("Barra de Productos")) {
					modificar.getBarra().setSelected(true);
				}
				else if(entradas[0][4].equals("Aire Acondicionado")) {
					modificar.getAire().setSelected(true);
				}
				else if(entradas[0][4].equals("Televisión por Cable")) {
					modificar.getTelevision().setSelected(true);
				}
			}
		}
		if(seccion.equals("buscarEliminarHabitacion")) {
			if(entradas[0].equals("-1")) {
			}
			else {
				eliminar.getTxtNumeroHabitacion().setText(entradas[0][1]);
				eliminar.getTxtCapacidadPersonas().setText(entradas[0][2]);
				eliminar.getTxtPrecioPersona().setText(entradas[0][3]);
				if(entradas[0][4].equals("Jacuzzi")) {
					eliminar.getJacuzzi().setSelected(true);
				}
				else if(entradas[0][4].equals("Barra de Productos")) {
					eliminar.getBarra().setSelected(true);
				}
				else if(entradas[0][4].equals("Aire Acondicionado")) {
					eliminar.getAire().setSelected(true);
				}
				else if(entradas[0][4].equals("Televisión por Cable")) {
					eliminar.getTelevision().setSelected(true);
				}
			}
		}
	}	

	public String[] leer(String seccion) {
		String[] datosHabitacion = null;
		if(seccion.equals("guardarHabitacion")) {
			datosHabitacion = new String[5];
			datosHabitacion[0] = agregar.getTxtNumeroHabitacion().getText();
			datosHabitacion[1] = agregar.getTxtCapacidadPersonas().getText();
			datosHabitacion[2] = agregar.getTxtPrecioPersona().getText();
			datosHabitacion[3] = null;
			if(agregar.getBarra().isSelected()) {
				datosHabitacion[3] = "Barra de Productos";
			}
			else if(agregar.getAire().isSelected()) {
				datosHabitacion[3] = "Aire Acondicionado";
			}
			else if(agregar.getTelevision().isSelected()) {
				datosHabitacion[3] = "Televisión por Cable";
			}
			else if(agregar.getJacuzzi().isSelected()) {
				datosHabitacion[3] = "Jacuzzi";
			}
			else {
				datosHabitacion[3] = "";
			}
		}
		if(seccion.equals("buscarModificarHabitacion")) {
			datosHabitacion = new String[1];
			datosHabitacion[0]=modificar.getTxtNumeroHabitacion().getText();
		}
		if(seccion.equals("btnModificarHabitacion")) {
			datosHabitacion = new String[5];
			datosHabitacion[0] = modificar.getTxtNumeroHabitacion().getText();
			datosHabitacion[1] = modificar.getTxtCapacidadPersonas().getText();
			datosHabitacion[2] = modificar.getTxtPrecioPersona().getText();
			datosHabitacion[3] = null;
			if(modificar.getBarra().isSelected()) {
				datosHabitacion[3] = "Barra de Productos";
			}
			else if(modificar.getAire().isSelected()) {
				datosHabitacion[3] = "Aire Acondicionado";
			}
			else if(modificar.getTelevision().isSelected()) {
				datosHabitacion[3] = "Televisión por Cable";
			}
			else if(modificar.getJacuzzi().isSelected()) {
				datosHabitacion[3] = "Jacuzzi";
			}
			else {
				datosHabitacion[3] = "";
			}
		}
		if(seccion.equals("buscarEliminarHabitacion")) {
			datosHabitacion = new String[1];
			datosHabitacion[0]=eliminar.getTxtNumeroHabitacion().getText();
		}
		if(seccion.equals("btnEliminarHabitacion")) {
			datosHabitacion =new String[1];
			datosHabitacion[0]=eliminar.getTxtNumeroHabitacion().getText();
		}
		return datosHabitacion;
	}
}
