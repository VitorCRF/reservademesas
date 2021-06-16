package controller;

import model.Cliente;
import view.CadastrarClienteView;
import view.CadastrarFuncionarioView;
import dao.ClienteDAO;

public class CadastrarClienteController {
	private CadastrarClienteView ccv;
	private Cliente cliente;
	private ClienteDAO clienteDAO;

	public CadastrarClienteController() {
		cliente = new Cliente();

		ccv = new CadastrarClienteView();

		cliente = ccv.telaCadastrarCliente();

		clienteDAO = new ClienteDAO();
		clienteDAO.insereCliente(cliente);
	}
}
