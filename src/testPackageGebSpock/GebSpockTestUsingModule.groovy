package testPackageGebSpock

import geb.spock.GebSpec
import Pages.*
import Modules.*

class GebSpockTestUsingModule extends GebSpec{
	def "example to use module class"(){
		given: 
		println "we are using module class"
		
		when:
		to ContactUsPage
		
		"click on manual test"()
		
		then:
		println title
	}


}
