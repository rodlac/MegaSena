package system;

public abstract class MegaSenaDecorator implements MegaSena {
	protected MegaSena megaSena;

	protected MegaSenaDecorator() {
		this.megaSena = CadastroMegaSena.getInstance();
	}

	public MegaSena getMegaSena() {
		return this.megaSena;
	}
}

/*
 * Location: C:\xampp\tomcat\MegaSena\WEB-INF\classes\ Qualified Name:
 * system.MegaSenaDecorator JD-Core Version: 0.6.2
 */