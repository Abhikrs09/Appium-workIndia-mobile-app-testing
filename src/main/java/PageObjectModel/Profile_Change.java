package PageObjectModel;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Profile_Change {
public Profile_Change(AppiumDriver<MobileElement> driver)
	
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
			+ "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
			+ "widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget."
			+ "FrameLayout[4]/android.view.ViewGroup/android.widget.TextView")
	public MobileElement profile;
	
	public void my_profile()
	{
		profile.click();	   
	}
	
	
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
			+ "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
			+ "LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget."
			+ "FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android."
			+ "widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	public MobileElement profile2;
	
	public void my_profile2()
	{
		profile2.click();	   
	}
	
	@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
			+ "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view."
			+ "ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget."
			+ "LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android."
			+ "widget.FrameLayout/android.widget.TextView")
	public MobileElement edit;
	
	public void edit_profile()
	{
		edit.click();	   
	}
	
	
	
			@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget."
					+ "LinearLayout/android.widget.FrameLayout/android.widget."
					+ "LinearLayout/android.widget.FrameLayout/android.widget."
					+ "LinearLayout/android.widget.FrameLayout/android.support."
					+ "v4.view.ViewPager/android.widget.ScrollView/android.widget."
					+ "LinearLayout/android.widget.EditText[3]")
			public MobileElement email_edit;
			
			public void edit_email(String email)
			{
				email_edit.sendKeys(email);	   
			}
			
			@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
					+ "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget."
					+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
					+ "LinearLayout/android.widget.Button[2]")
			public MobileElement done;
			
			public void edit_done()
			{
				done.click();	   
			}
			
			@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
					+ "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view."
					+ "ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget."
					+ "LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button")
			public MobileElement update;
			
			public void update_pofile()
			{
				update.click();	   
			}
			
			
	
			@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget."
					+ "LinearLayout/android.widget.FrameLayout/android.widget."
					+ "LinearLayout/android.widget.FrameLayout/android.widget."
					+ "LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget."
					+ "FrameLayout/android.support.v7.widget.RecyclerView/android.widget."
					+ "LinearLayout[10]/android.widget.LinearLayout/android.widget.ImageView[2]")
			public MobileElement changeLanguage;
			
			public void Change_Language()
			{
				changeLanguage.click();	   
			}
			
			@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget."
					+ "FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget."
					+ "LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget."
					+ "RelativeLayout/android.widget.TextView[1]")
			public MobileElement Language_setting;
			
			public void Setting_Lnaguage()
			{
				Language_setting.click();	   
			}
			
			@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget."
					+ "FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android."
					+ "widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
			public MobileElement language_choose;
			
			public void choose_lnaguage()
			{
				language_choose.click();	   
			}
			
			@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
					+ "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view."
					+ "ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget."
					+ "LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget."
					+ "FrameLayout/android.widget.LinearLayout/android.widget.ImageView")
			public MobileElement home;
			
			public void back_to_home()
			{
				home.click();	   
			}
			
			
			
			
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/navigation_wall")
		      public MobileElement tips  ;
		      public void TipsButton () {
				 tips .click();	  
			  }
		      @AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_like")
		      public MobileElement like ;
		      public void LikeButton () {
				  like.click();	  
			  }

}
