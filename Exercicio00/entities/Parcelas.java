package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Parcelas {
	
	private LocalDate vencimento;
	private Double quantidade;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Parcelas(LocalDate vencimento, Double quantidade) {
		this.vencimento = vencimento;
		this.quantidade = quantidade;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
	

	@Override
	public String toString() {
		return vencimento.format(fmt) + " - " + String.format("%.2f", quantidade);
 	}
	
	

}
