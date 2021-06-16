package controller;

import java.sql.ResultSet;
import dao.MesaDAO;
import view.ListarTodasMesasView;

public class ListarTodasMesasController {
    private MesaDAO MesaDAO;
    private ResultSet rs;
    private ListarTodasMesasView mesasView;

    public ListarTodasMesasController() {

        MesaDAO = new MesaDAO();
        rs = MesaDAO.listarTodasMesas();
        mesasView = new ListarTodasMesasView();
        mesasView.telaListarTodasMesasView(rs);
    }
}
