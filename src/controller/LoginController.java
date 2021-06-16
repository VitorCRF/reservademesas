package controller;

import view.LoginView;

public class LoginController {
	private LoginView loginView;
	private MenuClienteController mcc;
	private MenuFuncionarioController mfc;

	public LoginController() {
		loginView = new LoginView();
		int opcao = 0;
		opcao = loginView.telaDeLogin();

		switch (opcao) {
			case 1 -> mcc = new MenuClienteController();
			case 2 -> mfc = new MenuFuncionarioController();
			default -> loginView.telaOpcaoInvalida();
		}
	}
}
