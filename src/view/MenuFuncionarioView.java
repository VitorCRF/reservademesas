package view;

import java.util.Scanner;

public class MenuFuncionarioView {
	public int telaDeMenuFuncionario() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(1) Cadastrar mesa");
		System.out.println("(2) Listar  mesas Disponíveis");
		System.out.println("(3) Listar todas mesas");
		System.out.println("(4) Excluir mesa");

		return sc.nextInt();
	}
	public void telaOpcaoInvalida() {
		System.out.println("Opcao Invalida!");
	}
}
