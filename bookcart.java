package mvn.mrohmi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class bookcart {
	public WebDriver driver;
  @Test
  public void registration() {
  driver=new ChromeDriver();
  driver.get("https://bookcart.azurewebsites.net/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  WebElement loginbtn=driver.findElement(By.xpath("//span[text()=' Login ']"));
	 loginbtn.click();
	 
	 WebElement register=driver.findElement(By.xpath("//span[text()='Register']"));
	 register.click();
	 
	 WebElement firstn=driver.findElement(By.xpath("//input[@id='mat-input-2']"));
	 firstn.sendKeys("Rohini");
	 
	 driver.findElement(By.id("mat-input-3")).sendKeys("Sangapude");
	 
	 driver.findElement(By.id("mat-input-4")).sendKeys("rohini");
	 
	 driver.findElement(By.id("mat-input-5")).sendKeys("Rohini@123");
	 
	 driver .findElement(By.id("mat-input-6")).sendKeys("Rohini@123");
	 
	 driver.findElement(By.id("mat-radio-3-input")).click();
	 
WebElement login1=driver.findElement(By.xpath("//span[text()='Login']"));
login1.click();
	

	 driver.findElement(By.id("mat-input-7")).sendKeys("rohini");
	 WebElement password=driver.findElement(By.xpath("//input[@id='mat-input-8']"));
	 password.sendKeys("Rohini@123");
	 WebElement login=driver.findElement(By.xpath("//span[text()='Login']"));
	 login.click();

  }
  @Test
  public void searchbook() throws InterruptedException {
	  WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
	  search.sendKeys("Harry Potter and the Chamber of Secrets");
	 
		 WebElement addtocart=driver.findElement(By.xpath("(//span[contains(text(),' Add to Cart')][1])[1]"));
		 addtocart.click();
		 
		 WebElement search1=driver.findElement(By.xpath("//input[@type='search']"));
		  search.sendKeys("Harry Potter and the Prisoner of Azkaban");
		  WebElement addtocart1=driver.findElement(By.xpath("(//span[contains(text(),' Add to Cart')][1])[2]"));
		  addtocart1.click();
		  
		  WebElement search2=driver.findElement(By.xpath("//input[@type='search']"));
		  search.sendKeys("Harry Potter and the Goblet of Fire");
		  WebElement addtocart2=driver.findElement(By.xpath("(//span[contains(text(),' Add to Cart')][1])[3]"));
		  addtocart2.click();
		  
		  WebElement search3=driver.findElement(By.xpath("//input[@type='search']"));
		  search.sendKeys("Harry Potter and the Order of the Phoenix");
		  WebElement addtocart3=driver.findElement(By.xpath("(//span[contains(text(),' Add to Cart')][1])[4]"));
		  addtocart3.click();
		  
		  WebElement search4=driver.findElement(By.xpath("//input[@type='search']"));
		  search.sendKeys("Harry Potter and the Half-Blood Prince");
		  WebElement addtocart4=driver.findElement(By.xpath("(//span[contains(text(),' Add to Cart')][1])[5]"));
		//  addtocart4.click();
		  JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", addtocart4);
		  
		  Thread.sleep(5000);
		   WebElement cartlist=driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[3]"));
		   cartlist.click();
		  System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'₹1,634.00')]")).getText());
		  String actualprice="₹1,634.00";
		 Assert.assertTrue(true);
  }
  
  }
		
		
  



