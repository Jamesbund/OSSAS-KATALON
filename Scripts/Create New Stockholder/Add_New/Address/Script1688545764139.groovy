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

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/input_land Islands_Input_MN'), 
    '9090000200')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/input_Place of Birth_InputDOB'), 
    'Sample Place of Birth 01')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/input_Email Address_InputAddress'), 
    'Smokeynagata@sample.com')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/input_House Number_InputHN'), 
    '1002')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/select_PresentPermanent'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/input_Street_InputStreet'), 
    'Sample Street 01')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/input_Barangay_InputBrangay'), 
    'Sample Barangay 01')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/input_City_InputCity'), 
    'Sample City 01')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/input_ZipCode_InputZipcode'), 
    '4123')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/input_Province_InputProvince'), 
    'Sample Province 01')

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/Page_StockholderEnrollment/span_Next'))

