package MMP;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SendMessages {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver","geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/index.php");

	}

}
