package Hafsa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptTesting {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://developer.salesforce.com/signup");
			
			//cssSelector("#idvalue")
			//cssSelector("tagname#idvalue")
			//cssSelector("tagname.classvalue")
			//cssSelector("tagname[attribute name='attribute value']")
			//cssSelector("tagname.classvalue[attribute name='attribute value']")



			driver.findElement(By.cssSelector("input.company")).sendKeys("ABC");
	}

}
