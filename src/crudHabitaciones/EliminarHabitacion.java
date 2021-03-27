package crudHabitaciones;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import vista.Acciones;

public class EliminarHabitacion extends JPanel{
	private JLabel lblTitulo;
	private JLabel lblNumeroHabitacion;
	private JLabel lblCapacidadPersonas;
	private JLabel lblPrecioPersona;
	
	private JTextField txtNumeroHabitacion;
	private JTextField txtCapacidadPersonas;
	private JTextField txtPrecioPersona;
	
	private ButtonGroup opciones;
	private JRadioButton barra;
	private JRadioButton aire;
	private JRadioButton television;
	private JRadioButton jacuzzi;
	
	private URL urlBarra;
	private ImageIcon imgBarra;
	private JLabel lblBarra;
	
	private URL urlAire;
	private ImageIcon imgAire;
	private JLabel lblAire;
	
	private URL urlTelevision;
	private ImageIcon imgTelevision;
	private JLabel lblTelevision;
	
	private URL urlJacuzzi;
	private ImageIcon imgJacuzzi;
	private JLabel lblJacuzzi;
	
	private JButton btnBuscar;
	private URL urlLupa;
	private ImageIcon lupa;
	
	private JButton btnAtras;
	private JButton btnEliminar;
	private JButton btnMirar;
	
	public EliminarHabitacion() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Eliminar Habitación");
		
		lblNumeroHabitacion = new JLabel("Habitación N°:");
		txtNumeroHabitacion = new JTextField();
		
		lblCapacidadPersonas = new JLabel("Capacidad:");
		txtCapacidadPersonas = new JTextField();
		
		lblPrecioPersona = new JLabel("Precio por Persona:");
		txtPrecioPersona = new JTextField();
		
		opciones = new ButtonGroup();
		barra = new JRadioButton("Barra de Productos");
		aire = new JRadioButton("Aire Acondicionado");
		television = new JRadioButton("Televisión por Cable");
		jacuzzi = new JRadioButton("Jacuzzi");
		
		urlBarra = this.getClass().getResource("/imagenes/barra.jpg");
		imgBarra = new ImageIcon(urlBarra);
		lblBarra = new JLabel();
		
		urlAire = this.getClass().getResource("/imagenes/aire.jpg");
		imgAire = new ImageIcon(urlAire);
		lblAire = new JLabel();
		
		urlTelevision = this.getClass().getResource("/imagenes/television.jpg");
		imgTelevision = new ImageIcon(urlTelevision);
		lblTelevision = new JLabel();
		
		urlJacuzzi = this.getClass().getResource("/imagenes/jacuzzi.jpg");
		imgJacuzzi = new ImageIcon(urlJacuzzi);
		lblJacuzzi = new JLabel();
		
		urlLupa = this.getClass().getResource("/imagenes/lupa.png");
		lupa = new ImageIcon(urlLupa);
		btnBuscar = new JButton(lupa);
		
