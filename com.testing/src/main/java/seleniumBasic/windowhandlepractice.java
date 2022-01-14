package seleniumBasic;

import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlepractice {
	
	public static WebDriver driver ;
public static void main(String...  arrrrgs ) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.get("https://wetransfer.com");
	driver.manage().window().maximize();
	String url = "https://www.salesforce.com/in/?ir=1";
    driver.get(url);
    //implicit wait
    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
    // store all window handles
	
    driver.findElement(By.xpath("(//a[contains(@class,'btn btn-lg')])[2]")).click();
    Set<String> a = driver.getWindowHandles();
    // iterate through handles
    
    java.util.Iterator<String> it = a.iterator();
    String chlwnd = it.next();
    String pwnd = it.next();
    // switch to child window
    driver.switchTo().window(chlwnd);
    System.out.println("Page title "+ driver.getTitle());
    // switch to parent window
    driver.switchTo().window(pwnd);
    System.out.println("Page title "+ driver.getTitle());
    driver.quit();

	
	 }
}
	 
 
	 
