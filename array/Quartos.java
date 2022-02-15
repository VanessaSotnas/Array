package array;

public class Quartos {
 
	private int numeroQuarto;
	private String nomeLocatario;
	private String email;
	private double precoAluguel;
	
	
	public Quartos(int numeroQuarto, String nomeLocatario, String email, double precoAluguel) {
		this.numeroQuarto = numeroQuarto;
		this.nomeLocatario = nomeLocatario;
		this.email = email;
		this.precoAluguel = precoAluguel;		
	}


	public int getNumeroQuarto() {
		return numeroQuarto;
	}


	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}


	public String getNomeLocatario() {
		return nomeLocatario;
	}


	public void setNomeLocatario(String nomeLocatario) {
		this.nomeLocatario = nomeLocatario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getPrecoAluguel() {
		return precoAluguel;
	}


	public void setPrecoAluguel(double precoAluguel) {
		this.precoAluguel = precoAluguel;
	}
	

}
