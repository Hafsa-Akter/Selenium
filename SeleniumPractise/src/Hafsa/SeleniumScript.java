package Hafsa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());
		
		//driver.manage().window().maximize();
		
		//driver.findElement(By.id("identifierId")).sendKeys("Hafsahaque656@gmail.com");
		//WebElement email=driver.findElement(By.id("identifierId"));
		//email.sendKeys("hafsahaque656@gmail.com");
		//driver.findElement(By.name("identifier")).sendKeys("hafsa");

		//driver.quit();//driver. quit() method closes all browser windows and ends the WebDriver session.
		//driver.close();//close() closes only the current window on which Selenium is running automated tests
		//The WebDriver session, however, remains active
		
		//Firefox
		/*System.setProperty("webdriver.gecko.driver","E:\\selenium webdriver\\geckodriver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
		WebDriver fdriver=new FirefoxDriver();
		
	      fdriver.get("https://www.google.com");
	      System.out.println(fdriver.getTitle());
	      fdriver.close();*/
		

	}

}
