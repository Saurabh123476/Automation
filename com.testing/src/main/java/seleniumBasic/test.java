package seleniumBasic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	public static WebDriver driver ;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
String url = "https://www.salesforce.com/in/?ir=1";
driver.get(url);

Date date  = new Date();




File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//FileUtils.copyFile(src, new File("C://Users//Passion//eclipse-workspace//com.testing//target//screenshot//12eewq2.png"+date.getDate());





	}

	
}
