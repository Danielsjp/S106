package n1exercici1;

public class NoGenericMethods {
	
	protected static String valor1;
	protected static String valor2;
	protected static String valor3;
	
	public NoGenericMethods() {
		
	
	}
	
	public String dameDatos() {
		
		return "Valores:" + valor1 + "" + valor2 + "" + valor3;
	}
	
	public void agregaDatos(String valor3,String valor1, String valor2) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}
	
	
}
