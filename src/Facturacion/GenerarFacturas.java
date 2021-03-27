package Facturacion;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import com.toedter.calendar.JDateChooser;

import vista.Acciones;

public class GenerarFacturas extends JPanel{
	private JLabel lblTitulo;
	
	private JList verReservas;  
	private JLabel lblReservas;
	private JScrollPane jScrollLista;
	private DefaultListModel modelLista;
	
	private JLabel lblFechaDe;
	private JLabel lblSalida;
	private JDateChooser fechaSalida;
	
	private Border blackline;
	
	private JButton btnSiguiente;
	private JButton btnAtras;
	
	public GenerarFacturas() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Generar Factura");
		
		lblReservas = new JLabel("Elige una Reserva");
		modelLista=new DefaultListModel();
		jScrollLista = new JScrollPane(verReservas);
		verReservas = new JList<>(modelLista);
		
		lblFechaDe = new JLabel("Fecha de");
		lblSalida = new JLabel("Salida");
		fechaSalida = new JDateChooser();
		
		blackline = BorderFactory.createLineBorder(Color.black);
		
		btnSiguiente =new JButton("Siguiente");
		btnAtras = new JButton("Atras");
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 40));
		lblTitulo.setBounds(175, 0, 440,50);
		
		lblReservas.setFont(new Font("Algerian", 1, 20));
		lblReservas.setBounds(170,100,250,50);
		
		jScrollLista.setBounds(30,160,500,450);
		verReservas.setBounds(30,160,500,450);
		verReservas.setBorder(blackline);
		
		lblFechaDe.setFont(new Font("Algerian", 1, 20));
		lblFechaDe.setBounds(600,95,150,50);
		lblSalida.setFont(new Font("Algerian", 1, 20));
		lblSalida.setBounds(610,115,150,50);
		fechaSalida.setBounds(560,160,200,50);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(585,430,150,50);
		btnAtras.setActionCommand(Acciones.ATRAS_FACTURAS);
		
		btnSiguiente.setFont(new Font("Algerian", 0, 20));
		btnSiguiente.setBackground(Color.BLACK);
		btnSiguiente.setForeground(Color.WHITE);
		btnSiguiente.setBounds(585,360,150,50);
		btnSiguiente.setActionCommand(Acciones.SIGUIENTE_FACTURA);
	}
	private void agregar() {
		add(lblTitulo);
		
		add(lblReservas);
		add(verReservas);
		add(jScrollLista);
		
		add(lblFechaDe);
		add(lblSalida);
		add(fechaSalida);
		
		add(btnSiguiente);
		add(btnAtras);
	}
	//Getters/Setters
		public JList getVerReservas() {
			return verReservas;
		}
		public void setVerReservas(JList verReservas) {
			this.verReservas = verReservas;
		}
		public DefaultListModel getModelLista() {
			return modelLista;
		}
		public void setModelLista(DefaultListModel modelLista) {
			this.modelLista = modelLista;
		}
		public JButton getBtnSiguiente() {
			return btnSiguiente;
		}
		public void setBtnSiguiente(JButton btnSiguiente) {
			this.btnSiguiente = btnSiguiente;
		}
		public JButton getBtnAtras() {
			return btnAtras;
		}
		public void setBtnAtras(JButton btnAtras) {
			this.btnAtras = btnAtras;
		}
		public JDateChooser getFechaSalida() {
			return fechaSalida;
		}
		public void setFechaSalida(JDateChooser fechaSalida) {
			this.fechaSalida = fechaSalida;
		}
		
}
