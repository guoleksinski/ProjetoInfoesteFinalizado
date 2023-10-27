package br.com.oleksinski.ProjetoInfoeste.pages;

import org.openqa.selenium.WebDriver;

import br.com.oleksinski.ProjetoInfoeste.dsl.Dsl;

public class HomePage {

	private WebDriver driver;
	private Dsl dsl;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		dsl = new Dsl(driver);
		
	}
	
	public void clicarBotaoLogin() {
		dsl.clickBotao("//*[@id=\"root\"]/div[2]/div/div[2]/a");
	}
	public void esperarCarregarPaginaHome() {
		dsl.esperarCarregarPagina("localhost");
	}
	public void clickBotaoCadastro() {
		dsl.clickBotao("//*[@id=\"root\"]/div[2]/div/div[2]/button");
	}
	public void clicoBotaoProf() {
		dsl.clickBotao("/html/body/div[2]/div[3]/div[2]/button[1]");
	}
}
