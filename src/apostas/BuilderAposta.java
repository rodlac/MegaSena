package apostas;

import exceptions.ApostaInvalidaException;

public abstract class BuilderAposta {
	protected Aposta aposta;

	protected abstract Aposta create() throws ApostaInvalidaException;
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * apostas.BuilderAposta JD-Core Version: 0.6.2
 */