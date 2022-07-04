package n1exercici2;

public class Cotxe {
	
	private static final String marca; 
	private static String model;
	private final double potencia;
	
	
	
	
	//Constructor
	
	public Cotxe(String marca, String model, double potencia) {
		super();
		this.model = model;
		this.potencia = potencia;
	}




	public static String getModel() {
		return model;
	}




	public static void setModel(String model) {
		Cotxe.model = model;
	}




	public double getPotencia() {
		return potencia;
	}
	
	
	
	static void frenar() {
		
		
	}
	
	
	public void accelerar() {
		
		
		
		
		
		
	}
	

}
