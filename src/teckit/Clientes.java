package teckit;


import java.util.Scanner;

public class Clientes extends Persona{

		private String nombreCliente;
		private String rutCliente;
		private String fechaNacimientoCliente;
		Scanner sc = new Scanner(System.in);
		
		public Clientes() {
			this.nombreCliente = nombreClient;
			this.rutCliente = rutClient;
			this.fechaNacimientoCliente = fechaClient;
		}
		
		public String getNombreCliente() {
			return nombreCliente;
		}
		public void setNombreCliente(String nombreCliente, Scanner sc1) {
			nombreCliente = sc1.nextLine();
			this.nombreCliente = nombreCliente;
		}
		public String getRutCliente() {
			return rutCliente;
		}
		public void setRutCliente(String rutCliente, Scanner sc2) {
			rutCliente = sc2.nextLine();
			this.rutCliente = rutCliente;
		}
		public String getFechaNacimientoCliente() {
			return fechaNacimientoCliente;
		}
		public void setFechaNacimientoCliente(String fechaNacimientoCliente, Scanner sc3) {
			fechaNacimientoCliente = sc3.nextLine();
			this.fechaNacimientoCliente = fechaNacimientoCliente;
		}
}
