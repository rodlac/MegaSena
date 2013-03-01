package apostas;

import java.io.IOException;

import filtros.FiltroNumeros;

public class ApostaImparesFrequentes extends ApostaEstatistica {
	public ApostaImparesFrequentes(String apostador, double valor)
			throws IOException {
		super(apostador, valor);
		this.filtro.setFiltroNumeros(FiltroNumeros.IMPARES);
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * apostas.ApostaImparesFrequentes JD-Core Version: 0.6.2
 */