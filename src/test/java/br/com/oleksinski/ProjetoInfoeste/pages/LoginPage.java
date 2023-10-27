package br.com.oleksinski.ProjetoInfoeste.pages;

import org.openqa.selenium.WebDriver;

import br.com.oleksinski.ProjetoInfoeste.dsl.Dsl;

public class LoginPage {
	private WebDriver driver;
	private Dsl dsl;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		dsl = new Dsl(driver);
		
	}
	public void preencherEmail() {
		dsl.enviarCaracteres("//*[@id=\"ipt-email\"]", "gustavo@gmail.com");
	}
	public void preencherSenha(String text) {
		dsl.enviarCaracteres("//*[@id=\"ipt-senha\"]", text);
	}
	public void esperarPaginaLogin() {
		dsl.esperarCarregarPagina("Login");
	}
	public void clicarBotaoLogin() {
		dsl.clickBotao("//*[@id=\"root\"]/div[2]/div[3]/div[2]/div/button");
	}
}
