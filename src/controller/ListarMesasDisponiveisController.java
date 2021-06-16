package controller;

import java.sql.ResultSet;
import dao.MesaDAO;
import view.ListarMesasDisponiveisView;

public class ListarMesasDisponiveisController {
    private MesaDAO mesaDAO;
    private ResultSet rs;
    private ListarMesasDisponiveisView lmv;

    public Boolean listarMesasDisponiveisController() {

        mesaDAO = new MesaDAO();
        rs = mesaDAO.listarMesasDisponiveis();
        lmv = new ListarMesasDisponiveisView();
        return lmv.telaListarMesasDisponiveis(rs);
    }
}
