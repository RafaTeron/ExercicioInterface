package payment.service;

import java.time.LocalDate;

import entities.Contrato;
import entities.Parcelas;

public class Pagamento {
	
	private PagamentoServico pagamentoservico;

	public Pagamento(PagamentoServico pagamentoservico) {
		this.pagamentoservico = pagamentoservico;
	}
	
	public void processContrato(Contrato contrato, int meses) {
		double cotaBasica = contrato.getValor() / meses;
		for(int i=1; i<=meses; i++) {
			LocalDate vencimento = contrato.getData().plusMonths(i);
			double juros = pagamentoservico.juros(cotaBasica, i);
			double taxa = pagamentoservico.taxPagamento(cotaBasica + juros);
			double cota = cotaBasica + juros + taxa;
			contrato.getParcelas().add(new Parcelas(vencimento, cota));
			
		}
	}

}
