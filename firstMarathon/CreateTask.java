package firstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTask {
	
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
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='slds-button']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("tasks");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//mark[text()='Tasks']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@title='Show one more action']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='New Task']")).click();
		
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		
		Thread.sleep(4000);
		
		WebElement click1 = driver.findElement(By.xpath("(//a[@class='select'])[1]"));
		driver.executeScript("arguments[0].click();", click1);
		
		Thread.sleep(4000);
		
		WebElement click2 = driver.findElement(By.xpath("//a[@title='Waiting on someone else']"));
		driver.executeScript("arguments[0].click();", click2);
		
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		
		Thread.sleep(4000);
		
		String text = driver.findElement(By.xpath("(//div[@title='Bootcamp'])[2]")).getAttribute("title");
		System.out.println(text);
		if(text.contains("Bootcamp")) {
			System.out.println("verified");
		}else {
				System.out.println("not verified");
			}
		
	
	}
		
		

}
