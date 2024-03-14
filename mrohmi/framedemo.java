package mvn.mrohmi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framedemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame1");
	}

}
