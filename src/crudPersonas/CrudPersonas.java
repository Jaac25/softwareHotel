package crudPersonas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JPanel;

import control.Control;

public class CrudPersonas extends JPanel{
	private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	private InicioPersonas inicio;
	private AgregarPersonas agregar;
	private ModificarPersona modificar;
	private EliminarPersona eliminar;
	private VerPersonas ver;
	
	public CrudPersonas() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio= new InicioPersonas();
		agregar = new AgregarPersonas();
		modificar = new ModificarPersona();
		eliminar = new EliminarPersona();
		ver = new VerPersonas();
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
		eliminar.getBtnBuscar().addActionListener(control);
		eliminar.getBtnEliminar().addActionListener(control);
		
		ver.getBtnAtras().addActionListener(control);
	}
	public void limpiarTabla(){
		for (int i = 0; i < ver.getModeloTabla().getRowCount(); i++) {
			ver.getModeloTabla().removeRow(i);
			i--;
		}
	}
	public void iniciar(String seccion) {
		if(seccion.equals("agregarPersona")) {
			agregar.setVisible(true);
			add(agregar);
		}
		if(seccion.equals("modificarPersona")) {
			modificar.setVisible(true);
			add(modificar);
		}
		if(seccion.equals("eliminarPersona")) {
			eliminar.setVisible(true);
			add(eliminar);
		}
		if(seccion.equals("verPersonas")) {
			ver.setVisible(true);
			add(ver);
		}
		if(seccion.equals("crudPersonas")) {
			inicio.setVisible(true);
			add(inicio);
		}
	}

	public void salir(String seccion) {
		if(seccion.equals("crudPersonas")) {
			inicio.setVisible(true);
			remove(inicio);
		}
		if(seccion.equals("atrasPersona")) {
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
		if(seccion.equals("verPersonas")) {
			limpiarTabla();
			for (int i = 0; i < entradas.length; i++) {
				ver.getModeloTabla().addRow(entradas[i]);
			}	
		}
		if(seccion.equals("buscarModificarPersona")) {
			if(entradas[0].equals("-1")) {
				
			}
			else {
				Date fechaNacimiento=null;

				try {
					fechaNacimiento = formato.parse(entradas[0][5]);	
		        } 
		        catch (ParseException ex) {
		        	System.out.println("Este error");
		       	}
				modificar.getTxtDocumento().setText(entradas[0][1]);
				modificar.getTxtNombre().setText(entradas[0][2]);
				modificar.getTxtCiudad().setText(entradas[0][3]);
				modificar.getTxtCelular().setText(entradas[0][4]);
				modificar.getFechaNacimiento().setDate(fechaNacimiento);
				modificar.getTxtNombreUsuario().setText(entradas[0][6]);
				modificar.getTxtContraseña().setText(entradas[0][7]);
			}
		}
		if(seccion.equals("buscarEliminarPersona")) {
			if(entradas[0].equals("-1")) {
				
			}
			else {
				Date fechaNacimiento=null;

				try {
					fechaNacimiento = formato.parse(entradas[0][5]);	
		        } 
		        catch (ParseException ex) {
		        	System.out.println("Este error");
		       	}
				eliminar.getTxtDocumento().setText(entradas[0][1]);
				eliminar.getTxtNombre().setText(entradas[0][2]);
				eliminar.getTxtCiudad().setText(entradas[0][3]);
				eliminar.getTxtCelular().setText(entradas[0][4]);
				eliminar.getFechaNacimiento().setDate(fechaNacimiento);
				eliminar.getTxtNombreUsuario().setText(entradas[0][6]);
				eliminar.getTxtContraseña().setText(entradas[0][7]);
			}
		}
	}	

	public String[] leer(String seccion) {
		String[] datos = null;
		if(seccion.equals("guardarPersona")) {
			datos = new String[7];
			datos[0] = agregar.getTxtDocumento().getText();
			datos[1] = agregar.getTxtNombre().getText();
			datos[2] = agregar.getTxtCiudad().getText();
			datos[3] = agregar.getTxtCelular().getText();
			datos[4] = formato.format(agregar.getFechaNacimiento().getDate());
			datos[5] = agregar.getTxtNombreUsuario().getText();
			datos[6] = agregar.getTxtContraseña().getText();
		}
		if(seccion.equals("buscarModificarPersona")) {
			datos = new String[1];
			datos[0]=modificar.getTxtDocumento().getText();
		}
		if(seccion.equals("btnModificarPersona")) {
			datos = new String[7];
			datos[0] = modificar.getTxtDocumento().getText();
			datos[1] = modificar.getTxtNombre().getText();
			datos[2] = modificar.getTxtCiudad().getText();
			datos[3] = modificar.getTxtCelular().getText();
			datos[4] = formato.format(modificar.getFechaNacimiento().getDate());
			datos[5] = modificar.getTxtNombreUsuario().getText();
			datos[6] = modificar.getTxtContraseña().getText();
		}
		if(seccion.equals("buscarEliminarPersona")) {
			datos = new String[1];
			datos[0]=eliminar.getTxtDocumento().getText();
		}
		if(seccion.equals("btnEliminarPersona")){
			datos = new String[1];
			datos[0]=eliminar.getTxtDocumento().getText();
		}
		return datos;
	}
}
