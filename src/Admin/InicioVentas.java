package Admin;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import vista.Acciones;

public class InicioVentas extends JPanel{
	private JButton btnVer;
	private JButton btnGuardarSalir;
	public InicioVentas() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		btnVer= new JButton("Ver Ventas");
		btnGuardarSalir = new JButton("Guardar y Salir");
	}
	private void caracteristicas() {
		btnVer.setFont(new Font("Algerian", 0, 20));
		btnVer.setBackground(Color.BLACK);
		btnVer.setForeground(Color.WHITE);
		btnVer.setBounds(250,200,300,80);
		btnVer.setActionCommand(Acciones.VER_VENTAS);
		
		btnGuardarSalir.setFont(new Font("Algerian", 0, 20));
		btnGuardarSalir.setBackground(Color.BLACK);
		btnGuardarSalir.setForeground(Color.WHITE);
		btnGuardarSalir.setBounds(250,300,300,80);
		btnGuardarSalir.setActionCommand(Acciones.GUARDAR_SALIR_ADMIN);
	}
	private void agregar() {
		add(btnVer);
		add(btnGuardarSalir);
	}
	
	//Getters/Settteres
	
	public JButton getBtnVer() {
		return btnVer;
	}
	public void setBtnVer(JButton btnVer) {
		this.btnVer = btnVer;
	}
	public JButton getBtnGuardarSalir() {
		return btnGuardarSalir;
	}
	public void setBtnGuardarSalir(JButton btnGuardarSalir) {
		this.btnGuardarSalir = btnGuardarSalir;
	}
		
}
