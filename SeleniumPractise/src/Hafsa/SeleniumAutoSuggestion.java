package Hafsa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only+Goibibo&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%216504095653%21602838584772%21e%21goibibo%21c%21&gclid=Cj0KCQiAgOefBhDgARIsAMhqXA5gxBwIqyYqrCu0yQNCu50OnOF_JENIgsZjdj5e9ER9VIxcvkGyaYgaAmK9EALw_wcB");
	     driver.manage().window().maximize();
	     
	     WebElement from=driver.findElement(By.xpath("//div[@class='sc-cidDSM cXGIAa']//p[@class='sc-bYoBSM eyNSEu fswWidgetPlaceholder'][normalize-space()='Enter city or airport']"));
	     from.click();
	     from.sendKeys("Dubai");
	     Thread.sleep(2000);
	     from.sendKeys(Keys.ARROW_DOWN);
	     Thread.sleep(2000);
	     from.sendKeys(Keys.ENTER);
	     
	     //to
	     //WebElement 
	}

}
