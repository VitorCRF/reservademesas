package view;

import model.Mesa;

import java.util.Scanner;

public class LiberarMesaView extends ExcluirMesaView {
    public Mesa telaLiberarMesa() {
        Mesa mesa = new Mesa();
        Scanner s = new Scanner(System.in);

        System.out.println("Liberação de mesas");
        System.out.print("Digite o numero da mesa: ");
        mesa.setNumero(s.nextInt());

        return mesa;
    }
}
