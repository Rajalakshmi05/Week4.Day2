package Week4.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizeable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement res = driver.findElement(By.id("resizable"));
		Actions builder = new Actions(driver);
		builder.clickAndHold(res).moveByOffset(100, 150).release(res).perform();
		driver.close();

	}

}
