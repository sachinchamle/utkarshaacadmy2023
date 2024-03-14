package mvn.mrohmi;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class screens {

	public static <akescreenshort, takescreebshort, takescreenshort> void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
	
		
	WebElement selevopt=driver.findElement(By.xpath("//div[text()='Select Option']"));
	selevopt.click();
		WebElement opt=driver.findElement(By.xpath("//div[contains(text(),'A root option')]"));
		opt.click();
		driver.findElement(By.xpath("//img[@style='vertical-align:middle']")).click();
		
	WebElement selecttitle=driver.findElement(By.xpath("//div[@id='selectOne']"));
	selecttitle.click();
		
	Select selectcolour=new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
	selectcolour.selectByIndex(3);
	
	//WebElement selectv=driver.findElement(By.xpath("//div[text()='Select...'"));
//Select selectcolor =new Select(selectv);
//selectcolour.selectByValue("black");
	
	WebElement selectm=driver.findElement(By.xpath("//select[@id='cars']"));
	Select selectcolourSelect=new Select(selectm);
	selectcolour.selectByVisibleText("Opel");
	}
}
