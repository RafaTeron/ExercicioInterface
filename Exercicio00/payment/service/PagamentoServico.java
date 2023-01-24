package payment.service;

public interface PagamentoServico {
	
	Double taxPagamento(double quantidade);
	Double juros(double quantidade, int meses);

}
