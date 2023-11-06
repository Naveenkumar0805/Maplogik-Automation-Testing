package MLStepDefinition;

import java.io.IOException;

import CL_POM.CLBaseclass;
import CL_POM.companyloginpage;
import CL_POM.internshippage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CLstepDef extends CLBaseclass {
	
	companyloginpage companylogin = new companyloginpage();
	internshippage internpage = new internshippage();
	
	@Given("The user is on the company login page")
	public void the_user_is_on_the_company_login_page() {
	    
		getDriver();
		companylogin.opencompanylogin();
		
	}

	@When("the user enters the username to generate OTP")
	public void the_user_enters_the_username_to_generate_otp() {
	    
		companylogin.enterusername("8122809348");
	}

	@When("enters the OTP and click login")
	public void enters_the_otp_and_click_login() {
	    
		companylogin.login();
	}

	@Then("the user should be navigated to maplogik dashboard and clicks internship")
	public void the_user_should_be_navigated_to_maplogik_dashboard_and_clicks_internship() {
		
		internpage.internship();
	    
	}

	@Then("the user clicks post internship and enter the details and click on post")
	public void the_user_clicks_post_internship_and_enter_the_details_and_click_on_post() throws InterruptedException, IOException {
	    
		internpage.internshipdetails();
		internpage.titleanddescription();
		internpage.internduration();
	}


}
