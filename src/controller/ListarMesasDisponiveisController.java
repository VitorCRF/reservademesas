package controller;

import java.sql.ResultSet;
import dao.MesaDAO;
import view.ListarMesasDisponiveisView;

public class ListarMesasDisponiveisController {
    private MesaDAO MesaDAO;
    private ResultSet rs;
    private ListarMesasDisponiveisView lmv;

    public ListarMesasDisponiveisController() {
        
        MesaDAO = new MesaDAO();
        rs = MesaDAO.listarMesasDisponiveis();
        lmv = new ListarMesasDisponiveisView();
        lmv.telaListarMesasDisponiveis(rs);
    }
}
