package mvn.mrohmi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class windo {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable_notifications");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukari.com");
		driver.manage().window().maximize();

	}

}
