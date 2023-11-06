package ML_POM;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class assesmentques extends MLBaseclass {

	String filepath = "C:\\Users\\Admin\\Desktop\\New folder\\Maplogik Asses Ques.xlsx";
	public assesmentques(WebDriver driver) {
        PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//*[@name='question_name']")
	public WebElement questionname;

	@FindBy(xpath = "//*[@name='question_option1']")
	public WebElement optionAvalue;

	@FindBy(xpath = "//*[@name='question_option2']")
	public WebElement optionBvalue;

	@FindBy(xpath = "//*[@name='question_option3']")
	public WebElement optionCvalue;

	@FindBy(xpath = "//*[@name='question_option4']")
	public WebElement optionDvalue;
	
	
	

	public void aasesquestion() throws IOException {

		//MLBaseclass.excelwriter(filepath);

		FileInputStream fis = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);

		for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
			XSSFRow row = sheet.getRow(rowIndex);

			if (row != null) {
				String question = row.getCell(0).getStringCellValue();
				questionname.sendKeys(question);
				String optionA = row.getCell(1).getStringCellValue();
				optionAvalue.sendKeys(optionA);
				String optionB = row.getCell(2).getStringCellValue();
				optionBvalue.sendKeys(optionB);
				String optionC = row.getCell(3).getStringCellValue();
				optionCvalue.sendKeys(optionC);
				String optionD = row.getCell(4).getStringCellValue();
				optionDvalue.sendKeys(optionD);
				

				// Print or use the data as needed
				System.out.println("Question: " + question);
				System.out.println("OptionA: " + optionA);
				System.out.println("OptionB: " + optionB);
				System.out.println("OptionC: " + optionC);
				System.out.println("OptionD: " + optionD);
				
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("window.scrollBy(0,350)", " ");
				
				initializeWait();
				WebElement correctanswer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='correctanswer']")));
				correctanswer.click();
				
				WebElement selectoption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='correctanswer']/*[@value='1']")));
				selectoption.click();
				
				WebElement save = driver.findElement(By.xpath("//*[@id='submitbtn']"));
				save.click();
				
				if(rowIndex!=sheet.getLastRowNum())		{		
				WebElement addnew = driver.findElement(By.xpath("//a[@href='https://www.maplogik.com/index.php/admin/training/addAssessment/5']"));
				addnew.click();
				
				}
			}
		}
	}
}
