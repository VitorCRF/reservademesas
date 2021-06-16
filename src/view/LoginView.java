package view;

import java.util.Scanner;

public class LoginView {
	public int telaDeLogin() {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.println("---------------");
		System.out.println("(1) Cliente");
		System.out.println("(2) Funcionario");
		System.out.print("Opcao: ");
		opcao = sc.nextInt();
		System.out.println("---------------");

		return opcao;
	}
	public void telaOpcaoInvalida() {
		System.out.println("Opcao Invalida!");
	}
}
