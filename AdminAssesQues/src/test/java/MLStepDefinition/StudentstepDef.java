package MLStepDefinition;

import java.awt.AWTException;
import java.io.IOException;

import Student_POM.studentassessment;
import Student_POM.studentbaseclass;
import Student_POM.studentloginpage;
import Student_POM.studentskills;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentstepDef extends studentbaseclass {
	
	studentloginpage studentlogin = new studentloginpage();
	studentskills enhancement = new studentskills();
	studentassessment assessment = new studentassessment();
	
	@Given("The user is on the student login page")
	public void the_user_is_on_the_student_login_page() {
		
	 getDriver();
	 studentlogin.openstudentlogin();
	}

	@When("the student enters the username and password")
	public void the_student_enters_the_username_and_password() {
		
		studentlogin.entercredentials("CJF_1", "Test@123");
		studentlogin.clicklogin();
	}

	@Then("the student should be navigated to the homepage and clicks skill enhancement")
	public void the_student_should_be_navigated_to_the_homepage_and_clicks_skill_enhancement() {
	   
		enhancement.skills();
		enhancement.skillenhancement();
	}

	@Then("the student should select the course and proceed to the payment")
	public void the_student_should_select_the_course_and_proceed_to_the_payment() throws AWTException, IOException {
	   
		enhancement.selectcourse();
		
		
	}

	@When("the student clicks start training and start the assesment")
	public void the_student_clicks_start_training_and_start_the_assesment() throws AWTException {
	
		assessment.training();
		
	}

	@Then("answer the questions provided and submit the exam")
	public void answer_the_questions_provided_and_submit_the_exam() throws Exception {
	    
		assessment.answeringquestions();
	}




}
