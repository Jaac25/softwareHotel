package Persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import logica.Factura;
import logica.Habitacion;
import logica.Persona;
import logica.Producto;
import logica.Recepcionista;
import logica.Reserva;

public class Serializacion {
	//Productos
		public void crearArchivoProductos(ArrayList<Producto> productos){
			FileOutputStream file;
			try {
				file = new FileOutputStream("src\\archivos\\productos.ser");
				ObjectOutputStream objeto = new ObjectOutputStream(file);
	
				for (int i = 0; i < productos.size(); i++) {
					objeto.writeObject(productos.get(i));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public ArrayList<Producto> leerArchivoProductos(){
			ArrayList<Producto> productos = new ArrayList<Producto>();
			try {
				FileInputStream file = new FileInputStream("src\\archivos\\productos.ser");
				ObjectInputStream objeto = new ObjectInputStream(file);
				
				Producto libro = (Producto) objeto.readObject();
				productos.add(libro);
				
				while (libro != null) {
					libro = (Producto) objeto.readObject();
					productos.add(libro);
				}
			}	
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				System.out.println("El archivo productos se cargó correctamente");
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return productos;
		}
	//Recepcionistas
		public void crearArchivoRecepcionistas(ArrayList<Recepcionista> recepcionistas){
			FileOutputStream file;
			try {
				file = new FileOutputStream("src\\archivos\\Recepcionista.ser");
				ObjectOutputStream objeto = new ObjectOutputStream(file);

				for (int i = 0; i < recepcionistas.size(); i++) {
					objeto.writeObject(recepcionistas.get(i));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public ArrayList<Recepcionista> leerArchivoRecepcionistas(){
			ArrayList<Recepcionista> recepcionistas = new ArrayList<Recepcionista>();
			try {
				FileInputStream file = new FileInputStream("src\\archivos\\Recepcionista.ser");
				ObjectInputStream objeto = new ObjectInputStream(file);
				
				Recepcionista libro = (Recepcionista) objeto.readObject();
				recepcionistas.add(libro);
				
				while (libro != null) {
					libro = (Recepcionista) objeto.readObject();
					recepcionistas.add(libro);
				}
			}	
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				System.out.println("El archivo recepcionistas se cargó correctamente");
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return recepcionistas;
		}
		
		
	//Habitaciones
		public void crearArchivoHabitaciones(ArrayList<Habitacion> habitaciones){
			FileOutputStream file;
			try {
				file = new FileOutputStream("src\\archivos\\habitaciones.ser");
				ObjectOutputStream objeto = new ObjectOutputStream(file);
	
				for (int i = 0; i < habitaciones.size(); i++) {
					objeto.writeObject(habitaciones.get(i));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public ArrayList<Habitacion> leerArchivoHabitaciones(){
			ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
			try {
				FileInputStream file = new FileInputStream("src\\archivos\\habitaciones.ser");
				ObjectInputStream objeto = new ObjectInputStream(file);
				
				Habitacion habitacion = (Habitacion) objeto.readObject();
				habitaciones.add(habitacion);
				
				while (habitacion != null) {
					habitacion = (Habitacion) objeto.readObject();
					habitaciones.add(habitacion);
				}
			}	
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				System.out.println("El archivo habitaciones se cargó correctamente");
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return habitaciones;
		}
	//Personas
		public void crearArchivoPersonas(ArrayList<Persona> personas){
			FileOutputStream file;
			try {
				file = new FileOutputStream("src\\archivos\\personas.ser");
				ObjectOutputStream objeto = new ObjectOutputStream(file);
	
				for (int i = 0; i < personas.size(); i++) {
					objeto.writeObject(personas.get(i));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public ArrayList<Persona> leerArchivoPersonas(){
			ArrayList<Persona> personas = new ArrayList<Persona>();
			try {
				FileInputStream file = new FileInputStream("src\\archivos\\personas.ser");
				ObjectInputStream objeto = new ObjectInputStream(file);
				
				Persona libro = (Persona) objeto.readObject();
				personas.add(libro);
				
				while (libro != null) {
					libro = (Persona) objeto.readObject();
					personas.add(libro);
				}
			}	
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				System.out.println("El archivo personas se cargó correctamente");
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return personas;
		}
	//Reservas
		public void crearArchivoReservas(ArrayList<Reserva> reservas){
			FileOutputStream file;
			try {
				file = new FileOutputStream("src\\archivos\\reservas.ser");
				ObjectOutputStream objeto = new ObjectOutputStream(file);
	
				for (int i = 0; i < reservas.size(); i++) {
					objeto.writeObject(reservas.get(i));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public ArrayList<Reserva> leerArchivoReservas(){
			ArrayList<Reserva> reservas = new ArrayList<Reserva>();
			try {
				FileInputStream file = new FileInputStream("src\\archivos\\reservas.ser");
				ObjectInputStream objeto = new ObjectInputStream(file);
				
				Reserva libro = (Reserva) objeto.readObject();
				reservas.add(libro);
				
				while (libro != null) {
					libro = (Reserva) objeto.readObject();
					reservas.add(libro);
				}
			}	
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				System.out.println("El archivo reservas se cargó correctamente");
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return reservas;
		}	
	//Facturas
		public void crearArchivoFacturas(ArrayList<Factura> facturas){
			FileOutputStream file;
			try {
				file = new FileOutputStream("src\\archivos\\facturas.ser");
				ObjectOutputStream objeto = new ObjectOutputStream(file);
	
				for (int i = 0; i < facturas.size(); i++) {
					objeto.writeObject(facturas.get(i));
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public ArrayList<Factura> leerArchivoFacturas(){
			ArrayList<Factura> facturas = new ArrayList<Factura>();
			try {
				FileInputStream file = new FileInputStream("src\\archivos\\facturas.ser");
				ObjectInputStream objeto = new ObjectInputStream(file);
				
				Factura libro = (Factura) objeto.readObject();
				facturas.add(libro);
				
				while (libro != null) {
					libro = (Factura) objeto.readObject();
					facturas.add(libro);
				}
			}	
			catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
			catch (IOException e) {
				System.out.println("El archivo Facturas se cargó correctamente");
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return facturas;
		}
}
