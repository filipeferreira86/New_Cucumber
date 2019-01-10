package cucumber_test;

import org.junit.Assert;
import org.junit.
// Selenium amb
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

// Gherkin
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;

// Classe principal

public class TesteCrm {
	
	WebDriver driver = (WebDriver) new FirefoxDriver();
	
	@Dado("^que existam formas de pagamento cadastradas$")
	public void que_existam_formas_de_pagamento_cadastradas(){
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Dado("^estou logado no CRM$")
	public void estou_logado_no_CRM(){
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:/Users/Filipe/Documents/webdriver/chromedriver.exe");
//		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://189.45.198.123:8092/sisc_brandili/servlet/hsiscobra");
		WebElement login = driver.findElement(By.id("_USUCOD"));
		WebElement pw = driver.findElement(By.id("_USUSEN"));
		WebElement btnLogin = driver.findElement(By.id("BUTTON1"));
		WebElement btnConf = driver.findElement(By.name("BUTTON3"));
		login.sendKeys("9999");
		pw.sendKeys("senha");
		btnLogin.click();
		btnConf.click();
		
	}

	@Dado("^estou na tela de \"([^\"]*)\"$")
	public void estou_na_tela_de(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement menu = driver.findElement(By.linkText("hpesquisa?ln9nQmHTRK882kMrPnEovw=="));
	    menu.click();
	    WebElement nomeCl = driver.findElement(By.id("_DEVEDOR_NOME"));
	    WebElement pesq = driver.findElement(By.name("BTN_PESQUISAR"));
	    nomeCl.sendKeys("%");
	    pesq.click();
	    WebElement item = driver.findElement(By.name("span__DEVCOD_0001"));
	    item.click();
	    
	}

	@Quando("^eu acessar selecionar um item no Grid$")
	public void eu_acessar_selecionar_um_item_no_Grid(){
	    // Write code here that turns the phrase above into concrete actions
	    WebElement item1 = driver.findElement(By.name("_OPCAO_0002"));
	    if (item1.isSelected()!=true) {
	    	item1.click();
	    }
	}

	@Quando("^clicar no bot?o \"([^\"]*)\"$")
	public void clicar_no_bot_o(String arg1){
	    // Write code here that turns the phrase above into concrete actions
	    WebElement btnPesq = driver.findElement(By.name(arg1));
	    btnPesq.click();
	}
	
	@Quando("^clicar no bot?o \"([^\"]*)\"$")
	public void clicar_no_bot_o2(String arg1){
	    // Write code here that turns the phrase above into concrete actions
	    WebElement btnAcordo = driver.findElement(By.name(arg1));
	    btnAcordo.click();
	}

	@Quando("^clicar no BOX \"([^\"]*)\"$")
	public void clicar_no_BOX(String arg1){
	    // Write code here that turns the phrase above into concrete actions
	    WebElement comboPag = driver.findElement(By.name(arg1));
	    comboPag.click();
	}

	@Entao("^nao deve lista formas de pagamento conforme cadastrado na tela de \"([^\"]*)\" #\\(RQF(\\d+)\\)$")
	public void nao_deve_lista_formas_de_pagamento_conforme_cadastrado_na_tela_de_RQF(String arg1, int arg2){
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(true);
	}


	
}
