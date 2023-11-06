package Student_POM;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class studentskills extends studentbaseclass {


	public void skills() {

		initializeWait();
		WebElement findskill = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='menu-title text-truncate'])[5]")));
		findskill.click();
	}

	public void skillenhancement() {

		initializeWait();
		WebElement skillset = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a/span[@class='menu-title text-truncate']/b[contains(text(),'Skill Enhancement')]")));
		skillset.click();
	}

	public void selectcourse() throws AWTException, IOException {

				
		initializeWait();
		WebElement course = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://www.maplogik.com/index.php/student/training/5']")));
		course.click();
		
		fullscreenshot("C:\\\\Users\\\\Admin\\\\Desktop\\\\New folder\\\\MLscreenshots\\\\submit222.png");
	}

	
}
