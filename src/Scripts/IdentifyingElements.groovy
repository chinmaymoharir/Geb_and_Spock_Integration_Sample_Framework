import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver

def browser = new Browser(driver : new ChromeDriver())
browser.go("http://elearntesting.com/for-students/demo-site-for-automation-practice/")

browser.$("input[name='firstname'][type='text']").isDisplayed()
browser.$("input[name='firstname'][type='text']").value("Chinmay")
browser.$("input[name='lastname'][type='text']").value "Moharir"

browser.$("input#datepicker[type='text']") << "01/09/2018"
browser.$("input#sex-0[name='sex'][type='radio'][value='Male']").click()

browser.$("input#profession-0[value='Manual Tester']").click()

browser.$("form").continents = "Europe"

browser.$("select#continents").value("Africa")

browser.$("input#photo.input-file").value("F:\\Selenium\\Geb_Project\\pom.xml")
/*
browser.quit()
System.exit(0)*/