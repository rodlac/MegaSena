package apostas;

import java.io.IOException;

import filtros.FiltroConcurso;

public class ApostaFrequentesAcumulados extends ApostaEstatistica {
	public ApostaFrequentesAcumulados(String apostador, double valor)
			throws IOException {
		super(apostador, valor);
		this.filtro.setFiltroConcurso(FiltroConcurso.ACUMULADO);
	}
}
