package crudProductos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vista.Acciones;

public class AgregarProductos extends JPanel{
	private JLabel lblTitulo;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblCantidad;
	private JLabel lblPrecio;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JButton btnAtras;
	private JButton btnGuardar;
	
	public AgregarProductos() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Agregar Producto");
		
		lblCodigo=new  JLabel("Código:");
		txtCodigo=new JTextField();
		
		lblNombre = new JLabel("Nombre:");
		txtNombre = new JTextField();
		
		lblCantidad = new JLabel("Cantidad:");
		txtCantidad = new JTextField();
		
		lblPrecio = new JLabel("Precio:");
		txtPrecio = new JTextField();
		
		btnAtras = new JButton("Atrás");
		btnGuardar = new JButton("Guardar");
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 40));
		lblTitulo.setBounds(200,0,500,150);
		
		lblCodigo.setFont(new Font("Algerian", 0, 20));
		lblCodigo.setBounds(60,200,100,50);
		
		txtCodigo.setBounds(170,200,180,50);
		
		lblNombre.setFont(new Font("Algerian", 0, 20));
		lblNombre.setBounds(60,320,100,50);
		
		txtNombre.setBounds(170,320,180,50);
		
		lblCantidad.setFont(new Font("Algerian", 0, 20));
		lblCantidad.setBounds(400,200,110,50);
		
		txtCantidad.setBounds(530,200,180,50);
		
		lblPrecio.setFont(new Font("Algerian", 0, 20));
		lblPrecio.setBounds(400,320,110,50);
		
		txtPrecio.setBounds(530,320,180,50);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(180,500,150,70);
		btnAtras.setActionCommand(Acciones.ATRAS_PRODUCTO);
		
		btnGuardar.setFont(new Font("Algerian", 0, 20));
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBounds(460,500,150,70);
		btnGuardar.setActionCommand(Acciones.GUARDAR_PRODUCTO);
	}
	private void agregar() {
		add(lblTitulo);
		
		add(lblCodigo);
		add(txtCodigo);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblCantidad);
		add(txtCantidad);
		
		add(lblPrecio);
		add(txtPrecio);
		
		add(btnAtras);
		add(btnGuardar);
	}
	//Getters / Setters
	public JTextField getTxtCodigo() {
		return txtCodigo;
	}
	public JTextField getTxtNombre() {
		return txtNombre;
	}
	public JTextField getTxtCantidad() {
		return txtCantidad;
	}
	public JTextField getTxtPrecio() {
		return txtPrecio;
	}
	public JButton getBtnGuardar() {
		return btnGuardar;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}		
}
