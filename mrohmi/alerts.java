package mvn.mrohmi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement alertbutton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		alertbutton.click();
		driver.switchTo().alert().accept();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement secondbutton=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		
		secondbutton.click();
		wait.until( ExpectedConditions.alertIsPresent()).accept();
		

		WebElement confoirmbutton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confoirmbutton.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		
		WebElement boxbutton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		boxbutton.click();
		driver.switchTo().alert().sendKeys("Rohini");
		driver.switchTo().alert().accept();


	}

}
