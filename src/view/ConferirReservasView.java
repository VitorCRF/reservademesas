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
        System.out.println("Digite o RG: ");
        mesa.setRgCliente(s.next());
        return mesa;
    }

    public void telaListarReservas(ResultSet rs) {
        System.out.println("Nome | Rg | numero da mesa");

        try {
            while (rs.next()) {
                System.out.print(" " + rs.getString("nome") + " | ");
                System.out.print(" " + rs.getString("rg") + " | ");
                System.out.println(rs.getInt("numero") + " | ");
            }
        }
        catch (SQLException ex) {
        }
    }
}

