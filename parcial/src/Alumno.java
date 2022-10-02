import java.util.Arrays;
import java.util.Scanner;

public class Alumno extends Persona{
	
	private int legajo;
	private int[] notas;
	private String[] materias;


	
	public Alumno() {
		this.legajo = 7898;
		this.notas= new int[5];
		this.materias=new String[5];
		cargarMaterias();
		cargarNotas();
		}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
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
	
	public void mostrarMaterias(){
		System.out.println(Arrays.toString(this.materias));
	}
	
	public void cargarMaterias() {
		Scanner sc = new Scanner(System.in);
		for (int f = 0; f < 5; f++) {
			System.out.print("Ingrese materia:");
			materias[f] = sc.nextLine();
		}
		this.mostrarMaterias();
	}
	
	public void cargarNotas() {
		Scanner sc = new Scanner(System.in);
		notas = new int[5];
		for (int f = 0; f < 5; f++) {
			System.out.print("Ingrese nota:");
			notas[f] = sc.nextInt();
		}
		this.setNotas(notas);
		this.mostrarNotas();

	}
	
	public void mostrarNotas(){
		System.out.println(Arrays.toString(this.notas));
	}
	
	public int calcularPromedio(int[] notas) {
		int suma = 0;
		for (int f = 0; f < notas.length; f++) {
			suma += this.notas[f];
		}
		
		return suma/this.notas.length;
	}
	
	public void mostrarMateriaYNota(){
		for(int i=0;i<this.getNotas().length;i++){
			System.out.println(this.getMaterias()[i]+": "+this.getNotas()[i]);
		}
	}
	
	

}