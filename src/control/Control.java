package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import javax.swing.JOptionPane;

import Persistencia.Serializacion;
import logica.Habitacion;
import logica.gestion;
import vista.Acciones;

public class Control implements ActionListener{
	
	private Acciones acciones;
	private gestion gestion;
	private Serializacion serializacion;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	public Control(Acciones acciones) {
		this.acciones=acciones;
		gestion=new gestion();
		serializacion = new Serializacion();
		cargarArchivos();
	}
	
	private void cargarArchivos() {
		gestion.setProductos(serializacion.leerArchivoProductos());
		gestion.setRecepcionistas(serializacion.leerArchivoRecepcionistas());
		gestion.setHabitaciones(serializacion.leerArchivoHabitaciones());
		gestion.setPersonas(serializacion.leerArchivoPersonas());
		gestion.setReservas(serializacion.leerArchivoReservas());
		gestion.setFacturas(serializacion.leerArchivoFacturas());
	}

	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case Acciones.VERIFICAR:
			String verificar[]=acciones.leer(Acciones.VERIFICAR);
			verificar(verificar);
			break;
		case Acciones.SALIR:
			acciones.salir(Acciones.SALIR);
			break;
		//ADMIN	
			case Acciones.GUARDAR_SALIR_ADMIN:
				acciones.iniciar(Acciones.LOGIN);
				acciones.salir(Acciones.GUARDAR_SALIR_ADMIN);
				serializacion.crearArchivoProductos(gestion.getProductos());
				serializacion.crearArchivoRecepcionistas(gestion.getRecepcionistas());
				serializacion.crearArchivoHabitaciones(gestion.getHabitaciones());
				break;
			//Productos
				case Acciones.AGREGAR_PRODUCTO:
					acciones.iniciar(Acciones.AGREGAR_PRODUCTO);
					acciones.salir(Acciones.CRUD_PRODUCTO);
					break;
				case Acciones.MODIFICAR_PRODUCTO:
					acciones.iniciar(Acciones.MODIFICAR_PRODUCTO);
					acciones.salir(Acciones.CRUD_PRODUCTO);
					break;
				case Acciones.ELIMINAR_PRODUCTO:
					acciones.iniciar(Acciones.ELIMINAR_PRODUCTO);
					acciones.salir(Acciones.CRUD_PRODUCTO);
					break;
				case Acciones.VER_PRODUCTOS:
					acciones.iniciar(Acciones.VER_PRODUCTOS);
					acciones.salir(Acciones.CRUD_PRODUCTO);
					String[][] datosMatrizProducto = gestion.mostrarProductos();
					acciones.escribir(datosMatrizProducto, Acciones.VER_PRODUCTOS);
					break;
				case Acciones.GUARDAR_PRODUCTO:
					String[]datosProducto=acciones.leer(Acciones.GUARDAR_PRODUCTO);
					guardarProducto(datosProducto);
					break;
				case Acciones.BUSCAR_MODIFICAR_PRODUCTO:
					String [] codigoModificarProducto=acciones.leer(Acciones.BUSCAR_MODIFICAR_PRODUCTO);
					String [][] datosBusquedaProductoModificar=new String[1][5];
					datosBusquedaProductoModificar[0]=gestion.cargarProducto(codigoModificarProducto[0]);
					acciones.escribir(datosBusquedaProductoModificar, Acciones.BUSCAR_MODIFICAR_PRODUCTO);
					break;	
				case Acciones.BTN_MODIFICAR_PRODUCTO:
					codigoModificarProducto=acciones.leer(Acciones.BUSCAR_MODIFICAR_PRODUCTO);
					int posicionModificarProducto=gestion.buscarProducto(codigoModificarProducto[0]);
					datosProducto = acciones.leer(Acciones.BTN_MODIFICAR_PRODUCTO);
					String[] datosModificarProducto = {""+posicionModificarProducto,datosProducto[0],datosProducto[1],datosProducto[2],datosProducto[3]};
					modificarProducto(datosModificarProducto);
					break;
				case Acciones.BUSCAR_ELIMINAR_PRODUCTO:
					String [] codigoEliminarProducto=acciones.leer(Acciones.BUSCAR_ELIMINAR_PRODUCTO);
					String [][] datosBusquedaProductoEliminar=new String[1][5];
					datosBusquedaProductoEliminar[0]=gestion.cargarProducto(codigoEliminarProducto[0]);
					acciones.escribir(datosBusquedaProductoEliminar, Acciones.BUSCAR_ELIMINAR_PRODUCTO);
					break;
				case Acciones.BTN_ELIMINAR_PRODUCTO:
					codigoEliminarProducto=acciones.leer(Acciones.BUSCAR_ELIMINAR_PRODUCTO);
					int posicionEliminarProducto=gestion.buscarProducto(codigoEliminarProducto[0]);
					datosProducto = acciones.leer(Acciones.BTN_ELIMINAR_PRODUCTO);
					String[] datosEliminarProducto = {""+posicionEliminarProducto};
					eliminarProducto(datosEliminarProducto);
					break;
				case Acciones.ATRAS_PRODUCTO:
					acciones.iniciar(Acciones.CRUD_PRODUCTO);
					acciones.salir(Acciones.ATRAS_PRODUCTO);
					break;
					
