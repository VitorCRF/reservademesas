package controller;

import dao.ClienteDAO;
import dao.MesaDAO;
import model.Cliente;
import model.Mesa;
import view.CadastrarClienteView;
import view.ExcluirMesaView;
import view.ListarTodasMesasView;

import java.sql.ResultSet;

public class ExcluirMesaController {
    private dao.MesaDAO mesaDAO;
    private ResultSet rs;
    private ExcluirMesaView mesasView;
    private Mesa mesa;

    public ExcluirMesaController() {
        mesa = new Mesa();

        mesasView = new ExcluirMesaView();

        mesa = mesasView.telaExcluirMesas();

        mesaDAO = new MesaDAO();
        mesaDAO.excluirMesas(mesa);
    }

}
