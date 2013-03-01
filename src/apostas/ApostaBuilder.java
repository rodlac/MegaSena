package apostas;

import java.io.IOException;

import exceptions.ApostaInvalidaException;
import exceptions.TipoApostaInvalidoException;

public class ApostaBuilder extends BuilderAposta {
	public ApostaBuilder(String apostador, double valor, TipoAposta tipo)
			throws TipoApostaInvalidoException, IOException {
		this.aposta = ApostaFactory.getInstance().criar(apostador, valor, tipo);
	}

	public ApostaBuilder telefone(String telefone) {
		this.aposta.setTelefone(telefone);
		return this;
	}

	public ApostaBuilder cor(String cor) {
		this.aposta.setCor(cor);
		return this;
	}

	public ApostaBuilder numeroDaSorte(int numero) {
		this.aposta.setNumeroDaSorte(numero);
		return this;
	}

	public ApostaBuilder email(String email) {
		this.aposta.setEmail(email);
		return this;
	}

	public ApostaBuilder addNumero(int numero) {
		this.aposta.addNumero(numero);
		return this;
	}

	public Aposta create() throws ApostaInvalidaException {
		if (this.aposta.getNumeros().size() < 6)
			throw new ApostaInvalidaException("Números insuficientes!");
		return this.aposta;
	}
}