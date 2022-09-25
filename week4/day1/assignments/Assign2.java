package week4.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		int rows = driver.findElements(By.xpath("//div[@class='render']//table/tbody/tr")).size();
		
		System.out.println("Rows is"+ rows);
		
		int columns = driver.findElements(By.xpath("//div[@class='render']//th")).size();
			
			System.out.println("Column is " + columns);
	}
}
