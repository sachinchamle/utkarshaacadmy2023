package mvn.mrohmi;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserwindow {

	

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("tabButton")).click();
      String mainwindow=driver.getWindowHandle();
      
      Set<String>childwindow=driver.getWindowHandles();
    
     Iterator<String>itr=childwindow.iterator();
	while (itr.hasNext()) {
		String childwindow1 = itr.next();
		if (!mainwindow.equals(childwindow1)) {
			driver.switchTo().window(childwindow1);
			System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
			driver.close();
		}
		
	}
	driver.switchTo().window(mainwindow);
	//driver.close();

		
		
	System.out.println(driver.findElement(By.xpath("//button[@id='windowButton']")).getText());
				driver.close();
	}
	
		
	}


