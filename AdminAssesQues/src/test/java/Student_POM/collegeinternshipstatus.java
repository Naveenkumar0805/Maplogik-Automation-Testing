package Student_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import CL_POM.CLBaseclass;

public class collegeinternshipstatus extends CLBaseclass {
	
	public void internshipstatus() {
		
		initializeWait();
		
		WebElement status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='menu-title text-truncate'])[4]")));
		status.click();
		
	}
	
	public void generalinternship() {
		
		initializeWait();
		
		WebElement general = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='General Internship']")));
		general.click();
		
		WebElement totalstudents_applied = driver.findElement(By.xpath("//a[@href='https://www.maplogik.com/index.php/college/totalnoofstudents/92']"));
		totalstudents_applied.click();
		
		driver.navigate().back();
		
		WebElement programwise_details = driver.findElement(By.id("btnAuth0"));
		programwise_details.click();
		
		WebElement programs_numofstudents = driver.findElement(By.xpath("//a[@href='https://www.maplogik.com/index.php/college/internshipstudents/92/37']"));
		programs_numofstudents.click();
		
		driver.navigate().back();
	}
	
	public void skillmatchinginternship() {
		
		initializeWait();
		
		WebElement skillmatching = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Skill Matching Internship']")));
		skillmatching.click();
		
		WebElement totalstudents_applied = driver.findElement(By.xpath("//a[@href='https://www.maplogik.com/index.php/college/totalnoofstudents/94']"));
		totalstudents_applied.click();
		
		driver.navigate().back();
		
		WebElement programwise_details = driver.findElement(By.id("btnAuth0"));
		programwise_details.click();
		
		WebElement programs_numofstudents = driver.findElement(By.xpath("//a[@href='https://www.maplogik.com/index.php/college/internshipstudents/94/37']"));
		programs_numofstudents.click();
		
		WebElement logout = driver.findElement(By.xpath("(//span[@class='menu-title text-truncate'])[8]"));
		logout.click();
		
	}
	
	

}
