package apostas;

import java.io.IOException;

import filtros.FiltroNumeros;

public class ApostaParesFrequentes extends ApostaEstatistica {
	public ApostaParesFrequentes(String apostador, double valor)
			throws IOException {
		super(apostador, valor);
		this.filtro.setFiltroNumeros(FiltroNumeros.PARES);
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * apostas.ApostaParesFrequentes JD-Core Version: 0.6.2
 */