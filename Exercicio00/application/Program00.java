package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contrato;
import entities.Parcelas;
import payment.service.Pagamento;
import payment.service.Paypal;

public class Program00 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate data = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato:");
		double valor = sc.nextDouble();
		Contrato contrato = new Contrato(numero, data, valor);
		
		System.out.println("Entre com o numero de parcelas:  ");
		int n = sc.nextInt();
		
		Pagamento service = new Pagamento(new Paypal());
		service.processContrato(contrato, n);
		
		for (Parcelas parcelas : contrato.getParcelas()) {
			System.out.println(parcelas);
		}
		
		
		
		sc.close();

	}

}
