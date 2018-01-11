import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver

import geb.Browser

//def browser = new Browser(driver : new FirefoxDriver())
def browser = new Browser(driver : new ChromeDriver())
//def browser = new Browser(driver : new InternetExplorerDriver())
//def browser = new Browser(driver : new EdgeDriver())
browser.go("https://www.udemy.com")
