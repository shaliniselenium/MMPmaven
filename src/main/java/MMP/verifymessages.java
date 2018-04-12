package MMP;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class verifymessages {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver","geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
	driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/ul/li[8]/a")).click();
	driver.findElement(By.id("subject")).clear();
	driver.findElement(By.id("subject")).sendKeys("fever");
	driver.findElement(By.id("message")).clear();
	driver.findElement(By.id("message")).sendKeys("fever");
	
	driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div/div/form/div/table/tbody/tr[4]/td/input")).submit();
	
	System.out.println("Message sent !!!!!" );
	
	String title = driver.getTitle();
	System.out.println("Title::" + title);
	
	
	//this methods fetches the name of the window which has focus..
	String parent = driver.getWindowHandle();
	System.out.println("Name of the parent::"+parent);
	
	Set<String> wSet= driver.getWindowHandles();
	int count = wSet.size();
	
	
	System.out.println("Number of windows::"+ count );
	
     Alert a=driver.switchTo().alert();
String al=a.getText();
	System.out.println("The displayed text is "+ al);
	
	driver.switchTo().alert().accept();
	
	
	}

}
