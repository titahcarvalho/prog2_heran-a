package pratica_5_heranca;

public class Conhecido extends Contato {
	private String email;
	
	public Conhecido ( String nome, String endereco, String email) {
		super(nome, endereco);
		this.email=email;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void exibirDadosConhecido() {
		exibirDadosContato();
		System.out.println("Email:" + this.email);
	}
	public String toString() {
		return super.toString() + "\nEmail:" + this.email;
	
	}
}
