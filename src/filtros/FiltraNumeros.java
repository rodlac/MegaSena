package filtros;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.BancoMegaSena;
import models.Concurso;

public class FiltraNumeros {
	private BancoMegaSena sorteio;
	private OrdemFrequencia ordem;
	private FiltroNumeros filtroNumeros;
	private FiltroConcurso filtroConcurso;
	private Map<Integer, Integer> numeros;

	public FiltraNumeros() throws IOException {
		this.sorteio = BancoMegaSena.getInstance();
		this.numeros = new TreeMap<Integer, Integer>();
		this.ordem = OrdemFrequencia.DECRESCENTE;
		this.filtroNumeros = FiltroNumeros.TODOS;
		this.filtroConcurso = FiltroConcurso.TODOS;
	}

	public void setOrdem(OrdemFrequencia ordem) {
		this.ordem = ordem;
	}

	public void setFiltroNumeros(FiltroNumeros filtro) {
		this.filtroNumeros = filtro;
	}

	public void setFiltroConcurso(FiltroConcurso filtro) {
		this.filtroConcurso = filtro;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Map<Integer, Integer> getNumeros() {
		List list = new LinkedList(this.numeros.entrySet());
		final FiltraNumeros self = this;
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				if (self.ordem == OrdemFrequencia.DECRESCENTE) {
					return ((Comparable) ((Map.Entry) o2).getValue())
							.compareTo(((Map.Entry) o1).getValue());
				}
				return ((Comparable) ((Map.Entry) o1).getValue())
						.compareTo(((Map.Entry) o2).getValue());
			}
		});
		Map sortedMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

	public FiltraNumeros execute() {
		Iterator<Concurso> it = this.sorteio.iterator();
		Iterator<Integer> it2;

		while (it.hasNext()) {
			Concurso concurso = (Concurso) it.next();
			it2 = concurso.iterator();

			if (
					(this.filtroConcurso == FiltroConcurso.ACUMULADO && !concurso.isAcumulado()) || 
					(this.filtroConcurso == FiltroConcurso.NAOACUMULADO && concurso.isAcumulado())
				)
				continue;

			while (it2.hasNext()) {

				int numero = it2.next();

				if ((this.filtroNumeros == FiltroNumeros.TODOS)
						|| ((this.filtroNumeros == FiltroNumeros.PARES) && (numero % 2 == 0))
						|| ((this.filtroNumeros == FiltroNumeros.IMPARES) && (numero % 2 > 0))) {
					if (this.numeros.containsKey(Integer.valueOf(numero)))
						this.numeros.put(Integer.valueOf(numero), Integer
								.valueOf(((Integer) this.numeros.get(Integer
										.valueOf(numero))).intValue() + 1));
					else {
						this.numeros.put(Integer.valueOf(numero),
								Integer.valueOf(1));
					}
				}
			}
		}

		return this;
	}
}