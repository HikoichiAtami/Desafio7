package teckit;


public class Vendedores extends Persona {

	private String nombreVendedor;
	private String rutVendedor;
	private String fechaNacimientoVendedor;
	private int cantidadEntradasVendidas;
	
	public Vendedores(int cantidadEntradasVendidas) {
		
		this.nombreVendedor = nombreSale;
		this.rutVendedor = rutSale;
		this.fechaNacimientoVendedor = fechaSale;
		this.cantidadEntradasVendidas = cantidadEntradasVendidas;
	}
	public String getNombreVendedor() {
		return nombreVendedor;
	}
	public void setNombreVendedor(String nombreVendedor) {
		nombreVendedor = "Freddy";
		this.nombreVendedor = nombreVendedor;
	}
	public String getRutVendedor() {
		return rutVendedor;
	}
	public void setRutVendedor(String rutVendedor) {
		rutVendedor = "16.985.979-5";
		this.rutVendedor = rutVendedor;
	}
	public String getFechaNacimientoVendedor() {
		return fechaNacimientoVendedor;
	}
	public void setFechaNacimientoVendedor(String fechaNacimientoVendedor) {
		fechaNacimientoVendedor = "05/06/1988";
		this.fechaNacimientoVendedor = fechaNacimientoVendedor;
	}
	public int getCantidadEntradasVendidas() {
		return cantidadEntradasVendidas;
	}
	public void setCantidadEntradasVendidas(int cantidadEntradasVendidas) {
		this.cantidadEntradasVendidas = cantidadEntradasVendidas;
	}
	
	
}
