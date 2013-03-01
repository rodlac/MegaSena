package system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import apostas.Aposta;
import exceptions.ApostaNaoEncontradaException;

public class CadastroMegaSena implements MegaSena {
	private static CadastroMegaSena instance = null;
	private List<Aposta> apostas;

	public static CadastroMegaSena getInstance() {
		if (instance == null)
			instance = new CadastroMegaSena();
		return instance;
	}

	private CadastroMegaSena() {
		this.apostas = new ArrayList<Aposta>();
	}

	public void cadastrarAposta(Aposta aposta) {
		this.apostas.add(aposta);
	}

	public Aposta obterAposta(int codigo) throws ApostaNaoEncontradaException {
		for (Aposta aposta : this.apostas) {
			if (aposta.getCodigo() == codigo)
				return aposta;
		}
		throw new ApostaNaoEncontradaException();
	}

	public List<Aposta> getApostas() {
		return this.apostas;
	}

	public Iterator<Aposta> iterator() {
		return this.apostas.iterator();
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * system.CadastroMegaSena JD-Core Version: 0.6.2
 */