
public class Profesor extends Persona{
	private int numMatricula;
	private String materia;
	



	public Profesor() {
		System.out.print("Ingrese matricula :");
		numMatricula = teclado.nextInt();
		mostrarMateria();
		mostrarDatosDocente();
		
}


	public String mostrarMateria() {
		System.out.print("Ingrese Materia :");
		materia = teclado.next();
		return materia;
	}
	
	public void mostrarDatosDocente() {
		System.out.println("Nombre:" + nombre);
		System.out.println("Apellido:" + apellido);
		System.out.println("Dni:" + numDni);
		System.out.println("Numero matricula:" + numMatricula);
		System.out.println("materia cursada:" + materia);
	}
	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
	
	
	

}
