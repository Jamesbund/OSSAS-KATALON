import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login, Dashboard, and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Individual/div_Stockholder Information'))

WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Individual/span_Generate Stock Certificate'))

WebUI.switchToWindowTitle('UserlistReports')

WebUI.selectOptionByValue(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Individual/select_--Select Type--Per InstitutionPer Br_196992'), 
    '2', true)

'can change the CID here'
WebUI.setText(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Individual/input_CIDCIF_Input_TextVar'), 
    '192168111')

WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Individual/span_Generate'))

WebUI.delay(4)

for (def D : (1..8)) {
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))
}

WebUI.delay(3)

for (def U : (1..8)) {
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))
}

WebUI.delay(4)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Generate Stockholder Certificate/Page_Login/Page_Login/i_User Management_icon fa fa-power-off fa-2x'))

WebUI.click(findTestObject('Generate Stockholder Certificate/Page_Login/Page_Login/button_Logout'))

WebUI.closeBrowser()


