package Main;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import teckit.Eventos;
import teckit.Entrada;
import teckit.EntradasVip;
import teckit.Clientes;
import teckit.Vendedores;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // Se declaran Scanner auxiliares para utilizarlos en el programa
		Scanner sc2 = new Scanner(System.in); // Se opta por crear varios Scanner debido a que al sobrecargar uno este genera
		Scanner sc3 = new Scanner(System.in); // datos erroneos
	
		Eventos eventos = new Eventos("", 0); // Se declara el objeto eventos de clase Evento
		ArrayList <String> evento1 = new ArrayList<String>(); //Array que almacena los nombres de los eventos
		ArrayList <Integer> edad = new ArrayList<Integer>(); //Array que almacena la edad minima del evento
		
		Entrada entrada = new Entrada(0, 0); // Objeto entrada de clase Entrada
		ArrayList <Integer> valorEntrada = new ArrayList <Integer>(); //Array que almacena el valor de la entrada general de cada evento
		ArrayList<Integer> asiento = new ArrayList<Integer>(); //Array que almacena el numero de asiento de entrada general
		
		for (int i = 1; i <= 2000; i++) { //Ciclo que crea los asientos
			entrada.setNumeroAsientoEntrada(i); // se ejecuta el setter para el numero de asiento entrada general del objeto entrada, clase Entrada
			asiento.add(entrada.getNumeroAsientoEntrada()); // se pasa informacion mediante getter a un array
		}
		
		EntradasVip Vip = new EntradasVip(""); // Se declara el objeto Vip de clase EntradasVip
		ArrayList <Integer> valorEntradaVip = new ArrayList <Integer>(); // array que almacena valor entrada vip
		ArrayList<Integer> asientoVip = new ArrayList<Integer>(); // array que almacena los asientos vip
		
		for (int i = 1; i <= 100; i++) { //Ciclo que genera los asientos vip
			Vip.setNumeroAsientoVip(i); // se usa setter para enviar la informacio
			asientoVip.add(Vip.getNumeroAsientoVip()); // luego se almacena el un array mediante el getter
		}
		
		
		Vendedores vendedor1 = new Vendedores(0); // objeto vendedor1 de clase Vendedores
		int contadorVentasG = 0; //Contador ventas entrada general
		int contadorVentasVip = 0; // contador ventas entradas vip
		
		Clientes cliente1 = new Clientes(); // objeto cliente1 de clase Clientes
		ArrayList <String> nombreCliente1 = new ArrayList<String>(); //array que almacena el nombre de los clientes
		ArrayList <String> rutCliente1 = new ArrayList <String>(); // array que almacena rut de los clientes
		ArrayList <String> fechaCliente1 = new ArrayList <String>(); // array que almacena la fecha de nacimiento
		ArrayList<Integer> edadCliente = new ArrayList <Integer>(); // array que almacena la edad de los clientes
		
		System.out.println("¿Desea crear un nuevo evento?"); //Se pregunta si se requiere crear un nuevo evento
		System.out.println("S / N");
		String eventoo2 = sc.nextLine();
		if (eventoo2.compareToIgnoreCase("S") == 0) { // validacion true o false segun lo que se indique
			crearEvento(evento1, edad, eventos, eventoo2, entrada, valorEntradaVip, Vip, valorEntradaVip); // cast al metodo crearEvento
		}
		System.out.println("¿Desea agregar un nuevo cliente?"); // Se consulta si se requiere agregar un nuevo cliente
		System.out.println("S / N"); 
		String cliente2 = sc2.nextLine();	
		if(cliente2.compareToIgnoreCase("S") == 0) { //validacion
			crearCliente(cliente1,nombreCliente1, rutCliente1,fechaCliente1); //cast metodo crearCliente
		}
		System.out.println("¿Desea iniciar alguna venta?"); // Se consulta si se quiere iniciar una nueva venta
		System.out.println("S / N");
		String venta1 = sc3.nextLine();
		if (venta1.compareToIgnoreCase("S") == 0) { //validacion
		ventaEntrada(vendedor1, fechaCliente1, fechaCliente1, fechaCliente1, valorEntrada, valorEntradaVip, fechaCliente1, fechaCliente1, cliente1, Vip, contadorVentasG, contadorVentasVip);
		} //cast a metodo ventaEntrada
		
		System.out.println("¿Desea mostrar la edad de los clientes registrados?"); //se consulta si requiere mostrar la edad de los clientes
		System.out.println("S / N");
		String edades = sc2.nextLine();
		if (edades.compareToIgnoreCase("S") ==0) { //validacion
			edad(fechaCliente1, fechaCliente1, fechaCliente1, edadCliente); //cast metodo edades
		}
		
		System.out.println("¿Desea ingresar al evento?");
		System.out.println("S / N");
		String enter = sc2.nextLine();
		if (enter.compareToIgnoreCase("S") == 0) {
			
		}
	
	}
		
		public static void crearEvento(ArrayList<String> evento1, ArrayList<Integer> edad, //metodo para crear los eventos
				Eventos evento2,String ev2, Entrada entrada, ArrayList<Integer>valorEntrada, EntradasVip Vip, ArrayList<Integer> valorEntradaVip) {
				 
				
		
		Scanner aux = new Scanner(System.in); //Scanner auxiliares
		Scanner aux2 = new Scanner(System.in);
		
		
		while (ev2.compareToIgnoreCase("S") ==0){ //Validacion usada para generar bucle hasta que se decida dejar de crear eventos
				//Se solicita ingresar nombre al evento, se setea informacion ingresada y se añade a un arraylist mediante un get
				System.out.println("Ingrese el nombre del evento"); 
				evento2.setNombreEvento("", aux2);
				evento1.add(evento2.getNombreEvento());
			
				//Se solicita ingresar la edad minima para ingresar, se setea informacion y se añade a arraylist mediante un get
				System.out.println("Ingrese la edad minima para el evento");
				evento2.setEdadMinimaIngreso(0, aux2);
				edad.add(evento2.getEdadMinimaIngreso());
			
				//se solicita ingresar el valor de entrada general, se setea informacion y se añade a arraylist mediante un get
				System.out.println("Ingrese el valor de la entrada general");
				entrada.setPrecioEntrada(0);
				valorEntrada.add(entrada.getPrecioEntrada());
			
				//se solicita ingresar valor entrada vip. se setea informacion y se añade a arraylist mediante un get
				System.out.println("Ingrese el valor de la entrada VIP");
				Vip.setPrecioVip(0);
				aux2.nextLine();
				valorEntradaVip.add(Vip.getPrecioVip());
			
				//se consulta si se requiere crear otro evento
				System.out.println("¿Quieres agregar otro evento?");
				System.out.println("S / N");
				ev2 = aux.nextLine();
			if (ev2.compareToIgnoreCase("S") == 0) { // de ser asi se hace un cast al metodo crearEvento
				crearEvento(evento1, valorEntradaVip, evento2, ev2, entrada, valorEntradaVip, Vip, valorEntradaVip);
		}
		
		
	}
		
}
			//metodo para crear clientes
		public static void crearCliente (Clientes cliente1, ArrayList<String> nombreCliente1, ArrayList<String> rutCliente1, ArrayList<String> fechaCliente1) {
			
			Scanner nombre = new Scanner(System.in);
			Scanner rut = new Scanner(System.in);
			Scanner fecha = new Scanner(System.in);
			
			System.out.println("Buen dia");
			System.out.println("Bienvenido a Teckit"); //mensaje de bienvenida
			System.out.println("Estimado cliente, para adquirir entradas a los eventos disponibles es necesario registrarlo");
			System.out.println("Ingrese su nombre por favor"); // se pide ingresar nombre cliente para almacenarlo en un array
			cliente1.setNombreCliente("", nombre);
			nombreCliente1.add(cliente1.getNombreCliente());
			
			System.out.println("Ingrese su rut por favor"); // se pide ingresar el rut cliente para almacenarlo en un array
			cliente1.setRutCliente("", rut);
			rutCliente1.add(cliente1.getRutCliente());
			
			System.out.println("Finalmente ingrese su fecha de nacimiento por favor"); // se pide fecha nacimiento cliente para guardarlo eb un array
			cliente1.setFechaNacimientoCliente("", fecha);
			fechaCliente1.add(cliente1.getFechaNacimientoCliente());
			
			System.out.println("¿Desea registrar un nuevo cliente?"); //se consulta si se quiere crear otro cliente
			System.out.println("S / N");
			String client = nombre.nextLine();
			if(client.compareToIgnoreCase("S") == 0) { //si la validacion es true se hace un cast al metodo crearCliente
				crearCliente(cliente1, fechaCliente1, fechaCliente1, fechaCliente1);
			}
			
		}
		//metodo para venta de entrada
		public static void ventaEntrada (Vendedores vendedor1, ArrayList<String> nombreCliente1, ArrayList<String> rutCliente1, 
				ArrayList<String> fechaCliente1, ArrayList<Integer> valorEntradaVip, ArrayList<Integer> valorEntrada, ArrayList<String> evento1,
				ArrayList<String> edad, Clientes cliente1, EntradasVip Vip, int contadorVentasG, int contadorVentasVip ) {
			
			Scanner venta = new Scanner(System.in); //Scanner auxiliares
			Scanner venta1 = new Scanner(System.in);
			Scanner venta2 = new Scanner(System.in);
			
			System.out.println("Buenas tardes"); // mensaje bienvenida
			System.out.println("Bienvenido a Teckit");
			vendedor1.setNombreVendedor(""); // se setea nomnbre vendedor
			System.out.println("Usted esta siendo atendido por el vendedor " + vendedor1.getNombreVendedor()); // se le ingorma al cliente que vendedor lo esta atendiendo
			System.out.println("Para proseguir con la compra de entradas es necesario validar si esta registrado");
			System.out.println("Por favor ingrese su nombre"); //validacion para saber si esta registrado
			String nombreVenta = venta.nextLine(); 
			System.out.println("Ingrese su RUT"); // se pide ingresar rut y se almacena en un array
			String rutVenta = venta1.nextLine();
			System.out.println("Finalmente ingrese su fecha de nacimiento sin puntos ni guion");  // se pide fecha de cliente
			String fechaVenta = venta2.nextLine();
			System.out.println(nombreCliente1 + " " + rutCliente1 + " " + fechaCliente1);
			if (nombreCliente1.contains(nombreVenta) && rutCliente1.contains(rutVenta) && fechaCliente1.contains(fechaVenta)) {
				System.out.println("Cliente validado correctamente"); // se valida la informacion entregada con la existente
			} else {
				System.out.println("No se encuentra registrado"); // en caso de no ser validado se da la oportunidad de registrarse
				System.out.println("¿Quiere registrase como nuevo usuario?");
				System.out.println("S / N");
				String validacion = venta.nextLine();
				if (validacion.compareToIgnoreCase("S") ==0) {
					crearCliente(cliente1, edad, edad, edad);
				}else { //en caso contrario se informa a cliente que termino el programa
					System.out.println("Venta terminada");
					System.out.println("Teckit le desea un excelente dia");
					System.exit(0);
				}
			}
			if(evento1.isEmpty()) { // se toma la consideracion de que no haya ningun evento creado, se informa a usuario sobre esto
				System.out.println("Estimado cliente en estos momentos no hay ningun evento en curso");
				System.out.println("Este atento a nuestra pagina web para conocer el detalle de los eventos vigentes");
				System.out.println("Teckit le desea un excelente dia");
				System.exit(0);
			}
			System.out.println("Estos son los eventos disponibles"); // si la validacion es correcta se muestran los eventos disponibles
			for (int i = 0; i < evento1.size(); i++) { 
				System.out.println(i + "-" + evento1.get(i)); //se muestran en pantalla los eventos actuales
				System.out.println("Por favor seleccione el numero del evento");
				String ingreso = venta.nextLine(); // se pide a cliente que seleccione
				int parse = Integer.parseInt(ingreso);  // se parsea informacion de String a int
				if (ingreso == evento1.get(parse)) { // validacion
					System.out.println("Vamos a validar si cumple con la edad minima para el evento");
					System.out.println("Ingrese su fecha de nacimiento sin puntos ni guion");
					int date = Integer.parseInt(fechaCliente1.get(parse).substring(4, 8)); //se obtiene una porcion de la fecha
					Calendar cal = new GregorianCalendar(); // se aplica calendar
					int anoActual = cal.get(Calendar.YEAR);
					int date1 = Math.abs(date - anoActual);
					if (date1 < Integer.parseInt(edad.get(parse))) { // en caso de no cumplir la entrada minima se avisa a cliente
						System.out.println("Estimado cliente usted no cumple con la edad minima para ingresar al evento");
						System.out.println("¿Desea iniciar una nueva compra de entradas?"); // y se le da la posibilidad de chequar los otros event
						System.out.println("S / N");
						String noCumple = venta.nextLine();
						if (noCumple.compareToIgnoreCase("S") == 0) { // en caso que el cliente lo requiera se vuelve a ejecutar la venta
							ventaEntrada(vendedor1, edad, edad, edad, valorEntrada, valorEntrada, edad, edad, cliente1, Vip, date1, date1);
						} else {
							System.out.println("En estos momentos esta saliendo del portal"); // si no se sale del programa
							System.out.println("Teckit le desea un excelente dia");
							System.exit(0);
						}
					}
					System.out.println("Estimado cliente usted cumple con la edad minima, acontinuacion se mostraran las entradas disponibles");
					System.out.println("El valor de la entrada es: " + valorEntrada.get(i) ); // en caso de cumplir con la edad se muestran las entradas
					System.out.println("El valor de la entrada Vip es: " + valorEntradaVip.get(i)); // se muestran valores
					System.out.println("Seleccione el tipo de entrada que desea comprar");
					System.out.println("1 - Entrada general"); // se consulta que tipo de entrad quiere comprar
					System.out.println("2 - Entrada Vip");
					String entradas = venta.nextLine();
					if(entradas.compareToIgnoreCase("1") == 0) {
						System.out.println("¿Cuantas entradas desea comprar?"); //se pregunta cuantas entradas quiere comprar
						int entradaG = venta.nextInt();
						contadorVentasG += entradaG; // se agrega la cantidad de entradas al contador del vendedor
						System.out.println("El total de la/s entrada/s es: " + (valorEntrada.get(i) * entradaG)); // se muestra el total
					} else {
						System.out.println("¿Cuantas entradas Vip desea comprar?"); //compra entradas vip
						int entradaV = venta.nextInt();
						contadorVentasVip =+ entradaV; // contador ventas vip
						System.out.println("El total de la/s entrada/s Vip es: " + (valorEntradaVip.get(i) * entradaV));
						System.out.println("Estimado cliente por la compra de cada entrada Teckit le regala una: " + Vip.getRegaloVip());
					}
				}
			}
			
			}	
		// metodo para calcular edad clientes
		public static void edad (ArrayList <String> nombreCliente1,ArrayList <String> rutCliente1,ArrayList <String> fechaCliente1,
				ArrayList<Integer> edadCliente) {
			
			Scanner edadsc = new Scanner (System.in); // scanner auxiliar
			int ano, edad;	// se declaran variables que se usaran
			String fecha;
			Calendar cal = new GregorianCalendar();
			int anoActual = cal.get(Calendar.YEAR); // se calcula la edad con calendar
			
			if(nombreCliente1.isEmpty()) { // si no hay clientes registrados se da la oportunidad de crear uno
				System.out.println("Actualmente no hay ningun cliente registrado");
				System.out.println("¿Desea crear un nuevo cliente?");
				System.out.println("S / N");
				String cliente = edadsc.nextLine();
				if(cliente.compareToIgnoreCase("S") == 0) {
					crearCliente(null, fechaCliente1, fechaCliente1, fechaCliente1); // se hace un cast a crearCliente si se requiere
				} else {
					System.out.println("El programa ha finalizado"); // si no se cierra el programa
					System.exit(0);
				}
			}
			for (int i = 0; i < fechaCliente1.size(); i++) { // ciclo for para obtener los datos de los clientes
				fecha = fechaCliente1.get(i);
				ano = Integer.parseInt(fecha.substring(4, 8)); // se aplica substring para capturar el año
				edad = Math.abs(ano - anoActual); // se usa math para resolver el desafio
				edadCliente.add(edad); //se agregan resultados a una variable
			}
			for (int i = 0; i < nombreCliente1.size(); i++) { // se muestra la edad del cliente
				System.out.println(nombreCliente1.get(i) + " tiene " + edadCliente.get(i) + " años");
			}
			
			
		}
		
}
		
	


		

	
	
		
		
	


