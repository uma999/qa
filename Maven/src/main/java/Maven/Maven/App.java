package Maven.Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App{
	public WebDriver driver;
	
@Test
    public void setup() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\dimmi\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://www.qaclickacademy.com/practice.php");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@name='radioButton']")).click();
    driver.findElement(By.cssSelector("#dropdown-class-example")).click();
    
    
}

/*@AfterMethod
public void tearDown() {
driver.close();*/
}

