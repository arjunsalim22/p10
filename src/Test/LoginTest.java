package Test;




import java.time.Duration;

import org.testng.annotations.Test;

import Page.Loginpage;

public class LoginTest extends Baseclass {
	
	@Test
	public void testing() throws InterruptedException
	{
		
		Loginpage ob=new Loginpage(driver);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		ob.account();
		Thread.sleep(3000);
		
		ob.sign();
		Thread.sleep(3000);
		
	    ob.setValuess("arjunpsalim22@gmail.com","Arjun@123");
	    Thread.sleep(3000);
		ob.clik();
		Thread.sleep(3000);
		//ob.skip1();
		//Thread.sleep(3000);
		ob.skip2();
		Thread.sleep(3000);
		ob.luggage();
		//ob.searchh("watches");
		
		//Thread.sleep(4000);
		//ob.scroll();
		//ob.element();
		//Thread.sleep(4000);
		//ob.products();
		
		
		
	}

}
