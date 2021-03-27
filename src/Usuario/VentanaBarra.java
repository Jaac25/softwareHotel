package Usuario;

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

import vista.Acciones;

public class VentanaBarra extends JPanel{
	private JLabel lblTitulo;
	
	private JLabel lblProductos;
	private JList elegirProducto;
	private JScrollPane jScrollLista;
	private DefaultListModel modelLista;
	
	private Border blackline;
	
	private JButton btnComprar;
	private JButton btnAtras;
	
	public VentanaBarra() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Barra de Productos");
		
		lblProductos = new JLabel("Productos");
		
		modelLista=new DefaultListModel();
		jScrollLista = new JScrollPane(elegirProducto);
		elegirProducto=new JList<>(modelLista);

		blackline = BorderFactory.createLineBorder(Color.black);
		
		btnAtras = new JButton("Atras");
		btnComprar = new JButton("Comprar");
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 1, 40));
		lblTitulo.setBounds(150, 20, 460,50);
		
		lblProductos.setFont(new Font("Algerian", 1, 20));
		lblProductos.setBounds(140,130,150,50);
		
		jScrollLista.setBounds(30,180,350,440);
		elegirProducto.setBounds(30,180,350,440);
		elegirProducto.setBorder(blackline);
		
		btnComprar.setFont(new Font("Algerian", 0, 20));
		btnComprar.setBackground(Color.BLACK);
		btnComprar.setForeground(Color.WHITE);
		btnComprar.setBounds(490,180,150,50);
		btnComprar.setActionCommand(Acciones.COMPRAR);
		
		btnAtras.setFont(new Font("Algerian", 0, 20));
		btnAtras.setBackground(Color.BLACK);
		btnAtras.setForeground(Color.WHITE);
		btnAtras.setBounds(490,560,150,50);
		btnAtras.setActionCommand(Acciones.ATRAS_USUARIO);
	}
	private void agregar() {
		add(lblTitulo);
		
		add(lblProductos);
		add(elegirProducto);
		add(jScrollLista);
		
		add(btnComprar);
		add(btnAtras);
	}
	//Getters/Setters
	public JList getElegirProducto() {
		return elegirProducto;
	}
	public void setElegirProducto(JList elegirHabitacion) {
		this.elegirProducto = elegirHabitacion;
	}
	public DefaultListModel getModelLista() {
		return modelLista;
	}
	public void setModelLista(DefaultListModel modelLista) {
		this.modelLista = modelLista;
	}
	public JButton getBtnComprar() {
		return btnComprar;
	}
	public void setBtnComprar(JButton btnComprar) {
		this.btnComprar = btnComprar;
	}
	public JButton getBtnAtras() {
		return btnAtras;
	}
	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}
	
}
