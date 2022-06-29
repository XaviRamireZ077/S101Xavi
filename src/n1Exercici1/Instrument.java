package n1Exercici1;

public abstract class Instrument {

	private static String nom;
	private static int preu;
	
   
	public Instrument(String nom, int preu) {
		this.nom = nom;
		this.preu = preu;
		
	}	
    public String getNom() {
    	return nom;
    }
    
    public void setNom(String nom) {
    	this.nom = nom;
    
	}
	
    public int getPreu() {
    	return preu;
    }
	
	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	 static {
	 }  
	public abstract void tocar();
	
	 
	@Override
	public String toString() {
		return "Instrument [nom=" + nom + ", preu=" + preu + "]";
	}
	
}
	
	
	

