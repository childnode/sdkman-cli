import static cucumber.runtime.groovy.EN.*
import cucumber.runtime.PendingException

gvmDir = new File(System.getenv('GVM_DIR'))

Then(~'^the gvm scripts are up to date$') { ->
	def gvm = new File("$gvmDir/bin/gvm")
	assert gvm.exists()

	def gvmInit = new File("$gvmDir/bin/gvm-init.sh")
	assert gvmInit.exists()
}