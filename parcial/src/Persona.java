import java.util.Scanner;

public abstract class Persona {
	protected Scanner teclado;
	protected String nombre;
	protected String apellido;
	protected int numDni;


	public Persona() {
		teclado=new Scanner(System.in);
		mostrarDatosPersonales();
	}
	
	public void mostrarDatosPersonales() {
		System.out.print("Ingrese el nombre :");
		nombre = teclado.next();
		System.out.print("Ingrese el apellido :");
		apellido = teclado.next();
		System.out.print("Ingrese el dni :");
		numDni = teclado.nextInt();
		
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

}
