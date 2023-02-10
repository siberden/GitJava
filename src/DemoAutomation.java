import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();	
//		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.ebay.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("kitchen table");

		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		driver.close();
	
	
	}

}
