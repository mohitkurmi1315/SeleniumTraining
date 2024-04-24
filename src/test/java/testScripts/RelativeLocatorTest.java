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
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class RelativeLocatorTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://automationbookstore.dev/");
        String strid = driver.findElement(with(By.tagName("li"))
        		.toLeftOf(By.id("pid6"))
        		.below(By.id("pid1")))
        		.getAttribute("id");
        System.out.println(strid);
        driver.findElement(with(By.tagName("li"))
        		.toLeftOf(By.id("pid6"))
        		.below(By.id("pid1"))).click();
        		
}
}