package Hafsa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.ebay.com/");
			//driver.findElement(By.id("gh-ac")).sendKeys("T-Shirts");
			//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T-Shirts");
        // driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T- shirts");
		    // driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
			//driver.findElement(By.xpath("//input[@id='gh-ac' or @name='_w']")).sendKeys("T-shirts");
			//driver.findElement(By.xpath("//input[@id='gh-ac' and @name='_nkw']")).sendKeys("T-shirts");
        // driver.findElement(By.xpath("//input[contains(@name,'n')]")).sendKeys("Shirts for kids");
			//driver.findElement(By.xpath("//input[starts-with(@name,'_n')]")).sendKeys("shirts for kids");
			
	        driver.findElement(By.xpath("//a[text()=' Sell']")).click();

	}

}
