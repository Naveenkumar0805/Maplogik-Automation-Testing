package Student_POM;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class studentbaseclass {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public WebDriver getDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public static void initializeWait() {
		wait = new WebDriverWait(driver, 10); // Initialize the wait object with a timeout of 10 seconds.
	}

	public static void robotpagedown() throws AWTException {

		Robot robot = new Robot();

		// Scroll Down using Robot class
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot screenshot = (TakesScreenshot) webdriver;
		// Call getScreenshotAs method to create image file
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		// Move image file to new destination
		File destinationfile = new File(fileWithPath);
		// Copy file at destination
		FileUtils.copyFile(sourcefile, destinationfile);
	}
	
	public static void fullscreenshot(String path) throws AWTException, IOException {
		
		Robot robot = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		 Rectangle rectangle = new Rectangle(screensize);
		 BufferedImage source = robot.createScreenCapture(rectangle);
		 File destinationfile = new File(path);
		 ImageIO.write(source, "PNG", destinationfile);
		
	}
	
	public static void clickWithJavaScript(WebDriver driver, WebElement element) {
	      JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", element);
	    }


}
