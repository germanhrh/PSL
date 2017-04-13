package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddDoctor {
	
	
	// UI Elements Path
	
			
			//Radio Button
			//private final String ROUNDTRIP_OPTION = "[id='flight-type-round-trip']";
			
			//TextBox
			private final String D_NAME = "[id='name']";	
			private final String D_LAST_NAME = "[id='last_name']";	
			private final String D_TELEPHONE = "[id='telephone']";			
			private final String D_IDENTIFICATION = "[id='identification']";
			
	
			//ComboBox	
			private final String D_IDENTIFICATION_TYPE = "[id='identification_type']";
					
			//Button	
			private final String D_SAVE_BUTTON = "[class='btn btn-primary pull-right']";
			private final String D_HOME = "[href='home']";
		
			//Label
			private final String D_GUARDADO_EXITOSO = ".panel-body > p";
					
				
		
		//Selectors
			
		public WebElement getDNameSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(D_NAME));
		}
			
		public WebElement getDLastNameSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(D_LAST_NAME));
		}
		
		public WebElement getDTelephoneSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(D_TELEPHONE));
		}
		
		public WebElement getDIdentificationSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(D_IDENTIFICATION));
		}
		
		public WebElement getDdentificationTypeSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(D_IDENTIFICATION_TYPE));
		}
		
		public WebElement getDSaveButtonSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(D_SAVE_BUTTON));
		
		}
		
		public WebElement getDHomeButtonSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(D_HOME));
		
		}
		
		public WebElement getDSuccessMessage(WebDriver driver){
			
			return driver.findElement(By.cssSelector(D_GUARDADO_EXITOSO));
		
		}
		
	
		

}
