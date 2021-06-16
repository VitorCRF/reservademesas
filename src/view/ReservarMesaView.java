package view;

import java.util.Scanner;

import model.Mesa;

public class ReservarMesaView {
	private Mesa mesa;

	public Mesa telaReservarMesa() {
		mesa = new Mesa();
		Scanner s = new Scanner(System.in);

		System.out.println("\n Confirme o Rg: ");
		mesa.setRgCliente(s.next());

		s = new Scanner(System.in);
		System.out.println("\n Numero: ");
		mesa.setNumero(s.nextInt());

		mesa.setDisponivel(false);
		return mesa;
	}
}
