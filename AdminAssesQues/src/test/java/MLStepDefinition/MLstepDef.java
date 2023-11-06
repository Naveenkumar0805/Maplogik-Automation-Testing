package MLStepDefinition;

import java.io.IOException;

import ML_POM.LoginPage;
import ML_POM.MLBaseclass;
import ML_POM.assesmentques;
import ML_POM.skillenhancement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MLstepDef extends MLBaseclass {

	LoginPage login = new LoginPage();
	skillenhancement skilltrainings = new skillenhancement();
	assesmentques assesment = new assesmentques(getDriver());

	@Given("The user is on the admin login page")
	public void the_user_is_on_the_admin_login_page() {
		getDriver();
		login.openML();
	}
	
	
	@When("the user enters the username and password")
	public void the_user_enters_the_username_and_password() {
	 login.entercredentials("admin@gmail.com", "Admin@123");
	 login.clicklogin();
	 }
	
	
	@Then("the user should be navigated to the homepage and clicks skill enhancement")
	public void the_user_should_be_navigated_to_the_homepage_and_clicks_skill_enhancement() {
	   skilltrainings.skill();
	}
	
	
	@Then("click on all trainings under submenu of skill enhancement")
	public void click_on_all_trainings_under_submenu_of_skill_enhancement() {
	    skilltrainings.alltrainings();
	}
	
	
	@When("the user clicks add assessment icon under action column")
	public void the_user_clicks_add_assessment_icon_under_action_column() {
		skilltrainings.addassesment();
	}
	
	
	@Then("click on the add new button and adds the assessment questions and answers")
	public void click_on_the_add_new_button_and_adds_the_assessment_questions_and_answers() throws IOException {
	    assesment.aasesquestion();
	}

}
