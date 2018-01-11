import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver

waiting {
	timeout =2
	retryInterval = 0.5
	includeCauseInMessage = true

	preset {
		slow{
			timeout =120
			retryInterval =10
		}

		verySlow{ timeout =50 }
	}
}

atCheckWaiting = "slow"
atCheckWaiting = true

driver = {new ChromeDriver()}

environments{
	
	chrome {
		driver = {new ChromeDriver()}
	}
	
	firefox {
		driver = {new FirefoxDriver()}
	}
}

baseUrl = "http://abodeqa.com"
reportsDir =".target/report"


