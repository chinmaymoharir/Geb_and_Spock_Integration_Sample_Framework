import geb.Browser

Browser.drive{
	go("/wp-content/uploads/2016/05/DemoSite.html")
	
	$("input[name='firstname'][type='text']").isDisplayed()
	$("input[name='firstname'][type='text']").value("Chinmay")
	$("input[name='lastname'][type='text']").value "Moharir"
	
	$("input#datepicker[type='text']") << "01/09/2018"
	$("input#sex-0[name='sex'][type='radio'][value='Male']").click()
	
	$("input#profession-0[value='Manual Tester']").click()
	
	$("form").continents = "Europe"
	
	$("select#continents").value("Africa")
	
	$("input#photo.input-file").value("F:\\Selenium\\Geb_Project\\pom.xml")
}
import geb.Browser
import pages.*

Browser.drive{
	go("http://www.abodeqa.com/wp-content/uploads/2016/05/DemoSite.html")
	
	//Textbox
	$("input[name='firstname']").value("FirsetName")
	$("input[name='lastname']").value "LastName"
	$("#datepicker") << "05/22/2016"
	
	
	//Radio Button
	$("#sex-0").click()
	
	//Checkbox
	$("#profession-0").click()
	
	//File Upload
	
	$("#photo").value("B:\\New folder\\eclipse-jee-mars-2-win32\\eclipse\\workspace\\GebExample\\pom.xml")
	
	//Dropdown
	
	$("form").continents = "Europe"
	$("#continents").value("Australia")
}
