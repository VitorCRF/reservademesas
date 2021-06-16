package view;

import java.util.Scanner;

import model.Mesa;

public class ReservarMesaView {
	private Mesa mesa;

	public Mesa telaReservarMesa() {
		mesa = new Mesa();
		Scanner s = new Scanner(System.in);
		
		System.out.println("------------------");
		System.out.println("Reservar mesa");
		System.out.println("");

		System.out.print("Informe o email: ");
		mesa.setEmailCliente(s.next());

		s = new Scanner(System.in);
		System.out.print("Numero da mesa: ");
		mesa.setNumero(s.nextInt());
		System.out.println("------------------");

		return mesa;
	}
	public void telaMesaIndisponivel(){
		System.out.println("Essa mesa não está disponível!");
	}
}
