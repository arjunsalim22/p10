package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Temwrk {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.bikenwear.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void testing() throws InterruptedException {
		Thread.sleep(4000);
		By obike=By.xpath("//*[@id=\"SiteNav\"]/li[3]/button");
		By obikemaintain=By.xpath("//*[@id=\"SiteNavLabel-bike-accessories\"]/ul/li[6]/a");
		By osortby=By.xpath("//*[@id=\"SortBy\"]");
		By ospray=By.xpath("//*[@id=\"Collection\"]/ul/li[10]/div/a");
		By oadd=By.xpath("//button[@name=\"add\"]");
		By oremove=By.xpath("/html/body/div[3]/main/div/div/form/table/tbody/tr[1]/td[2]/p/a");
		
			driver.findElement(obike).click();
			Thread.sleep(4000);
			driver.findElement(obikemaintain).click();
			Thread.sleep(4000);
			WebElement r=driver.findElement(osortby);
			Select l=new Select(r);
			l.selectByIndex(4);
			Thread.sleep(4000);
			WebElement j=driver.findElement(ospray);
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", j);
			j.click();
			Thread.sleep(4000);
			driver.findElement(oadd).click();
			Thread.sleep(4000);
			driver.findElement(oremove).click();
			Thread.sleep(4000);
			
		}
		
	    
	    
	}


