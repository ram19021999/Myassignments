package firstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;
public class SecondTestcase {
	
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
		
		WebElement click1 = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", click1);
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]")).sendKeys("Ramkumar");
		
		driver.findElement(By.xpath("(//span[contains(@class,'slds-listbox__option-text slds-listbox__')])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		
		driver.findElement(By.xpath("//span[text()='15']")).click();
		
		Thread.sleep(4000);
		
		WebElement click2 = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux slds-')])[1]"));
		driver.executeScript("arguments[0].click();", click2);
		
		Thread.sleep(4000);
		
		WebElement click3 = driver.findElement(By.xpath("//span[@title='Needs Analysis']"));
		driver.executeScript("arguments[0].click();", click3);
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		String attribute = driver.findElement(By.xpath("//span[contains(@class,'toastMessage')]/a")).getAttribute("title");
		System.out.println(attribute);
		if(attribute.contains("TestLeaf")) {
			System.out.println("verified");
		}else {
				System.out.println("not verified");
			}
		
	}

}
