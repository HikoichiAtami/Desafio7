package teckit;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

	protected int precioEntrada;
	protected int numeroAsientoEntrada;
	Scanner entrada = new Scanner(System.in);
	
	public Entrada(int precioEntrada, int numeroAsientoEntrada) {
		this.numeroAsientoEntrada = numeroAsientoEntrada;
		this.precioEntrada = precioEntrada;
	}

	public int getPrecioEntrada() {
		return precioEntrada;
	}
	public void setPrecioEntrada(int precioEntrada) {
		precioEntrada = entrada.nextInt();
		this.precioEntrada = precioEntrada;
	}
	public int getNumeroAsientoEntrada() {
		return numeroAsientoEntrada;
	}
	public void setNumeroAsientoEntrada(int numeroAsientoEntrada) {
		
			
		this.numeroAsientoEntrada = numeroAsientoEntrada;
	}
	

	
}
