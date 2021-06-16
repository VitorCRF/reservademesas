package controller;

import dao.FuncionarioDAO;
import model.Funcionario;
import view.CadastrarFuncionarioView;

public class CadastrarFuncionarioController {
	private CadastrarFuncionarioView cfv;
	private Funcionario funcionario;
	private FuncionarioDAO funcionarioDAO;

	public CadastrarFuncionarioController() {
		funcionario = new Funcionario();

		cfv = new CadastrarFuncionarioView();

		funcionario = cfv.telaCadastrarFuncionario();

		funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.insereFuncionario(funcionario);
	}
}
