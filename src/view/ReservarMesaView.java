package view;

import java.util.Scanner;

import model.Mesa;

public class ReservarMesaView {
	private Mesa mesa;

	public Mesa telaReservarMesa() {
		mesa = new Mesa();
		Scanner s = new Scanner(System.in);

		System.out.println("Confirme o Rg: ");
		mesa.setRgCliente(s.next());

		s = new Scanner(System.in);
		System.out.println("Numero: ");
		mesa.setNumero(s.nextInt());

		return mesa;
	}
	public void telaMesaIndisponivel(){
		System.out.println("Essa mesa não está disponível!");
	}
}
