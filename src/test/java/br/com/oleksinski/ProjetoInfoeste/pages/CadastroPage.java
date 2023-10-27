package br.com.oleksinski.ProjetoInfoeste.pages;

import org.openqa.selenium.WebDriver;

import br.com.oleksinski.ProjetoInfoeste.dsl.Dsl;

public class CadastroPage {

	private WebDriver driver;
	private Dsl dsl;
	
	public CadastroPage(WebDriver driver) {
		this.driver = driver;
		dsl = new Dsl(driver);
	}
	public void clickBotaoCadastro() {
		dsl.clickBotao("//*[@id=\"root\"]/div[2]/div/div[2]/button");
	}
	public void esperarCarregarPaginaCadastro() {
		dsl.esperarCarregarPagina("cadastro");
	}
	public void preencherNome(String text) {
		dsl.enviarCaracteres("//*[@id=\"ipt-nome\"]", text);
	}
	public void preencherCpf(String text) {
		dsl.preencherCpf();
	}
	public void preencherEmail(String text) {
		dsl.enviarCaracteres("//*[@id=\"ipt-email\"]", text);
	}
	public void clicarBotaoProx(String text) {
		dsl.clickBotao(text);
	}
	public void preencherDataNsc() {
		dsl.preencherDataNsc();;
	}
	public void preencherSenha(String xpath, String text) {
		dsl.enviarCaracteres(xpath, text);
	}
	public void escolherGenero() throws InterruptedException {
		dsl.clickBotao("//*[@id=\"demo-simple-select\"]");
		Thread.sleep(1000);
		dsl.clickBotao("//*[@id=\"menu-\"]/div[3]/ul/li[2]");
	}
	public void preencherCep() {
		dsl.preencherCep();
	}
	public void preencherNum() {
		dsl.preencherNum();
	}
}
