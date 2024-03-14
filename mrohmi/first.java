package mvn.mrohmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class first {

	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        
        Actions act=new Actions(driver);
        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']")); 
        WebElement code=driver.findElement(By.xpath("//div[@id='draggable']"));
        act.dragAndDrop(source, code).perform();

	}

}
