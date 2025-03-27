package Demo;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoggerDemo
{
        static Logger log=LogManager.getLogger("LoggerDemo.class");
       @Test
       public void testLog() throws InterruptedException
       {
        System.setProperty("webdriver.chrome.driver", "F:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        log.info("Maximize window");
        driver.get("https://www.saucedemo.com/");
        log.info("Open saucedemo application");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        log.info("Entered username");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        log.info("Entered password");
        //log.error("for error message");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        log.debug("Verifying the presence of the login button on the page.");
        log.info("clicked Log in button");

        System.out.println("Completed");
        Thread.sleep(3000);
        driver.close();
        log.info("saucedemo Window is closed");
        log.info("exited from application");
    }
}
