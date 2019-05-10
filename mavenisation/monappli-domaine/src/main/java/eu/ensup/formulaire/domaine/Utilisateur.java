package eu.ensup.formulaire.domaine;

public class Utilisateur {

	public String login;
	public String pwd;
	public Utilisateur(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Utilsateur [login=" + login + ", pwd=" + pwd + "]";
	}
	
	
}
