package view;

import java.util.Scanner;

public class MenuFuncionarioView {
	public int telaDeMenuFuncionario() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n(1) Cadastrar mesa");
		System.out.println("(2) Listar mesas");

		return sc.nextInt();
	}
	public void telaOpcaoInvalida() {
		System.out.println("Opcao Invalida!");
	}
}
