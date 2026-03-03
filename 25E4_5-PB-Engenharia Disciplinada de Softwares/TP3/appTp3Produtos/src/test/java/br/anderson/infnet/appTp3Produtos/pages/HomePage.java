package br.anderson.infnet.appTp3Produtos.pages;

import br.anderson.infnet.appTp3Produtos.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class HomePage extends BasePage<HomePage> {
    private final static String URL = "http://localhost:8080/";
    private final By linkProduto = By.id("linkProduto");


	public HomePage(WebDriver driver, Duration duration) {
        super(driver, duration, URL);
    }

    public ProdutosPage navegarParaListaDeProdutos() {
        click(linkProduto);
        return new ProdutosPage(driver, duration);
    }



    /*public HomePage alterarParaIframe() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
        return this;
    }*/

//    @Test
//    @DisplayName("Testa Produto, campos;")
//    public void testa()  {
//        driver.get(URL);
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        //Assertions.assertEquals(1,1);
//    }


}
