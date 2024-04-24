package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTestme {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://blueimp.github.io/jQuery-File-Upload/"); 
        WebElement addfile = driver.findElement(By.xpath("//input[@type='file']"));
        String strpath1 = System.getProperty("user.dir");
        System.out.println(strpath1);
        String strpath = System.getProperty("user.dir")
        		+ "//ImageScreen.png";
        addfile.sendKeys(strpath);
        driver.findElement(By.xpath("//span[text()='Start upload']")).click();
       
		
	}

}
