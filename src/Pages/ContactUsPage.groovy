package Pages

import geb.Page
import Modules.*
import spock.lang.Title

class ContactUsPage extends Page{
	static url = "/contact-us/"
	
	//At checker
	static at= {
		title == "Contact Us - Abode QA"
		$("h1.page-title").isDisplayed()

	}
	
	static  content= {
		nameField(wait : true) { $("input#g1280-name[type='text'][name='g1280-name']") }
		emailField(wait : true) { $("input#g1280-email[type='email'][name='g1280-email']")}
		websiteField(wait : true) { $("input#g1280-website[type='text'][name='g1280-website']")}
		commentField(wait : true) { $("textarea.textarea#contact-form-comment-g1280-comment")}
		submitButton(wait : true) { $("input.pushbutton-wide[type='submit']") }
		tabs(wait:10) {module adobeQATabs}

		
		
		/*
		 * wait : true
		 * required : true
		 * cache : true
		*/
	}
	
	def "click on manual test"(){
		tabs.ManualTester.click()
	}
	
	def "enter name"(nameString){
		nameField.value(nameString)		
		assert nameField.value() == nameString
	}
	
	def "enter email"(emailString){
		emailField.value(emailString)
		assert emailField.value() == emailString
	}
	
	def "enter website"(websiteString){
		websiteField.value(websiteString)
		assert websiteField.value() == websiteString
	}
	
	def "enter comment"(commentString){
		commentField.value(commentString)
		assert commentField.value() == commentString
	}
	
	def "click on submit button"(){
		submitButton.click()
		
	}

}
