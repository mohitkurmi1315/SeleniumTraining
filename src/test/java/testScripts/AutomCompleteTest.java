package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomCompleteTest {
    public static final String  expValue= "BASIC";
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
        driver.get("https://jqueryui.com/autocomplete/");
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        WebElement inp = driver .findElement(By.cssSelector("#tags"));
        inp.sendKeys("as");
        List<WebElement> items = driver.findElements(By.cssSelector("ul#ui-id-1>li"));
        System.out.println("No of matching item ...." + items.size());
        for(WebElement item : items) {
        	System.out.println(item.getText());
        	if(item.getText().equalsIgnoreCase(expValue)) {
        		item.click();
        		break;
        	}
        }
	}

}
