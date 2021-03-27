package logica;

import java.io.Serializable;
import java.util.Date;

public class Persona implements Serializable{
	//Atributos
		private String documento;
		private String nombre;
		private String ciudad;
		private String celular;
		private Date fechaNacimiento;
		private String nombreUsuario;
		private String contraseña;
		
	//Constructor
		public Persona(String documento,String nombre,String ciudad, String celular,Date fechaNacimiento,String nombreUsuario,String contraseña) {
			this.documento=documento;
			this.nombre=nombre;
			this.ciudad=ciudad;
			this.celular=celular;
			this.fechaNacimiento=fechaNacimiento;
			this.nombreUsuario=nombreUsuario;
			this.contraseña=contraseña;
		}
	//Getters/Setters
		public String getDocumento() {
			return documento;
		}
		public void setDocumento(String documento) {
			this.documento = documento;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getCiudad() {
			return ciudad;
		}
		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}
		public String getCelular() {
			return celular;
		}
		public void setCelular(String celular) {
			this.celular = celular;
		}
		public Date getFechaNacimiento() {
			return fechaNacimiento;
		}
		public void setFechaNacimiento(Date fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}
		public String getNombreUsuario() {
			return nombreUsuario;
		}
		public void setNombreUsuario(String nombreUsuario) {
			this.nombreUsuario = nombreUsuario;
		}
		public String getContraseña() {
			return contraseña;
		}
		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}
		
}
