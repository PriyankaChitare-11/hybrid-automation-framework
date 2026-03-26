package enums;

public enum BrowserType {
	CHROME,
	FIREFOX,
	EDGE;
	
	public static BrowserType fromString(String browser) {
	
	try {
	return BrowserType.valueOf(browser.trim().toUpperCase());
	}catch(Exception e) {
		
		throw new IllegalArgumentException("Invalid browse : " + browser);
		
	}
	}
	
	

}