			//Recepcionista
				case Acciones.AGREGAR_RECEPCIONISTA:
					acciones.iniciar(Acciones.AGREGAR_RECEPCIONISTA);
					acciones.salir(Acciones.CRUD_RECEPCIONISTA);
					break;
				case Acciones.MODIFICAR_RECEPCIONISTA:
					acciones.iniciar(Acciones.MODIFICAR_RECEPCIONISTA);
					acciones.salir(Acciones.CRUD_RECEPCIONISTA);
					break;
				case Acciones.ELIMINAR_RECEPCIONISTA:
					acciones.iniciar(Acciones.ELIMINAR_RECEPCIONISTA);
					acciones.salir(Acciones.CRUD_RECEPCIONISTA);
					break;
				case Acciones.VER_RECEPCIONISTA:
					acciones.iniciar(Acciones.VER_RECEPCIONISTA);
					acciones.salir(Acciones.CRUD_RECEPCIONISTA);
					String[][] datosMatrizRecepcionista = gestion.mostrarRecepcionistas();
					acciones.escribir(datosMatrizRecepcionista, Acciones.VER_RECEPCIONISTA);
					break;
				case Acciones.GUARDAR_RECEPCIONISTA:
					String[]datosRecepcionista=acciones.leer(Acciones.GUARDAR_RECEPCIONISTA);
					guardarRecepcionista(datosRecepcionista);
					break;	
				case Acciones.BUSCAR_MODIFICAR_RECEPCIONISTA:
					String [] codigoModificarRecepcionista=acciones.leer(Acciones.BUSCAR_MODIFICAR_RECEPCIONISTA);
					String [][] datosBusquedaRecepcionistaModificar=new String[1][6];
					datosBusquedaRecepcionistaModificar[0]=gestion.cargarRecepcionista(codigoModificarRecepcionista[0]);
					acciones.escribir(datosBusquedaRecepcionistaModificar, Acciones.BUSCAR_MODIFICAR_RECEPCIONISTA);
					break;
				case Acciones.BTN_MODIFICAR_RECEPCIONISTA:
					codigoModificarRecepcionista=acciones.leer(Acciones.BUSCAR_MODIFICAR_RECEPCIONISTA);
					int posicionModificarRecepcionista=gestion.buscarRecepcionista(codigoModificarRecepcionista[0]);
					datosRecepcionista = acciones.leer(Acciones.BTN_MODIFICAR_RECEPCIONISTA);
					String[] datosModificarRecepcionista = {""+posicionModificarRecepcionista,datosRecepcionista[0],datosRecepcionista[1],datosRecepcionista[2],datosRecepcionista[3],datosRecepcionista[4]};
					modificarRecepcionista(datosModificarRecepcionista);
					break;
				case Acciones.BUSCAR_ELIMINAR_RECEPCIONISTA:
					String [] documentoEliminarRecepcionista=acciones.leer(Acciones.BUSCAR_ELIMINAR_RECEPCIONISTA);
					String [][] datosBusquedaRecepcionistaEliminar=new String[1][6];
					datosBusquedaRecepcionistaEliminar[0]=gestion.cargarRecepcionista(documentoEliminarRecepcionista[0]);
					acciones.escribir(datosBusquedaRecepcionistaEliminar, Acciones.BUSCAR_ELIMINAR_RECEPCIONISTA);
					break;	
				case Acciones.BTN_ELIMINAR_RECEPCIONISTA:
					documentoEliminarRecepcionista=acciones.leer(Acciones.BUSCAR_ELIMINAR_RECEPCIONISTA);
					int posicionEliminarRecepcionista=gestion.buscarRecepcionista(documentoEliminarRecepcionista[0]);
					datosRecepcionista = acciones.leer(Acciones.BTN_ELIMINAR_RECEPCIONISTA);
					String[] datosEliminarRecepcionista = {""+posicionEliminarRecepcionista};
					eliminarRecepcionista(datosEliminarRecepcionista);
					break;
				case Acciones.ATRAS_RECEPCIONISTA:
					acciones.iniciar(Acciones.CRUD_RECEPCIONISTA);
					acciones.salir(Acciones.ATRAS_RECEPCIONISTA);
					break;	
					
			//Habitaciones
				case Acciones.ATRAS_HABITACION:
					acciones.iniciar(Acciones.CRUD_HABITACION);
					acciones.salir(Acciones.ATRAS_HABITACION);
					break;
				case Acciones.AGREGAR_HABITACION:
					acciones.iniciar(Acciones.AGREGAR_HABITACION);
					acciones.salir(Acciones.CRUD_HABITACION);
					break;
				case Acciones.MODIFICAR_HABITACION:
					acciones.iniciar(Acciones.MODIFICAR_HABITACION);
					acciones.salir(Acciones.CRUD_HABITACION);
					break;
				case Acciones.ELIMINAR_HABITACION:
					acciones.iniciar(Acciones.ELIMINAR_HABITACION);
					acciones.salir(Acciones.CRUD_HABITACION);
					break;
				case Acciones.VER_HABITACIONES:
					acciones.iniciar(Acciones.VER_HABITACIONES);
					acciones.salir(Acciones.CRUD_HABITACION);
					String[][] datosMatrizHabitacion = gestion.mostrarHabitaciones();
					acciones.escribir(datosMatrizHabitacion, Acciones.VER_HABITACIONES);
					break;
				case Acciones.GUARDAR_HABITACION:
					String[]datosHabitacion=acciones.leer(Acciones.GUARDAR_HABITACION);
					guardarHabitacion(datosHabitacion);
					break;	
				case Acciones.BUSCAR_MODIFICAR_HABITACION:
					String [] codigoModificarHabitacion=acciones.leer(Acciones.BUSCAR_MODIFICAR_HABITACION);
					String [][] datosBusquedaHabitacionModificar=new String[1][5];
					datosBusquedaHabitacionModificar[0]=gestion.cargarHabitacion(codigoModificarHabitacion[0]);
					acciones.escribir(datosBusquedaHabitacionModificar, Acciones.BUSCAR_MODIFICAR_HABITACION);
					break;
				case Acciones.BTN_MODIFICAR_HABITACION:
					codigoModificarHabitacion=acciones.leer(Acciones.BUSCAR_MODIFICAR_HABITACION);
					int posicionModificarHabitaciones=gestion.buscarHabitacion(codigoModificarHabitacion[0]);
					datosHabitacion = acciones.leer(Acciones.BTN_MODIFICAR_HABITACION);
					String[] datosModificarHabitacion = {""+posicionModificarHabitaciones,datosHabitacion[0],datosHabitacion[1],datosHabitacion[2],datosHabitacion[3]};
					modificarHabitacion(datosModificarHabitacion);
					break;	
				case Acciones.BUSCAR_ELIMINAR_HABITACION:
					String [] codigoEliminarHabitacion=acciones.leer(Acciones.BUSCAR_ELIMINAR_HABITACION);
					String [][] datosBusquedaHabitacionEliminar=new String[1][5];
					datosBusquedaHabitacionEliminar[0]=gestion.cargarHabitacion(codigoEliminarHabitacion[0]);
					acciones.escribir(datosBusquedaHabitacionEliminar, Acciones.BUSCAR_ELIMINAR_HABITACION);
					break;
				case Acciones.BTN_ELIMINAR_HABITACION:
					codigoEliminarHabitacion=acciones.leer(Acciones.BUSCAR_ELIMINAR_HABITACION);
					int posicionEliminarHabitacion=gestion.buscarHabitacion(codigoEliminarHabitacion[0]);
					datosHabitacion = acciones.leer(Acciones.BTN_ELIMINAR_HABITACION);
					String[] datosEliminarHabitacion = {""+posicionEliminarHabitacion};
					eliminarHabitacion(datosEliminarHabitacion);
					break;	
				case Acciones.MIRAR_AGREGAR_HABITACION:
					acciones.iniciar(Acciones.MIRAR_AGREGAR_HABITACION);
					acciones.iniciar(Acciones.AGREGAR_HABITACION);
					break;
				case Acciones.MIRAR_MODIFICAR_HABITACION:
					acciones.iniciar(Acciones.MIRAR_MODIFICAR_HABITACION);
					acciones.iniciar(Acciones.MODIFICAR_HABITACION);
					break;	
				case Acciones.MIRAR_ELIMINAR_HABITACION:
					acciones.iniciar(Acciones.MIRAR_ELIMINAR_HABITACION);
					acciones.iniciar(Acciones.ELIMINAR_HABITACION);
					break;
			//Ventas	
				case Acciones.VER_VENTAS:
					acciones.iniciar(Acciones.VER_VENTAS);
					acciones.salir(Acciones.VENTAS);
					String[][] datosMatrisVentas = gestion.mostrarVentas();
					acciones.escribir(datosMatrisVentas, Acciones.VER_VENTAS);
					break;
				case Acciones.ATRAS_VENTAS:
					acciones.iniciar(Acciones.VENTAS);
					acciones.salir(Acciones.ATRAS_VENTAS);
					break;
					
