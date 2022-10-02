import java.util.Scanner;

public abstract class Persona {
	protected Scanner teclado;
	protected String nombre;
	protected String apellido;
	protected int numDni;


	public Persona(String nombre, String apellido, int numDni) {
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setNumDni(numDni);
	}
	
	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getNumDni() {
		return numDni;
	}

	public void setNumDni(int numDni) {
		this.numDni = numDni;
	}
	
	public void mostrarDatosPersonales() {
		System.out.println(this.toString());
		
	}
	
	@Override
	public String toString() {
		return "Persona{" +
				"nombre=" + nombre + '\'' +
				", apellido =" + apellido + '\'' + 
				", numDni=" + numDni +
				'}';
	}

}
