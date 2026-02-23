package br.anderson.infnet.appTp3Produtos.pages;

import br.anderson.infnet.appTp3Produtos.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;

@SpringBootTest
public class HomePage extends BasePage<HomePage> {
    private final static String URL = "http://localhost:8080";
    private final By primeiroProduto = By.cssSelector("a.product-thumbnail");
    private final By iframe = By.tagName("iframe");


	public HomePage(WebDriver driver, Duration duration) {
        super(driver, duration, URL);
    }

    /*public HomePage alterarParaIframe() {
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
        return this;
    }*/

    @Test
    @DisplayName("Testa Produto, campos;")
    public void testa()  {
        driver.get(URL);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Assertions.assertEquals(1,1);
    }


}
