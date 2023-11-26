package MLStepDefinition;

import CL_POM.CLBaseclass;
import Student_POM.collegeinternshipstatus;
import Student_POM.collegeloginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class collegeinternStatus_StepDef extends CLBaseclass{
	
	
	collegeloginpage collegelogin = new collegeloginpage();
	collegeinternshipstatus internstatus = new collegeinternshipstatus();
	
	@Given("The user is on the maplogik college login page")
	public void the_user_is_on_the_maplogik_college_login_page() {
		
		 getDriver();
		 collegelogin.opencollegelogin();
		
		}

	@When("the user enters the username and password in college login page")
	public void the_user_enters_the_username_and_password_in_college_login_page() {

		
		collegelogin.entercredentials("admindhana@gmail.com", "Test@123");
		collegelogin.clicklogin();
		
	}

	@Then("the student should be navigated to the homepage and clicks internship status")
	public void the_student_should_be_navigated_to_the_homepage_and_clicks_internship_status() {
	 
		internstatus.internshipstatus();
		
	}

	@Then("clicks general internship to check the intern details")
	public void clicks_general_internship_to_check_the_intern_details() {
	   
		internstatus.generalinternship();
	}

	@Then("clicks skill matching internship to check the intern details")
	public void clicks_skill_matching_internship_to_check_the_intern_details() {

		internstatus.skillmatchinginternship();
	}




}
