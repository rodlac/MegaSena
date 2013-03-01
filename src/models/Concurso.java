package models;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Concurso {
	private final int codigo;
	private boolean acumulado;
	private Set<Integer> numeros;

	public Concurso(int c) {
		this.codigo = c;
		setAcumulado(true);
		this.numeros = new TreeSet<Integer>();
	}

	public Iterator<Integer> iterator() {
		return this.numeros.iterator();
	}

	public int getCodigo() {
		return this.codigo;
	}

	public boolean isAcumulado() {
		return this.acumulado;
	}

	public void setAcumulado(boolean acumulado) {
		this.acumulado = acumulado;
	}

	public Set<Integer> getNumeros() {
		return this.numeros;
	}

	public void addNumero(int n) {
		this.numeros.add(Integer.valueOf(n));
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * models.Concurso JD-Core Version: 0.6.2
 */