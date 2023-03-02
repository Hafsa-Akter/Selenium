package Hafsa;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptShadowDom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://books-pwakit.appspot.com/");
		SearchContext shadow =driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		shadow.findElement(By.cssSelector("#input")).sendKeys("hafsa");
		
	/*WebElement host=driver.findElement(By.tagName("book-app"));
	
	System.out.println(host);
	
	JavascriptExecutor j=(JavascriptExecutor) driver;
	
	SearchContext shadowDom= (SearchContext) j.executeScript("return arguments[0].shadowRoot", host);
	System.out.println(shadowDom);

	
	WebElement appHeader=shadowDom.findElement(By.tagName("app-header"));
	System.out.println(appHeader);

	
    WebElement appToolbar=appHeader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
	System.out.println(appToolbar);
	
    WebElement bookDec=appToolbar.findElement(By.tagName("book-input-decorator"));
	System.out.println(bookDec);

	bookDec.findElement(By.cssSelector("input#input")).sendKeys("selenium webdriver");
	*/
	
	//This Element is inside single shadow DOM.
		
		
	//String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
	//SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
	//.findElement(By.cssSelector("input#input")).sendKeys("hafsa");
	
	}

}
