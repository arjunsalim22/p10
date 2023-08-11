package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class Loginpage {   
	WebDriver driver;
	 //object repository
	By targetacc=By.xpath("//*[@id=\"headerPrimary\"]/a[4]/span");
	By tsign=By.xpath("//*[@id=\"listaccountNav-signIn\"]/a/span");
	By tusername=By.id("username");
	By tpassword=By.id("password");
	By tlogin=By.id("login");
	By tskip=By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div[2]/div/div/a");
	By lug=By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[4]/div/div/div/div/div/div[3]/div/a/div[2]/h3");
	/*By telement=By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[8]/div/div/div/div[2]/div/div[3]/div/a/div[2]/h3");
	By tmen=By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[2]/div/div/ul/li[5]/a/div/div[2]/span");
	By product=By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[11]/div/div[1]/div[2]/div/section/div/div[3]/div/div/div[1]/div[2]/div/div/div[1]/div[1]/div[1]/a");
	//By menewArrivals=By.xpath("//*[@id=\"pageBodyContainer\"]/div[1]/div/div[2]/div/ul/li[2]/a/div/div[2]/span");
	//By tsearch=By.xpath("//*[@id=\"searchMobile\"]");
	By createacc=By.xpath("//*[@id=\"listaccountNav-signIn\"]/a/span");
	By firstnme=By.id("firstname");
	By lastnme=By.id("lastname");
	By createbtn=By.id("createAccount");*/
	By skipp=By.xpath("//*[@id=\"circle-skip\"]");
	
	public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void account()
	{
		driver.findElement(targetacc).click();
	}
	public void sign()
	{
		//driver.findElement(createacc).click();
		driver.findElement(tsign).click();
	}
	
		
	public void setValuess(String email,  String password)
	{
		driver.findElement(tusername).sendKeys(email);
		
		driver.findElement(tpassword).sendKeys(password);
	}
	public void clik()
	{
		driver.findElement(tlogin).click();
	}
	/*public void skip1()
	{
		driver.findElement(tskip).click();
	}*/
	public void skip2()
	{
		driver.findElement(skipp).click();
	}
	
	public void luggage()
	{
		JavascriptExecutor a=(JavascriptExecutor) driver;
		a.executeScript("window.scrollTo(0,400)");
		driver.findElement(lug).click();
		
	}
	/*public void element()
	{
		
		driver.findElement(telement).click();
		driver.findElement(tmen).click();	
	}
	public void products()
	{
		driver.findElement(product).click();
		//driver.findElement(menewArrivals).click();	
		
		
	}
	public void searchh(String search)
	{
		//driver.findElement(tsearch).click();
		WebElement s=driver.findElement(tsearch);
		s.sendKeys(search);
		s.sendKeys(Keys.RETURN);
		
		
		
	}*/
	
	
	
	 
	


}
