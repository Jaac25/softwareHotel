package Usuario;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vista.Acciones;

public class VentanaFactura extends JPanel{
	private JLabel lblTitulo;
	private JTextField txtReserva;
	
	private JLabel lblPrecioPor;
	private JLabel lblPersona;
	private JTextField txtPrecioPersona;
	
	private JLabel lblPrecio;
	private JLabel lblEstadia;
	private JTextField txtPrecioEstadia;
	
	private JLabel lblAdicionales;
	private JTextField txtAdicionales;
	
	private JLabel lblTotalAdi;
	private JLabel lblTotAdicionales;
	private JTextField txtTotalProductos;
	
	private JLabel lblTotal;
	private JTextField txtTotal;
	
	private JButton btnCobrar;
	private JButton btnAtras;
	
	public VentanaFactura() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Factura");
		txtReserva = new JTextField();
		
		lblPrecioPor = new JLabel("Precio por");
		lblPersona = new JLabel("Persona");
		txtPrecioPersona = new JTextField();
		
		lblPrecio=new JLabel("Precio");
		lblEstadia=new JLabel("Estadia");
		txtPrecioEstadia = new JTextField();
		
		lblAdicionales = new JLabel("Adicionales");
		txtAdicionales = new JTextField();
		
		lblTotalAdi = new JLabel("Total");
		lblTotAdicionales = new JLabel("Adicionales");
		txtTotalProductos = new JTextField();
		
		lblTotal = new JLabel("Total");
		txtTotal = new JTextField(); 
		
		btnCobrar = new JButton("Cobrar");
		btnAtras = new JButton("Atras");
 	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 30));
		lblTitulo.setBounds(200, 20, 460,50);
		txtReserva.setBounds(585,20,100,50);
		txtReserva.setFont(new Font("Algerian", 1, 30));
		
		lblPrecioPor.setFont(new Font("Algerian", 1, 20));
		lblPrecioPor.setBounds(45, 110, 150,50);
		lblPersona.setFont(new Font("Algerian", 1, 20));
		lblPersona.setBounds(55, 130, 100,50);
		txtPrecioPersona.setBounds(200, 120, 180, 50);
		
		lblPrecio.setFont(new Font("Algerian", 1, 20));
		lblPrecio.setBounds(65,200,150,50);
		lblEstadia.setFont(new Font("Algerian", 1, 20));
		lblEstadia.setBounds(60,220,150,50);
		txtPrecioEstadia.setBounds(200, 210,180, 50);
		
		lblAdicionales.setFont(new Font("Algerian", 1, 20));
		lblAdicionales.setBounds(420,110,150,50);
		txtAdicionales.setBounds(580,110,180,50);
		
		lblTotalAdi.setFont(new Font("Algerian", 1, 20));
		lblTotalAdi.setBounds(450,200,150,50);
		lblTotAdicionales.setFont(new Font("Algerian", 1, 20));
		lblTotAdicionales.setBounds(420,220,150,50);
		txtTotalProductos.setBounds(580,210,180,50);
		
		lblTotal.setFont(new Font("Algerian", 1, 20));
		lblTotal.setBounds(360,350,150,50);
		txtTotal.setBounds(320,400,150,50);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(320,500,150,70);
		btnAtras.setActionCommand(Acciones.ATRAS_USUARIO);
	}
	private void agregar() {
		add(lblTitulo);
//		add(txtReserva);
		
		add(lblPrecioPor);
		add(lblPersona);
		add(txtPrecioPersona);
		
		add(lblPrecio);
		add(lblEstadia);
		add(txtPrecioEstadia);
		
		add((lblAdicionales));
		add(txtAdicionales);
		
		add(lblTotalAdi);
		add(lblTotAdicionales);
		add(txtTotalProductos);
		
		add(lblTotal);
		add(txtTotal);
		
		add(btnAtras);
		
	}
	//Getters/Setters
	public JTextField getTxtReserva() {
		return txtReserva;
	}
	public void setTxtReserva(JTextField txtReserva) {
		this.txtReserva = txtReserva;
	}
	public JTextField getTxtPrecioPersona() {
		return txtPrecioPersona;
	}
	public void setTxtPrecioPersona(JTextField txtPrecioPersona) {
		this.txtPrecioPersona = txtPrecioPersona;
	}
	public JTextField getTxtPrecioEstadia() {
		return txtPrecioEstadia;
	}
	public void setTxtPrecioEstadia(JTextField txtPrecioEstadia) {
		this.txtPrecioEstadia = txtPrecioEstadia;
	}
	public JTextField getTxtAdicionales() {
		return txtAdicionales;
	}
	public void setTxtAdicionales(JTextField txtAdicionales) {
		this.txtAdicionales = txtAdicionales;
	}
	public JTextField getTxtTotalProductos() {
		return txtTotalProductos;
	}
	public void setTxtTotalProductos(JTextField txtTotalProductos) {
		this.txtTotalProductos = txtTotalProductos;
	}
	public JTextField getTxtTotal() {
		return txtTotal;
	}
	public void setTxtTotal(JTextField txtTotal) {
		this.txtTotal = txtTotal;
	}
	public JButton getBtnCobrar() {
		return btnCobrar;
	}
	public void setBtnCobrar(JButton btnCobrar) {
		this.btnCobrar = btnCobrar;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}
}
