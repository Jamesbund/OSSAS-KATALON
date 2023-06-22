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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://cmiti-dev.outsystemsenterprise.com/STOCKSADMINSYSTEMS/Login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_Input_UsernameVal'), 'James Aldrine')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_Input_PasswordVal'), 'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.click(findTestObject('Object Repository/Page_Login/i_Password_icon fa fa-eye-slash fa-2x'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Login/i_Password_icon fa fa-eye fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Stockholder Information_osui-submenu__h_be17fb'))

WebUI.click(findTestObject('SAS Login and Logout/Page_Dashboard/div_Create New Stockholder_submenu-2-icon'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Add New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_StockholderEnrollment/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_StockholderEnrollment/div_Stockholder Information_osui-submenu__h_be17fb'))

WebUI.click(findTestObject('SAS Login and Logout/Page_Dashboard/div_Create New Stockholder_submenu-2-icon'))

WebUI.click(findTestObject('Object Repository/Page_StockholderEnrollment/span_Stockholder list'))

WebUI.click(findTestObject('Object Repository/Page_StockholderList/button_Stocks History'))

WebUI.click(findTestObject('Object Repository/Page_Stockdetails/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Stockdetails/span_Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_Parameters_icon fa fa-bell-o fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/div_Stock Admin System  DashboardOverall St_025d3a'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/i_Parameters_icon fa fa-power-off fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Logout'))

