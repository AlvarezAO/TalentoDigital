package ZooMexicano;
import java.util.*;

public class MainZoo {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int option, option2;
		//int sizeTierra = 0, sizeAgua = 0, sizeAire = 0;
		
		Zoologico zoo = new Zoologico();
		
		do {
			System.out.println("Menú Zoologico \n1 - Agregar Animal \n2 - Mostrar Animal \n3 - Resumen \n4 - Salir");
			option = kb.nextInt();
			
			switch (option) {
			
			case 1: 
					System.out.println("Selecciona tipo de animal \n1 - Terrestre \n2 - Acuatico \n3 - Volador");
					option2 = kb.nextInt();
					kb.nextLine();
					
					System.out.println("Ingresa nombre del animal");
			 		String name = kb.nextLine();
			 		System.out.println("Ingresa el país de origen");
			 		String paisOrigen = kb.nextLine();
			 		System.out.println("Ingresa su fecha de ingreso");
			 		String fechaIngreso = kb.nextLine();
			 		
			 	switch (option2) {
			 	
			 		case 1: System.out.println("Ingresa la cantidad de patas");
			 		 		int cantPatas = kb.nextInt();
			 		 		kb.nextLine();
			 		 		System.out.println("Ingresa tu tipo de Alimentación");
			 		 		String tipoAlimentacion = kb.nextLine();
			 		 		System.out.println("Ingresa sus horas de sueño");
			 		 		int horasSueno = kb.nextInt();
			 		 		
			 		 		Terrestres animalTierra = new Terrestres(name, paisOrigen, fechaIngreso, cantPatas,
			 		 												tipoAlimentacion, horasSueno);
			 		 		
			 		 		zoo.addTierra(animalTierra);
			 		 					 		 		
			 		 	break;	
			 		 	
			 		case 2: int cantAleta = 0, tipoAgua = 0,  nivelAgresividad = 0;
			 		
			 				Acuaticos animalAgua = new Acuaticos(name, paisOrigen, fechaIngreso, tipoAgua, cantAleta, nivelAgresividad );
			 			
			 				do {
			 					System.out.println("Ingresa Tipo de agua \n1 - Dulce \n2 - Salada");
				 		 		animalAgua.setAmbiente( tipoAgua = kb.nextInt());
			 				} while (tipoAgua != 1 && tipoAgua != 2);
			 				
			 		 		System.out.println("Ingresa la cantidad de aletas");
			 		 		animalAgua.setNumAletas(cantAleta = kb.nextInt()); 
			 		 		
			 		 		do {
				 		 		System.out.println("Nivel de agresividad \n1 - Poco Agresivo \n2 - Agresivo \n3 - Muy Agresivo");
				 		 		animalAgua.setNivelAgresividad( nivelAgresividad = kb.nextInt());
			 		 		} while (nivelAgresividad > 3 || nivelAgresividad <=0);
			 		 		
			 		 		zoo.addAgua(animalAgua);
			 		 					 		
			 			break;	
			 			
			 		case 3: int migrante = 0, size = 0;
			 				String colorPluma = "";
			 				
			 				Voladores animalAire = new Voladores(name, paisOrigen, fechaIngreso, colorPluma, size, migrante);
			 				
			 				System.out.println("Ingresa el color de plumas");
			 				animalAire.setColorPluma(colorPluma = kb.nextLine());
			 				System.out.println("Ingresa el tamaño");
			 				animalAire.setSize(size = kb.nextInt());
			 				
			 				do {
			 					System.out.println("Ingresa si el animal es migrante \n1 - SI \n2 - NO");
			 					animalAire.setMigrante(migrante = kb.nextInt());			 					
			 				} while (migrante != 1 && migrante != 2);
			 				
			 				zoo.addAire(animalAire);
			 			
			 			break;	
			 			
			 		default: System.out.println("Ingresa una opción válida");	
			 		}			 		
			 	
			 	break;
			 	
			case 2: do {
						
					System.out.println("Muestra animales \n1 - Tipo Terrestre \n2 - Tipo Acuatico \n3 - Tipo Volador");
					option2 = kb.nextInt();
					
					if (option2 == 1) {
						zoo.muestraTierra();
					} else if (option2 == 2) {
						zoo.muestraAgua();
					} else if (option2 == 3) {
						zoo.muestraAire();
					}
				
					} while (option2 > 3 || option2 <= 0);
			 		
			 	break;	
			 	
			case 3: System.out.println("La cantidad de Animales Terrestres registrados son: "+ zoo.sizeTierra());
					System.out.println("La cantidad de Animales Acuaticos registrados son: "+ zoo.sizeAgua());
					System.out.println("La cantidad de Animales Voladores registrados son: "+ zoo.sizeAire());
					
				break;	
			 	
			case 4: System.out.println("Has salido del programa"); 	
				
				break;
				
			default: System.out.println("Ingresa una opción válida");	
			}
			
			
		} while (option != 4);
			
	}
}
