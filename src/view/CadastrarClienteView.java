package view;

import java.util.Scanner;
import model.Cliente;

public class CadastrarClienteView {
	private Cliente cliente;

	public Cliente telaCadastrarCliente() {

		cliente = new Cliente();
		Scanner s = new Scanner(System.in);

		System.out.print("Digite o nome: ");
		cliente.setNome(s.nextLine());
		
		s = new Scanner(System.in);
		System.out.print("Digite o telefone: ");
		cliente.setTelefone(s.nextLine());

		s = new Scanner(System.in);
		System.out.println("Digite o RG: ");
		cliente.setRg(s.next());

		return cliente;
	}
}
