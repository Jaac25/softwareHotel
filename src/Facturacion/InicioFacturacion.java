package Facturacion;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import vista.Acciones;

public class InicioFacturacion extends JPanel{
	private JButton btnGenerarFacturas;
	private JButton btnGuardarSalir;
	
	public InicioFacturacion() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		btnGenerarFacturas = new JButton("Generar Facturas");
		btnGuardarSalir = new JButton("Guardar y Salir");
	}
	private void caracteristicas() {
		btnGenerarFacturas.setBounds(270,200,250,70);
		btnGenerarFacturas.setFont(new Font("Algerian", 0, 20));
		btnGenerarFacturas.setBackground(Color.BLACK);
		btnGenerarFacturas.setForeground(Color.WHITE);
		btnGenerarFacturas.setActionCommand(Acciones.GENERAR_FACTURA);
		
		btnGuardarSalir.setBounds(270,300,250,70);
		btnGuardarSalir.setFont(new Font("Algerian", 0, 20));
		btnGuardarSalir.setBackground(Color.BLACK);
		btnGuardarSalir.setForeground(Color.WHITE);
		btnGuardarSalir.setActionCommand(Acciones.GUARDAR_SALIR_RECEPCIONISTA);
	}
	private void agregar() {
		add(btnGenerarFacturas);
		add(btnGuardarSalir);
	}
	
	//Getters/ Setters
	public JButton getBtnGenerarFacturas() {
		return btnGenerarFacturas;
	}
	public void setBtnGenerarFacturas(JButton btnGenerarFacturas) {
		this.btnGenerarFacturas = btnGenerarFacturas;
	}
	public JButton getBtnGuardarSalir() {
		return btnGuardarSalir;
	}
	public void setBtnGuardarSalir(JButton btnGuardarSalir) {
		this.btnGuardarSalir = btnGuardarSalir;
	}
		
}
