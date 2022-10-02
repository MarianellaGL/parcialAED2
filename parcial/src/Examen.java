import java.util.Arrays;
import java.util.Scanner;

public class Examen {
    private static String fechaExamen;
	private static final int NOTA_APROBACION = 4;
	private Alumno alumno1, alumno2;
	private Profesor profe;
	
	{
		System.out.println("Inicializando examen");
	}
	
	public Examen() {
		
	}
	
	public Examen(Alumno a1, Alumno a2, Profesor p, String fecha) {
		this.alumno1 = a1;
		this.alumno2 = a2;
		this.profe = p;
		this.fechaExamen = fecha;
	}

	public static String getFechaExamen() {
		return fechaExamen;
	}


	public static void setFechaExamen(String fechaExamen) {
		Examen.fechaExamen = fechaExamen;
	}

	public Alumno getAlumno1() {
		return alumno1;
	}


	public void setAlumno1(Alumno alumno1) {
		this.alumno1 = alumno1;
	}


	public Alumno getAlumno2() {
		return alumno2;
	}


	public void setAlumno2(Alumno alumno2) {
		this.alumno2 = alumno2;
	}


	public Profesor getProfe() {
		return profe;
	}


	public void setProfe(Profesor profe) {
		this.profe = profe;
	}





	public void verMateriasMayorProm(Alumno alumno) {
		
    	int[] notas = alumno.getNotas();
    	int promedio = alumno.calcularPromedio(notas);
		System.out.println("Las materias con mayor promedio son ");
    	for(int f = 0; f<notas.length ; f++) {
    	if(notas[f] > promedio) {
          System.out.println(alumno.getMaterias()[f]);
            }
    	}
    	
    }
   
    public void validaDocenteCatedra(Profesor p, Alumno a) { 
    	String validarMateria = p.getMateria();
    	String[] materias = a.getMaterias();
    	for(int f = 0; f<materias.length; f++) {
    		if(materias[f] == validarMateria) {
    			System.out.println("El docente corresponde a la materia" + p.getMateria() + "a dar por el alumno " + a.getNombre());
    		}
    	}
    	
    }
    
    public void verMateriasAprobadas(Alumno alumno) {
    	int[] notas = alumno.getNotas();
		System.out.println("Las siguientes materias están aprobadas: ");
    	for(int f = 0; f<notas.length ; f++) {
    	if(notas[f] >= NOTA_APROBACION) {
          System.out.println(alumno.getMaterias()[f]);
            }
    	}
    }


	public static void main(String[] args) {
		Alumno a1 = new Alumno();
		a1.setNombre("Juan");
		a1.setApellido("Juarez");
		a1.setNumDni(466677);
		a1.setLegajo(477777);
		a1.mostrarDatosPersonales();
		a1.mostrarMateriaYNota();
		System.out.println("el promedio para el alumno " +  a1.getNombre() + " es " + a1.calcularPromedio(a1.getNotas()));
		Alumno a2 = new Alumno();
		a2.setNombre("Juana");
		a2.setApellido("Perez");
		a2.setNumDni(463377);
		a2.setLegajo(333333);
		a2.mostrarDatosPersonales();
		a2.mostrarMateriaYNota();
		System.out.println("el promedio para el alumno " +  a2.getNombre() + " es " + a2.calcularPromedio(a1.getNotas()));
		Profesor p = new Profesor();
		p.setNombre("Julian");
		p.setApellido("Alvarez");
		p.setNumDni(299999);
		p.setNumMatricula(9889);
		p.setMateria("Ingles");
		System.out.println("El docente es" + p.getApellido() +" " + p.getNombre() + " matricula:" + p.getNumMatricula());
		Examen examen = new Examen(a1, a2, new Profesor(), "5/10/2022");
		examen.verMateriasAprobadas(a1);
		examen.verMateriasAprobadas(a2);
		examen.verMateriasMayorProm(a1);
		examen.verMateriasMayorProm(a2);
		examen.validaDocenteCatedra(p, a1);
		examen.validaDocenteCatedra(p, a2);
		
		
		

		
		
		

	}

}