		//RECEPCIONISTA		
			case Acciones.GUARDAR_SALIR_RECEPCIONISTA:
				acciones.iniciar(Acciones.LOGIN);
				acciones.salir(Acciones.GUARDAR_SALIR_RECEPCIONISTA);
				serializacion.crearArchivoPersonas(gestion.getPersonas());	
				serializacion.crearArchivoReservas(gestion.getReservas());
				serializacion.crearArchivoFacturas(gestion.getFacturas());
				break;
				
			//Personas
				case Acciones.ATRAS_PERSONA:
					acciones.iniciar(Acciones.CRUD_PERSONAS);
					acciones.salir(Acciones.ATRAS_PERSONA);
					break;
				case Acciones.AGREGAR_PERSONA:
					acciones.iniciar(Acciones.AGREGAR_PERSONA);
					acciones.salir(Acciones.CRUD_PERSONAS);
					break;
				case Acciones.MODIFICAR_PERSONA:
					acciones.iniciar(Acciones.MODIFICAR_PERSONA);
					acciones.salir(Acciones.CRUD_PERSONAS);
					break;
				case Acciones.ELIMINAR_PERSONA:
					acciones.iniciar(Acciones.ELIMINAR_PERSONA);
					acciones.salir(Acciones.CRUD_PERSONAS);
					break;
				case Acciones.VER_PERSONAS:
					acciones.iniciar(Acciones.VER_PERSONAS);
					acciones.salir(Acciones.CRUD_PERSONAS);
					String[][] datosMatrizPersonas = gestion.mostrarPersonas();
					acciones.escribir(datosMatrizPersonas, Acciones.VER_PERSONAS);
					break;
				case Acciones.GUARDAR_PERSONA:
					String[]datosPersona=acciones.leer(Acciones.GUARDAR_PERSONA);
					guardarPersona(datosPersona);
					break;		
				case Acciones.BUSCAR_MODIFICAR_PERSONA:
					String [] documentoModificarPersona=acciones.leer(Acciones.BUSCAR_MODIFICAR_PERSONA);
					String [][] datosBusquedaPersonaModificar=new String[1][8];
					datosBusquedaPersonaModificar[0]=gestion.cargarPersona(documentoModificarPersona[0]);
					acciones.escribir(datosBusquedaPersonaModificar, Acciones.BUSCAR_MODIFICAR_PERSONA);
					break;
				case Acciones.BTN_MODIFICAR_PERSONA:
					documentoModificarPersona=acciones.leer(Acciones.BUSCAR_MODIFICAR_PERSONA);
					int posicionModificarPersona=gestion.buscarPersona(documentoModificarPersona[0]);
					datosPersona = acciones.leer(Acciones.BTN_MODIFICAR_PERSONA);
					String[] datosModificarPersona = {""+posicionModificarPersona,datosPersona[0],datosPersona[1],datosPersona[2],datosPersona[3],datosPersona[4],datosPersona[5],datosPersona[6]};
					modificarPersona(datosModificarPersona);
					break;
				case Acciones.BUSCAR_ELIMINAR_PERSONA:
					String [] documentoEliminarPersona=acciones.leer(Acciones.BUSCAR_ELIMINAR_PERSONA);
					String [][] datosBusquedaPersonaEliminar=new String[1][8];
					datosBusquedaPersonaEliminar[0]=gestion.cargarPersona(documentoEliminarPersona[0]);
					acciones.escribir(datosBusquedaPersonaEliminar, Acciones.BUSCAR_ELIMINAR_PERSONA);
					break;	
				case Acciones.BTN_ELIMINAR_PERSONA:
					documentoEliminarPersona=acciones.leer(Acciones.BUSCAR_ELIMINAR_PERSONA);
					int posicionEliminarPersona=gestion.buscarPersona(documentoEliminarPersona[0]);
					datosPersona = acciones.leer(Acciones.BTN_ELIMINAR_PERSONA);
					String[] datosEliminarPersona = {""+posicionEliminarPersona};
					eliminarPersona(datosEliminarPersona);
					break;
					
