package Check_box;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CheckBoxPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/alibaba/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkBoxOne=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		checkBoxOne.click();
	}

}
