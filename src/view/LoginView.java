package view;

import java.util.Scanner;

public class LoginView {
	public int telaDeLogin() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n(1) Cliente");
		System.out.println("(2) Funcionario\n");
		System.out.print(" Opcao: ");
		
		return sc.nextInt();
	}
	public void telaOpcaoInvalida() {
		System.out.println("Opcao Invalida!");
	}
}
