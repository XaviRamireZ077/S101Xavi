package n1exercici2;

public class Cotxe {

	private static final String marca = "Ferrari";
	private static String model = "Testarrosa";
	private final double potencia;

	// Constructor

	public Cotxe(double potencia) {
		super();

		this.potencia = potencia;
	}

	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return marca;
	}

	public double getPotencia() {
		return potencia;
	}

	public static void frenar() {
		System.out.println("El cotxe esta frenant");
	}

	public void accelerar() {
		System.out.println("El cotxe esta accelerant");
	}

}
