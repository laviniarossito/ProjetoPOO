
public class ClassePessoas {

	String nomeAt;
	String documentoAt;
	float rendaAt;
	
	// Construtor 1

	public ClassePessoas() {
		
	}
	
	// Construtor 2
	
	public ClassePessoas(String nomePar, String documentoPar, float rendaPar) {
		this.nomeAt = nomePar;
		this.documentoAt = documentoPar;
		this.rendaAt = rendaPar;
	}
	
	// Setters (alterar dados)
	
	public void alterarNome (String nomePar) {
		this.nomeAt = nomePar;
		
	}
}
