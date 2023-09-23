package StepDefinitions;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;

import BasePackage.BaseClass;
import PageObjectModel.Profile_Change;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Profile_change_step extends BaseClass {
	public Profile_Change sr;
	public Logger log = Logger.getLogger(Profile_change_step.class);
	public void verticleswipebypercentage (double startpercentage, double endpercentage, double anchorpercentage) {

		Dimension size = driver.manage().window().getSize();

		int anchor= (int) (size.width * anchorpercentage);
		int startpoint = (int) (size.height * startpercentage);
		int endpoint = (int) (size.height * endpercentage);

		new TouchAction(driver).press(PointOption.point(anchor,startpoint))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
		.moveTo(PointOption.point(anchor,endpoint)).release().perform();
	}

	public void verticleswipebypercentags (double startpercentage, double endpercentage, double anchorpercentage) {

		Dimension size = driver.manage().window().getSize();

		int anchor= (int) (size.width * anchorpercentage);
		int startpoint = (int) (size.height * startpercentage);
		int endpoint = (int) (size.height * endpercentage);

		new TouchAction(driver).press(PointOption.point(anchor,endpoint))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
		.moveTo(PointOption.point(anchor,startpoint)).release().perform();
	}
	
	@Given("^Workindia app is launched$")
	public void Workindia_app_is_launched() throws Throwable {
	   
		sr = new Profile_Change(driver);
	}




	  
	  

	  
	  @When("^User click on profile button$")
	  public void user_click_on_profile_button() throws Throwable {
	      sr.my_profile();
	      log.info("User clicks on profile button");
	  }

	  @When("^User select My profile option$")
	  public void user_select_My_profile_option() throws Throwable {
		  sr.my_profile2();
		  log.info("User select my profile option");
	  }

	  @Then("^User click on edit button$")
	  public void user_click_on_edit_button() throws Throwable {
	      sr.edit_profile();
	      log.info("User click on edit button");
	  }

	  @Then("^User enter email address \"([^\"]*)\"$")
	  public void user_enter_email_address(String email) throws Throwable {
	      sr.edit_email(email);
	  }

	  @Then("^User click on done button$")
	  public void user_click_on_done_button() throws Throwable {
		  sr.edit_done();
		  Thread.sleep(2000);
		  verticleswipebypercentage(0.70, 0.10,0.50);
		
	  }
	  
	  @Then("^User click on update profile$")
	  public void user_click_on_update_profile() throws Throwable {
		  Thread.sleep(2000);
		  verticleswipebypercentage(0.70, 0.10,0.50);
		  sr.update_pofile();
	      verticleswipebypercentags(0.70, 0.10,0.50);
	      Thread.sleep(1000);
	      verticleswipebypercentags(0.70, 0.10,0.50); 
	      sr.back_to_home();
	  }

	  @When("^User click on profile$")
	  public void user_click_on_profile() throws Throwable {
		  sr.my_profile();    
	      Thread.sleep(2000);
	      verticleswipebypercentage(0.70, 0.10,0.50);
	  }

	  @When("^User select change language option$")
	  public void user_select_change_language_option() throws Throwable {
		  sr.Change_Language();
		  sr.Setting_Lnaguage();
		  log.info("User select change language options");
	  }

	 

	  @Then("^User select language$")
	  public void user_select_language() throws Throwable {
		  sr.choose_lnaguage();
	      Thread.sleep(3000);
	      log.info("User select  language ");
	  }
	  //secnario5
		@Then("^user click on tip button$")
		public void user_click_on_tip_button() throws Throwable {
		    
			sr.TipsButton();
		   verticleswipebypercentage(0.70, 0.10,0.50);
		   
		}

		@Then("^user click on like button$")
		public void user_click_on_like_button() throws Throwable {
		    
			verticleswipebypercentage(0.70, 0.10,0.50);
			sr.LikeButton();
			log.info("User click on like button");
		}

}
