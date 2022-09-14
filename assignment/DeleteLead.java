package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver leaftaps=new ChromeDriver();
		
		leaftaps.get("http://leaftaps.com/opentaps/control/main");
		
		leaftaps.manage().window().maximize();
		
		leaftaps.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		leaftaps.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		
		leaftaps.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		leaftaps.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		leaftaps.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		leaftaps.findElement(By.xpath("//a[text()='Leads']")).click();
		
		leaftaps.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		leaftaps.findElement(By.xpath("//span[text()='Phone']")).click();
        
        leaftaps.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
        
        leaftaps.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9994663532");
        
        leaftaps.findElement(By.xpath("//button[text()='Find Leads']")).click();
        
        leaftaps.findElement(By.xpath("//a[text()='10500']")).click();
        
        leaftaps.findElement(By.xpath("//a[text()='Delete']")).click();
       
    	leaftaps.findElement(By.xpath("//a[text()='Find Leads']")).click();
    	
    	leaftaps.findElement(By.xpath("(//input[@class=' x-form-text x-form-field '])[1]")).sendKeys("10500");
    	
    	 leaftaps.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	 
    	 leaftaps.close();
		
      
}}