		btnAtras = new JButton("Atrás");
		btnEliminar = new JButton("Eliminar");
		btnMirar = new JButton("Mirar");
	}
	
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 40));
		lblTitulo.setBounds(180,0,500,150);
		
		lblNumeroHabitacion.setFont(new Font("Algerian", 0, 20));
		lblNumeroHabitacion.setBounds(120,130,150,50);
		
		txtNumeroHabitacion.setBounds(100,180,150,50);
		
		lblCapacidadPersonas.setFont(new Font("Algerian", 0, 20));
		lblCapacidadPersonas.setBounds(550,130,150,50);
		
		txtCapacidadPersonas.setBounds(520,180,180,50);
		
		lblPrecioPersona.setFont(new Font("Algerian", 0, 20));
		lblPrecioPersona.setBounds(300,130,220,50);
		
		txtPrecioPersona.setBounds(310,180,180,50);
		
		barra.setBounds(70,270,240,50);
		barra.setFont(new Font("Algerian", 0, 20));
		
		aire.setBounds(70,330,240,50);
		aire.setFont(new Font("Algerian", 0, 20));
		
		television.setBounds(70,390,245,50);
		television.setFont(new Font("Algerian", 0, 20));
		
		jacuzzi.setBounds(70,450,240,50);
		jacuzzi.setFont(new Font("Algerian", 0, 20));
		
		lblBarra.setIcon(imgBarra);
		lblBarra.setBounds(380,270,400,210);
		
		lblAire.setIcon(imgAire);
		lblAire.setBounds(370,270,400,210);
		
		lblTelevision.setIcon(imgTelevision);
		lblTelevision.setBounds(380,270,400,210);
		
		lblJacuzzi.setIcon(imgJacuzzi);
		lblJacuzzi.setBounds(380,270,400,210);
		
		opciones.add(barra);
		opciones.add(aire);
		opciones.add(television);
		opciones.add(jacuzzi);
		
		btnMirar.setFont(new Font("Algerian", 0, 15));
		btnMirar.setBackground(Color.BLACK);
		btnMirar.setForeground(Color.WHITE);
		btnMirar.setBounds(490,480,100,40);
		btnMirar.setActionCommand(Acciones.MIRAR_ELIMINAR_HABITACION);
		
		btnBuscar.setBounds(250,180,50,50);
		btnBuscar.setActionCommand(Acciones.BUSCAR_ELIMINAR_HABITACION);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(180,560,150,50);
		btnAtras.setActionCommand(Acciones.ATRAS_HABITACION);
		
		btnEliminar.setFont(new Font("Algerian", 0, 20));
		btnEliminar.setBackground(Color.BLACK);
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBounds(460,560,150,50);
		btnEliminar.setActionCommand(Acciones.BTN_ELIMINAR_HABITACION);
	}	
	
	private void agregar() {
		add(lblTitulo);
		
		add(lblNumeroHabitacion);
		add(txtNumeroHabitacion);
		
		add(lblCapacidadPersonas);
		add(txtCapacidadPersonas);
		
		add(lblPrecioPersona);
		add(txtPrecioPersona);
		
		add(barra);
		add(aire);
		add(television);
		add(jacuzzi);
		
		add(btnBuscar);
		add(btnMirar);
		add(btnAtras);
		add(btnEliminar);
	}
	
//	Metodo
//		public void radio() {
//			if(barra.isSelected()) {
//				add(getLblBarra());
//				remove(getLblAire());
//				remove(getLblTelevision());
//				remove(getLblJacuzzi());
//			}
////			else if(modificar.getAire().isSelected()) {
////				add(modificar);
////				modificar.add(modificar.getLblAire());
////				modificar.remove(modificar.getLblBarra());
////				modificar.remove(modificar.getLblTelevision());
////				modificar.remove(modificar.getLblJacuzzi());
////				
////			}
////			else if(modificar.getTelevision().isSelected()) {
////				modificar.add(modificar.getLblTelevision());
////				modificar.remove(modificar.getLblAire());
////				modificar.remove(modificar.getLblBarra());
////				modificar.remove(modificar.getLblJacuzzi());
////				add(modificar);
////			}
////			else if(modificar.getTelevision().isSelected()) {
////				modificar.add(modificar.getLblJacuzzi());
////				modificar.remove(modificar.getLblTelevision());
////				modificar.remove(modificar.getLblAire());
////				modificar.remove(modificar.getLblBarra());
////				add(modificar);
////			}
//		}
	
		//Getters/Setters
		public JTextField getTxtNumeroHabitacion() {
			return txtNumeroHabitacion;
		}
		public JTextField getTxtCapacidadPersonas() {
			return txtCapacidadPersonas;
		}
		public JTextField getTxtPrecioPersona() {
			return txtPrecioPersona;
		}
		public ButtonGroup getOpciones() {
			return opciones;
		}
		public JRadioButton getBarra() {
			return barra;
		}
		public JRadioButton getAire() {
			return aire;
		}
		public JRadioButton getTelevision() {
			return television;
		}
		public JRadioButton getJacuzzi() {
			return jacuzzi;
		}
		public JButton getBtnAtras() {
			return btnAtras;
		}
		public JButton getBtnEliminar() {
			return btnEliminar;
		}
		public JButton getBtnMirar() {
			return btnMirar;
		}
		public JLabel getLblBarra() {
			return lblBarra;
		}
		public JLabel getLblAire() {
			return lblAire;
		}
		public JLabel getLblTelevision() {
			return lblTelevision;
		}
		public JLabel getLblJacuzzi() {
			return lblJacuzzi;
		}
		public JButton getBtnBuscar() {
			return btnBuscar;
		}
}
