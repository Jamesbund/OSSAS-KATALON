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

<<<<<<< Updated upstream:Scripts/Login, Dashboard, and Logout/Login/Script1688521789080.groovy
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://cmiti-dev.outsystemsenterprise.com/STOCKSADMINSYSTEMS/Login')
=======
WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/input_ImmediateContact Person_Immediate_Con_5c3087'),
	'Megatron Griffin')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/input_land Islands_ImmediateContactNumberS'),
	'9091000000')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/input_Immediate Address_ImmediateContactNumber2'),
	'Sample Immediate Address 01')
>>>>>>> Stashed changes:Scripts/Create New Stockholder/Add_New/Immediate_Family/Script1688629793085.groovy

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_Input_UsernameVal'), 'James Aldrine')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_Input_PasswordVal'), 'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.click(findTestObject('Object Repository/Page_Login/i_Password_icon fa fa-eye-slash fa-2x'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Login/i_Password_icon fa fa-eye fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))
