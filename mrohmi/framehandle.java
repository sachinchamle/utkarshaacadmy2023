package mvn.mrohmi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framehandle {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://demoqa.com/frames");
    driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.switchTo().frame(2);
   //  driver.switchTo().frame("frame1");
     WebElement frame1=driver.findElement(By.xpath("//iframe[@id='frame2']"));
     driver.switchTo().frame(frame1);
     System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
	}

}
