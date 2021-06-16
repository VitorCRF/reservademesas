package view;

import model.Mesa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConferirReservasView {
    private Mesa mesa;

    public Mesa telaReceberRg() {
        mesa = new Mesa();
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o email: ");
        mesa.setEmailCliente(s.next());
        return mesa;
    }

    public void telaListarReservas(ResultSet rs) {
    	
    	System.out.println("-----------------------------");
    	System.out.println("Conferir mesas reservadas");
    	System.out.println("");
        System.out.println("Nome | email | numero da mesa");

        try {
            while (rs.next()) {
                System.out.print(" " + rs.getString("nome") + " | ");
                System.out.print(" " + rs.getString("email") + " | ");
                System.out.println(rs.getInt("numero") + " | ");
            }
        }
        catch (SQLException ex) {
        }
        System.out.println("-----------------------------");
    }
}

