package MMP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class ScheduleAppointment {

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
		     
			
			 
		driver.findElement(By.id("datepicker")).click(); 
			
			driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[5]/td[6]/a")).click();		
			 //date picker code
			 String doj="March/24/2019";
				String dt,month,year;
				
				String []date=doj.split("/");   //delimeter '/'
				
				month=date[0];
				dt=date[1];
				year=date[2];
				
				String calYear,calMonth;
				
				//getting Year
				calYear=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
				
				System.out.println(calYear);
				System.out.println(year);
				
				while(!calYear.equals(year))
				{
					driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
					calYear=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
					System.out.println("While Loop printing year:: "+calYear);
				}
				
				//getting Month
				calMonth=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
				System.out.println(calMonth);
				System.out.println(month);
				
				while(!calMonth.equals(month))
				{
					driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
					calMonth=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
					System.out.println("While Loop printing month:: "+calMonth);
				}
				
				//getting date
				
				List<WebElement> tdList = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
				
				for(int i=0;i<tdList.size();i++)
				{
					WebElement e=tdList.get(i);
					if(e.getText().equals(dt))
					{
						System.out.println("Date Matching:: "+e.getText());
						e.click();
						break;
					}
				}
				
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				 WebElement k = driver.findElement(By.id("time"));
				    Select sel = new Select(k);
				    //sel.selectByIndex(1);
                List<WebElement> optionList = sel.getOptions();
                int s=optionList.size();
				    System.out.println("List size is:" + s);
                     String expected= "11Am";
                     System.out.println(expected);
				    for (int i = 0; i < s; i++) {
				    	
				    	System.out.println(optionList.get(i).getText());
				        if (optionList.get(i).getText().equalsIgnoreCase(expected)) {
				        	
				            optionList.get(i).click();
				            System.out.println("Time Selected");
				            break;
	}
				        
				        

				    }
				    
				    
	}
}


/*driver.findElement(By.id(".//*[@id='time']/option[2]")).click();
			
				
				driver.findElement(By.id("ChangeHeatName")).click();

				driver.switchTo().defaultContent();
				driver.findElement(By.id("sym"));
				driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/input")).click();
				System.out.println("Successful");*/






