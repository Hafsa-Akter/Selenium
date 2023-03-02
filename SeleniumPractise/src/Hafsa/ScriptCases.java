package Hafsa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptCases {

	public static void main(String[] args) {

		 //open the chrome browser
		//navigate to the url
		//enter valid username
		//enter valid password
		//click on login
		//verify url
		//verifiy title
		//close the browser
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium webdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
           
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");	
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String act_url=driver.getCurrentUrl();
		System.out.println(act_url);
		
		/*String desired_url="https://www.gmail.com/";
		if(act_url.equals(desired_url)) {
			
			System.out.println("Pass");
		}else {
			System.out.println("fail");
		}*/
		
		String act_title=driver.getTitle();
		System.out.println(act_title);
		
		/*String dersired_title="OrangeHRM";
		
		if(act_title.equals(dersired_title)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}*/
		
		String ps=driver.getPageSource();
		System.out.println(ps);
		//driver.close();
		
	}

}
