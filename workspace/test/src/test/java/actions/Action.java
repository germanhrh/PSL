package actions;


import org.openqa.jetty.html.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.*;

import page.AddCita;
import page.AddDoctor;
import page.AddPaciente;
import page.Inicio;
import util.HerokuappConstant;


public class Action {
	
	private AddPaciente _AddPatient = new AddPaciente();
	private HerokuappConstant _HerokuappConstant = new HerokuappConstant();
	private AddDoctor _AddDoctor = new AddDoctor();
	private Inicio _Inicio = new Inicio();
	private AddCita _AddCita = new AddCita();
	
	
	//move page
	public void MoveToElement(WebElement element, WebDriver driver){
		
		Actions actionsDriver = new Actions(driver);
		actionsDriver.moveToElement(element);
	}
	
	//Add Doctor
	public void AddDoctor(String strDoctorName, String strDoctorLastName,
			String strDoctorIdentification, String strDoctorTelephone, 
			String strDoctorIdentificationType, WebDriver driver) throws InterruptedException
		{
		_AddDoctor.getDNameSelector(driver).clear();
		_AddDoctor.getDNameSelector(driver).sendKeys(strDoctorName);
		
		_AddDoctor.getDLastNameSelector(driver).clear();
		_AddDoctor.getDLastNameSelector(driver).sendKeys(strDoctorLastName);
		
		_AddDoctor.getDTelephoneSelector(driver).clear();
		_AddDoctor.getDTelephoneSelector(driver).sendKeys(strDoctorTelephone);
		
		_AddDoctor.getDdentificationTypeSelector(driver).click();
		Select select = new Select(_AddDoctor.getDdentificationTypeSelector(driver));
		if (strDoctorIdentificationType=="Cédula de ciudadanía")
		{
			select.selectByIndex(0);
		}
		else if (strDoctorIdentificationType=="Cédula de extanjería")
		{
			select.selectByIndex(1);
		}
		else if (strDoctorIdentificationType=="Cédula de extanjería")
		{
			select.selectByIndex(2);
		}
		
		MoveToElement(_AddDoctor.getDIdentificationSelector(driver), driver);
		_AddDoctor.getDIdentificationSelector(driver);
		_AddDoctor.getDIdentificationSelector(driver).clear();
		_AddDoctor.getDIdentificationSelector(driver).sendKeys(strDoctorIdentification);
		
		_AddDoctor.getDSaveButtonSelector(driver).click();	
		Thread.sleep(4000);
		
		
		}
	
	
	public void AddCita(String strCitaDate, String strCitaDoctor,
			String strCitaPatient, String strCitaObserv, 
			 WebDriver driver) throws InterruptedException
	{
		_AddCita.getCDateSelector(driver).clear();
		_AddCita.getCDateSelector(driver).sendKeys(strCitaDate);
		_AddCita.getCDateSelector(driver).click();
		//_AddCita.getCDateDaySelector(driver).click();
		
		//_AddCita.getCIdDoctorSelector(driver).click();
		_AddCita.getCIdDoctorSelector(driver).clear();
		_AddCita.getCIdDoctorSelector(driver).sendKeys(strCitaDoctor);
		
		_AddCita.getCIdPatientSelector(driver).clear();
		_AddCita.getCIdPatientSelector(driver).sendKeys(strCitaPatient);
		
//		_AddCita.getCObservacionesSelector(driver).clear();
//		_AddCita.getCObservacionesSelector(driver).sendKeys(strCitaObserv);
		
		_AddCita.getCSaveButtonSelector(driver).click();
		Thread.sleep(4000);
	}
	
	
	
	public void AddPaciente(String strPatientName, String strPatientLastName,
									String strIdentification, String strTelephone, 
									String strIdentificationType, WebDriver driver) throws InterruptedException{
//		
		
//		WebDriverWait waitLoading = new WebDriverWait(driver, _HerokuappConstant.getStandardWait());
		
		_AddPatient.getPNameSelector(driver).clear();
		_AddPatient.getPNameSelector(driver).sendKeys(strPatientName);
		
		_AddPatient.getPLastNameSelector(driver).clear();
		_AddPatient.getPLastNameSelector(driver).sendKeys(strPatientLastName);
		
		_AddPatient.getPTelephoneSelector(driver).clear();
		_AddPatient.getPTelephoneSelector(driver).sendKeys(strTelephone);
		
		_AddPatient.getPIdentificationTypeSelector(driver).click();
		Select select=new Select(_AddPatient.getPIdentificationTypeSelector(driver));
		
		if (strIdentificationType=="Cédula de ciudadanía")
		{
			select.selectByIndex(0);
		}
		else if (strIdentificationType=="Cédula de extanjería")
		{
			select.selectByIndex(1);
		}
		else if (strIdentificationType=="Cédula de extanjería")
		{
			select.selectByIndex(2);
		}

		
		_AddPatient.getPIdentificationSelector(driver).clear();
		_AddPatient.getPIdentificationSelector(driver).sendKeys(strIdentification);
		
		_AddPatient.getPSaveButtonSelector(driver).click();
		Thread.sleep(4000);
		

		}
	
	//navigate main menu
	public void ClickMenuInicio(int OpcionMenu, WebDriver driver) throws InterruptedException{
		
		switch (OpcionMenu) {
        case 1:  
        	_Inicio.getIAddDoctorSelector(driver).click();
        	Thread.sleep(4000);
        	break;
        case 2: 	
        	_Inicio.getIAddPatientSelector(driver).click();
        	Thread.sleep(4000);
        	break;
        case 3:
        	_Inicio.getIAppointmentSchedulingSelector(driver).click();
        	Thread.sleep(4000);
        	break;
		}
	}
	
	//Back main menu
	public void ClickInicio(WebDriver driver) throws InterruptedException{
		
		_Inicio.getIAddHomeSelector(driver).click();
		Thread.sleep(4000);
		
	}

	

}
