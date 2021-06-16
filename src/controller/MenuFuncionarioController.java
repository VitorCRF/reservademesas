package controller;

import view.MenuFuncionarioView;

public class MenuFuncionarioController {
	private MenuFuncionarioView menuFuncionarioView;
	private CadastrarMesasController cadastrarMesasController;
	private ListarMesasDisponiveisController listarMesasDisponiveisController;
	private ListarTodasMesasController listarTodasMesasController;

	public MenuFuncionarioController() {
		menuFuncionarioView = new MenuFuncionarioView();
		int opcao = 0;
		opcao = menuFuncionarioView.telaDeMenuFuncionario();

		switch (opcao) {
			case 1 -> cadastrarMesasController = new CadastrarMesasController();
			case 2 -> listarMesasDisponiveisController = new ListarMesasDisponiveisController();
			case 3 -> listarTodasMesasController = new ListarTodasMesasController();
			default -> menuFuncionarioView.telaOpcaoInvalida();
		}

	}
}
