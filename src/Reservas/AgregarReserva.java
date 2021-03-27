package Reservas;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.toedter.calendar.JDateChooser;

import datechooser.view.CalendarPane;
import logica.Habitacion;
import vista.Acciones;

public class AgregarReserva extends JPanel{
	private JLabel lblTitulo;
	
	private JLabel lblCodigo;
	private JTextField txtCodigo;
	
	private JLabel lblFechaDe;
	private JLabel lblEntrada;
	private JDateChooser fechaEntrada;
	
	private JLabel lblNumeroDe;
	private JLabel lblPersonas;
	private JTextField txtNumeoPersonas;
	
	private JLabel lblHabitacion;
	private JList elegirHabitacion;
	private JScrollPane jScrollLista;
	private DefaultListModel modelLista;
	
	private JButton btnGuardar;
	private JButton btnAtras;
	
	private Border blackline;
	
	public AgregarReserva() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Agregar Reserva");
		
		lblCodigo = new JLabel("Código: ");
		txtCodigo = new JTextField();
		
		lblFechaDe = new JLabel("Fecha de");
		lblEntrada = new JLabel("Ingreso");
		fechaEntrada = new JDateChooser();
		
		lblNumeroDe = new JLabel("Numero de");
		lblPersonas =new JLabel("Personas");
		txtNumeoPersonas = new JTextField();
		
		lblHabitacion = new JLabel("Habitación");
		modelLista=new DefaultListModel();
		jScrollLista = new JScrollPane(elegirHabitacion);
		elegirHabitacion=new JList<>(modelLista);
		
		blackline = BorderFactory.createLineBorder(Color.black);
		
		btnGuardar = new JButton("Guardar");
		btnAtras = new JButton("Atras");

	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 40));
		lblTitulo.setBounds(175, 0, 440,50);
	
		lblCodigo.setFont(new Font("Algerian", 1, 20));
		lblCodigo.setBounds(50,100,150,50);
		txtCodigo.setBounds(170,100,180,50);
		
		lblFechaDe.setFont(new Font("Algerian", 1, 20));
		lblFechaDe.setBounds(420,90,150,50);
		lblEntrada.setFont(new Font("Algerian", 1, 20));
		lblEntrada.setBounds(426,110,150,50);
		fechaEntrada.setBounds(560,100,180,50);
		
		lblNumeroDe.setFont(new Font("Algerian", 1, 20));
		lblNumeroDe.setBounds(40,190,150,50);
		lblPersonas.setBounds(44,210,150,50);
		lblPersonas.setFont(new Font("Algerian", 1, 20));
		txtNumeoPersonas.setBounds(170,200,180,50);
		
		lblHabitacion.setFont(new Font("Algerian", 1, 20));
		lblHabitacion.setBounds(40,270,150,50);
		jScrollLista.setBounds(30,320,500,290);
		elegirHabitacion.setBounds(30,320,500,290);
		elegirHabitacion.setBorder(blackline);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(580,440,150,50);
		btnAtras.setActionCommand(Acciones.ATRAS_RESERVA);
		
		btnGuardar.setFont(new Font("Algerian", 0, 20));
		btnGuardar.setBackground(Color.BLACK);
		btnGuardar.setForeground(Color.WHITE);
		btnGuardar.setBounds(580,510,150,50);
		btnGuardar.setActionCommand(Acciones.GUARDAR_RESERVA);
	}
	private void agregar() {
		add(lblTitulo);
		
		add(lblCodigo);
		add(txtCodigo);
		
		add(lblFechaDe);
		add(lblEntrada);
		add(fechaEntrada);
		
		add(lblNumeroDe);
		add(lblPersonas);
		add(txtNumeoPersonas);
		
		add(lblHabitacion);
		add(elegirHabitacion);
		add(jScrollLista);
		
		add((btnAtras));
		add(btnGuardar);
	}
	
	//Getters/Setters
	public JTextField getTxtCodigo() {
		return txtCodigo;
	}
	public void setTxtCodigo(JTextField txtCodogo) {
		this.txtCodigo = txtCodogo;
	}
	public JDateChooser getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(JDateChooser fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public JTextField getTxtNumeoPersonas() {
		return txtNumeoPersonas;
	}
	public void setTxtNumeoPersonas(JTextField txtNumeoPersonas) {
		this.txtNumeoPersonas = txtNumeoPersonas;
	}
	public JList getElegirHabitacion() {
		return elegirHabitacion;
	}
	public void setElegirHabitacion(JList elegirHabitacion) {
		this.elegirHabitacion = elegirHabitacion;
	}
	public JScrollPane getjScrollLista() {
		return jScrollLista;
	}
	public void setjScrollLista(JScrollPane jScrollLista) {
		this.jScrollLista = jScrollLista;
	}
	public DefaultListModel getModelLista() {
		return modelLista;
	}
	public void setModelLista(DefaultListModel modelLista) {
		this.modelLista = modelLista;
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
