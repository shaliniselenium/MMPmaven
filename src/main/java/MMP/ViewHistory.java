package MMP;



import java.util.List;

//import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ViewHistory {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
		
		driver.manage().window().maximize();
		driver.findElementByLinkText("Profile").click();
		driver.findElement(By.xpath("//div[2]/a[1]/button")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='wrapper']/p[2]/a/input")).click();
		
		
		
		List<WebElement> tbList = driver.findElements(By.xpath("html/body/div[1]/div/div[2]/div[2]/div"));
		String s="Past Transactions";
		String sym="fever";
		for (int i=0;i<tbList.size();i++)
		{		
			if(tbList.get(i).getText().contains(s))
			{
			driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div")).click();
			
			}
			System.out.println("Past Transactions Selected");
		}
		
	}
}

		
		
		
		
	/*	if	(driver.getPageSource().contains(sym))
		{

			System.out.println("Details Found !!!");
				
		}

		else
		{
			System.out.println("Details Not Found !!!");
		}
		}
		}

		
		
	/*	String s="fever";
		
	if	(driver.getPageSource().contains(s))
	{
	
		System.out.println("Details Found !!!");
			
	}
	
	else
	{
		System.out.println("Details Not Found !!!");
	}
	}
}
//button[@type='Save and Continue Edit
//input[@type='button' and @value='Past Appointments'] */

/*	List<WebElement> tbList = driver.findElements(By.xpath("html/body/div[1]/div/div[2]/div[2]/div"));
String s="Past Transactions";
String sym="fever";
for (int i=0;i<tbList.size();i++)
{		
	if(tbList.get(i).getText().contains(s))
	{
	driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div[2]/div")).click();
	System.out.println("Past Transactions Selected");
	}
}
if	(driver.getPageSource().contains(sym))
{

	System.out.println("Details Found !!!");
		
}

else
{
	System.out.println("Details Not Found !!!");
}
}
}
*/