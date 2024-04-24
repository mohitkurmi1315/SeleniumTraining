package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
//      Below will provide no of rows in table
        driver.findElement(By.xpath("//table[@id='example']//following::tr"));
//        no of test data or cell data, td= test data 
        driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td"));
        String salary= driver.findElement(By.xpath("//td[contains(text(),'B. Wagner')]//following-sibling::td[5]")).getText();
        System.out.println("Wagner's Salary :" + salary);
//        find out how many are working in San fransisco
//        find out how many are working in San fransisco
        
//        cssselector
        driver.get("https://www.lambdatest.com/blog/");
        WebElement child = driver.findElement(By.cssSelector("div.header__menu__items>div:nth-child(3)"));
        System.out.println("3rd child is :" + child.getText() );
        WebElement drpdwn = driver.findElement(By.cssSelector("div.header__menu__items div[class*='rs-dropdown']"));
        System.out.println("dropdown :" + drpdwn.getText() );

	}

}
