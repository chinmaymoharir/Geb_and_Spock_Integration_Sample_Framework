package testPackageGebSpock

import geb.Page
import Pages.*
import Modules.*
import geb.spock.GebSpec

class FirstGebSpockTestCaseSpecification extends GebSpec{
	def "Fill Contact Us Page form and click on submit button"(){
		given:
		println "We are in given block"
		
		when:
		to ContactUsPage
		"enter name"("Name")
		"enter email"("abc@gmail.com")
		"enter website"("abc.com")
		"enter comment"("Hello")
		"click on submit button"()

		
		then:
		println "Validation complete"
		//at MessageSubmittedPage
		
	}

}
