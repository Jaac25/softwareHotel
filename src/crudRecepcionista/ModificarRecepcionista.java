package crudRecepcionista;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vista.Acciones;

public class ModificarRecepcionista extends JPanel{
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
	private JButton btnModificar;
	
	private JButton btnBuscar;
	private URL urlLupa;
	private ImageIcon lupa;
	
	public ModificarRecepcionista() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Modificar Recepcionista");
		
		lblNombre = new JLabel("Nombre:");
		txtNombre = new JTextField();
		
		lblDocumento = new JLabel("Documento:");
		txtDocumento = new JTextField();
		
		lblApellido = new JLabel("Apellido:");
		txtApellido = new JTextField();
		
		lblTelefono = new JLabel("Tel?fono:");
		txtTelefono = new JTextField();
		
		lblDireccion = new JLabel("Direcci?n:");
		txtDireccion = new JTextField();
		
		urlLupa = this.getClass().getResource("/imagenes/lupa.png");
		lupa = new ImageIcon(urlLupa);
		
		btnAtras = new JButton("Atr?s");
		btnModificar = new JButton("Modificar");
		btnBuscar = new JButton(lupa);
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 40));
		lblTitulo.setBounds(150,0,550,150);
		
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
		
		btnBuscar.setBounds(710,170,45,50);
		btnBuscar.setActionCommand(Acciones.BUSCAR_MODIFICAR_RECEPCIONISTA);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(180,500,150,70);
		btnAtras.setActionCommand(Acciones.ATRAS_RECEPCIONISTA);
		
		btnModificar.setFont(new Font("Algerian", 0, 20));
		btnModificar.setBackground(Color.BLACK);
		btnModificar.setForeground(Color.WHITE);
		btnModificar.setBounds(460,500,150,70);
		btnModificar.setActionCommand(Acciones.BTN_MODIFICAR_RECEPCIONISTA);
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
		
		add(btnBuscar);
		add(btnAtras);
		add(btnModificar);
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
	public JButton getBtnModificar() {
		return btnModificar;
	}
	public JButton getBtnBuscar() {
		return btnBuscar;
	}
		
}
