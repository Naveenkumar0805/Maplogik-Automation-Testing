package MLStepDefinition;

import java.awt.AWTException;

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
	
	@When("the user select a particular internship to view the candidates applied")
	public void the_user_select_a_particular_internship_to_view_the_candidates_applied() throws AWTException {
		
		approve.selectinternship();
		
	}

	@Then("select the right candidate fit for the internship")
	public void select_the_right_candidate_fit_for_the_internship() {
	    
		approve.candidateselect();
		
	}

	@Then("approve the internship of the selected candidate")
	public void approve_the_internship_of_the_selected_candidate() {

		
		approve.approval();
	}


	@Then("the user clicks approve internship and check the interns applied")
	public void the_user_clicks_approve_internship_and_check_the_interns_applied() {
	    
		approve.viewdetails();
		
	}
	


}
