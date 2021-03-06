package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddCita {
	
//	AddCita UI Elements
	
	//TextBox
	private final String C_DATE_PIKER = "[id='datepicker']";
//	private final String C_DATE_PIKER_SELECT = "a.ui-state-default[href='20']";
	private final String C_ID_PATIENT= "[placeholder='Ingrese el documento de identidad del paciente']";
	private final String C_ID_DOCTOR= "[placeholder='Ingrese el documento de identidad del doctor']";
	private final String C_OBSERVACIONES = "[row='3']";
	
	//Button	
	private final String C_SAVE_BUTTON = "[class='btn btn-primary pull-right']";
	private final String C_HOME = "[href='home']";
	
	//Label
	private final String C_GUARDADO_EXITOSO = ".panel-body > p";
	
	
//	//Selectors
//	public WebElement getCDateDaySelector(WebDriver driver){
//		
//		return driver.findElement(By.cssSelector(C_DATE_PIKER_SELECT));
//	}
	
	public WebElement getCDateSelector(WebDriver driver){
		
		return driver.findElement(By.cssSelector(C_DATE_PIKER));
	}
	
	public WebElement getCIdPatientSelector(WebDriver driver){
		
		return driver.findElement(By.cssSelector(C_ID_PATIENT));
	}
	
	public WebElement getCIdDoctorSelector(WebDriver driver){
		
		return driver.findElement(By.cssSelector(C_ID_DOCTOR));
	}
	
	public WebElement getCObservacionesSelector(WebDriver driver){
		
		return driver.findElement(By.cssSelector(C_OBSERVACIONES));
	}
	
	public WebElement getCSaveButtonSelector(WebDriver driver){
		
		return driver.findElement(By.cssSelector(C_SAVE_BUTTON));
	}
	
	public WebElement getCHomeButtonSelector(WebDriver driver){
		
		return driver.findElement(By.cssSelector(C_HOME));
	
	}
	
	public WebElement getCSuccessMessage(WebDriver driver){
		
		return driver.findElement(By.cssSelector(C_GUARDADO_EXITOSO));
	
	}
	

}
