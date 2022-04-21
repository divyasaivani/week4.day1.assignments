package week4.day1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Set the system property and Launch the URL
		driver.get("https://erail.in/");
//		Click the 'sort on date' checkbox
		driver.findElement(By.id("chkSelectDateOnly")).click();
//		clear the existing text from station text field
		driver.findElement(By.id("txtStationFrom")).clear();
//		type "ms"in the from station text field //		tab in the from station text field
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms",Keys.TAB,Keys.TAB);
//		clear the existing text in the to station text field
		driver.findElement(By.id("txtStationTo")).clear();
//		type "mdu" in the to station text field//		tab in the to station text field
		driver.findElement(By.id("txtStationTo")).sendKeys("mdu",Keys.TAB);
//		Add a java sleep for 2 seconds
		Thread.sleep(2000);
//		Store all the train names in a list
		List<WebElement> trains = driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//tr[1]/td[2]"));
//		Get the size of list
		int size = trains.size();
		System.out.println("Trains Size: "+size);
//		Add the list into a new Set
		List<String> train = new ArrayList<String>();
            for (int i = 1; i <= size; i++) {
			
			String names = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]")).getText();
		
			train.add(names);
//		Get the size of set
			int listSize = train.size();
			
			System.out.println("ListSize"+listSize);
			
			Set<String> setnames = new LinkedHashSet<String>(train);
			
			int setSize = setnames.size();
			
			System.out.println("SetSize"+setSize);
//		Compare the Size of list and Set to verify the names are unique
			if(listSize==setSize) {
				
				System.out.println("The names are unique");
			}
			else {
				System.out.println("The names are not unique");
			}
	}
	}
}
