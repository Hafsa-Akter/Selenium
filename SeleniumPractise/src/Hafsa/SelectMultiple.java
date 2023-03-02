package Hafsa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectMultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.seleniumeasy.com");
	     driver.manage().window().maximize();
	     
	     Select selectelement=new Select(driver.findElement(By.xpath("//a[normalize-space()='More..']")));
	     
	     List<WebElement> options=selectelement.getOptions();
	     System.out.println("the size of dropdownlist"+options.size());
	     
	     for(WebElement e:options) {
	    	 
	    	 System.out.println("The values are "+e.getText());
	     }
	     
	     System.out.println(selectelement.isMultiple());

	     //select the options
	     //selectbyvalue
	     selectelement.selectByValue("New York");
	     
	     //select by index
	     selectelement.selectByIndex(0);
	     
	     //select by visible text
	     selectelement.selectByVisibleText("Washington");
	     
	     System.out.println(selectelement.getFirstSelectedOption().getText());
	     
	     //deselect by index only for multiple select
	     Thread.sleep(0);
	     selectelement.deselectByIndex(0);
	     
	     //deselect by value
	     selectelement.deselectByValue("Washington");
	     
	     //deselect by visible text
	     selectelement.deselectByVisibleText("California");
	     

	}

}
