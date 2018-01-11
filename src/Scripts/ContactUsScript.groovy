import geb.Browser
import Pages.ContactUsPage;

Browser.drive{
	to ContactUsPage
	
	println currentUrl
	
	"enter name"("Chinmay")
	
}