package view;

import java.util.Scanner;

public class MenuClienteView {
	public int telaDeMenuCliente() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n(1) Reservar mesa");
		System.out.println("(2) Conferir reservas");

		return sc.nextInt();
	}
	public void telaOpcaoInvalida() {
		System.out.println("Opcao Invalida!");
	}
}
