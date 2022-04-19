package n1exercici2;

public class Principal {

	public static void main(String[] args) {

		GenericMethods<String> una = new GenericMethods<String>();
		una.setPrimero("Daniel");
		System.out.println(una.getPrimero());
		
		Persona pers1 = new Persona("Juan", "Sanchez", 66);
		GenericMethods<Persona> otra = new GenericMethods<Persona>();
		otra.setPrimero(pers1);
		GenericMethods hola = new GenericMethods();
		hola.setAll("Palabra", pers1, 3);
	    //GenericMethods<T> otra2 = new GenericMethods<T>();
		//otra.setAll(pers1, pers1, pers1);
		System.out.println(otra.getPrimero());
		System.out.println(hola.getAll());

	}

	public static class Persona {

		private String nombre;
		private String cognom;
		private int edad;

		public Persona(String nombre, String cognom, int edad) {
			this.nombre = nombre;
			this.cognom = cognom;
			this.edad = edad;
		}
	}
}
