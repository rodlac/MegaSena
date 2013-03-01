package apostas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TreeSet;

public abstract class Aposta {
	protected static int contador = 1;
	private final int codigo;
	protected String apostador;
	protected double valor;
	private final Calendar data;
	protected String telefone;
	protected String cor;
	protected int numeroDaSorte;
	protected String email;
	protected Set<Integer> numeros;

	protected Aposta(String apostador, double valor) {
		this.codigo = (contador++);
		this.apostador = apostador;
		this.valor = valor;
		this.data = GregorianCalendar.getInstance();
		this.numeros = new TreeSet<Integer>();
	}

	public String getApostador() {
		return this.apostador;
	}

	public void setApostador(String apostador) {
		this.apostador = apostador;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroDaSorte() {
		return this.numeroDaSorte;
	}

	public void setNumeroDaSorte(int numeroDaSorte) {
		this.numeroDaSorte = numeroDaSorte;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public Calendar getData() {
		return this.data;
	}

	public Set<Integer> getNumeros() {
		return this.numeros;
	}

	public void addNumero(int n) {
		this.numeros.add(Integer.valueOf(n));
	}

	public String toString() {
		return "Aposta [codigo="
				+ this.codigo
				+ ", "
				+ (this.apostador != null ? "apostador=" + this.apostador
						+ ", " : "")
				+ "valor="
				+ this.valor
				+ ", "
				+ (this.data != null ? "data=" + this.data + ", " : "")
				+ (this.telefone != null ? "telefone=" + this.telefone + ", "
						: "")
				+ (this.cor != null ? "cor=" + this.cor + ", " : "")
				+ "numeroDaSorte=" + this.numeroDaSorte + ", "
				+ (this.email != null ? "email=" + this.email + ", " : "")
				+ (this.numeros != null ? "numeros=" + this.numeros : "") + "]";
	}
}