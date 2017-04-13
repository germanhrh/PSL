package util;

public final class HerokuappConstant {
	
	
	//UI Constants
	private static final String BASE_UI_URL = "http://automatizacion.herokuapp.com/pperez/home";
	
	//Global units
	private static final long Standard_Wait = 60;
	
	
	//not needed	
	public HerokuappConstant(){
			
	}
		
	public static String getBase(){
		return BASE_UI_URL;
	}
	
	public long getStandardWait(){
		return Standard_Wait;
	}
	
}
