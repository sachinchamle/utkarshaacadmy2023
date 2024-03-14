package mvn.mrohmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceform {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Rohini");
		driver.findElement(By.id("lastName")).sendKeys("Sangapude");
		driver.findElement(By.id("userEmail")).sendKeys("rohinisangapude35@gmail.com");
		WebElement gender=driver.findElement(By.xpath("//label[normalize-space()='Female']"));
		gender.click(); 
		
		driver.findElement(By.id("userNumber")).sendKeys("7887913858");
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("01june1996");
		driver.findElement(By.id("subjectsContainer")).sendKeys("math,chemistry,physices,history");
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']")).click();
        driver.findElement(By.id("//input[@id='uploadPicture']")).click();
	}

}
