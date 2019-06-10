import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_git {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bmohanty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//*[@class='_3Njdz7'] //*[@class='_2AkmmA _29YdH8']")).click();

		Thread.sleep(1000L);
		WebElement searchBox = driver.findElement(By.xpath("//*[@class='O8ZS_U'] //*[@type='text']"));
		searchBox.sendKeys("puma");
		Thread.sleep(2000L);
		int i=1;
		while(i<5) {
		searchBox.sendKeys(Keys.ARROW_DOWN);
		i++;
		}
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(5000L);
		System.out.println(driver.getTitle());

	}

}
