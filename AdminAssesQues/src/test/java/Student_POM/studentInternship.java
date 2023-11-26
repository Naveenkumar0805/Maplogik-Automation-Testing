package Student_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class studentInternship extends studentbaseclass {

	public void internship() {

		initializeWait();

		WebElement internship = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='menu-title text-truncate'])[10]")));
		internship.click();


	}

	public void general() {
		

		initializeWait();

		WebElement general = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='General Internship']")));
		general.click();

		WebElement apply = driver.findElement(By.xpath("(//button[@class='btn btn-info me-1 waves-effect waves-float waves-light'])[1]"));
		clickWithJavaScript(driver, apply);
		
	}

	public void skillmatching() {	

		WebElement skillmatching = driver.findElement(By.xpath("//a[text()='Skill Matching Internship']"));
		skillmatching.click();

		WebElement apply1 = driver.findElement(By.xpath("(//button[@class='btn btn-info me-1 waves-effect waves-float waves-light'])[1]"));
		clickWithJavaScript(driver, apply1);


	}

}
