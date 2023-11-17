package CL_POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class internshippage extends CLBaseclass {

	public void internship() {

		WebElement intern = driver
				.findElement(By.xpath("//a[@href='https://company.maplogik.com/public/intership-table']"));
		intern.click();

		WebElement postinternship = driver
				.findElement(By.xpath("//a[@class='btn btn-primary text-white font-weight-bold']"));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", postinternship);

	}

	public void internshipdetails() throws InterruptedException, IOException {

		initializeWait();
		WebElement collegetype = wait.until(ExpectedConditions.elementToBeClickable(By.id("select2-college_type-container")));
		collegetype.click();
		List<WebElement> collegeoptions = collegetype.findElements(By.xpath("//select[@id='college_type']//option[2]"));
		collegeoptions.get(0).click();

		WebElement graduationtype = driver.findElement(By.id("select2-department_type-container"));
		graduationtype.click();
		List<WebElement> graduationoptions = graduationtype.findElements(By.xpath("//select[@id='department_type']//option[3]"));
		graduationoptions.get(0).click();

		WebElement department = driver.findElement(By.xpath("//span[@data-select2-id='5']"));
		department.click();
		WebElement departmentoption = driver.findElement(By.xpath("(//*[text()='BE CSE'])[1]"));
		departmentoption.click();

		WebElement location = driver.findElement(By.xpath("//span[@data-select2-id='9']"));
		location.click();
		WebElement locationoption = driver.findElement(By.xpath("//*[text()='Chennai']"));
		locationoption.click();
	}

	public void titleanddescription() throws IOException {

		WebElement interntitle = driver.findElement(By.id("title"));
		WebElement interndescription = driver.findElement(By.id("description"));

		String filepath = "C:\\Users\\Admin\\Desktop\\New folder\\Maplogik Asses Ques.xlsx";

		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(1);

		int rowIndex = 4;

		XSSFRow row = sheet.getRow(rowIndex);

		if (row != null) {
			String title = row.getCell(0).getStringCellValue();
			interntitle.sendKeys(title);

			String description = row.getCell(1).getStringCellValue();
			interndescription.sendKeys(description);


		}
	}

	public void internduration() {

		WebElement startdate = driver.findElement(By.id("start_date"));
		startdate.sendKeys("12092023"+Keys.ENTER);

		WebElement vacancies = driver.findElement(By.id("intern_reg"));
		vacancies.sendKeys("5"+Keys.ENTER);

		WebElement duration = driver.findElement(By.id("duration"));
		duration.sendKeys("3"+Keys.ENTER);

		WebElement stipend = driver.findElement(By.id("salary"));
		stipend.sendKeys("15,000"+Keys.ENTER);
		
		initializeWait();		
		WebElement posted = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@type='button'])[3]")));
		posted.click();

	}


}


