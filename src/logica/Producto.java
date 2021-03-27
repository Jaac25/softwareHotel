package logica;

import java.io.Serializable;

public class Producto implements Serializable {
	//Atributos
		private String codigo;
		private String nombre;
		private int cantidad;
		private int precio;
		
	//Constructor
		public Producto(String codigo,String nombre, int cantidad, int precio) {
			this.codigo=codigo;
			this.nombre=nombre;
			this.cantidad=cantidad;
			this.precio=precio;
		}
	//Getters/Setters
		public String getCodigo() {
			return codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public int getCantidad() {
			return cantidad;
		}

		public int getPrecio() {
			return precio;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		public void setPrecio(int precio) {
			this.precio = precio;
		}
		
}
