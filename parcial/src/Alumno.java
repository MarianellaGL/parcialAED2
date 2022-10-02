import java.util.Scanner;

public class Alumno extends Persona{
	
	private int legajo;
	private int[] notas;
	private String[] materias;
	private int promedio = 0;


	
	public Alumno() {
		this.legajo = legajo;
		cargarNotas(teclado);
		}

	public void cargarMaterias(Scanner teclado ) {
		materias = new String[5];
		for (int f = 0; f < 5; f++) {
			System.out.print("Ingrese materia:");
			materias[f] = teclado.next();
		}
	}
	
	public int[] cargarNotas(Scanner teclado) {
		notas = new int[5];
		for (int f = 0; f < 5; f++) {
			System.out.print("Ingrese nota:");
			notas[f] = teclado.nextInt();
		}
		return notas;

	}
	
	public int calcularPromedio(int[] notas) {
		int suma = 0;
		for (int f = 0; f < notas.length; f++) {
			suma = notas[f] ++;
		    promedio= suma/notas.length;

		}
		return promedio;
	}
	
	
	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = calcularPromedio(notas);
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}
	

}