package CL_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CLAvailabilityOfInterns extends CLBaseclass {
	
	public void availability() {
		
		WebElement course = driver.findElement(By.id("college_type"));
		course.click();
		
		WebElement selectcourse = driver.findElement(By.xpath("(//*[text()= 'Engineering'])[1]"));
		selectcourse.click();
		
		WebElement program = driver.findElement(By.id("dept_type"));
		program.click();
		
		WebElement selectprogram = driver.findElement(By.xpath("//*[text()= 'UG']"));
		selectprogram.click();
		
		
		
		
	}

}
