package easework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Eazework {
	
	@Test
	public void logIn() throws InterruptedException{
		   System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\New folder\\Drivers\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.eazework.com/login/");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//input[@id='txtEmailAddress']")).sendKeys("evry");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//input[@id='Login']")).sendKeys("shilakha");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//input[@id='Password']")).sendKeys("Hello@123");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath(".//input[@value='Login']")).click();
		  // driver.switchTo().alert().accept();
		   //driver.quit();
	   }
}
