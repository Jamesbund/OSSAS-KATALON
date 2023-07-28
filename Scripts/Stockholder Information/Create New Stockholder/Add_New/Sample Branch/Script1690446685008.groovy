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

WebUI.navigateToUrl('https://cmiti-dev.outsystemsenterprise.com/STOCKSADMINSYSTEMS/')

WebUI.setText(findTestObject('Object Repository/Sample Branch/Page_Login/input_Username_Input_UsernameVal'), 'James Aldrine')

WebUI.setEncryptedText(findTestObject('Object Repository/Sample Branch/Page_Login/input_Password_Input_PasswordVal'), 'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_DasHboaRd/div_Stockholder Information_osui-submenu__h_be17fb'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_DasHboaRd/div_Create New Stockholder_submenu-2-icon'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_DasHboaRd/div_Profile'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_DasHboaRd/span_Add New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Sample Branch/Page_StockholderEnrollment/select_--Select--MemberNonMemberStaff'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sample Branch/Page_StockholderEnrollment/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Sample Branch/Page_StockholderEnrollment/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '0', true)

WebUI.click(findTestObject('Sample Branch/SpyWeb/Page_StockholderEnrollment/div_SelectRegionn'))

WebUI.click(findTestObject('Sample Branch/SpyWeb/Page_StockholderEnrollment/span_REGION 4-A'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_StockholderEnrollment/div_Select'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_StockholderEnrollment/span_Barleta'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_StockholderEnrollment/div_Select'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_StockholderEnrollment/span_SPC 2'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_StockholderEnrollment/div_Select'))

WebUI.click(findTestObject('Object Repository/Sample Branch/Page_StockholderEnrollment/span_AKAP 1'))

