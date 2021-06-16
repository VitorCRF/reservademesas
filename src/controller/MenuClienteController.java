package controller;

import view.LoginView;
import view.MenuClienteView;

public class MenuClienteController {
	private MenuClienteView menuClienteView;
	private ReservarMesaController rmc;
	private ConferirReservasController crc;

	public MenuClienteController() {
		menuClienteView = new MenuClienteView();
		int opcao = 0;
		opcao = menuClienteView.telaDeMenuCliente();

		switch (opcao) {
			case 1 -> rmc = new ReservarMesaController();
			case 2 -> crc = new ConferirReservasController();
			default -> menuClienteView.telaOpcaoInvalida();
		}

	}
}
