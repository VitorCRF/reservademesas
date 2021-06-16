package controller;

import java.sql.ResultSet;
import dao.MesaDAO;
import view.ConferirReservasView;

public class ConferirReservasController {
    private MesaDAO mesaDAO;
    private ResultSet rs;
    private ConferirReservasView reservasView;

    public ConferirReservasController() {

        reservasView = new ConferirReservasView();
        mesaDAO = new MesaDAO();

        rs = mesaDAO.conferirReservas(reservasView.telaReceberRg());
        reservasView.telaListarReservas(rs);
    }
}
