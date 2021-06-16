package view;

import model.Mesa;

import java.sql.ResultSet;
import java.util.Scanner;

public class ExcluirMesaView {

    public Mesa telaExcluirMesas() {
        Mesa mesa = new Mesa();
        Scanner s = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Exclusão de mesas");
        System.out.print("Digite o numero da mesa: ");
        mesa.setNumero(s.nextInt());
        System.out.println("");

        return mesa;
    }
}
