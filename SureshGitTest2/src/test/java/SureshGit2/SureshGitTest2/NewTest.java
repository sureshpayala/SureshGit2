package SureshGit2.SureshGitTest2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import pageObjects.Home_Page;
//import pageObjects.LogIn_Page;
import org.testng.annotations.Test;

public class NewTest {
  private static WebDriver driver = null;
  @Test
  public void testOne() {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver\\chromedriver.exe");
	 	//driver = new ChromeDriver();
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
	    driver = new FirefoxDriver();
	 	 
	    driver.get("http://www.store.demoqa.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     // Use page Object library now
	 
	     Home_Page.lnk_MyAccount(driver).click();
	 
	     LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");
	 
	     LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");
	 
	     LogIn_Page.btn_LogIn(driver).click();
	 
	     System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	     //Home_Page.lnk_LogOut(driver).click();
	 
	     //driver.quit();	  
  }
}

