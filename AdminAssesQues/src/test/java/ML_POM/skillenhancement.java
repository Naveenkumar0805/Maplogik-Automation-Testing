package ML_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class skillenhancement extends MLBaseclass {
	
	
	public void skill() {
		
		driver.findElement(By.xpath("//*[contains(text(),'Skill Enhancement')]")).click();
	
	}
	
	public void alltrainings() {
		
		MLBaseclass.initializeWait();
		WebElement trainings = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'All Trainings')]")));
		trainings.click();
	}

	public void addassesment() {
		
		WebElement action = driver.findElement(By.xpath("//a[@href='https://www.maplogik.com/index.php/admin/training/quizlist/5']"));
		action.click();
		
		WebElement addnew = driver.findElement(By.xpath("//a[@href='https://www.maplogik.com/index.php/admin/training/addAssessment/5']"));
		addnew.click();
		
	}
	
}
