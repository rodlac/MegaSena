package system;

import apostas.Aposta;
import exceptions.ApostaNaoEncontradaException;

public abstract interface MegaSena {
	public abstract void cadastrarAposta(Aposta paramAposta);

	public abstract Aposta obterAposta(int paramInt)
			throws ApostaNaoEncontradaException;
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * system.MegaSena JD-Core Version: 0.6.2
 */