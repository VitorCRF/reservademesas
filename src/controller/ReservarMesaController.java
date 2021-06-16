package controller;

import dao.MesaDAO;
import model.Mesa;
import view.ReservarMesaView;

public class ReservarMesaController {


	private ListarMesasDisponiveisController mesasController;
	private CadastrarClienteController clienteController;
	private ReservarMesaView mesaView;
	private Mesa mesa;
	private MesaDAO mesaDAO;

	public ReservarMesaController() {
		mesa = new Mesa();

		mesasController = new ListarMesasDisponiveisController();


		if (mesasController.listarMesasDisponiveisController()){
			mesaView = new ReservarMesaView();
			mesa = mesaView.telaReservarMesa();
			mesaDAO = new MesaDAO();

			if(mesaDAO.conferirMesa(mesa) != null){
				mesaDAO.atualizaMesa(mesa);
				clienteController = new CadastrarClienteController();
			}
			else
				mesaView.telaMesaIndisponivel();
		}
	}
}
