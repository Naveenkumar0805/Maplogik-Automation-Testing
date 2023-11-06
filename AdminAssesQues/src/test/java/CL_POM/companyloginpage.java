package CL_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class companyloginpage extends CLBaseclass {
	
	public void opencompanylogin() {
		
		driver.get("https://company.maplogik.com/public/login");
		
	}
	
	public void enterusername(String username) {
		
		WebElement usernameinput = driver.findElement(By.id("mobile"));
		usernameinput.sendKeys(username);
		
		WebElement generateOTP = driver.findElement(By.xpath("//button[@class='btn btn-primary text-decoration-none text-white']"));
		generateOTP.click();
		
	}
	
	public void login() {
		
		WebElement OTP = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
		String text = OTP.getText();
		//int x=Integer.parseInt(text.split(" ")[5]);
		//String OTPnumber=Integer.toString(x); 
		
		// Extract numbers from the text
        StringBuilder extractedNumbers = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                extractedNumbers.append(c);
            }
        }

        // Convert the extracted numbers to a String
        String OTPnumber = extractedNumbers.toString();
			
		WebElement enterOTP = driver.findElement(By.id("otp"));
		enterOTP.sendKeys(OTPnumber);
		
		WebElement OTPlogin = driver.findElement(By.xpath("//button[@type='submit']"));
		OTPlogin.click();
		
		
	}

	
}
