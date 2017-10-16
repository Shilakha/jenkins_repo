import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Geckodriver {
	 public static void main(String[] args){
		 System.setProperty("webdriver.firefox.driver","D:\\SOFTWARES\\New folder\\geckodriver.exe");
		 WebDriver driver =new FirefoxDriver();
		 driver.get("http://demo.guru99.com/V4/");
		 driver.quit();
	    }
}
