package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ventanaLogin extends JPanel{
	private JLabel lblUsuario;
	private JLabel lblContrase�a;
	private JTextField txtUsuario;
	private JPasswordField contrase�a;
	private JButton btnVerificar;
	private JButton btnSalir;
	
	public ventanaLogin() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblUsuario = new JLabel("Usuario:");
		txtUsuario=new JTextField();
		
		lblContrase�a = new JLabel("Contrase�a:");
		contrase�a = new JPasswordField();
		
		btnVerificar = new JButton("Verificar");
		btnSalir = new JButton("Salir");
	}
	private void caracteristicas() {
		lblUsuario.setBounds(220, 150, 100, 50);
		lblUsuario.setFont(new Font("Algerian", 1, 20));
		txtUsuario.setBounds(380,150, 200, 50);
		
		lblContrase�a.setBounds(210,250, 200, 50);
		lblContrase�a.setFont(new Font("Algerian", 1, 20));
		contrase�a.setBounds(380,250,200,50);
		
		btnVerificar.setBounds(180,380,180,50);
		btnVerificar.setBackground(Color.BLACK);
		btnVerificar.setFont(new Font("Algerian", 0, 25));
		btnVerificar.setForeground(Color.white);
		btnVerificar.setActionCommand(Acciones.VERIFICAR);
		
		btnSalir.setBounds(450,380,180,50);
		btnSalir.setBackground(Color.BLACK);
		btnSalir.setFont(new Font("Algerian", 0, 25));
		btnSalir.setForeground(Color.white);
		btnSalir.setActionCommand(Acciones.SALIR);
	}
	private void agregar() {
		add(lblUsuario);
		add(txtUsuario);
		add(lblContrase�a);
		add(contrase�a);
		add(btnVerificar);
		add(btnSalir);
	}
	//Getters / Setters
	public JButton getBtnVerificar() {
		return btnVerificar;
	}
	public JButton getBtnSalir() {
		return btnSalir;
	}
	public JTextField getTxtUsuario() {
		return txtUsuario;
	}
	public JPasswordField getContrase�a() {
		return contrase�a;
	}
}

