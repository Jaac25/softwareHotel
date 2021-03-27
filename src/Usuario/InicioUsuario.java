package Usuario;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import vista.Acciones;

public class InicioUsuario extends JPanel{
	private JButton btnFactura;
	private JButton btnBarra;
	private JButton btnSalir;
	
	public InicioUsuario() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		btnFactura = new JButton("Factura");
		btnBarra = new JButton("Barra");
		btnSalir = new JButton("Salir");
	}
	private void caracteristicas() {
		btnFactura.setFont(new Font("Algerian", 0, 20));
		btnFactura.setBackground(Color.BLACK);
		btnFactura.setForeground(Color.WHITE);
		btnFactura.setBounds(250,200,300,80);
		btnFactura.setActionCommand(Acciones.VER_FACTURA);
		
		btnBarra.setFont(new Font("Algerian", 0, 20));
		btnBarra.setBackground(Color.BLACK);
		btnBarra.setForeground(Color.WHITE);
		btnBarra.setBounds(250,300,300,80);
		btnBarra.setActionCommand(Acciones.BARRA);
		
		btnSalir.setFont(new Font("Algerian", 0, 20));
		btnSalir.setBackground(Color.BLACK);
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBounds(250,400,300,80);
		btnSalir.setActionCommand(Acciones.SALIR_USUARIO);
	}
	private void agregar() {
		add(btnFactura);
		add(btnBarra);
		add(btnSalir);
	}
	//Getters/Setters
	public JButton getBtnFactura() {
		return btnFactura;
	}
	public void setBtnFactura(JButton btnFactura) {
		this.btnFactura = btnFactura;
	}
	public JButton getBtnBarra() {
		return btnBarra;
	}
	public void setBtnBarra(JButton btnBarra) {
		this.btnBarra = btnBarra;
	}
	public JButton getBtnSalir() {
		return btnSalir;
	}
	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}	
}
