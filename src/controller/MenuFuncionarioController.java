package controller;

import view.MenuFuncionarioView;

public class MenuFuncionarioController {
	private MenuFuncionarioView menuFuncionarioView;
	private CadastrarMesasController cadastrarMesasController;
	private ListarMesasDisponiveisController listarMesasDisponiveisController;
	private ListarTodasMesasController listarTodasMesasController;
	private ExcluirMesaController excluirMesaController;
	private LiberarMesaController liberarMesaController;

	public MenuFuncionarioController() {
		menuFuncionarioView = new MenuFuncionarioView();
		int opcao = 0;
		opcao = menuFuncionarioView.telaDeMenuFuncionario();

		switch (opcao) {
			case 1 -> cadastrarMesasController = new CadastrarMesasController();
			case 2 -> {
				listarMesasDisponiveisController = new ListarMesasDisponiveisController();
				listarMesasDisponiveisController.listarMesasDisponiveisController();
			}
			case 3 -> listarTodasMesasController = new ListarTodasMesasController();
			case 4 -> excluirMesaController = new ExcluirMesaController();
			case 5 -> liberarMesaController = new LiberarMesaController();
			default -> menuFuncionarioView.telaOpcaoInvalida();
		}

	}
}
