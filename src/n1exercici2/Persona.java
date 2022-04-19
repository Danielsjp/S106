package n1exercici2;

public class Persona<T> {

	private T ob;
	private T ob2;
	private T ob3;

	public Persona(T o, T i, T p) {

		ob = o;
		ob2 = i;
		ob3 = p;

	}

	public String mostrarTipo() {

		System.out.println("El tipo de: " + ob.getClass().getName());
		System.out.println("El tipo de: " + ob2.getClass().getName());
		System.out.println("El tipo de: " + ob3.getClass().getName());
		return null;
	}

}
