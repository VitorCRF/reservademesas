package controller;

import java.sql.ResultSet;
import dao.MesaDAO;
import view.ListarTodasMesasView;

public class ListarTodasMesasController {
    private MesaDAO mesaDAO;
    private ResultSet rs;
    private ListarTodasMesasView mesasView;

    public ListarTodasMesasController() {

        mesaDAO = new MesaDAO();
        rs = mesaDAO.listarTodasMesas();
        mesasView = new ListarTodasMesasView();
        mesasView.telaListarTodasMesasView(rs);
    }
}
