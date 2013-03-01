package apostas;

import java.io.IOException;

import filtros.OrdemFrequencia;

public class ApostaMenosFrequentes extends ApostaEstatistica {
	public ApostaMenosFrequentes(String apostador, double valor)
			throws IOException {
		super(apostador, valor);
		this.filtro.setOrdem(OrdemFrequencia.CRESCENTE);
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * apostas.ApostaMenosFrequentes JD-Core Version: 0.6.2
 */