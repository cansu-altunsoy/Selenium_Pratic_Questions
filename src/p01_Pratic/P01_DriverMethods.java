package p01_Pratic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01_DriverMethods {

    public static void main(String[] args) throws InterruptedException {


        /*
    //....Exercise-1:...
            // Create a new class with main method
            // Set Path
            // Create a chrome driver
            // Maximize window
            // Open google home page https://www.google.com
            // On the same class, navigate to wisequarter home page https://www.wisequarter.com and navigate back to google
            // Wait about 4 sn
            // Navigate forward to wisequarter
            // Refresh page
            // Close/quit the browser
            // And Last step print "All is well" on console
    */


        System.setProperty("Webdriver.chrome.driver", "kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // Open google home page https://www.google.com
        driver.get("https://www.google.com");


        // On the same class, navigate to wisequarter home page https://www.wisequarter.com and navigate back to google
        driver.navigate().to("https://www.wisequarter.com");
        Thread.sleep(4000);  // Wait about 4 sn

        // Navigate forward to wisequarter
        driver.navigate().back();

        driver.navigate().forward();
        driver.navigate().refresh();


        Thread.sleep(3000);
        driver.quit();

        System.out.println("All is well");


    }
}