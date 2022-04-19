package n1exercici1;
import java.util.ArrayList;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<NoGenericMethods> Lista2 = new ArrayList<NoGenericMethods>();
		Lista2.add(new NoGenericMethods("juan","ana","maria")); //los tres valores son del mismo tipo, admite diferente orden.
		System.out.println(NoGenericMethods.dameDatos());
	}

}
