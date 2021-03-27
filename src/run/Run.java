package run;

import control.Control;
import vista.VentanaPrincipal;

public class Run {
	public static void main(String[]arg) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		Control control = new Control(ventana);
		ventana.asignarControl(control);
		ventana.setVisible(true);
	}
}
