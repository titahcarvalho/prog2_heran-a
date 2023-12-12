package pratica_5_heranca;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda(10); //instacia da Agenda com capacidade de 10 contatos
		
		
		Contato amigo1 = new Amigo("Carlos", "\nAvenida Principal, 500", "15.05.1990");
		Contato amigo2 = new Amigo("Carla", "\nAvenida Brasil, 400", "30.03.1999");

		Contato conhecido1 = new Conhecido ("Ana", "\nRua das Acácias 1000","analemos@gmail.com");
		Contato conhecido2 = new Conhecido ("Amanda", "\nRua Ametista 200","amanda.ferreira@hotmail.com");

		agenda.adicionarContato(amigo1);
		agenda.adicionarContato(amigo2);
		agenda.adicionarContato(conhecido1);
		agenda.adicionarContato(conhecido2);
		
		
		
		System.out.println("Amigos na agenda:");
		agenda.imprimirAmigos();
		
		System.out.println("Conhecidos na agenda:");
		agenda.imprimirConhecidos();
		
		System.out.println("\n" + agenda.toString());
		System.out.println(agenda.getTotal());
		
	}

}
