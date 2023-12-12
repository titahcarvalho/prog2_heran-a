package pratica_5_heranca;

public class Agenda {
	private Contato[] contatos;
	private static int nContatos;
	public Agenda (int n) {
		this.contatos = new Contato[n];
		
	}
	
	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
		
	public void imprimirAmigos() {  //instanceof Conhecido, verificar como utiliza
		for( Contato contato : contatos) {
			if(contato instanceof Amigo) {
				((Amigo) contato).exibirDadosAmigos();//método criado na classe amigo
				
			}
		}
	}
	public void imprimirConhecidos() {
		for (Contato contato : contatos) {
			if( contato instanceof Conhecido) {
				((Conhecido) contato).exibirDadosConhecido();
			}
		}
		
	}
	public void adicionarContato(Contato novoContato) {
		for (int i = 0; i < contatos.length; i++) {
			if ( contatos[i] == null) {
				contatos[i] = novoContato;
				System.out.println( + (i+1) + "° contato adicionado com Sucesso");
				nContatos++;
				return;
			}
		}
		System.out.println("Agenda cheia.");

		//adicionar um novo contato a agenda
		//verificar se ainda há espaço no Array ok
	}
	public int getTotal() {
		return nContatos;
	}
	public String toString() {
		return "Numero total de contatos:";
	
	}
	

}
