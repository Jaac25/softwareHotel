package Admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vista.Acciones;

public class VerVentas extends JPanel{
	private JLabel lblTitulo;
	private JScrollPane jScrollPane;
	private DefaultTableModel modeloTabla;
	private JTable jTableProductos;
	private JButton btnAtras;
	
	public VerVentas() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}

	private void inicializar() {
		lblTitulo = new JLabel("Ver Ventas");
		String[] cabecera = {"Fecha","Total Estadia","Total Productos","Total"};
		modeloTabla = new DefaultTableModel();
		modeloTabla.setColumnIdentifiers(cabecera);
		jTableProductos = new JTable(modeloTabla);
		jScrollPane = new JScrollPane(jTableProductos);
		btnAtras = new JButton("Atrás");
	}
	
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 30));
		lblTitulo.setBounds(290,0,300,50);
		
		jTableProductos.setGridColor(Color.BLUE);
		jScrollPane.setBounds(20, 50, 750, 490);
		
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setFont(new Font("Algerian", 0, 15));
		btnAtras.setForeground(Color.white);
		btnAtras.setBounds(340, 550, 120, 50);
		btnAtras.setActionCommand(Acciones.ATRAS_VENTAS);
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
