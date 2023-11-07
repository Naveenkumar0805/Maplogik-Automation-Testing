package MLStepDefinition;

import CL_POM.CLBaseclass;
import CL_POM.CLapproveinternship;
import CL_POM.companyloginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CLapproveinternship_StepDef extends CLBaseclass{
	
	companyloginpage companylogin = new companyloginpage();
	CLapproveinternship approve = new CLapproveinternship();

	@Given("The user is on the company page login")
	public void the_user_is_on_the_company_page_login() {
	  
		getDriver();
		companylogin.opencompanylogin();
	}

	@When("the user enters username to generate OTP")
	public void the_user_enters_username_to_generate_otp() {
	  
		companylogin.enterusername("8122809348");
	}

	@When("enters the OTP given and click login")
	public void enters_the_otp_given_and_click_login() {
		
		companylogin.login();
	}

	@Then("the user should be navigated to maplogik dashboard page and clicks internship")
	public void the_user_should_be_navigated_to_maplogik_dashboard_page_and_clicks_internship() {
	  
		approve.internship();
	}

	@Then("the user clicks approve internship and check the interns applied")
	public void the_user_clicks_approve_internship_and_check_the_interns_applied() {
	    
		approve.viewdetails();
		
	}


}
