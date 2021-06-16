package controller;

import dao.MesaDAO;
import model.Mesa;
import view.ExcluirMesaView;
import view.LiberarMesaView;

import java.sql.ResultSet;

public class LiberarMesaController {
    private dao.MesaDAO mesaDAO;
    private ResultSet rs;
    private LiberarMesaView mesasView;
    private Mesa mesa;

    public LiberarMesaController() {
        mesa = new Mesa();

        mesasView = new LiberarMesaView();

        mesa = mesasView.telaLiberarMesa();

        mesaDAO = new MesaDAO();
        mesaDAO.liberarMesas(mesa);
    }
}
