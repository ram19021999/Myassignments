package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("RAM");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KUMAR");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RAM");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("SELENIUMWEDRIVER");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("for learning");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramkumarsrk06@gmail.com");
	
		driver.findElement(By.id("createLeadForm_description")).sendKeys("for learning");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ACCENTURE");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ANANTH");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
	}

}



