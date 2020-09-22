package teckit;


import java.util.Scanner;

public class Eventos {

		protected String nombreEvento;
		protected int edadMinimaIngreso;
		Scanner sc = new Scanner(System.in);
		
		
		
		
	public Eventos(String nombreEvento,  int edadMinimaIngreso) {
		this.nombreEvento = nombreEvento;
		this.edadMinimaIngreso = edadMinimaIngreso;

	}
		

		public String getNombreEvento() {
			return nombreEvento;
		}

		public void setNombreEvento(String nombreEvento, Scanner sc2) {
			nombreEvento = sc2.nextLine();
			this.nombreEvento = nombreEvento;
		}


		public int getEdadMinimaIngreso() {
			return edadMinimaIngreso;
		}

		public void setEdadMinimaIngreso(int edadMinimaIngreso, Scanner sc3) {
			edadMinimaIngreso = sc3.nextInt();
			this.edadMinimaIngreso = edadMinimaIngreso;
		}
	
	
	}