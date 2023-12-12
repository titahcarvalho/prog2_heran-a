package pratica_5_heranca;

public class Contato {
	private String nome;
	private String endereco;
	
	public Contato(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void exibirDadosContato() {
		System.out.println("Nome:" + this.nome + "\nEndereço:" + this.endereco);
		
	}
	public String toString() {
		return "Contatos \n \n Nome:" + this.nome + "\nEndereço:" + this.endereco; 
	
	}
}
