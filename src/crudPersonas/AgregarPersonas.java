package crudPersonas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import vista.Acciones;

public class AgregarPersonas extends JPanel{

	private JLabel lblTitulo;
	
	private JLabel lblDocumento;
	private JTextField txtDocumento;
	
	private JLabel lblNombre;
	private JTextField txtNombre;
	
	private JLabel lblCiudad;
	private JTextField txtCiudad;
	
	private JLabel lblCelular;
	private JTextField txtCelular;
	
	private JLabel lblFechaDe;
	private JLabel lblNacimiento;
	private JDateChooser fechaNacimiento;
	
	private JLabel lblNombreUsuario;
	private JTextField txtNombreUsuario;
	
	private JLabel lblContraseña;
	private JTextField txtContraseña;
	
	private JButton btnGuardar;
	private JButton btnAtras;
	
	public AgregarPersonas() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Agregar Cliente");
		
		lblDocumento = new JLabel("Documento:");
		txtDocumento = new JTextField();
		
		lblNombre = new JLabel("Nombre:");
		txtNombre = new JTextField();
		
		lblCiudad = new JLabel("Ciudad:");
		txtCiudad = new JTextField();
		
		lblCelular = new JLabel("Celular:");
		txtCelular = new JTextField();
		
		lblFechaDe = new JLabel("Fecha de");
		lblNacimiento = new JLabel("Nacimiento");
		fechaNacimiento = new JDateChooser();
		
		lblNombreUsuario = new JLabel("Usuario:");
		txtNombreUsuario = new JTextField();
		
		lblContraseña = new JLabel("Contraseña:");
		txtContraseña = new JTextField();
		
		btnGuardar = new JButton("Guardar");
		btnAtras = new JButton("Atrás");
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 40));
		lblTitulo.setBounds(220,-10	,500,150);
		
		lblDocumento.setFont(new Font("Algerian", 0, 20));
		lblDocumento.setBounds(50,130,120,40);
		txtDocumento.setBounds(200,130,170,60);
		
		lblNombre.setFont(new Font("Algerian", 0, 20));
		lblNombre.setBounds(50,220,120,40);
		txtNombre.setBounds(200,220,170,60);
		
		lblCiudad.setFont(new Font("Algerian", 0, 20));
		lblCiudad.setBounds(50,310,120,40);
		txtCiudad.setBounds(200,310,170,60);
		
		lblFechaDe.setFont(new Font("Algerian", 0, 20));
		lblFechaDe.setBounds(50,400,120,40);
		lblNacimiento.setFont(new Font("Algerian", 0, 20));
		lblNacimiento.setBounds(40,420,120,40);
		fechaNacimiento.setBounds(200,400,170,60);
		
		lblCelular.setFont(new Font("Algerian", 0, 20));
		lblCelular.setBounds(450,130,120,40);
		txtCelular.setBounds(570,130,170,60);
		
		lblNombreUsuario.setFont(new Font("Algerian", 0, 20));
		lblNombreUsuario.setBounds(450,220, 120,40);
		txtNombreUsuario.setBounds(570,220,170,60);
		
		lblContraseña.setFont(new Font("Algerian", 0, 20));
		lblContraseña.setBounds(430,310,140,40);
		txtContraseña.setBounds(570,310,170,60);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(180,500,150,70);
		btnAtras.setActionCommand(Acciones.ATRAS_PERSONA);
		
		btnGuardar.setFont(new Font("Algerian", 0, 20));
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBounds(460,500,150,70);
		btnGuardar.setActionCommand(Acciones.GUARDAR_PERSONA);
	}
	private void agregar() {
		add(lblTitulo);
		
		add(lblDocumento);
		add(txtDocumento);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblCiudad);
		add(txtCiudad);
		
		add(lblCelular);
		add(txtCelular);
		
		add(lblFechaDe);
		add(lblNacimiento);
		add(fechaNacimiento);
		
		add(lblNombreUsuario);
		add(txtNombreUsuario);
		
		add(lblContraseña);
		add(txtContraseña);
		
		add(btnGuardar);
		add(btnAtras);
	}
	public JTextField getTxtDocumento() {
		return txtDocumento;
	}
	public void setTxtDocumento(JTextField txtDocumento) {
		this.txtDocumento = txtDocumento;
	}
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}
	public JTextField getTxtCiudad() {
		return txtCiudad;
	}
	public void setTxtCiudad(JTextField txtCiudad) {
		this.txtCiudad = txtCiudad;
	}
	public JTextField getTxtCelular() {
		return txtCelular;
	}
	public void setTxtCelular(JTextField txtCelular) {
		this.txtCelular = txtCelular;
	}
	public JDateChooser getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(JDateChooser fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public JTextField getTxtNombreUsuario() {
		return txtNombreUsuario;
	}
	public void setTxtNombreUsuario(JTextField txtNombreUsuario) {
		this.txtNombreUsuario = txtNombreUsuario;
	}
	public JTextField getTxtContraseña() {
		return txtContraseña;
	}
	public void setTxtContraseña(JTextField txtContraseña) {
		this.txtContraseña = txtContraseña;
	}
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}
}
 	