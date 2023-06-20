package alumnoscontrol;

import java.sql.*;

//POR QUE SE ESTABLECIO UN METODO MAIN PUBLICO ANTES 

	
public class Alumnosapp {
	static final String DB_URL="jdbc:mysql://localhost/school";
	static final String USER ="jperezmx";
	static final String PASS = "Chuchomysql_01";
	//static final String QUERY= "//"
	
	public static void main(String[] args) {
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	}
		
		// preguntar cuantos alumnos
	//__Alumnos alumno1 = new Alumnos();
		
		//Establecer el programa
		
	//Programa programa = Programa.KINDER;
		
	//switch (programa) {
	//case KINDER:
	//System.out.println("Programa montessori casa de los ninos");
				//		break;
	//case LUDOTECA:
	//System.out.println("Servicio de sala juego por hora");
				//	break;
	//case TALLER:
	//		System.out.println("Programa montessori Taller de ninos");
	//		break;
	//	case CAMPAMENTO:
	//		System.out.println("campamento educativo de temporada");
	//		break;
		
		
		   
		// dar de alta la cantidad de alumnos  nuevos

	
	

}
