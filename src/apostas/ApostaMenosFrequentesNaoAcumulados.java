package apostas;

import java.io.IOException;

import filtros.FiltroConcurso;
import filtros.OrdemFrequencia;

public class ApostaMenosFrequentesNaoAcumulados extends ApostaEstatistica {
	public ApostaMenosFrequentesNaoAcumulados(String apostador, double valor)
			throws IOException {
		super(apostador, valor);
		this.filtro.setFiltroConcurso(FiltroConcurso.NAOACUMULADO);
		this.filtro.setOrdem(OrdemFrequencia.CRESCENTE);
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * apostas.ApostaMenosFrequentesNaoAcumulados JD-Core Version: 0.6.2
 */