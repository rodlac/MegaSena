package apostas;

import java.util.Random;

public class ApostaSurpresinha extends Aposta {
	protected ApostaSurpresinha(String apostador, double valor) {
		super(apostador, valor);
		gerarNumeros();
	}

	public void gerarNumeros() {
		Random r = new Random();
		while (getNumeros().size() < 6)
			addNumero(r.nextInt(60) + 1);
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * apostas.ApostaSurpresinha JD-Core Version: 0.6.2
 */