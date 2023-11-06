package ML_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends MLBaseclass {

	public void openML() {
		
		driver.get("https://www.maplogik.com/index.php/admin/login");
	}

	public void entercredentials(String username, String password) {
		
		WebElement usernameinput = driver.findElement(By.id("login-email"));
		WebElement passwordinput = driver.findElement(By.id("login-password"));
		
		usernameinput.sendKeys(username);
		passwordinput.sendKeys(password);
	}
	
	public void clicklogin() {
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary w-100 waves-effect waves-float waves-light']")).click();
	}
}
