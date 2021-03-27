package logica;

import java.io.Serializable;
import java.util.Date;

public class Reserva implements Serializable{
	//Atributos
		private String codigo;
		private Date fechaEntrada;
		private String numeroPersonas;
		private Habitacion habitacion;
		
	//Constructor
		public Reserva(String codigo,Date fechaEntrada,String numeroPersonas, Habitacion habitacion) { 
			this.codigo=codigo;
			this.fechaEntrada=fechaEntrada;
			this.numeroPersonas=numeroPersonas;
			this.habitacion=habitacion;
		}
	//Getters/Setters

		public String getCodigo() {
			return codigo;
		}

		public Date getFechaEntrada() {
			return fechaEntrada;
		}

		public String getNumeroPersonas() {
			return numeroPersonas;
		}

		public Habitacion getHabitacion() {
			return habitacion;
		}

		public void setHabitacion(Habitacion habitacion) {
			this.habitacion = habitacion;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public void setFechaEntrada(Date fechaEntrada) {
			this.fechaEntrada = fechaEntrada;
		}

		public void setNumeroPersonas(String numeroPersonas) {
			this.numeroPersonas = numeroPersonas;
		}
}
