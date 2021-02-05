package br.ce.wcaquino.page;

import org.openqa.selenium.By;

import br.ce.wcaquino.core.BasePage;
import br.ce.wcaquino.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("https://seubarriga.wcaquino.me");
	}
	
	public void setEmail(String email) {
		this.escrever("email", email);
	}
	
	public void setSenha(String senha) {
		this.escrever("senha", senha);
	}
	
	public void entrar() {
		this.clicarBotao(By.xpath("//button[.='Entrar']"));
	}
	
	public void logar(String email, String senha) {
		setEmail(email);
		setSenha(senha);
		entrar();
	}
}
