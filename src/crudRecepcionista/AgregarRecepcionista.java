package crudRecepcionista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vista.Acciones;

public class AgregarRecepcionista extends JPanel{
	
	private JLabel lblTitulo;
	
	private JLabel lblDocumento;
	private JTextField txtDocumento;
	
	private JLabel lblNombre;
	private JTextField txtNombre;
	
	private JLabel lblApellido;
	private JTextField txtApellido;
	
	private JLabel lblTelefono;
	private JTextField txtTelefono;
	
	private JLabel lblDireccion;
	private JTextField txtDireccion;
	
	private JButton btnAtras;
	private JButton btnGuardar;
	
	public AgregarRecepcionista() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Agregar Recepcionista");
		
		lblNombre = new JLabel("Nombre:");
		txtNombre = new JTextField();
		
		lblDocumento = new JLabel("Documento:");
		txtDocumento = new JTextField();
		
		lblApellido = new JLabel("Apellido:");
		txtApellido = new JTextField();
		
		lblTelefono = new JLabel("Teléfono:");
		txtTelefono = new JTextField();
		
		lblDireccion = new JLabel("Dirección:");
		txtDireccion = new JTextField();
		
		btnAtras = new JButton("Atrás");
		btnGuardar = new JButton("Guardar");
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 40));
		lblTitulo.setBounds(150,0,500,150);
		
		lblNombre.setFont(new Font("Algerian", 0, 20));
		lblNombre.setBounds(70,170,100,50);
		
		txtNombre.setBounds(180,170,180,50);
		
		lblDocumento.setFont(new Font("Algerian", 0, 20));
		lblDocumento.setBounds(400,170,120,50);
		
		txtDocumento.setBounds(530,170,180,50);
		
		lblApellido.setFont(new Font("Algerian", 0, 20));
		lblApellido.setBounds(70,270,120,50);
		
		txtApellido.setBounds(180,270,180,50);
		
		lblTelefono.setFont(new Font("Algerian", 0, 20));
		lblTelefono.setBounds(400,270,120,50);
		
		txtTelefono.setBounds(530,270,180,50);
		
		lblDireccion.setFont(new Font("Algerian", 0, 20));
		lblDireccion.setBounds(70,370,120,50);
		
		txtDireccion.setBounds(180,370,180,50);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(180,500,150,70);
		btnAtras.setActionCommand(Acciones.ATRAS_RECEPCIONISTA);
		
		btnGuardar.setFont(new Font("Algerian", 0, 20));
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBounds(460,500,150,70);
		btnGuardar.setActionCommand(Acciones.GUARDAR_RECEPCIONISTA);
	}
	private void agregar() {
		add(lblTitulo);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblDocumento);
		add(txtDocumento);
		
		add(lblApellido);
		add(txtApellido);
		
		add(lblTelefono);
		add(txtTelefono);
		
		add(lblDireccion);
		add(txtDireccion);
		
		add(btnAtras);
		add(btnGuardar);
	}
	//Getters/Setters
	public JTextField getTxtDocumento() {
		return txtDocumento;
	}
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	public JTextField getTxtApellido() {
		return txtApellido;
	}
	public JTextField getTxtTelefono() {
		return txtTelefono;
	}
	public JTextField getTxtDireccion() {
		return txtDireccion;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	
	
}
