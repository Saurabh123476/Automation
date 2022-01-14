package seleniumBasic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenrelated {
public static WebDriver driver ; 
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//String url = "https://www.salesforce.com/in/?ir=1";
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(2000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		

FileUtils.copyFile(src,new File ("C://Users//Passion//eclipse-workspace//com.testing//target//pics//screenshot.png"));		
		
	
		
		
	}

}
