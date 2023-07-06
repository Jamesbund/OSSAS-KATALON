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

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/input_ImmediateContact Person_Immediate_Con_5c3087'),
	'Megatron Griffin')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/input_land Islands_ImmediateContactNumberS'),
	'9091000000')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/input_Immediate Address_ImmediateContactNumber2'),
	'Sample Immediate Address 01')

WebUI.click(findTestObject('Object Repository/Page_StockholderEnrollment/button_Next'))