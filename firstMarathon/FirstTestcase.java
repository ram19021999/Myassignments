package firstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestcase {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions ch=new ChromeOptions();
		
		ch.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(ch);
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/parent::div")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		Thread.sleep(4000);
		
		WebElement click1 = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();",click1 );
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//a[@class='forceActionLink'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Ramkumar");
		
		WebElement dropdown = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[3]"));
		driver.executeScript("arguments[0].click();", dropdown);
		
		WebElement click2 = driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].click();", click2);
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");
		System.out.println(attribute);
		if(attribute.contains("Ramkumar")) {
			System.out.println("verified");
		}else {
				System.out.println("not verified");
			}
		}
		
		
		
		
		
		
	}


