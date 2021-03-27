package logica;

import java.io.Serializable;
import java.util.Date;

public class Factura implements Serializable{
	//Atributos
		private Date fechaSalida;
		private int precioEstadia;
		private int totalProductos;
		private int total;
		
	//Constructor	
		public Factura(Date fechaSalida,int precioEstadia,int totalProductos,int total) {
			this.fechaSalida=fechaSalida;
			this.precioEstadia=precioEstadia;
			this.totalProductos=totalProductos;
			this.total=total;
		}
		
	//Getters/Setters
		public Date getFechaSalida() {
			return fechaSalida;
		}
		public void setFechaSalida(Date fechaSalida) {
			this.fechaSalida = fechaSalida;
		}
		public int getPrecioEstadia() {
			return precioEstadia;
		}
		public void setPrecioEstadia(int precioEstadia) {
			this.precioEstadia = precioEstadia;
		}
		public int getTotalProductos() {
			return totalProductos;
		}
		public void setTotalProductos(int totalProductos) {
			this.totalProductos = totalProductos;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
}