			//Reserva
				case Acciones.AGREGAR_RESERVA:
					acciones.iniciar(Acciones.AGREGAR_RESERVA);
					acciones.salir(Acciones.RESERVA);
					String[][] datosMatrizEscogerHabitacion = gestion.mostrarListaHabitaciones();
					acciones.escribir(datosMatrizEscogerHabitacion, Acciones.AGREGAR_RESERVA);
					break;
				case Acciones.VER_RESERVAS:
					acciones.iniciar(Acciones.VER_RESERVAS);
					acciones.salir(Acciones.RESERVA);
					String[][] datosMatrisReservas = gestion.mostrarReservas();
					acciones.escribir(datosMatrisReservas, Acciones.VER_RESERVAS);
					break;
				case Acciones.ATRAS_RESERVA:
					acciones.iniciar(Acciones.RESERVA);
					acciones.salir(Acciones.ATRAS_RESERVA);
					break;
				case Acciones.GUARDAR_RESERVA:
					String[]datosReserva=acciones.leer(Acciones.GUARDAR_RESERVA);
					guardarReserva(datosReserva);
					break;
					
			//Facturacion
				case Acciones.GENERAR_FACTURA:
					acciones.iniciar(Acciones.GENERAR_FACTURA);
					acciones.salir(Acciones.FACTURACION);
					String[][] datosMatrizEscogerFactura = gestion.mostrarReservas();
					acciones.escribir(datosMatrizEscogerFactura, Acciones.GENERAR_FACTURA);
					break;
				case Acciones.ATRAS_FACTURAS:
					acciones.iniciar(Acciones.FACTURACION);
					acciones.salir(Acciones.ATRAS_FACTURAS);
					break;
				case Acciones.SIGUIENTE_FACTURA:
					acciones.iniciar(Acciones.SIGUIENTE_FACTURA);
					acciones.salir(Acciones.GENERAR_FACTURA);
					String[]datosSiguiente=acciones.leer(Acciones.SIGUIENTE_FACTURA);
					String [][] datosLlenarFactura = llenarFactura(datosSiguiente[0],datosSiguiente[1]);
					acciones.escribir(datosLlenarFactura, Acciones.SIGUIENTE_FACTURA);
					break;
				case Acciones.ATRAS_SIGUIENTE:
					acciones.iniciar(Acciones.GENERAR_FACTURA);
					acciones.salir(Acciones.ATRAS_SIGUIENTE);
					break;
				case Acciones.GUARDAR_FACTURA:
					String[]datosFactura=acciones.leer(Acciones.GUARDAR_FACTURA);
					guardarFactura(datosFactura);
					acciones.iniciar(Acciones.FACTURACION);
					acciones.salir(Acciones.ATRAS_FACTURAS);
					break;
			//USUARIO
				case Acciones.VER_FACTURA:
					acciones.iniciar(Acciones.VER_FACTURA);
					acciones.salir(Acciones.USUARIO);
					String [][] datosLlenarLaFactura = llenarLaFactura();
					acciones.escribir(datosLlenarLaFactura, Acciones.VER_FACTURA);
					break;
				case Acciones.BARRA:
					acciones.iniciar(Acciones.BARRA);
					acciones.salir(Acciones.USUARIO);
					String[][] datosMatrizEscogerProducto = gestion.mostrarProductos();
					acciones.escribir(datosMatrizEscogerProducto, Acciones.BARRA);
					break;
				case Acciones.ATRAS_USUARIO:
					acciones.iniciar(Acciones.USUARIO);
					acciones.salir(Acciones.ATRAS_USUARIO);
					break;
				case Acciones.SALIR_USUARIO:
					acciones.iniciar(Acciones.LOGIN);
					acciones.salir(Acciones.VENTANA_USUARIOS);
					break;
				case Acciones.COMPRAR:
					String [] posicion = acciones.leer(Acciones.COMPRAR);
					productos(posicion);
					break;
		default:
			break;
		}
	}

