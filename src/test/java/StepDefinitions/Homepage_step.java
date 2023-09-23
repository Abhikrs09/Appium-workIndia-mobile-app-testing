package StepDefinitions;



import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.Dimension;

import BasePackage.BaseClass;

import PageObjectModel.Home_page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Homepage_step extends BaseClass {
	
	public Home_page sc;
	public Logger log = Logger.getLogger(Homepage_step.class);
	public void verticleswipebypercentage (double startpercentage, double endpercentage, double anchorpercentage) {
		Dimension size = driver.manage().window().getSize();

		int anchor= (int) (size.width * anchorpercentage);
		int startpoint = (int) (size.height * startpercentage);
		int endpoint = (int) (size.height * endpercentage);

		new TouchAction(driver).press(PointOption.point(anchor,startpoint))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
		.moveTo(PointOption.point(anchor,endpoint)).release().perform();
	}
		
	    
		@Given("^workindia app is launched$")
		
		public void workindia_app_is_launched() throws Throwable {
		    sc=new Home_page(driver);
		    log.info("App is launched");
		   
		    
		}
		@When("^User click on continue$")
		public void user_click_on_continue() throws Throwable {
		    sc.continue_();
		    log.info("User clicked on continue button");
		    
		}
		@Then("^User click on ok$")
		public void user_click_on_ok() throws Throwable {
		    sc.ok_();
		    log.info("User clicked on ok button");
		    
		   

		}

		@When("^user enters name \"([^\"]*)\"$")
		public void user_enters_name(String arg1) throws Throwable {
		   sc.getname(arg1);
		   log.info("User enters his name");
		    

		}

		@When("^user enters \"([^\"]*)\"$")
		public void user_enters(String arg1) throws Throwable {
		    sc.getno(arg1);
		    log.info("User enters his mobile no");
		   
		}

		@Then("^User click on submit button$")
		public void user_click_on_submit_button() throws Throwable {
		    sc.clickButton();
		    log.info("User clicked on submit button");
		   

		}

		@Then("^user choose the city$")
		public void user_choose_the_city() throws Throwable {
		    
		    sc.select();
		    
		    log.info("User choose the city");
		}

		@Then("^user enter \"([^\"]*)\"$")
		public void user_enter(String arg1) throws Throwable {
		   
		    sc.nearestCity(arg1);
		}

		@Then("^user click on the submit button$")
		public void user_click_on_the_submit_button() throws Throwable {
		    
			sc.submit();
		   	}
		


		@Given("^user have to select his Gender$")
		public void user_have_to_select_his_Gender() throws Throwable {
		    
		    sc.Gender();
		}

		@Then("^user have to select his Qualification$")
		public void user_have_to_select_his_Qualification() throws Throwable {
		    
		    sc.Qualification();
		}

		@Then("^user have to select his School Medium Was$")
		public void user_have_to_select_his_School_Medium_Was() throws Throwable {
		    
		    sc.Medium();
		    log.info("User select school medium");
		}

		@Then("^user have to select how fluent his English is$")
		public void user_have_to_select_how_fluent_his_English_is() throws Throwable {
		    
			sc.speakEnglish();
			verticleswipebypercentage(0.70, 0.10,0.50);
		}

		@Then("^user have to select his Fresher/Experience$")
		public void user_have_to_select_his_Fresher_Experience() throws Throwable {
		    
		    sc.Fresher();
		    verticleswipebypercentage(0.70, 0.5,0.25);
		}

		@Then("^user have to select his age$")
		public void user_have_to_select_his_age() throws Throwable {
		    
		    sc.Age();
		    sc.SelectAge();
		    verticleswipebypercentage(0.70, 0.5,0.25);
		    log.info("User selects his age");
		}

		@Then("^user have to select his profession intrest$")
		public void user_have_to_select_his_profession_intrest() throws Throwable {
		   
		    sc.ProfessionIntreset();
		}

		@Then("^user click on the intrest submit button$")
		public void user_click_on_the_intrest_submit_button() throws Throwable {
		    
		    sc.Submit();
		}

		@Then("^user select his Technical skill$")
		public void user_select_his_Technical_skill() throws Throwable {
		    
		    sc.technicalSkill();
		}

		@Then("^user choose his option$")
		public void user_choose_his_option() throws Throwable {
		   
		    sc.ElectricalOption();
		}

		@Then("^user click on Submit button$")
		public void user_click_on_Submit_button() throws Throwable {
		    
		    sc.submitOpttion();
		}

		@Then("^user choose his Degree$")
		public void user_choose_his_Degree() throws Throwable {
		   
		    sc.yourDegree();
		}

		@Then("^user click on Desired degree$")
		public void user_click_on_Desired_degree() throws Throwable {
		    
		   sc.DegreeSelect();
		}

		@Then("^user yes/no$")
		public void user_yes_no() throws Throwable {
		    
		    sc.No();
		}

		@Then("^user click on submits button$")
		public void user_click_on_submits_button() throws Throwable {
		   
		    sc.Submit();
		}

		@Then("^user choose his language$")
		public void user_choose_his_language() throws Throwable {
		    
		    sc.selectLanguage();
		}
		
		

		
		@When("^User have to click on filter$")
		public void user_have_to_click_on_filter() throws Throwable {
			Thread.sleep(20000);
		  sc.filter_();
		}

		@When("^User have to choose Interesed aria for job$")
		public void user_have_to_choose_Interesed_aria_for_job() throws Throwable {
		  sc.interesed_area1();
		}

		@Then("^click on apply$")
		public void click_on_apply() throws Throwable {
		  sc.Apply_filter();
		  Thread.sleep(5000);
		  verticleswipebypercentage(0.70, 0.10,0.50);
		  
		}


		@Given("^User have to search near location for job \"([^\"]*)\"$")
		public void user_have_to_sreach_near_location_for_job(String location) throws Throwable {
		   sc.Search(location);
		   Thread.sleep(3000);
		   log.info("User search nearest location");
		}

		@When("^Use have to Select Jobs$")
		public void use_have_to_Selcet_Jobs() throws Throwable {
		   sc.job_favorite1();
		   log.info("User select job");
		}

		  @Then("^User Have to click on favorite button to save job for later$")
		public void user_Have_to_click_on_favorite_button_to_save_job_for_later() throws Throwable {
		    sc.Add_to_favortite();
		    Thread.sleep(3000);
		}
		  @Then("^User have to go back to select another job$")
		  public void user_have_to_go_back_to_select_another_job() throws Throwable {
		    sc.back();
		  }

		  @Then("^User have to select another job$")
		  public void user_have_to_select_another_job() throws Throwable {
		    sc.job_favorite2();
		  }

		  @Then("^User have to click on favorite button$")
		  public void user_have_to_click_on_favorite_button() throws Throwable {
		    sc.Add_to_favortite();
		  }

		  @When("^User have go back for cheking Favorite Job List$")
		  public void user_have_go_back_for_cheking_Favorite_Job_List() throws Throwable {
		    sc.back();
		  }

		  @Then("^Click on profile$")
		  public void click_on_prifle() throws Throwable {
		      sc.my_profile();
		      log.info("User clicks on profile");
		  }

		  @Then("^Click on my favorite job$")
		  public void click_on_my_favorite_job() throws Throwable {
		    sc.my_favorite_job();
		   
		    sc.back();
		  }
}