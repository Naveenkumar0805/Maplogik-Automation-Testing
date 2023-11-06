package Student_POM;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class studentassessment extends studentbaseclass {

	public void training() throws AWTException {

		WebElement starttraining = driver.findElement(By.xpath(
				"//*[@class='btn btn-primary btn-cart me-0 me-sm-1 mb-1 mb-sm-0 waves-effect waves-float waves-light']"));
		starttraining.click();

		initializeWait();
		WebElement startassessment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//a[@class='btn btn-primary btn-cart me-0 me-sm-1 mb-1 mb-sm-0 waves-effect waves-float waves-light']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", startassessment);

		robotpagedown();
		WebElement readyforassess = driver.findElement(
				By.xpath("//a[@class='btn btn-success btn-lg mb-4 waves-effect waves-float waves-light']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", readyforassess);

	}

	public void answeringquestions() throws Exception {

		for (int i = 2; i <= 11; i++) {

			WebElement selectanswers = driver.findElement(By.xpath("(//input[@value='1'])[" + i + "]"));
			selectanswers.click();

			if (i < 11) {

				WebElement nextoption = driver.findElement(By.xpath("//button[@id='next']"));
				nextoption.click();

			}

		}

		WebElement submitexam = driver.findElement(By.cssSelector("#submitbtn"));
		submitexam.click();
		
		
		takeSnapShot(driver, "C:\\Users\\Admin\\Desktop\\New folder\\MLscreenshots\\submit.png");

		fullscreenshot("C:\\\\Users\\\\Admin\\\\Desktop\\\\New folder\\\\MLscreenshots\\\\submit222.png");
	}
}
