package env;

import enums.Environment;

public class EnvFactory {

    public static String getUrl(Environment env) {

        switch (env) {

            case QA:
                return "https://sauce-demo.myshopify.com/";

            case DEV:
                return "https://sauce-demo.myshopify.com/";

            case PROD:
                return "https://sauce-demo.myshopify.com/";

            default:
                throw new RuntimeException("Invalid env: " + env);
        }
    }
}
