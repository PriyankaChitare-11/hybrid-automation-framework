package enums;

public enum Environment {
	
	QA("https://sauce-demo.myshopify.com/"),
    DEV("https://dev-url.com"),
    PROD("https://prod-url.com");

    private String url;

    Environment(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    
    public static Environment fromString(String env) {
    	return Environment.valueOf(env.trim().toUpperCase());
    }


}
