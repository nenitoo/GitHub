

package prgitejemplo;

/**
 *
 * @author nenitoo
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
        System.out.println("modificado por alumno 1"); // alumno 1 
	
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println("modificado por alumno 2"); // alumno 2
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	// modificaciones alumno 1 
 	System.out.println("Alumno 1 inserta esta sentencia");  

	// modificaciones alumno 2 
 	System.out.println("Alumno 2 inserta esta sentencia");    }

	public void testGitAux(){
	//Metodo rama nenitoo
	System.out.println("metodo nenitoo");
 	}
}