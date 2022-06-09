package Week4.Day2;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hoveron {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
	 WebElement men=driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions builder=new Actions(driver);
		builder.moveToElement(men).perform();
		driver.findElement(By.xpath("//sapn[text(),'Shirts']")).click();
		
		
	}

}
