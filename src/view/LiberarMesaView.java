package view;

import model.Mesa;

import java.util.Scanner;

public class LiberarMesaView extends ExcluirMesaView {
    public Mesa telaLiberarMesa() {
        Mesa mesa = new Mesa();
        Scanner s = new Scanner(System.in);
        
        System.out.println("--------------------------");
        System.out.println("Liberação de mesas");
        System.out.print("Digite o numero da mesa: ");
        mesa.setNumero(s.nextInt());
        System.out.println("Mesa liberada com sucesso!");
        System.out.println("--------------------------");

        return mesa;
    }
}
