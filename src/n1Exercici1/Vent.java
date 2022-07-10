package n1Exercici1;

public class Vent extends Instrument {

	public Vent(String nom, int preu) {
		super(nom, preu);
	}

	{
		System.out.println("Bloque inicialización");
	}

	static {

		System.out.println("Esta sonant un instrument de vent");
	}

	public void tocar() {

		System.out.println("Esta sonant un instrument de vent");

	}

}
