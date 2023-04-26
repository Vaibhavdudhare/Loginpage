package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"navbar\"]/table/tbody/tr[3]/td[1]/input")
	 WebElement username; 
	 
	 @FindBy(xpath = "//*[@id=\"navbar\"]/table/tbody/tr[3]/td[2]/input[1]")
	 WebElement password;
	 
	 @FindBy(xpath = "/html[1]/body[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]/div[1]/input[1]")
	 WebElement signInBtn;
	 
	 public Login()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--remote-allow-origins=*");

			driver = new ChromeDriver(options);
			driver.get("https://www.pulse.datamatics.com/dlintranet/Login.do?method=showLogin");
			
			
	        
	        PageFactory.initElements(driver, this );
	 }
	        
	        public void launchApplication()
		    {
		    	driver.get("https://www.pulse.datamatics.com/dlintranet/Login.do?method=showLogin");
		    }

		   
		    
		 
		     public void enterUserName(String un)
		     {
		    	 username.sendKeys(un);
		    	 
		     }
		     
		     public void enterPassword(String pwd)
		     {
		    	 password.sendKeys(pwd);
		     }
		     
		     public void clickButton()
		     {
		    	 signInBtn.click();
		     }
	 
}

