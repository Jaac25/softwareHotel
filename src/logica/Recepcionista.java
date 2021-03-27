package logica;

import java.io.Serializable;

public class Recepcionista implements Serializable{
	//Atributos
		private String documento;
		private String nombre;
		private String apellido;
		private String telefono;
		private String direccion;
	//Constructor
		public Recepcionista(String documento,String nombre,String apellido,String telefono,String direccion) {
			this.documento=documento;
			this.nombre=nombre;
			this.apellido=apellido;
			this.telefono=telefono;
			this.direccion=direccion;
		}
	//Getters/Setters
		public String getDocumento() {
			return documento;
		}
		public String getNombre() {
			return nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public String getTelefono() {
			return telefono;
		}
		public String getDireccion() {
			return direccion;
		}
}
