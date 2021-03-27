package crudProductos;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vista.Acciones;

public class EliminarProductos extends JPanel{
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
	private JButton btnEliminar;
	private JButton btnBuscar;
	private URL urlLupa;
	private ImageIcon lupa;
	
	public EliminarProductos() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Eliminar Producto");
		
		lblCodigo=new  JLabel("Código:");
		txtCodigo=new JTextField();
		
		lblNombre = new JLabel("Nombre:");
		txtNombre = new JTextField();
		
		lblCantidad = new JLabel("Cantidad:");
		txtCantidad = new JTextField();
		
		lblPrecio = new JLabel("Precio:");
		txtPrecio = new JTextField();
		
		urlLupa = this.getClass().getResource("/imagenes/lupa.png");
		lupa = new ImageIcon(urlLupa);
		
		btnAtras = new JButton("Atrás");
		btnEliminar = new JButton("Eliminar");
		btnBuscar = new JButton(lupa);
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 40));
		lblTitulo.setBounds(200,0,500,150);
		
		lblCodigo.setFont(new Font("Algerian", 0, 20));
		lblCodigo.setBounds(60,200,100,50);
		
		txtCodigo.setBounds(170,200,170,50);
		
		lblNombre.setFont(new Font("Algerian", 0, 20));
		lblNombre.setBounds(60,320,100,50);
		
		txtNombre.setBounds(170,320,180,50);
		
		lblCantidad.setFont(new Font("Algerian", 0, 20));
		lblCantidad.setBounds(400,200,110,50);
		
		txtCantidad.setBounds(530,200,180,50);
		
		lblPrecio.setFont(new Font("Algerian", 0, 20));
		lblPrecio.setBounds(400,320,110,50);
		
		txtPrecio.setBounds(530,320,180,50);
		
		btnBuscar.setBounds(345,200,45,50);
		btnBuscar.setActionCommand(Acciones.BUSCAR_ELIMINAR_PRODUCTO);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(180,500,150,70);
		btnAtras.setActionCommand(Acciones.ATRAS_PRODUCTO);
		
		btnEliminar.setFont(new Font("Algerian", 0, 20));
		btnEliminar.setBackground(Color.BLACK);
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBounds(460,500,150,70);
		btnEliminar.setActionCommand(Acciones.BTN_ELIMINAR_PRODUCTO);
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
		
		add(btnBuscar);
		add(btnAtras);
		add(btnEliminar);
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
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public JButton getBtnBuscar() {
		return btnBuscar;
	}
}
