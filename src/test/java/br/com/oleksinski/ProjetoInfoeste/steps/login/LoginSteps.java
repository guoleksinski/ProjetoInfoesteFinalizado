package br.com.oleksinski.ProjetoInfoeste.steps.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.oleksinski.ProjetoInfoeste.pages.HomePage;
import br.com.oleksinski.ProjetoInfoeste.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {

	private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	@Before
	public void initialize() {
		driver = new ChromeDriver();
		driver.get("http://localhost:3000");
		homePage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		
	}
	@After
	public void close() {
		driver.quit();
	}
	
	
	@Given("clicamos no botão login")
	public void clicamos_no_botão_login() {
		homePage.esperarCarregarPaginaHome();
	    homePage.clicarBotaoLogin();
	}
	@When("preenchermos os campos {string}")
	public void preenchermos_os_campos(String pass) throws InterruptedException {
	   loginPage.esperarPaginaLogin();
	   loginPage.preencherEmail();
	   loginPage.preencherSenha(pass);
	}
	@When("clicar no botao login")
	public void clicar_no_botao_login() {
	    loginPage.clicarBotaoLogin();
	}



}
