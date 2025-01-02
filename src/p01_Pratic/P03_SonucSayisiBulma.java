package p01_Pratic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03_SonucSayisiBulma {


    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1-https://babayigit.net/test/index.html adresine gidin
        driver.get("https://babayigit.net/test/index.html");

        //2-Arama kutusuna 12 Kızgın yazıp saerch butonuna tıklayın
        WebElement aramaKutusu = driver.findElement(By.id("search"));
        aramaKutusu.sendKeys("12 Kızgın" + Keys.ENTER);

        Thread.sleep(2000);

        //3-Arama sonuçlarında sonuç sayısını kaydedip yazdırın

        WebElement sonucYazisi = driver.findElement(By.tagName("a"));
        System.out.println(sonucYazisi.getText());


        Thread.sleep(2000);
        driver.quit();


    }
}

