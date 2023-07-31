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

WebUI.click(findTestObject('Object Repository/Stock Inquiries 360/Page_DasHboaRd/div_Stockholder Information_osui-submenu__h_be17fb'))

WebUI.click(findTestObject('Object Repository/Stock Inquiries 360/Page_DasHboaRd/span_Stockholder Inquiries 360'))

WebUI.setText(findTestObject('Object Repository/Stock Inquiries 360/Page_Inquiries Customer Details 360/input_Search_Input_TextVar'), 
    '192168222')

WebUI.click(findTestObject('Object Repository/Stock Inquiries 360/Page_Inquiries Customer Details 360/button_Submit'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Object Repository/Stock Inquiries 360/Page_Inquiries Customer Details 360/span_192168222'), 
    0)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Stock Inquiries 360/Page_Inquiries Customer Details 360/i_Total Amount_icon fa fa-chevron-circle-do_7ca990'))

WebUI.scrollToElement(findTestObject('Stock Inquiries 360/Page_Inquiries Customer Details 360/button_Submit'), 0)

WebUI.callTestCase(findTestCase('Login, Dashboard, and Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

