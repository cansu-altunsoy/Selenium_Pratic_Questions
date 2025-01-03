package p02_Pratic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01_seleniumTest {

    public static void main(String[] args) throws InterruptedException {

            /*
      1-Driver oluşturalim
      2-Java class'imiza chromedriver.exe i tanitalim
      3-Driver'in tum ekranı kaplamasini saglayalim
      4-Driverla sayfanın yuklenmesini 10.000 milisaniye boyunca beklemesini
        söyleyelim. Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
      5-"https://www.testotomasyonu.com" adresine gidelim
      6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
      7-Title'ın Test ve url inin testotomasyonu kelimesini içerip icermedigini kontrol edelim
      8-Ardindan "https://wisequarter.com/" adresine gidip
      9-Bu adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
      10-Bir onceki web sayfamiza geri donelim
      11-Sayfayı yenileyelim
      12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
      13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */


        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //"https://www.testotomasyonu.com" adresine gidelim
        driver.get("https://www.testotomasyonu.com");

        // Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim

        String actualTitle = driver.getTitle();
        String actulUrl = driver.getCurrentUrl();

        String expectedUrl = "testotomasyonu";
        String expectedTitle = "testotomasyonu";

        if (actulUrl.contains(expectedUrl)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }
        Thread.sleep(1000);

        System.out.println("All is well");

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title test PAASED");
        } else {
            System.out.println("Title test FAILED");
        }

        //Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/");

        // -Bu adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        String wiseTitle = driver.getTitle();
        String actualWiseTitle = "Quarter";

        if (wiseTitle.contains(actualWiseTitle)) {
            System.out.println("Test Wise PASSED");
        } else {
            System.out.println("Test wise FAILED");
        }

        driver.navigate().back();


        Thread.sleep(3000);
        driver.quit();


    }
}
