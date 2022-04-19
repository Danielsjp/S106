package n1exercici1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoGenericMethods ObjetoNoGenerico = new NoGenericMethods();
		/*
		 * ObjetoNoGenerico.valor3="platano"; ObjetoNoGenerico.valor1="manzana";
		 * ObjetoNoGenerico.valor2="pera";
		 */
		ObjetoNoGenerico.agregaDatos("manzana", "pera", "limon");
		System.out.println(ObjetoNoGenerico.dameDatos());
	}

}
