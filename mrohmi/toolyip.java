package mvn.mrohmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class toolyip {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
			
        WebElement hovermetoseebtn=driver.findElement(By.xpath("//button[@id=]"));
		
         act.moveToElement(hovermetoseebtn).perform();
         
         WebElement text=driver.findElement(By.xpath("//div[@id='texFieldToolTopContainer']")).getText();
         
	}

}
