package page;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddPaciente {
	
		//Patient UI Elements
		//TextBox
		private final String P_NAME = "[name='name']";	
		private final String P_LAST_NAME = "[name='last_name']";	
		private final String P_TELEPHONE = "[name='telephone']";			
		private final String P_IDENTIFICATION = "[name='identification']";
		
		//CheckBox
		private final String P_SALUD_PREPAGADA = "[name='prepaid']";

		//ComboBox	
		private final String P_IDENTIFICATION_TYPE = "[name='identification_type']";
	
		//Button	
		private final String P_SAVE_BUTTON = "[class='btn btn-primary pull-right']";
		private final String P_HOME = "[href='home']";
		
		//Label
		private final String P_GUARDADO_EXITOSO = ".panel-body > p";
	
			
	
	//Selectors
		
		public WebElement getPNameSelector(WebDriver driver){
			
		return driver.findElement(By.cssSelector(P_NAME));
		}
		
		public WebElement getPLastNameSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(P_LAST_NAME));
		}
		
		public WebElement getPTelephoneSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(P_TELEPHONE));
		}
		
		public WebElement getPIdentificationSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(P_IDENTIFICATION));
		}

		public WebElement getPSPrepagadaSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(P_SALUD_PREPAGADA));
		}
		
		public WebElement getPIdentificationTypeSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(P_IDENTIFICATION_TYPE));
		}
		
		public WebElement getPSaveButtonSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(P_SAVE_BUTTON));
		}
		
		public WebElement getPHomeButtonSelector(WebDriver driver){
			
			return driver.findElement(By.cssSelector(P_HOME));
		
		}
		
		public WebElement getPSuccessMessage(WebDriver driver){
			
			return driver.findElement(By.cssSelector(P_GUARDADO_EXITOSO));
		
		}	

}
