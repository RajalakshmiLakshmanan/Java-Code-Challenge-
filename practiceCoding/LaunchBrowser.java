package practiceCoding;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Raji");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India");
		boolean enabled = driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled();
		System.out.println("Check fied is enabled:"+enabled);
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("raji",Keys.ENTER);

	}

}
