package Modules
import geb.Module
import Pages.*
import Scripts.*

class adobeQATabs extends Module{
	static content = {
		ManualTester(wait:true){ $("#menu-item-2433 > a") }
	}
	
	def "Click on Manual Testing"(){
		ManualTester.click()
	}

}
