package MMP;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScheduleNew {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.driver","geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
		
		driver.findElement(By.xpath("//span[contains(text(),'Schedule')]")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		driver.findElement(By.xpath("(//*[@id='opener'])[3]")).click();
		
		//to change frame:

			driver.switchTo().frame("myframe"); 
			 Thread.sleep(6000);
			// driver.findElement(By.id("datepicker")).click(); 
			 WebElement date=driver.findElement(By.id("datepicker"));
			 
			 String dateval= "01/02/2019";
			 selectdate(driver,date,dateval);
			}
	
	public static void selectdate(WebDriver driver, WebElement element ,String dateval) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
	}

}