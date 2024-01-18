import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Creamos los 3 pilotos y los 3 aviones con los datos que nos dan
		Piloto piloto1 = new Piloto(1125, "Pete Maverick", 10000, "Capitán");
		Piloto piloto2 = new Piloto(7813, "Natasha Phoenix", 3000, "Teniente");
		Piloto piloto3 = new Piloto(2005, "Bradley Rooster", 3500, "Teniente");
		
		Avion avion1 = new Entrenamiento(1234, "F-35", 8, piloto1, false);
		Avion avion2 = new Combate(201, "F-zop", 5, piloto2, false);
		Avion avion3 = new Combate(9621, "Flanker", 5, piloto2, true);
		//Pedimos datos para crear 2 nuevos pilotos
		System.out.println("\nIntroduce 2 nuevos pilotos");
		System.out.println("Primer Piloto ");
		System.out.println("--------------");
		Piloto piloto4 = new Piloto();
		System.out.println("Identificador del piloto ");
		piloto4.setIdPiloto(sc.nextInt());
		sc.nextLine();
		System.out.println("Nombre del piloto ");
		piloto4.setNomPiloto(sc.nextLine());
		System.out.println("Horas de vuelo del piloto ");
		piloto4.setHorasVueloPiloto(sc.nextInt());
		sc.nextLine();
		System.out.println("Rango del piloto ");
		piloto4.setRangoPiloto(sc.nextLine());
		
		System.out.println("\nSegundo Piloto");
		System.out.println("--------------");
		Piloto piloto5 = new Piloto();
		System.out.println("Identificador del piloto ");
		piloto5.setIdPiloto(sc.nextInt());
		sc.nextLine();
		System.out.println("Nombre del piloto ");
		piloto5.setNomPiloto(sc.nextLine());
		System.out.println("Horas de vuelo del piloto ");
		piloto5.setHorasVueloPiloto(sc.nextInt());
		sc.nextLine();
		System.out.println("Rango del piloto ");
		piloto5.setRangoPiloto(sc.nextLine());

		System.out.println("----------------------------------------------------------");
		System.out.println("\nAñadamos información de 2 nuevos aviones de entrenamiento");
		System.out.println("Primer Avión");
		System.out.println("--------------");
		Avion avion4 = new Entrenamiento();
		System.out.println("Identificador del avión");
		avion4.setIdAvion(sc.nextInt());
		sc.nextLine();
		System.out.println("Modelo del avión");
		avion4.setModAvion(sc.nextLine());
		System.out.println("Capacidad del avión");
		avion4.setCapAvion(sc.nextInt());		
		avion4.setPiloto(piloto4);
		System.out.println("\nSegundo Avión");
		System.out.println("--------------");
		Avion avion5 = new Entrenamiento();
		System.out.println("Identificador del avión");
		avion5.setIdAvion(sc.nextInt());
		sc.nextLine();
		System.out.println("Modelo del avión");
		avion5.setModAvion(sc.nextLine());
		System.out.println("Capacidad del avión");
		avion5.setCapAvion(sc.nextInt());		
		avion5.setPiloto(piloto2);
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\nInformación de los pilotos");
		System.out.println("\n--------------");
		System.out.println(piloto1.mostrarPiloto());
		System.out.println("\n--------------");
		System.out.println(piloto3.mostrarPiloto());
		System.out.println("\n--------------");
		System.out.println(piloto4.mostrarPiloto());
		System.out.println("\n--------------");
		System.out.println(piloto5.mostrarPiloto());
		System.out.println("\n----------------------------------------------------------");
		System.out.println("\nInformación de los aviones");		
		System.out.println(avion1.mostrarAvion());
		System.out.println("\n--------------");
		System.out.println(avion2.mostrarAvion());
		System.out.println("\n--------------");
		System.out.println(avion3.mostrarAvion());
		System.out.println("\n--------------");
		System.out.println(avion4.mostrarAvion());
		System.out.println("\n--------------");
		System.out.println(avion5.mostrarAvion());

		sc.close(); 
	}
}
