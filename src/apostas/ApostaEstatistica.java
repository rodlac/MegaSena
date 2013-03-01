package apostas;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import filtros.FiltraNumeros;

public abstract class ApostaEstatistica extends Aposta {
	protected FiltraNumeros filtro;

	public ApostaEstatistica(String apostador, double valor) throws IOException {
		super(apostador, valor);
		this.filtro = new FiltraNumeros();
	}

	public Set<Integer> getNumeros() {
		obterNumeros();
		return super.getNumeros();
	}

	@SuppressWarnings("rawtypes")
	private void obterNumeros() {
		Map<Integer, Integer> numeros = this.filtro.execute().getNumeros();
		Iterator<Entry<Integer, Integer>> it = numeros.entrySet().iterator();
		while ((it.hasNext()) && (this.numeros.size() < 6))
			addNumero(((Integer) ((Map.Entry) it.next()).getKey()).intValue());
	}
}