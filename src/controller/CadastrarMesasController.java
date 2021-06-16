package controller;

import dao.MesaDAO;
import model.Mesa;
import view.CadastrarMesasView;

public class CadastrarMesasController {
    private CadastrarMesasView mesasView;
    private Mesa mesa;
    private MesaDAO mesaDAO;

    public CadastrarMesasController() {
        mesa = new Mesa();
        mesasView = new CadastrarMesasView();

        mesa = mesasView.telaCadastrarMesas();

        mesaDAO = new MesaDAO();
        mesaDAO.insereMesa(mesa);
    }
}
