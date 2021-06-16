package view;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarMesasDisponiveisView {
    int mesa = 0;
    public Boolean telaListarMesasDisponiveis(ResultSet rs) {
    	
    	System.out.println("");
    	System.out.println("Mesas disponiveis: ");

        try {
            while (rs.next()) {
                System.out.print(" " + rs.getString("numero") + " | ");
                mesa++;
            }
        } catch (SQLException ex) {
        }
        System.out.println("");
        System.out.println("quantidade = " + mesa);

        if (mesa==0){
            System.out.println("Ops! Parece que não tem nenhuma mesa disponivel.");
            return false;
        }
        System.out.println("");
        return true;
    }

}
