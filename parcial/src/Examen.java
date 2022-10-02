import java.util.Scanner;

public class Examen {
	private Scanner teclado;
    private static String fechaExamen;
	private static int notaAprobacion;
	private Alumno alumno1, alumno2;
	private Profesor profe;
	
    public String[] verMateriasAprobadas() {
    	int[] notas = alumno1.getNotas();
    	for(int f = 0; f<notas.length ; f++) {
    	if(notas[f] >= 4) {
    		return alumno1.getMaterias();
    	}
    	}
		return alumno1.getMaterias();
    }

	public Examen() {
		System.out.println("inicializando examen");
		teclado = new Scanner(System.in);
		/*System.out.print("Ingrese fecha examen:");
		fechaExamen = teclado.nextLine();
		System.out.print("Ingrese nota del examen:");
		notaAprobacion = teclado.nextInt();
		System.out.println("Inicializando datos del docente:");
		profe = new Profesor();
		System.out.println("Inicializando datos del alumno:");*/
		alumno1 = new Alumno();
		//alumno1.cargarMaterias(teclado);
		System.out.print(alumno1.getPromedio());
		//System.out.println(alumno1.getPromedio());
		//System.out.println("Inicializando datos del alumno:");
		//alumno2 = new Alumno();
		//alumno2.cargarMaterias(teclado);
		//alumno2.cargarNotas(teclado);
	}


	public int verMateriasMayorProm() {
		return notaAprobacion;
    	
    }
    
    public void validaDocenteCatedra() { 
    	int validarMatricula = profe.getNumMatricula();
    	System.out.println(validarMatricula);
    }


	public static void main(String[] args) {
		
		Examen examen = new Examen();
		//examen.validaDocenteCatedra();
		//examen.verMateriasMayorProm();
		//examen.verMateriasAprobadas();
		//examen.verMateriasMayorProm();
		//examen.validaDocenteCatedra();
		
		
		

		
		
		

	}

}
