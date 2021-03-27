package crudHabitaciones;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vista.Acciones;

public class VerHabitacion extends JPanel{
	private JLabel lblTitulo;
	private JScrollPane jScrollPane;
	private DefaultTableModel modeloTabla;
	private JTable jTableHabitacion;
	private JButton btnAtras;
	
	public VerHabitacion() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}

	private void inicializar() {
		lblTitulo = new JLabel("Ver Habitaciones");
		
		String[] cabecera = {"Número","Capacidad","Precio","Opción"};
		modeloTabla = new DefaultTableModel();
		modeloTabla.setColumnIdentifiers(cabecera);
		jTableHabitacion = new JTable(modeloTabla);
		jScrollPane = new JScrollPane(jTableHabitacion);
		btnAtras = new JButton("Atrás");
	}
	
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 30));
		lblTitulo.setBounds(250,0,320,50);
		
		jTableHabitacion.setGridColor(Color.BLUE);
		jScrollPane.setBounds(50, 50, 700, 490);
		
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 15));
		btnAtras.setForeground(Color.white);
		btnAtras.setBounds(340, 550, 120, 50);
		btnAtras.setActionCommand(Acciones.ATRAS_HABITACION);
	}

	private void agregar() {
		add(lblTitulo);
		add(jScrollPane);
		add(btnAtras);
	}
	
	//Getters/Setters
	public JButton getBtnAtras() {
		return btnAtras;
	}
	
	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}
	
	public JTable getjTableHabitacionProductos() {
		return jTableHabitacion;
	}
}
