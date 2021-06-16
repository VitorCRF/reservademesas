package view;

import java.util.Scanner;

public class MenuFuncionarioView {
	public int telaDeMenuFuncionario() {
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		System.out.println("Menu de funcionario");
		System.out.println("");
		
		System.out.println("(1) Cadastrar mesa");
		System.out.println("(2) Listar  mesas Disponíveis");
		System.out.println("(3) Listar todas mesas");
		System.out.println("(4) Excluir mesa");
		System.out.println("(5) Liberar mesa");
		System.out.print("Opcao: ");
		opcao = sc.nextInt();
		
		System.out.println("");
		System.out.println("-------------------");

		return opcao;
	}
	public void telaOpcaoInvalida() {
		System.out.println("Opcao Invalida!");
	}
}
