import java.util.Scanner;

public class Profesor extends Persona{
	private int numMatricula;
	private String materia;
	



	public Profesor() {
		super();	
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
	
	public void mostrarDatosDocente() {
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		return "Profesor{" +
				"numMatricula=" + numMatricula +
				", materia='" + materia + '\'' +
				'}';
	}
	
	public void mostrarMateria() {
		System.out.println(this.getMateria());
	}
	
	
	

}
