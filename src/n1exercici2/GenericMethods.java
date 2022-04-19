package n1exercici2;

import n1exercici2.Principal.Persona;

public class GenericMethods<T> {

	public GenericMethods() {
		
		primero=null;
		segundo=null;
		tercero=null;
	}
	
	public void setPrimero(T nuevoValor) {
		
		primero=nuevoValor;
	}
	
	public void setAll(T nuevoValor1,T nuevoValor2,T nuevoValor3)
	{
		
		primero=nuevoValor1;
		segundo=nuevoValor2;
		tercero=nuevoValor3;
	}
	
	public T getPrimero() {
		return primero;
	}
	
	public String getAll() {
		return primero +" "+ segundo +" "+ tercero;
	}
	
	private T primero;
	private T segundo;
	private T tercero;
	
}
