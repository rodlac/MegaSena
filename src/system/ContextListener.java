package system;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import apostas.Aposta;
import apostas.ApostaBuilder;
import apostas.TipoAposta;
import exceptions.ApostaInvalidaException;
import exceptions.TipoApostaInvalidoException;

@WebListener
public class ContextListener implements ServletContextListener {
	@SuppressWarnings("unused")
	public void contextInitialized(ServletContextEvent arg0) {
		CadastroMegaSena cadastro = CadastroMegaSena.getInstance();
		try {
			Aposta apostaNormal = new ApostaBuilder("Aposta Normal", 2.0D,
					TipoAposta.NORMAL).addNumero(52).addNumero(16)
					.addNumero(21).addNumero(26).addNumero(35).addNumero(5)
					.create();
			cadastro.cadastrarAposta(apostaNormal);

			Aposta apostaSurpresinha = new ApostaBuilder("Surpresinha", 2.0D,
					TipoAposta.SURPRESINHA).create();
			cadastro.cadastrarAposta(apostaSurpresinha);

			Aposta apostaNaoCadastrada = new ApostaBuilder(
					"Aposta não cadastrada", 2.0D, TipoAposta.SURPRESINHA)
					.create();

			Aposta menosFrequentes = new ApostaBuilder("Menos frequentes",
					5.0D, TipoAposta.MENOSFREQUENTES).create();
			cadastro.cadastrarAposta(menosFrequentes);

			Aposta imparesFrequentes = new ApostaBuilder(
					"Ímpares mais frequentes", 2.0D,
					TipoAposta.IMPARESFREQUENTES).create();
			cadastro.cadastrarAposta(imparesFrequentes);

			Aposta paresFrequentes = new ApostaBuilder("Pares mais frequentes",
					10.0D, TipoAposta.PARESFREQUENTES).create();
			cadastro.cadastrarAposta(paresFrequentes);

			Aposta frequentesAcumulados = new ApostaBuilder(
					"Mais frequentes em sorteios acumulados", 3.0D,
					TipoAposta.FREQUENTESACUMULADOS).create();
			cadastro.cadastrarAposta(frequentesAcumulados);

			Aposta menosFrequentesNaoAcumulados = new ApostaBuilder(
					"Menos frequentes em sorteios não acumulados", 4.0D,
					TipoAposta.MENOSFREQUENTESNAOACUMULADOS).create();
			cadastro.cadastrarAposta(menosFrequentesNaoAcumulados);
		} catch (ApostaInvalidaException e1) {
			e1.printStackTrace();
		} catch (TipoApostaInvalidoException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		ServletContext sc = arg0.getServletContext();
		sc.setAttribute("CadastroMegaSena", cadastro);
	}

	public void contextDestroyed(ServletContextEvent arg0) {
	}
}