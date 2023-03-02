package Hafsa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptWeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub//Launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    //open the url
    driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&mobileBrowserWeblabTreatment=C&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&prevRID=RW73H4D0YA1WZY79VBEH&openid.assoc_handle=usflex&openid.mode=checkid_setup&desktopBrowserWeblabTreatment=C&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    
    //enter username and password
    //clear username and password
    //submit login button
    //click is used for any type of button 
    //submit works for only button that is inside form 
    
    
    //get text
      String getText=driver.findElement(By.linkText("Conditions of Use")).getText();
      System.out.println("the text is "+getText);
      
    //get location
       WebElement e=driver.findElement(By.id("ap_customer_name"));
       Point point=e.getLocation();
       System.out.println("X cordinates "+point.x);
       System.out.println("Y condinates "+point.y);
       
    //get size
       WebElement e1=driver.findElement(By.id("ap_customer_name"));
       Dimension d=e1.getSize();
       System.out.println("the height "+d.height);
       System.out.println("the width "+d.width);

    //get tag name
       String tagname=driver.findElement(By.id("ap_customer_name")).getTagName();
       System.out.println("tagname is "+tagname);
       
    //to print number of links present on the webpage
       List<WebElement> link=driver.findElements(By.tagName("a"));
       System.out.println("no of link "+link.size());
       
       
    //check if the login button is displayed
       Boolean b=driver.findElement(By.id("continue")).isDisplayed();
       System.out.println("button displayed? "+b);
       
    //check if the login button is enabled
       Boolean b1=driver.findElement(By.id("continue")).isEnabled();
       System.out.println("button enabled? "+b1);
    //check if the login button is selected is for radio button or checkbox
    
    
    Thread.sleep(100);
    driver.close();


	}

}
