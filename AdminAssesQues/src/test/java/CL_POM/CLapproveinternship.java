package CL_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CLapproveinternship extends CLBaseclass {
	
	public void internship() {

		WebElement intern = driver
				.findElement(By.xpath("//a[@href='https://company.maplogik.com/public/intership-table']"));
		intern.click();

		WebElement approveinternship = driver
				.findElement(By.xpath("//a[@class='btn btn-primary text-white font-weight-bold pull-right']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", approveinternship);

	}
	
	public void viewdetails() {
		
		WebElement view = driver.findElement(By.id("intern_app"));
		view.click();
		
		initializeWait();
		
		WebElement Highlyskilled = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn bg-primary text-white font-weight-bold percentage-filter1 mr-2' and @data-id='6']")));
		//Highlyskilled.click();
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", Highlyskilled);
		
		//WebElement Eightypluspercent = driver.findElement(By.xpath("//button[@class='btn bg-primary text-white font-weight-bold percentage-filter1 mr-2' and @data-id='1']"));
		//Eightypluspercent.click();
		
	}

}