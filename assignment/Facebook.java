package week2.day2.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver facebook = new ChromeDriver();
		
		facebook.get("https://en-gb.facebook.com/");
		
		facebook.manage().window().maximize();
		
		facebook.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		facebook.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		facebook.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ram");
		
		facebook.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		
		facebook.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("ramkumarsrk06@gmail.com");
		
		facebook.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("ramkumarsrk06@gmail.com");
		
		facebook.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("qwerty");
		
		WebElement dropdown = facebook.findElement(By.xpath("//select[@name='birthday_day']"));
		Select Day=new Select(dropdown);
		Day.selectByValue("19");
		
		WebElement dropdown1 = facebook.findElement(By.xpath("//select[@name='birthday_month']"));
		Select Month=new Select(dropdown1);
		Month.selectByIndex(1);
		
		WebElement dropdown2 = facebook.findElement(By.xpath("//select[@name='birthday_year']"));
		Select Year=new Select(dropdown2);
		Year.selectByVisibleText("1999");
		
		facebook.findElement(By.xpath("//label[text()='Male']")).click();

		facebook.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		}

}
