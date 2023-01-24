package payment.service;

public class Paypal implements PagamentoServico {

	@Override
	public Double juros(double quantidade, int meses) {
		return quantidade * 0.01 * meses;
	}

	@Override
	public Double taxPagamento(double quantidade) {
		return quantidade * 0.02;
	}

}
