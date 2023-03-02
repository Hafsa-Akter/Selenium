package Hafsa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptNavigation {

	public static void main(String[] args) throws InterruptedException {
		//test cases
				//Launch a Chrome Browser
				System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//Navigate to the URL
				driver.get("https://www.amazon.com/");
				
				//maximize the window
				driver.manage().window().maximize();
				
			     Thread.sleep(1000);
				//navigate to url https://www.ebay.com/
				driver.navigate().to("https://www.ebay.com/");
				
				//enter some values in the text boxes
				driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T-shirts");
				
			     Thread.sleep(1000);
				//refresh the page
				driver.navigate().refresh();
				
				Thread.sleep(1000);
				//navigate back to amazon
				driver.navigate().back();
				
				Thread.sleep(1000);
				//navigate forward to ebay
				driver.navigate().forward();
				
				Thread.sleep(1000);
				//close the browser
				driver.close();
				
	}

}
