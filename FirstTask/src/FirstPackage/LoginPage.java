package FirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\arpit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='JFPqaw']/span")).click();
		driver.findElement(By.xpath("//a[@href='/travel/flights?param=FKHPNavTravelBBDSep23&fm=neo%2Fmerchandising&iid=M_a6b1a6b6-8110-42b7-af04-6e326aafcc75_1_FBB4FBSRQIC6_MC.9ODHZCZ094O6&otracker=hp_rich_navigation_9_1.navigationCard.RICH_NAVIGATION_Flights_9ODHZCZ094O6&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_9_L0_view-all&cid=9ODHZCZ094O6\']")).click();	
		
	}

}