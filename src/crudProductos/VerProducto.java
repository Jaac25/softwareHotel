package crudProductos;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vista.Acciones;

public class VerProducto extends JPanel{
	private JLabel lblTitulo;
	private JScrollPane jScrollPane;
	private DefaultTableModel modeloTabla;
	private JTable jTableProductos;
	private JButton btnAtras;
	
	public VerProducto() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}

	private void inicializar() {
		lblTitulo = new JLabel("Ver Productos");
		
		String[] cabecera = {"Código","Nombre","Cantidad","Precio"};
		modeloTabla = new DefaultTableModel();
		modeloTabla.setColumnIdentifiers(cabecera);
		jTableProductos = new JTable(modeloTabla);
		jScrollPane = new JScrollPane(jTableProductos);
		btnAtras = new JButton("Atrás");
	}
	
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 30));
		lblTitulo.setBounds(270,0,300,50);
		
		jTableProductos.setGridColor(Color.BLUE);
		jScrollPane.setBounds(50, 50, 700, 490);
		
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 15));
		btnAtras.setForeground(Color.white);
		btnAtras.setBounds(340, 550, 120, 50);
		btnAtras.setActionCommand(Acciones.ATRAS_PRODUCTO);
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
		
		public JTable getjTableProductos() {
			return jTableProductos;
		}
}
