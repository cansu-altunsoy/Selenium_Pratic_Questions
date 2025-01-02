package p01_Pratic;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_Xpath {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1- https://www.testotomasyonu.com/ sayfasına gidin.
        driver.get(" https://www.testotomasyonu.com/");

        // 2- Arama kutusuna “dress” yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("dress" + Keys.ENTER);

        // 3- Görüntülenen sonuçların sayısını yazdırın

        WebElement sonucSayisi = driver.findElement(By.xpath("//*[@class='product-count-text']"));

        System.out.println(sonucSayisi.getText());


        // 4- Listeden ilk urunun resmine tıklayın.

        WebElement ilkUrunTiklama = driver.findElement(By.xpath("(//img[@class='lazy'])[1]"));

        ilkUrunTiklama.click();


        // 5- Urun detayinda dress kelimesi geçtiğini test edin.

        WebElement detayKelimeArama = driver.findElement(By.xpath("//div[@class='product-short-desc  my-2']"));
        // detayKelimeArama.getText();

        String expectedkelime = "dress";
        String actuaclKelime = detayKelimeArama.getText();

        if (actuaclKelime.contains(expectedkelime)) {
            System.out.println("Dress kelime testi PASSED");

        } else System.out.println("Dress kelime testi FAILED");


        Thread.sleep(3000);
        driver.quit();


    }
}
