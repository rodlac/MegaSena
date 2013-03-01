package apostas;

import exceptions.TipoApostaInvalidoException;
import java.io.IOException;

public class ApostaFactory {
	private static ApostaFactory instance = null;

	public static ApostaFactory getInstance() {
		if (instance == null)
			instance = new ApostaFactory();
		return instance;
	}

	public Aposta criar(String apostador, double valor, TipoAposta tipo)
			throws TipoApostaInvalidoException, IOException {
		if (tipo == TipoAposta.NORMAL)
			return new ApostaNormal(apostador, valor);
		if (tipo == TipoAposta.SURPRESINHA)
			return new ApostaSurpresinha(apostador, valor);
		if (tipo == TipoAposta.PARESFREQUENTES)
			return new ApostaParesFrequentes(apostador, valor);
		if (tipo == TipoAposta.MENOSFREQUENTES)
			return new ApostaMenosFrequentes(apostador, valor);
		if (tipo == TipoAposta.FREQUENTESACUMULADOS)
			return new ApostaFrequentesAcumulados(apostador, valor);
		if (tipo == TipoAposta.IMPARESFREQUENTES)
			return new ApostaImparesFrequentes(apostador, valor);
		if (tipo == TipoAposta.MENOSFREQUENTESNAOACUMULADOS)
			return new ApostaMenosFrequentesNaoAcumulados(apostador, valor);
		throw new TipoApostaInvalidoException();
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * apostas.ApostaFactory JD-Core Version: 0.6.2
 */