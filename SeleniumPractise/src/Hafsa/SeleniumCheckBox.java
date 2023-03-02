package Hafsa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://demoqa.com/automation-practice-form");
	     driver.manage().window().maximize();
	     
	     //handlecheckbox
	   WebElement sports=  driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
	   sports.click();
	   
	   WebElement reading=driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
	   Thread.sleep(2000);
	   reading.click();
	   
	   WebElement music=driver.findElement(By.xpath("//label[normalize-space()='Music']"));
	   Thread.sleep(2000);
	   music.click();
	   
	  /* 
	   //uncheck
	   sports.click();
	   Thread.sleep(2000);
	   reading.click();
	   Thread.sleep(2000);
	   music.click();
	   Thread.sleep(2000);
	   
	   //validation
	   //isDisplayed:T/F ifbthe element is displayed
	   //isSelected:T/F if the element is selected
	   //isEnabled: T/F if the element is enabled
	   
	   
	   //isDisplayed()
	   
	   Boolean bool1=sports.isDisplayed();
	   System.out.println(bool1);
	   
	   if(bool1==true) {
		   sports.click();
	   }
	   
	   //isSelected
	   Boolean bool2=reading.isSelected();
	   
	   System.out.println(bool2);
	   if(bool2==false) {
		   reading.click();
	   }
	   
	   //isEnabled()
	   Boolean bool3=music.isSelected();
	   
	   System.out.println(bool3);
	   if(bool3==true) {
		   music.click();
	   }
	   */
	     

	}

}