//Metodos
	//VERIFICAR
	private void verificar(String[] verificar) {
		boolean comprobar=false;
		boolean comprobarRecepcionista=false;
		boolean comprobarCliente = false;
		//Administrador
		if(verificar[0].equals("George") && verificar[1].equals("123") 
				|| verificar[0].equals("Admin") && verificar[1].equals("123") ) {
			acciones.iniciar(Acciones.CRUD_ADMIN);
			acciones.salir(Acciones.SALIR_VERIFICAR);
			comprobar=true;
		}
		
		//Recepcionistas
		if(gestion.getRecepcionistas().size()>0) {
			for(int i=0;i<gestion.getRecepcionistas().size();i++) {
				if(verificar[0].equals(gestion.getRecepcionistas().get(i).getNombre()) && 
						verificar[1].equals(gestion.getRecepcionistas().get(i).getDocumento())) {
					comprobarRecepcionista=true;
					comprobar=true;
				}
			}	
		}
		//Usuarios
		if(gestion.getPersonas().size()>0) {
			for(int i=0;i<gestion.getPersonas().size();i++) {
				if(verificar[0].equals(gestion.getPersonas().get(i).getNombreUsuario()) && 
						verificar[1].equals(gestion.getPersonas().get(i).getContraseña())) {
					comprobar=true;
					comprobarCliente=true;
				}
			}
		}
		if(comprobarCliente) {
			acciones.iniciar(Acciones.VENTANA_USUARIOS);
			acciones.salir(Acciones.SALIR_VERIFICAR);
		}
		if(comprobarRecepcionista) {
			acciones.iniciar(Acciones.CRUDS_RECEPCIONISTAS);
			acciones.salir(Acciones.SALIR_VERIFICAR);
		}
		
		if(comprobar==false) {
			JOptionPane.showMessageDialog(null, "Usuario o Contraseña erroneos");
		}
	}
	//ADMIN
	//Productos
		//Guardar
			private void guardarProducto(String[] datosProducto) {
				boolean comprobar=true;
				boolean comprobarAgrego = false;
				boolean comprobarMayor = false;
				String codigo="";
				String nombre = "";
				int cantidad = 0;
				int precio = 0;
				if(gestion.getProductos().size()>0) {
					for(int i=0;i<gestion.getProductos().size();i++) {
						if(datosProducto[0].equals(gestion.getProductos().get(i).getCodigo())){
							JOptionPane.showMessageDialog(null, "Ya existe ese código");
							comprobar=false;
						}
						else if(Integer.parseInt(datosProducto[2])<=0 || Integer.parseInt(datosProducto[3])<=0){
							comprobarMayor = true;
							comprobar=false;
						}
						else if(datosProducto[0].equals("") || datosProducto[1].equals("") || datosProducto[2].equals("") || 
								datosProducto[3].equals("")) {
							comprobarAgrego = true;
							comprobar=false;
						}	
						else {
							codigo = datosProducto[0];
							nombre = datosProducto[1];
							cantidad = Integer.parseInt(datosProducto[2]);
							precio = Integer.parseInt(datosProducto[3]);
						}
					}
				}
				else {
					if(datosProducto[0].equals("") || datosProducto[1].equals("") || datosProducto[2].equals("") || 
							datosProducto[3].equals("")) {
						comprobarAgrego = true;
						comprobar=false;
					}
					else if(Integer.parseInt(datosProducto[2])<=0 || Integer.parseInt(datosProducto[3])<=0){
						comprobarMayor = true;
						comprobar=false;
					}
					else {
						codigo = datosProducto[0];
						nombre = datosProducto[1];
						cantidad = Integer.parseInt(datosProducto[2]);
						precio = Integer.parseInt(datosProducto[3]);
					}
				}
				if(comprobarAgrego) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
				}
				if(comprobarMayor) {
					JOptionPane.showMessageDialog(null, "El valor tiene que ser positivo y mayor a 0");
				}
				if(comprobar) {
					gestion.agregarProducto(codigo, nombre, cantidad, precio);
					JOptionPane.showMessageDialog(null, "Guardado Exitoso");
					acciones.salir(Acciones.ATRAS_PRODUCTO);
					acciones.iniciar(Acciones.CRUD_PRODUCTO);
				}
			}
		//Modificar	
			private void modificarProducto(String[] datosModificarProducto) {
				boolean comprobar=true;
				boolean comprobarMayor=false;
				String codigo=datosModificarProducto[1];
				String nombre="";
				int cantidad = 0;
				int precio = 0;
				if(gestion.getProductos().size()>0) {
					if(datosModificarProducto[1].equals("") || datosModificarProducto[2].equals("") || 
							datosModificarProducto[3].equals("") || datosModificarProducto[4].equals("")) {
						JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
						comprobar=false;
						
					}
					else if(Integer.parseInt(datosModificarProducto[3])<=0 || Integer.parseInt(datosModificarProducto[4])<=0) {
						comprobarMayor=true;
						comprobar=false;
					}
					else {
						nombre = datosModificarProducto[2];
						cantidad=Integer.parseInt(datosModificarProducto[3]);
						precio = Integer.parseInt(datosModificarProducto[4]);
					}
					if(comprobarMayor) {
						JOptionPane.showMessageDialog(null, "El valor numérico debe ser mayor a 0");
					}
					if(comprobar) {
						gestion.modificarProductoDocumento(datosModificarProducto[0],codigo,nombre,cantidad,precio);
						JOptionPane.showMessageDialog(null, "Modificación Exitosa");
						acciones.salir(Acciones.ATRAS_PRODUCTO);
						acciones.iniciar(Acciones.CRUD_PRODUCTO);
					}
				}	
			}
		//Eliminar
			private void eliminarProducto(String[] datosEliminarProducto) {
				if(gestion.getProductos().size()>0) {
					gestion.eliminarProducto(datosEliminarProducto[0]);
					JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
					acciones.salir(Acciones.ATRAS_PRODUCTO);
					acciones.iniciar(Acciones.CRUD_PRODUCTO);
				}
				else {
					JOptionPane.showMessageDialog(null, "No se ha registrado a ningún médico");
				}
			}
	//Recepcionista	
		//Guardar
			private void guardarRecepcionista(String[] datosRecepcionista) {
				boolean comprobar=true;
				boolean comprobarAgrego = false;
				String documento="";
				String nombre = "";
				String apellido = "";
				String telefono = "";
				String direccion = "";
				if(gestion.getRecepcionistas().size()>0) {
					for(int i=0;i<gestion.getRecepcionistas().size();i++) {
						if(datosRecepcionista[0].equals(gestion.getRecepcionistas().get(i).getDocumento()) ){
							JOptionPane.showMessageDialog(null, "Ya existe ese documento");
							comprobar=false;
						}
						else if(datosRecepcionista[0].equals("") || datosRecepcionista[1].equals("") || datosRecepcionista[2].equals("") || 
								datosRecepcionista[3].equals("") || datosRecepcionista[4].equals("")) {
							comprobarAgrego=true;
							comprobar=false;
						}	
						else {
							documento = datosRecepcionista[0];
							nombre = datosRecepcionista[1];
							apellido = datosRecepcionista[2];
							telefono = datosRecepcionista[3];
							direccion = datosRecepcionista[4];
						}
					}
				}
				else {
					if(datosRecepcionista[0].equals("") || datosRecepcionista[1].equals("") || datosRecepcionista[2].equals("") || 
							datosRecepcionista[3].equals("") || datosRecepcionista[4].equals("")) {
						comprobarAgrego=true;
						comprobar=false;
					}	
					else {
						documento = datosRecepcionista[0];
						nombre = datosRecepcionista[1];
						apellido = datosRecepcionista[2];
						telefono = datosRecepcionista[3];
						direccion = datosRecepcionista[4];
					}
				}
				if(comprobarAgrego) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
				}
				if(comprobar) {
					gestion.agregarRecepcionista(documento, nombre, apellido, telefono,direccion);
					JOptionPane.showMessageDialog(null, "Guardado Exitoso");
					acciones.salir(Acciones.ATRAS_RECEPCIONISTA);
					acciones.iniciar(Acciones.CRUD_RECEPCIONISTA);
				}	
			}
		//Modificar
			private void modificarRecepcionista(String[] datosModificarRecepcionista) {
				boolean comprobar=true;
				boolean comprobarAgrego=false;
				String documento=datosModificarRecepcionista[1];
				String nombre="";
				String apellido= "";
				String telefono = "";
				String direccion = "";	
				if(gestion.getRecepcionistas().size()>0) {
					if(datosModificarRecepcionista[1].equals("") || datosModificarRecepcionista[2].equals("") || 
							datosModificarRecepcionista[3].equals("") || datosModificarRecepcionista[4].equals("")) {
						comprobarAgrego=true;
						comprobar=false;
						
					}
					else {
						nombre = datosModificarRecepcionista[2];
						apellido=datosModificarRecepcionista[3];
						telefono = datosModificarRecepcionista[4];
						direccion = datosModificarRecepcionista[5];
					}
					if(comprobarAgrego) {
						JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
					}
					if(comprobar) {
						gestion.modificarRecepcionista(datosModificarRecepcionista[0],documento,nombre,apellido,telefono,direccion);
						JOptionPane.showMessageDialog(null, "Modificación Exitosa");
						acciones.salir(Acciones.ATRAS_RECEPCIONISTA);
						acciones.iniciar(Acciones.CRUD_RECEPCIONISTA);
					}
				}	
				else {
					JOptionPane.showMessageDialog(null,"No se ha registrado a ningún recepcionista");
				}
			}	
		//Eliminar
			private void eliminarRecepcionista(String[] datosEliminarRecepcionista) {
				if(gestion.getRecepcionistas().size()>0) {
					gestion.eliminarRecepcionista(datosEliminarRecepcionista[0]);
					JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
					acciones.salir(Acciones.ATRAS_RECEPCIONISTA);
					acciones.iniciar(Acciones.CRUD_RECEPCIONISTA);
				}
				else {
					JOptionPane.showMessageDialog(null, "No se ha registrado a ningún recepcionista");
				}
			}
			
	//Habitaciones
		//Guardar
			private void guardarHabitacion(String[] datosHabitacion) {
				boolean comprobar=true;
				boolean comprobarAgregar=false;
				boolean comprobarMayor = false;
				String numeroHabitacion="";
				String capacidad = "";
				int precioPersona = 0;
				String opcion = "";
				if(gestion.getHabitaciones().size()>0) {
					for(int i=0;i<gestion.getHabitaciones().size();i++) {
						if(datosHabitacion[0].equals(gestion.getHabitaciones().get(i).getNumeroHabitacion()) ){
							JOptionPane.showMessageDialog(null, "Ya existe esa habitación");
							comprobar=false;
						}
						else if(Integer.parseInt(datosHabitacion[1])<=0 || Integer.parseInt(datosHabitacion[2])<=0){
							comprobarMayor = true;
							comprobar=false;
						}
						else if(datosHabitacion[0].equals("") || datosHabitacion[1].equals("") || datosHabitacion[2].equals("") || 
								datosHabitacion[3].equals("")) {
							comprobarAgregar = true;
							comprobar=false;
						}	
						else {
							numeroHabitacion = datosHabitacion[0];
							capacidad = datosHabitacion[1];
							precioPersona = Integer.parseInt(datosHabitacion[2]);
							opcion = datosHabitacion[3];
						}
					}
				}
				else {
					if(datosHabitacion[0].equals("") || datosHabitacion[1].equals("") || datosHabitacion[2].equals("") || 
							datosHabitacion[3].equals("")) {
						comprobarAgregar = true;
						comprobar=false;
					}
					else if(Integer.parseInt(datosHabitacion[1])<=0 || Integer.parseInt(datosHabitacion[2])<=0){
						comprobarMayor = true;
						comprobar=false;
					}
					else {
						numeroHabitacion = datosHabitacion[0];
						capacidad = datosHabitacion[1];
						precioPersona = Integer.parseInt(datosHabitacion[2]);
						opcion = datosHabitacion[3];
					}
				}
				if(comprobarMayor) {
					JOptionPane.showMessageDialog(null, "El valor tiene que ser positivo y mayor a 0");
				}
				if(comprobarAgregar) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
				}
				if(comprobar) {
					gestion.agregarHabitacion(numeroHabitacion, capacidad, precioPersona, opcion);
					JOptionPane.showMessageDialog(null, "Guardado Exitoso");
					acciones.salir(Acciones.ATRAS_HABITACION);
					acciones.iniciar(Acciones.CRUD_HABITACION);
				}	
			}
		//Modificar
			private void modificarHabitacion(String[] datosModificarHabitacion) {
				boolean comprobar=true;
				boolean comprobarAgrego=false;
				boolean comprobarMayor= false;
				String numeroHabitacion=datosModificarHabitacion[1];
				int capacidad=0;
				int precioPer=0;
				String opcion="";
				if(gestion.getRecepcionistas().size()>0) {
					if(datosModificarHabitacion[1].equals("") || datosModificarHabitacion[2].equals("") || 
							datosModificarHabitacion[3].equals("")) {
						comprobarAgrego=true;
						comprobar=false;
					}	
					else if(Integer.parseInt(datosModificarHabitacion[1])<=0 || Integer.parseInt(datosModificarHabitacion[2])<=0){
						comprobarMayor = true;
						comprobar=false;	
					}
					else {
						capacidad = Integer.parseInt(datosModificarHabitacion[2]);
						precioPer = Integer.parseInt(datosModificarHabitacion[3]);
						opcion = datosModificarHabitacion[4];
					}
					if(comprobarAgrego) {
						JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
					}
					if(comprobarMayor) {
						JOptionPane.showMessageDialog(null, "El valor tiene que ser positivo y mayor a 0");
					}
					if(comprobar) {
						gestion.modificarHabitacion(datosModificarHabitacion[0],numeroHabitacion,capacidad,precioPer,opcion);
						JOptionPane.showMessageDialog(null, "Modificación Exitosa");
						acciones.salir(Acciones.ATRAS_HABITACION);
						acciones.iniciar(Acciones.CRUD_HABITACION);
					}
				}	
				else {
					JOptionPane.showMessageDialog(null,"No se ha agregar ninguna habitación");
				}
				
			}
		//Eliminar
			private void eliminarHabitacion(String[] datosEliminarHabitacion) {
				if(gestion.getRecepcionistas().size()>0) {
					gestion.eliminarHabitacion(datosEliminarHabitacion[0]);
					JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
					acciones.salir(Acciones.ATRAS_HABITACION);
					acciones.iniciar(Acciones.CRUD_HABITACION);
				}
				else {
					JOptionPane.showMessageDialog(null, "No se ha agregado ninguna habitación");
				}
			}
	//RECEPCIONISTA
	//Persona
		//Agregar
			private void guardarPersona(String[] datosPersona) {
				boolean comprobar=true;
				boolean comprobarAgregar=false;
				String documento="";
				String nombre = "";
				String ciudad = "";
				String celular = "";
				Date fechaNacimiento = null;
				String usuario="";
				String contraseña = ""; 
				if(gestion.getPersonas().size()>0) {
					for(int i=0;i<gestion.getPersonas().size();i++) {
						if(datosPersona[0].equals(gestion.getPersonas().get(i).getDocumento()) ){
							JOptionPane.showMessageDialog(null, "Ya existe ese documento");
							comprobar=false;
						}
						else if(datosPersona[0].equals("") || datosPersona[1].equals("") || datosPersona[2].equals("") || 
								datosPersona[3].equals("") || datosPersona[4]==null || datosPersona[5].equals("") || datosPersona[6].equals("")) {
							comprobarAgregar = true;
							comprobar=false;
						}	
						else {
							documento=datosPersona[0];
							nombre=datosPersona[1];
							ciudad=datosPersona[2];
							celular=datosPersona[3];
							try {
								fechaNacimiento = formato.parse(datosPersona[4]);
					        } 
					        catch (ParseException ex) 	{
					        	
					        }
							usuario=datosPersona[5];
							contraseña=datosPersona[6];
						}
					}
				}
				else {
					if(datosPersona[0].equals("") || datosPersona[1].equals("") || datosPersona[2].equals("") || 
						datosPersona[3].equals("")|| datosPersona[4].equals("") || datosPersona[5].equals("") || datosPersona[6].equals("")) {
						comprobarAgregar = true;
						comprobar=false;
					}
					else {
						documento=datosPersona[0];
						nombre=datosPersona[1];
						ciudad=datosPersona[2];
						celular=datosPersona[3];
						usuario=datosPersona[5];
						contraseña=datosPersona[6];
						try {
							fechaNacimiento = formato.parse(datosPersona[4]);	
				        } 
				        catch (ParseException ex) {
				        	System.out.println("Este error");
				       	}
					}
				}
				if(comprobarAgregar) {
					JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
				}
				if(comprobar) {
					gestion.agregarPersona(documento,nombre, ciudad, celular, fechaNacimiento, usuario, contraseña);
					JOptionPane.showMessageDialog(null, "Guardado Exitoso");
					acciones.salir(Acciones.ATRAS_PERSONA);
					acciones.iniciar(Acciones.CRUD_PERSONAS);
				}	
			}
		//Modificar
			private void modificarPersona(String[] datosModificarPersona) {
				boolean comprobar=true;
				boolean comprobarAgrego=false;
				String documento=datosModificarPersona[1];
				String nombre = "";
				String ciudad = "";
				String celular="";
				Date fechaNacimiento=null;
				String usuario="";
				String contraseña="";
				
				if(gestion.getPersonas().size()>0) {
					if(datosModificarPersona[1].equals("") || datosModificarPersona[2].equals("") || 
							datosModificarPersona[3].equals("") || datosModificarPersona[4].equals("") || datosModificarPersona[5].equals("") ||
							datosModificarPersona[6].equals("") || datosModificarPersona[7].equals("")) {
						comprobarAgrego=true;
						comprobar=false;
					}	
					else {
						nombre = datosModificarPersona[2];
						ciudad = datosModificarPersona[3];
						celular = datosModificarPersona[4];
						try {
							fechaNacimiento = formato.parse(datosModificarPersona[5]);
				        } 
				        catch (ParseException ex) 	{
				        	
				        }
						usuario = datosModificarPersona[6];
						contraseña = datosModificarPersona[7];
						
					}
					if(comprobarAgrego) {
						JOptionPane.showMessageDialog(null, "Ingrese todos los datos");
					}
					if(comprobar) {
						gestion.modificarPersona(datosModificarPersona[0],documento,nombre,ciudad,celular,fechaNacimiento,usuario,contraseña);
						JOptionPane.showMessageDialog(null, "Modificación Exitosa");
						acciones.salir(Acciones.ATRAS_PERSONA);
						acciones.iniciar(Acciones.CRUD_PERSONAS);
					}
				}	
				else {
					JOptionPane.showMessageDialog(null,"No se ha registrado a ninguna persona");
				}
				
			}
		//Eliminar
			private void eliminarPersona(String[] datosEliminarPersona) {
				if(gestion.getPersonas().size()>0) {
					gestion.eliminarPersona(datosEliminarPersona[0]);
					JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
					acciones.salir(Acciones.ATRAS_PERSONA);
					acciones.iniciar(Acciones.CRUD_PERSONAS);
				}
				else {
					JOptionPane.showMessageDialog(null, "No se ha agregado ninguna habitación");
				}
			}
	//Reservas
		//Guardar
			private void guardarReserva(String[] datosReserva) {
				
				boolean comprobar =true;
				boolean comprobarCapacidad=false;
				boolean comprobarAgrego=false;
				
				String codigo="";
				String numeroPersonas = "";
				Date fechaIngreso=null;
				Habitacion habitacion=null;
				int posicion=Integer.parseInt(datosReserva[3]);
				
				if(gestion.getReservas().size()>0) {
					for(int i=0;i<gestion.getReservas().size();i++) {
						if(datosReserva[0].equals(gestion.getReservas().get(i).getCodigo())) {
							JOptionPane.showMessageDialog(null, "Ya existe el código de reserva");
							comprobar = false;
						}
						else if(datosReserva[0].equals("") || datosReserva[1].equals("") || datosReserva[2]==null || datosReserva[3]==null) {
							comprobarAgrego=true;
							comprobar = false;
						}
						else if(Integer.parseInt(datosReserva[1])>Integer.parseInt(gestion.getHabitaciones().get(posicion).getNumeroMaxUsuarios()) || Integer.parseInt(datosReserva[1])<1) {
							comprobarCapacidad=true;
							comprobar= false;
						}
						else {
							codigo=datosReserva[0];
							numeroPersonas=datosReserva[1];
							try {
								fechaIngreso = formato.parse(datosReserva[2]);	
					        } 
					        catch (ParseException ex) {
					        	System.out.println("Este error");
					       	}
							habitacion=gestion.getHabitaciones().get(Integer.parseInt(datosReserva[3]));
						}
					}	
				}
				else {
					if(datosReserva[0].equals("") || datosReserva[1].equals("") || datosReserva[2]==null || datosReserva[3]==null) {
						comprobarAgrego=true;
						comprobar = false;
					}
					else if(Integer.parseInt(datosReserva[1])>Integer.parseInt(gestion.getHabitaciones().get(posicion).getNumeroMaxUsuarios()) || Integer.parseInt(datosReserva[1])<1) {
						comprobarCapacidad=true;
						comprobar= false;
					}
					else {
						codigo=datosReserva[0];
						numeroPersonas=datosReserva[1];
						try {
							fechaIngreso = formato.parse(datosReserva[2]);	
				        } 
				        catch (ParseException ex) {
				        	System.out.println("Este error");
				       	}
						habitacion=gestion.getHabitaciones().get(Integer.parseInt(datosReserva[3]));
					}
				}
				if(comprobarCapacidad) {
					JOptionPane.showMessageDialog(null, "Está ingresando un valor mayor o menor a la capacidad de la habitación");
				}
				if(comprobarAgrego) {
					JOptionPane.showMessageDialog(null, "Ingreso todos los datos");
				}
				if(comprobar) {
					gestion.agregarReserva(codigo,fechaIngreso,numeroPersonas,habitacion);
					JOptionPane.showMessageDialog(null, "Guardado Exitoso");
					acciones.iniciar(Acciones.RESERVA);
					acciones.salir(Acciones.ATRAS_RESERVA);
				}
			}
	//Facturacion
		//Llenar Factura
			private String[][] llenarFactura(String i, String fecha) {
				String[][]factura=new String[1][6];
				int posicion=Integer.parseInt(i);
				String fechaInicio=formato.format( gestion.getReservas().get(posicion).getFechaEntrada());
				String fechaActual = fecha;
		        String[] fechaIngreso = fechaInicio.split("/");
		        String[] fechaUl = fechaActual.split("/");
		        int fechaSalida=Integer.parseInt(fechaUl[0]);
		        int fechaEntrada=Integer.parseInt(fechaIngreso[0]);
		        int cantDias = fechaSalida-fechaEntrada;
				int precioPersona=gestion.getHabitaciones().get(posicion).getPrecioPer();
				int cantPersonas=Integer.parseInt(gestion.getReservas().get(posicion).getNumeroPersonas());
				int precioEstadia=(precioPersona*cantPersonas)*cantDias;
				if(precioEstadia<0) {
					precioEstadia=precioEstadia*-1;
				}
				int adicionales=0;
				String [] posi = new String [1];
				posi[0]=i;
				int totalAdicionales=productos(posi);
				int total=precioEstadia+totalAdicionales;
				factura[0][0] = String.valueOf(precioPersona);
				factura[0][1] = String.valueOf(precioEstadia);
				factura[0][2] = String.valueOf(adicionales);
				factura[0][3] = String.valueOf(totalAdicionales);
				factura[0][4] = String.valueOf(total);
				factura[0][5] = gestion.getReservas().get(posicion).getCodigo();
				return factura;
			}
		//Guardar
			private void guardarFactura(String[] datosFactura) {
				String codigo = datosFactura[0];
				int precioEstadia = Integer.parseInt(datosFactura[1]);
				int totalProductos = Integer.parseInt(datosFactura[2]);
				int total = Integer.parseInt(datosFactura[3]);
				Date fechaSalida = null;
				try {
					fechaSalida = formato.parse(datosFactura[4]);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				gestion.eliminarReserva(datosFactura[5]);
				gestion.agregarFactura(fechaSalida,precioEstadia,totalProductos,total);
				JOptionPane.showMessageDialog(null, "Guardado Exitoso");
			}
	//Usuario
			private String[][] llenarLaFactura() {
				String [][] factura=new String [1][5];
				factura[0][0] = String.valueOf(gestion.getHabitaciones().get(0).getPrecioPer());
				factura[0][1] = ""+0;
				factura[0][2] = ""+0;
				factura[0][3] = ""+0;
				factura[0][4] = ""+0;
				if(gestion.getFacturas().size()>0) {
					factura[0][1] = String.valueOf(gestion.getFacturas().get(0).getPrecioEstadia());
					factura[0][2] = "0";
					factura[0][3] = String.valueOf(gestion.getFacturas().get(0).getTotalProductos());
					factura[0][4] = String.valueOf(gestion.getFacturas().get(0).getTotal());
				}
				return factura;
			}
		//Barra
			private int productos(String[] i) {
				int posicion=Integer.parseInt(i[0]);
				boolean comprobar=true;
				int precio=0;
				int cantidad=gestion.getProductos().get(posicion).getCantidad();
				int precioProducto=gestion.getProductos().get(posicion).getPrecio();
				int contador=0;
				int precioTotal=0;
				
				if(gestion.getProductos().get(posicion).getCantidad()>0) {
					cantidad=cantidad-1;
					contador=contador+1;
					JOptionPane.showMessageDialog(null, "Se compró una, quedan "+cantidad);
				}
				else {
					JOptionPane.showMessageDialog(null, "No quedan más unidades");
				}
				if(comprobar) {
					precio=precioProducto*contador;
					precioTotal=precio+precioTotal;
					acciones.iniciar(Acciones.BARRA);
					gestion.getProductos().get(posicion).setCantidad(cantidad);
				}
				return precioTotal;
			}
}
