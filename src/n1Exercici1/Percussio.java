package n1Exercici1;

public class Percussio extends Instrument {

	public Percussio(String nom, int preu) {
		super(nom, preu);
	}

	{
		System.out.println("Bloque inicialización");
	}

	static {

		System.out.println("Esta sonant un instrument de percussio");
	}

	public void tocar() {

		System.out.println("Esta sonant un instrument de percussio");

	}

}
