package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1 {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.chittorgarh.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.findElement(By.xpath("//a[text()='STOCK MARKET ']")).click();
		
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		
		List<String> total=new ArrayList<String>();
		List<WebElement> name = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//tr/th[3]"));
		
		for (int i = 0; i < name.size(); i++) {
			String text = name.get(i).getText();
			
			for (int j = 0; j < name.size(); j++) {
				total.add(text);
				}
			
			Set<String> dupli=new HashSet<String>(total);
			if (total.size()==dupli.size()) {
				System.out.println("Duplicate Present");
			}else {
				System.out.println("No Duplicate");
}
}
}
}