package n1exercici2;

public class Maincotxe {

	/*
	 * Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca
	 * ha de ser estàtic final, el model estàtic i la potència final. Demostra la
	 * diferència entre els tres. N’hi ha algun que es pugui inicialitzar al
	 * constructor de la classe?
	 * 
	 * Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat frenar()
	 * i un altre no estàtic anomenat accelerar(). El mètode accelerar ha de mostrar
	 * per consola: “El vehicle està accelerant” i el mètode frenar() ha de mostrar:
	 * “El vehicle està frenant”.
	 * 
	 * Demostra com invocar el mètode estàtic i el no estàtic des del main() de la
	 * classe principal.
	 */

	
	
	Cotxe vehicle1 = new Cotxe("Ferrari","testarrosa",500);
    Cotxe vehicle2 = new Cotxe("Lamborgini","diablo",480);
	
	
   
    vehicle1.accelerar();
    System.out.println(vehicle1.getVelocidad());
    vehicle1.parar();
    System.out.println(vehicle1.getVelocidad());
    System.out.println(vehicle1.toString());
    vehicle2.accelerar();
    System.out.println(vehicle2.toString());
    vehicle3.accelerar();
    System.out.println(vehicle3.toString());
    vehicle4.accelerar();
    System.out.println(vehicle4.toString());
}
	
	
	
	
	
	
	
	
	
	
	
	
}
