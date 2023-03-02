package Hafsa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptBrowser {

	public static void main(String[] args) {
		//test cases
        //Open the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Navigate to the URL
		driver.get("https://demoqa.com/browser-windows");
		
		//Maximize the window
		driver.manage().window().maximize();
		//Verify the current url of the page
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://demoqa.com/browser-windows")) {
			System.out.println("varified Url");
		}else{
			
			System.out.println("not varified");
		}
		//verify the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals(title)) {
			
			System.out.println("varified title");
		}else {
			System.out.println("not varified");
		}
		
	    //print the length of the title of the page
		int titleLength=title.length();
		System.out.println(titleLength);
		
		//print the pagesource of the page
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
		
		//print the length of the page source of the page
		int pageSourceLength=pageSource.length();
		System.out.println("length of pagesource "+pageSourceLength);
		
		//click on new tab
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		//close the browser 
		//parenttab closed
		//driver.close();
		
		//quit the browser
		//all tabs closed
		driver.quit();
	}

}
