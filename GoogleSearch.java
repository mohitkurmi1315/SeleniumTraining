package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
//		below 3 lines are - if u want to test ur code in any other version of browser
//		ChromeOptions options = new ChromeOptions();
//		options.setBrowserVersion("115");
//		WebDriver driver = new ChromeDriver(options);
//		Below 3 will execute the headless, w/o launching the url
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(options);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.google.com");
//		driver.navigate().to("https://www.google.com");
	    System.out.println("Page Title :"+ driver.getTitle());
	    WebElement srcbox = driver.findElement(By.id("APjFqb"));
	    srcbox.sendKeys("Java tutorial");
	    srcbox.sendKeys(Keys.ENTER);
	    System.out.println("Page Title :"+ driver.getTitle());
	    System.out.println("New URL : " + driver.getCurrentUrl());
	    driver.navigate().back();
	    System.out.println("Page Title after Back :"+ driver.getTitle());
	    driver.navigate().forward();
	    driver.navigate().refresh();
	}

}
