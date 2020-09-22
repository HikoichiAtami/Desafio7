package teckit;

import java.util.Scanner;

public class EntradasVip extends Entrada{

	private int precioVip;
	private int numeroAsientoVip;
	private String regaloVip;

	Scanner vip = new Scanner (System.in);
	
	public EntradasVip(String regaloVip) {
		super(0, 0);
		this.precioVip = precioEntrada;
		this.numeroAsientoVip = numeroAsientoEntrada;
		this.regaloVip = regaloVip;
		
	}
	public int getPrecioVip() {
		return precioVip;
	}
	public void setPrecioVip(int precioVip) {
		precioVip = vip.nextInt();
		this.precioVip = precioVip;
	}
	public int getNumeroAsientoVip() {
		return numeroAsientoVip;
	}
	public void setNumeroAsientoVip(int numeroAsientoVip) {
		this.numeroAsientoVip = numeroAsientoVip;
	}
	public String getRegaloVip() {
		return regaloVip;
	}
	public void setRegaloVip(String regaloVip) {
		regaloVip = "Polera Conmemorativa";
		this.regaloVip = regaloVip;
	}

	
	
	
}
