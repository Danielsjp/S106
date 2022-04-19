package n1exercici1;

public class NoGenericMethods {
	
	static String valor1;
	static String valor2;
	static String valor3;
	
	public NoGenericMethods(String valor1, String valor2, String valor3) {
		
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;

	}
	
	public static String dameDatos() {
		
		return "Valores: " + valor1 + " " + valor2 + " " + valor3;
	}

}
