package MLStepDefinition;

import Student_POM.studentInternship;
import Student_POM.studentbaseclass;
import Student_POM.studentloginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class studentInternshipStepDef extends studentbaseclass {
	
	studentloginpage studentlogin = new studentloginpage();
	studentInternship internship = new studentInternship();
	
	@Given("The user is on the maplogik student login page")
	public void the_user_is_on_the_maplogik_student_login_page() {
		
		 getDriver();
		 studentlogin.openstudentlogin();
	}

	@When("the student enters username and password")
	public void the_student_enters_username_and_password() {
		
		studentlogin.entercredentials("RV_1006", "Test@123");
		studentlogin.clicklogin();
	}

	@Then("the student should be navigated to the homepage and clicks internship")
	public void the_student_should_be_navigated_to_the_homepage_and_clicks_internship() {
	
		internship.internship();
	}

	@Then("apply for a required internship program in general and skill matching internships")
	public void apply_for_a_required_internship_program_in_general_and_skill_matching_internships() {
	
		//internship.general();
		internship.skillmatching();
	}

}
