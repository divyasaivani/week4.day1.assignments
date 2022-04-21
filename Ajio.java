package week4.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//1. Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		//2. In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
		//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[contains(@class,'genderfilter facet-linkname-Men')]")).click();
		//4. Under "Category" click "Fashion Bags"
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'Fashion Bags')]")).click();
		//5. Print the count of the items Found. 
		String count = driver.findElement(By.className("length")).getText();
		System.out.println("Total Number Of Items Found: " +count);
		//6. Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']"));
		int List = brands.size();
		System.out.println("List of brands: " +List );
		for (WebElement webElement : brands) {
			String text = webElement.getText();
			System.out.println(text);
		}
		//7. Get the list of names of the bags and print it    
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int BagNames = bagNames.size();
		System.out.println("List Of Bag names: "+BagNames);
		for (WebElement webElement : bagNames) {
			String text1 = webElement.getText();
			System.out.println(text1);
		}
			
		
		
		

	}

}
