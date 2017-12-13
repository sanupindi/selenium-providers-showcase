package sapientrf_tests.utilties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import sapientrf_tests.tests.TestEnvironment;

public class WebDriverManager {

	WebDriver driver;

	public WebDriver create(String pageUrl) {
		return create(pageUrl, false);
	}

	public WebDriver create(String pageUrl, boolean isHeadless) {
		/*
		 * ProfilesIni profile = new ProfilesIni(); FirefoxProfile myProfile =
		 * profile.getProfile(Util.FIREFOXPROFILE); driver = new
		 * FirefoxDriver(new FirefoxBinary(new File(Util.FIREFOXPATH)),
		 * myProfile);
		 */
		System.setProperty("webdriver.chrome.driver", TestEnvironment.CHROME_DRIVER_BINARY_PATH);
		ChromeOptions options = new ChromeOptions();
		if (isHeadless) {
			options.addArguments("--headless");
		}
		driver = new ChromeDriver(options);
		driver.get(pageUrl);
		driver.manage().window().maximize();
		return driver;
	}

	public void close() {
		driver.close();
		driver.quit();
	}

}
