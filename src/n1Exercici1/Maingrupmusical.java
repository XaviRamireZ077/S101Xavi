package n1Exercici1;

public class Maingrupmusical {


// En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha instruments de vent, de corda i de percussió.

//Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més, tenen un mètode anomenat tocar(). 

//Aquest, és abstracte a la classe instrument i, per tant, s’ha d’implementar a les classes filles. Si s’està tocant un instrument de vent, el mètode ha de mostrar per consola: "Està sonant un instrument de vent", si s’està tocant un instrument de corda: “Està sonant un instrument de corda” i si s’està tocant un instrument de percussió: “Està sonant un instrument de percussió”.


//El procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta.





	public static void main(String []args) {
		
		
		
		Vent flauta1 = new Vent("Flauta",75);
		Percussio tambor1 = new Percussio("Tambor",150);
		Corda guitarra1 = new Corda("guitarra",225);
		
		
		flauta1.tocar();
		tambor1.tocar();
		guitarra1.tocar();
		





	}


}