package SureshGit2.SureshGitTest2;
 
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class Home_Page {
 
    private static WebElement element = null;
 
 public static WebElement lnk_MyAccount(WebDriver driver){
 
    element = driver.findElement(By.className("account_icon"));
    
    //element = driver.findElement(By.className("account_icon"));
    //JavascriptExecutor executor = (JavascriptExecutor)driver;
    //executor.executeScript("arguments[0].click();", element);
 
    return element;
 
    }
 
 public static WebElement lnk_LogOut(WebDriver driver){
 
    element = driver.findElement(By.id("account_logout"));
 
 return element;
 
    }
 
}

 