package MMP;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPage {
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");
		
		driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/ul/li[8]/a/span")).click();
		String title=driver.getTitle();
		System.out.println("The title of the Page is :  " + title);
		String t1= driver.findElement(By.xpath("(//label)[1]")).getText();
		System.out.println("The label 1 is :   "+t1);
		
		String t2=driver.findElement(By.xpath("(//label)[2]")).getText();
		System.out.println("The label 2 is :   "+t2);
		
		 String t3=driver.findElement(By.xpath("//input[@value='Send']")).getAttribute("value");
		 System.out.println("The label 3 is :   "+t3);
		
}
}
