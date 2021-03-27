package logica;

import java.io.Serializable;

public class Habitacion implements Serializable{
	//Atributos
		private String numeroHabitacion;
		private String numeroMaxUsuarios;
		private int precioPer;
		private String opcion;
//		private boolean barra;
//		private boolean aire;
//		private boolean television;
//		private boolean jacuzzi;
		
	//Constructor	
		public Habitacion(String numeroHabitacion,String numeroMaxUsuarios,int precioPer, String opcion) {
			this.numeroHabitacion=numeroHabitacion;
			this.numeroMaxUsuarios=numeroMaxUsuarios;
			this.precioPer=precioPer;
			this.opcion=opcion;
//			this.barra=barra;
//			this.aire=aire;
//			this.television=television;
//			this.jacuzzi=jacuzzi;
		}
		
	//Getters/Setters
		public String getNumeroHabitacion() {
			return numeroHabitacion;
		}
		public void setNumeroHabitacion(String numeroHabitacion) {
			this.numeroHabitacion = numeroHabitacion;
		}
		public String getNumeroMaxUsuarios() {
			return numeroMaxUsuarios;
		}
		public void setNumeroMaxUsuarios(String numeroMaxUsuarios) {
			this.numeroMaxUsuarios = numeroMaxUsuarios;
		}
		public int getPrecioPer() {
			return precioPer;
		}
		public void setPrecioPer(int precioPer) {
			this.precioPer = precioPer;
		}

		public String getOpcion() {
			return opcion;
		}

		public void setOpcion(String opcion) {
			this.opcion = opcion;
		}

//		public boolean isBarra() {
//			return barra;
//		}
//
//		public void setBarra(boolean barra) {
//			this.barra = barra;
//		}
//
//		public boolean isAire() {
//			return aire;
//		}
//
//		public void setAire(boolean aire) {
//			this.aire = aire;
//		}
//
//		public boolean isTelevision() {
//			return television;
//		}
//
//		public void setTelevision(boolean television) {
//			this.television = television;
//		}
//
//		public boolean isJacuzzi() {
//			return jacuzzi;
//		}
//
//		public void setJacuzzi(boolean jacuzzi) {
//			this.jacuzzi = jacuzzi;
//		}
		
}
