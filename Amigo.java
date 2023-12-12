package pratica_5_heranca;

public class Amigo extends Contato{
	private String aniversario;
	
	public Amigo(String nome, String endereco, String aniversario) {
		super(nome,endereco);
		this.aniversario = aniversario;
	}
	
	public String getAniversario() {
		return aniversario;
	}

	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}

	public void exibirDadosAmigos() {
		exibirDadosContato();//metodo criado na classe contato
		System.out.println("Aniversario:" + this.aniversario);
	}
	
	public String toString() {
		return super.toString() + "\nAniversario:" + this.aniversario;
	
	}
}
