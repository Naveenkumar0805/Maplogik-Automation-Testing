package CL_POM;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CLapproveinternship extends CLBaseclass {
	
	public void internship() {

		WebElement intern = driver
				.findElement(By.xpath("//a[@href='https://company.maplogik.com/public/intership-table']"));
		intern.click();

		WebElement approveinternship = driver
				.findElement(By.xpath("//a[@class='btn btn-primary text-white font-weight-bold pull-right']"));
			clickWithJavaScript(driver, approveinternship);

	}
	
	
	public void selectinternship() throws AWTException {
		
		initializeWait();
		WebElement internshiptitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id='intern_get'])[1]")));
		clickWithJavaScript(driver, internshiptitle);
		
	}
	
	public void candidateselect() {
		
		for(int i=1; i<=7; i++) {
		
		WebElement selectcandidate = driver.findElement(By.xpath("(//*[@id='checkboxnew'])["+ i +"]"));		
		clickWithJavaScript(driver, selectcandidate);
		
}
	}
	
	public void approval() {
		
		WebElement approve = driver.findElement(By.id("approve-intern"));
		clickWithJavaScript(driver, approve);
		
		initializeWait();		
		WebElement okay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='swal2-confirm swal2-styled']")));
		okay.click();
		
	}
	
	
	public void viewdetails() {
		
		initializeWait();
		
		WebElement view = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@id=\"intern_app\"])[1]")));		
		clickWithJavaScript(driver, view);

		WebElement Highlyskilled = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn bg-primary text-white font-weight-bold percentage-filter1 mr-2' and @data-id='6']")));		
		clickWithJavaScript(driver, Highlyskilled);

		WebElement Eightypluspercent = driver.findElement(By.xpath("//button[@class='btn bg-primary text-white font-weight-bold percentage-filter1 mr-2' and @data-id='1']"));
		Eightypluspercent.click();
		
		WebElement seventy_to_eightypercent = driver.findElement(By.xpath("//button[@class='btn bg-primary text-white font-weight-bold percentage-filter1 mr-2' and @data-id='2']"));
		seventy_to_eightypercent.click();
		
		WebElement sixty_to_seventy = driver.findElement(By.xpath("//button[@class='btn bg-primary text-white font-weight-bold percentage-filter1 mr-2' and @data-id='3']"));
		sixty_to_seventy.click();
		
		WebElement forty_to_sixty = driver.findElement(By.xpath("//button[@class='btn bg-primary text-white font-weight-bold percentage-filter1 mr-2' and @data-id='4']"));
		forty_to_sixty.click();
		
		WebElement backlog = driver.findElement(By.xpath("//button[@class='btn bg-primary text-white font-weight-bold percentage-filter1 mr-2' and @data-id='5']"));
		backlog.click();
		
	}
	
	

}
