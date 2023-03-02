package Hafsa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.daraz.com.np/womens-fashion/");
			//title of anker tag
			//driver.findElement(By.linkText("Kurta Suruwal")).click();
	         //driver.findElement(By.partialLinkText("Kurta")).click();
	}

}
