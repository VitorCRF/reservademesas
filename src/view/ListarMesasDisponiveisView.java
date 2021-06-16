package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarMesasDisponiveisView {
    public void telaListarMesasDisponiveis(ResultSet rs) {
        System.out.println("Essas são as mesas disponiveis: ");
        System.out.println("Numero");

        try {
            while (rs.next()) {
                System.out.print(" " + rs.getString("numero") + " | ");
            }
        } catch (SQLException ex) {
        }
    }

}
