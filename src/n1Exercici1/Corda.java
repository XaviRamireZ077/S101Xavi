package n1Exercici1;

public class Corda extends Instrument {

	public Corda(String nom, int preu) {
		super(nom, preu);
	}

	{
		System.out.println("Bloque inicialización");
	}

	static {

		System.out.println("Esta sonant un instrument de corda");
	}

	public void tocar() {

		System.out.println("Esta sonant un instrument de corda");
	}

}
