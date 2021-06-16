package view;

import model.Cliente;
import model.Mesa;

import java.util.Scanner;

public class CadastrarMesasView {
    public Mesa telaCadastrarMesas() {
        Mesa mesa = new Mesa();
        Scanner s = new Scanner(System.in);
        
        System.out.println("----------------------------");
        System.out.println("Cadastro de nova mesa");
        System.out.print("Digite o numero: ");
        mesa.setNumero(s.nextInt());
        System.out.println("Mesa registrada com sucesso!");
        System.out.println("----------------------------");

        return mesa;
    }
}
