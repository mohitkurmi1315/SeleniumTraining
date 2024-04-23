package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        WebElement chk= driver.findElement(By.id("isAgeSelected"));
        if(!chk.isSelected()) {
        	chk.click();
//        	Screenshot of entire screen
        	TakesScreenshot screen = (TakesScreenshot)driver;
        	File img = screen.getScreenshotAs(OutputType.FILE);
        	String path = System.getProperty("user.dir")
        			+ "/screenshots/"+ System.currentTimeMillis()+".png";
        	FileUtils.copyFile(img, new File(path));
        	
//        	screenshot of particular element
        	File img1 = chk.getScreenshotAs(OutputType.FILE);
        	String path1 = System.getProperty("user.dir")
        			+ "/screenshots/"+ System.currentTimeMillis()+".png";
        	FileUtils.copyFile(img1, new File(path1));
        	
        }
        
        
        
        
        driver.findElement(By.xpath("(//input[@class='cb1-element'])[2]")).click();
        
//        RadioButton
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        driver.findElement(By.xpath("//input[@value='5 - 15']")).click();
        

	}

}
