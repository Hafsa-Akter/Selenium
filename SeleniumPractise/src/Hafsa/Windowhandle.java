package Hafsa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//test cases
        //1.Open the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//2.Navigate to the URL
		driver.get("https://demoqa.com/browser-windows");
		
		//3.maximize the window
		driver.manage().window().maximize();
		
		//4.Print the parent window handle
		String  parentwindowHandle=driver.getWindowHandle();
		System.out.println("the parent window handle is "+parentwindowHandle);
		
		//click three times
		for(int i=1;i<=3;i++) {
			
			driver.findElement(By.xpath("//button[@id='windowButton']")).click();
			Thread.sleep(3000);
		}
		
		//print the window handles and 
		Set<String> windowhandles=driver.getWindowHandles();
		String lastwindowhandle="";
		
		for(String handle:windowhandles ) {
			
			System.out.println("The window handles are "+handle);
			
			//switching to windows
			System.out.println("switching windows "+handle);
			Thread.sleep(2000);
			driver.switchTo().window(handle);
			
			//navigating to google.com
			Thread.sleep(3000);
			driver.get("http://www.google.com");
			
			//maximize the page
			driver.manage().window().maximize();
			//close the browser
		}
		
		//close parent window first
		Thread.sleep(2000);
		driver.switchTo().window(parentwindowHandle);
		driver.close();
		
		//switch to the other windows
		Thread.sleep(2000);
		driver.switchTo().window(lastwindowhandle);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
