package mvn.mrohmi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboaraction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        act.sendKeys(username, "Rohini");
        
        act.sendKeys(Keys.TAB).perform();
        act.sendKeys("rohinisangapude34@gmail.com").perform();
        
        act.sendKeys(Keys.TAB).perform();
        act.sendKeys("S.T.collony,udgir,tq.devioni,dist.latur").perform();
        
       // For select text
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.build().perform();
        
        act.keyUp(Keys.CONTROL).perform();
        
        //for copy text
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.build().perform();
        
        act.keyUp(Keys.CONTROL).perform();
        act.keyUp(Keys.TAB).perform();
        
        //for paste text
        act.keyDown(Keys.CONTROL).perform();
        act.sendKeys(Keys.TAB).perform();
        act.sendKeys(Keys.ENTER).perform();
	}

}
