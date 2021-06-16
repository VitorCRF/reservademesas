package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarTodasMesasView {
    public void telaListarTodasMesasView(ResultSet rs) {
    	System.out.println("--------------------------------------------");
        System.out.println("Essas são todas as mesas do estabelecimento: ");
        System.out.println("Numero");

        try {
            while (rs.next()) {
                System.out.print(" " + rs.getString("numero") + " | ");
            }
        } catch (SQLException ex) {
        }
        System.out.println("");
        System.out.println("--------------------------------------------");
    }
}



