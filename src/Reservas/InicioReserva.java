package Reservas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import vista.Acciones;

public class InicioReserva extends JPanel{
	private JButton btnAgregar;
	private JButton btnVer;
	private JButton btnGuardarSalir;
	
	public InicioReserva() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		btnAgregar= new JButton("Agregar Reserva");
		btnVer = new JButton("Ver Reservas");
		btnGuardarSalir = new JButton("Guardar y Salir");
	}
	private void caracteristicas() {
		btnAgregar.setBounds(250,150,300,80);
		btnAgregar.setFont(new Font("Algerian", 0, 20));
		btnAgregar.setBackground(Color.BLACK);
		btnAgregar.setForeground(Color.WHITE);
		btnAgregar.setActionCommand(Acciones.AGREGAR_RESERVA);
		
		btnVer.setBounds(250,250,300,80);
		btnVer.setFont(new Font("Algerian", 0, 20));
		btnVer.setBackground(Color.BLACK);
		btnVer.setForeground(Color.WHITE);
		btnVer.setActionCommand(Acciones.VER_RESERVAS);
		
		btnGuardarSalir.setBounds(250,350,300,80);
		btnGuardarSalir.setFont(new Font("Algerian", 0, 20));
		btnGuardarSalir.setBackground(Color.BLACK);
		btnGuardarSalir.setForeground(Color.WHITE);
		btnGuardarSalir.setActionCommand(Acciones.GUARDAR_SALIR_RECEPCIONISTA);
	}
	private void agregar() {
		add(btnAgregar);
		add(btnVer);
		add(btnGuardarSalir);
	}
	//Getters/Setters
	public JButton getBtnAgregar() {
		return btnAgregar;
	}
	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}
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
