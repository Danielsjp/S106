package n1exercici2;

public class Principal {

	public static void main(String[] args) {

		Persona hola = new Persona("hola", 1, 2);
		System.out.println(hola.mostrarTipo());
		Persona hola2 = new Persona(4, "hola", 2); // cambiamos el orden para demostrar que acepta cualquer tipo de parametro
		System.out.println(hola2.mostrarTipo());
	}
}

class genericPersona {

	private String nombre;
	private int edad;

	public genericPersona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String ToString() {
		return nombre + " " + edad;

	}
}
