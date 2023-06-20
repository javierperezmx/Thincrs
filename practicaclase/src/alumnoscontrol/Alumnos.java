package alumnoscontrol;
import java.util.Scanner;

public class Alumnos {
	//declarar variables
	
	private String firtsName;
	private String lastName1;
	private String lastName2;
	private int edad;
	//private array programa;
	private int programa;
	private int alumnoID;
	private int	estadodeCuenta;
	private int costoDeprograma =5500;
	

	//contructor: agregar Nombre y edad
	
	public Alumnos() {
		Scanner in = new Scanner(System.in);
		System.out.print("Ingresa el nombre del alumno: ");
		this.firtsName = in.nextLine();
		
		System.out.print("Ingresa el apellido paterno: ");
		this.lastName1 = in.nextLine();
		
		System.out.print("Ingresa el apellido materno: ");
		this.lastName2 = in.nextLine();
		
		System.out.print("Ingresa la edad del alumno: ");
		this.edad = in.nextInt();
		
		System.out.print("selecciona programa deseado: \n1-Casa de los ninos\n2-Curso de verano\n3-Ludoteca\n4-Taller");
		this.programa = in.nextInt();
		System.out.println(firtsName+" " + lastName1+" " + lastName2 +" " + edad + "anos"+" "+ programa);
	}
	//Asignar ID  
	
	private String getalumnoID() {
		//this.alumnoID = autonumeric
		
	}
	// POR QUE PRIVATE?
	
	//seleccionar programa, grado  o courso
	
	
	//ver estado de cuenta
	
	//pagar monto pendiente
	
	//mostrar estado del alumno 
	 
}
