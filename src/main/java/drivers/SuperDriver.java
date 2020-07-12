package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class SuperDriver {

    private SuperDriver() {

    }

    public static WebDriver create(String browser) {
        switch (browser.trim().toLowerCase()) {
            case "chrome":
            case "google chrome":
            case "google":
                WebDriverManager.chromedriver().setup();
                return new SuperChromeDriver();
            case "firefox":
            case "mozilla firefox":
            case "mozilla":
                WebDriverManager.firefoxdriver().setup();
                return new SuperFirefoxDriver();
            case "ie":
            case "explorer":
            case "internet explorer":
                WebDriverManager.iedriver().setup();
                return new SuperIEDriver();
            case "opera":
                WebDriverManager.operadriver().setup();
                return new SuperOperaDriver();
            case "safari":
                return new SuperSafariDriver();
            default:
                return new SuperHtmlUnitDriver();
        }

    }


}
