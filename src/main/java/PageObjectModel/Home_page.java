package PageObjectModel;

import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_page extends BaseClass {
public Home_page(AppiumDriver<MobileElement> driver)
	
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy (id = "com.android.permissioncontroller:id/continue_button")
	public MobileElement _continue;
	
	public void continue_()
	{
		//driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
		_continue.click();
	}
	
	
	@AndroidFindBy (id = "android:id/button1")
	public MobileElement _ok;
	
	public void ok_()
	{
		//driver.findElementById("android:id/button1").click();
		_ok.click();
	}
	

    @AndroidFindBy (id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_name")
   	public  MobileElement Name_Field;
	
	public void getname(String Name)
	{
		//driver.findElementById("in.workindia.nileshdungarwal.workindiaandroid:id/et_name").sendKeys(Name);
		Name_Field.sendKeys(Name);
	}
	
	
	
	@AndroidFindBy (id = "in.workindia.nileshdungarwal.workindiaandroid:id/et_number")
	public  MobileElement  no_Field;
	
	public void getno(String MobNo)
	{
		//driver.findElementById("in.workindia.nileshdungarwal.workindiaandroid:id/et_number").sendKeys(MobNo);
		no_Field.sendKeys(MobNo);
	}
	
	@AndroidFindBy (id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_submit")
	public  MobileElement  button;
	
	public void clickButton()
	{
	   //driver.findElementById("in.workindia.nileshdungarwal.workindiaandroid:id/btn_submit").click();
		button.click();
		
	}
	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_delhi")
	public MobileElement block;
	public void select() {
		block.click();
		
	}
	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/act_auto_complete")
	public MobileElement select;
	public void nearestCity(String nearestCity) {
	select.sendKeys(nearestCity);
		
	}
	@AndroidFindBy(id = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	public MobileElement choose;
	public void submit() {
		choose.click();
		
	}
	

	@AndroidFindBy (id = "in.workindia.nileshdungarwal.workindiaandroid:id/rg_male")
	public MobileElement gender;
	
	public void Gender()
	{
		//driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
		gender.click();
	}
	
	
	@AndroidFindBy (id = "in.workindia.nileshdungarwal.workindiaandroid:id/rb_graduate")
	public MobileElement qualification;
	
	public void Qualification()
	{
		//driver.findElementById("android:id/button1").click();
	  qualification.click();
	}
	

    @AndroidFindBy (id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_english")
   	public  MobileElement medium;
    public void Medium() {
    	medium.click();
    }
    
    @AndroidFindBy (id = "in.workindia.nileshdungarwal.workindiaandroid:id/rg_eng_level_3")
   	public  MobileElement english;
    public void speakEnglish() {
    	english.click();
    }
    @AndroidFindBy (id = "in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher")
   	public  MobileElement fresher;
    public void Fresher() {
    	fresher.click();
    }
    @AndroidFindBy (id ="in.workindia.nileshdungarwal.workindiaandroid:id/et_age")
   	public  MobileElement age;
  
    public void Age() {
    	age.click();
    
    	
    }
    @AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/"
			+ "android.widget.FrameLayout/android.widget."
			+ "FrameLayout/android.widget."
			+ "LinearLayout/android.widget."
			+ "FrameLayout/android.widget.ListView/"
			+ "android.widget.TextView[8]")
   	public  MobileElement selectAge;
   	public void SelectAge() {
    	selectAge.click();
    	
    }
    
    
    @AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.GridView/android.widget.FrameLayout[11]/android.widget.CheckBox")
   	public  MobileElement Intrest;
    public void ProfessionIntreset() {
    	Intrest.click();
    }
    
    ///submit button
    @AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	public  MobileElement submit;
	 public void Submit() {
    	submit.click();
    }
    
    @AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_skill_1")
	public  MobileElement details;
	 public void technicalSkill() {
    	details.click();
    }
    @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.CheckBox")
	public  MobileElement option;
	 public void ElectricalOption() {
    	option.click();
    }
    @AndroidFindBy(id="android:id/button1")
	public  MobileElement opt;
	 public void submitOpttion() {
    	opt.click();
    }
    @AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_course")
	public  MobileElement degree;
	 public void yourDegree() {
    	degree.click();
    }
	 
	 @AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[8]")
	
	 public  MobileElement selectDegree;
	 public void DegreeSelect () {
		 selectDegree.click();
	 }
	  @AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_no")
	  public MobileElement no;
	  public void No() {
		  no.click();
	  }
	  
	  //now submit button will be clicked
	  @AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_english")
	  public MobileElement language;
	  public void selectLanguage() {
		  language.click();
	  }
	  

	  
	  
	  @AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android."
				+ "widget.FrameLayout/android.widget.LinearLayout/android.view."
				+ "ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android."
				+ "widget.LinearLayout/android.widget.LinearLayout/android.widget."
				+ "LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView")
		public MobileElement filter;
		
		public void filter_()
		{
			
			filter.click();
			
		}
		
		@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.view."
				+ "ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android."
				+ "widget.RelativeLayout/android.widget.ScrollView/android.widget."
				+ "LinearLayout/android.widget.LinearLayout/android.widget.GridView/android."
				+ "widget.FrameLayout[6]/android.widget.CheckBox")
		public MobileElement filter_area1;
		
		@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android."
				+ "widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android."
				+ "widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android."
				+ "widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.GridView/android."
				+ "widget.FrameLayout[13]/android.widget.CheckBox")
		public MobileElement filter_area2;
		
		
		public void interesed_area1()
		{
		
			filter_area1.click();
			
		}
		
		public void interesed_area2()
		{
		
			filter_area2.click();
			
		}
		
		@AndroidFindBy (id ="in.workindia.nileshdungarwal.workindiaandroid:id/btn_apply")
		public MobileElement apply;
		
		
		public void Apply_filter()
		{
		
			apply.click();	
		}
		
		@AndroidFindBy (id ="in.workindia.nileshdungarwal.workindiaandroid:id/et_inputSearch")
		public MobileElement Search_bar;
		
		
		public void Search(String location)
		{
		
			Search_bar.sendKeys(location);
			
		}
		
		@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android."
				+ "widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android."
				+ "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
				+ "support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget."
				+ "LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android."
				+ "widget.TextView[1]")
		public MobileElement Job1;
		
		public void job_favorite1()
		{
			Job1.click();
		   
		}
		
		@AndroidFindBy (id ="in.workindia.nileshdungarwal.workindiaandroid:id/ib_favorite")
		public MobileElement favorite;
		
		public void Add_to_favortite()
		{
			favorite.click();
		   
		}
		
		@AndroidFindBy (xpath ="//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
		public MobileElement Back;
		
		public void back()
		{
			Back.click();
		   
		}
		
		
		@AndroidFindBy (xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android."
				+ "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
				+ "widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget."
				+ "LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget."
				+ "LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget."
				+ "RelativeLayout/android.widget.TextView[1]")
		public MobileElement job2;
		
		public void job_favorite2()
		{
			job2.click();	   
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
				+ "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android."
				+ "widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget."
				+ "FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[6]/android."
				+ "widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
		public MobileElement favorite_list;
		
		public void my_favorite_job()
		{
			favorite_list.click();	   
		}
	
}