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

		clienteController = new CadastrarClienteController();

		mesasController = new ListarMesasDisponiveisController();

		mesaView = new ReservarMesaView();
		mesa = mesaView.telaReservarMesa();
		mesaDAO = new MesaDAO();
		mesaDAO.atualizaMesa(mesa);


	}
}
