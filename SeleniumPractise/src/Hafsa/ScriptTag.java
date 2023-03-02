package Hafsa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScriptTag {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");
			List<WebElement> links=driver.findElements(By.tagName("a"));
		    System.out.print(links.size()); 
			
			for(WebElement l: links) {
				
				System.out.println(l.getText());
			}
	}

}
