package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/*
 * 
 * This code is working in chrome but gives an exception in firefox
 */
public class Demo_AutoIT {

    @Test
	public void uploadDemo() throws Exception {
		
		
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
/*		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		 * 
		 * Using JavascriptExecutor
		 
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		*/
		
		
		
		
		
		/*
		 * 
		 * Uploading the image using AutoIT
		 */
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");	
		driver.findElement(By.xpath("//input[@multiple='']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:/Users/ManasS/Desktop/AUTOIT/Upload_AutoIT.exe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click='item.upload()']")).click();
		
		/*
		 * 
		 * Uploading a image using sendkeys() , provided the element has an attribute type='file' in the html code
		 */
/*		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\ManasS\\Downloads\\improvised_captain_america_wallpaper_by_zongral-d7o2kn2.jpg");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click='item.upload()']")).click();
*/
	}

}
