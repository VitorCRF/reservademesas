package view;

import java.util.Scanner;

public class MenuClienteView {
	public int telaDeMenuCliente() {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.println("\n(1) Reservar mesa");
		System.out.println("(2) Conferir reservas");
		System.out.print("Opcao: ");
		opcao = sc.nextInt();
		System.out.println("---------------");

		return opcao;
	}
	public void telaOpcaoInvalida() {
		System.out.println("Opcao Invalida!");
	}
}
