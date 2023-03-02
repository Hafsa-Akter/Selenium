package Hafsa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptTestCases1 {

	public static void main(String[] args) throws InterruptedException {
		//launch a chrome browser
				System.setProperty("webdriver.chrome.driver","E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				
				//open https://wordpress.com/
				driver.get("https://wordpress.com/");
				
				//maximize
				driver.manage().window().maximize();
				
				//click on get started xpath
				driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).click();
				
				Thread.sleep(100);
				//come back to home page
				driver.navigate().back();
				
				Thread.sleep(100);
				//again go back to the get started page
				driver.navigate().forward();
				
				Thread.sleep(100);
				//refresh the browser
				driver.navigate().refresh();
				
				Thread.sleep(100);
				//close the browser
				driver.close();
				
	}

}
