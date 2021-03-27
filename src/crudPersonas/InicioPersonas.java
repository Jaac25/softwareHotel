package crudPersonas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vista.Acciones;

public class InicioPersonas extends JPanel{
	private JLabel lblTitulo;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnVer;
	private JButton btnGuardarSalir;
	
	public InicioPersonas() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	
	private void inicializar() {
		lblTitulo=new JLabel("Clientes");
		btnAgregar=new JButton("Agregar Cliente");
		btnModificar=new JButton("Modificar Cliente");
		btnEliminar=new JButton("Eliminar Cliente");
		btnVer=new JButton("Ver Cliente");
		btnGuardarSalir=new JButton("Guardar y Salir"); 
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 46)); 
		lblTitulo.setForeground (Color.BLACK);
		lblTitulo.setBounds(270,0,300,150);
		
		btnAgregar.setFont(new Font("Algerian", 0, 20));
		btnAgregar.setBackground(Color.BLACK);
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setBounds(180,160,420,70);
		btnAgregar.setActionCommand(Acciones.AGREGAR_PERSONA);
		
		btnModificar.setFont(new Font("Algerian", 0, 20));
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBounds(180,240,420,70);
		btnModificar.setActionCommand(Acciones.MODIFICAR_PERSONA);
		
		btnEliminar.setFont(new Font("Algerian", 0, 20));
		btnEliminar.setBackground(Color.BLACK);
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBounds(180,320,420,70);
		btnEliminar.setActionCommand(Acciones.ELIMINAR_PERSONA);
		
		btnVer.setFont(new Font("Algerian", 0, 20));
		btnVer.setBackground(Color.BLACK);
		btnVer.setForeground(Color.WHITE);
		btnVer.setBounds(180,400,420,70);
		btnVer.setActionCommand(Acciones.VER_PERSONAS);
		
		btnGuardarSalir.setFont(new Font("Algerian", 0, 20));
		btnGuardarSalir.setBackground(Color.BLACK);
		btnGuardarSalir.setForeground(Color.WHITE);
		btnGuardarSalir.setBounds(180,480,420,70);
		btnGuardarSalir.setActionCommand(Acciones.GUARDAR_SALIR_RECEPCIONISTA);
	}
	private void agregar() {
		add(lblTitulo);
		add(btnAgregar);
		add(btnModificar);
		add(btnEliminar);
		add(btnVer);
		add(btnGuardarSalir);
	}
	//Getters/Setters
	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnVer() {
		return btnVer;
	}

	public void setBtnVer(JButton btnVer) {
		this.btnVer = btnVer;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnGuardarSalir() {
		return btnGuardarSalir;
	}
}
