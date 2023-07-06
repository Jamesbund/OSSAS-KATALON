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
//
import java.time.LocalDate as LocalDate
import java.time.format.DateTimeFormatter as DateTimeFormatter

//
WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/input_Account Number_FinalstepAccountNumber'), 
    '1000011')

// Get the current date
LocalDate currentDate = LocalDate.now()

DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern('MM-dd-yyy')

String currentDateFormatted = currentDate.format(dateFormat)

// Print the current date
println('The current date is: ' + currentDateFormatted)

//
// Input the current date into the text box
WebUI.setText(findTestObject('Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/input_Stock Date Acquisition_stockdate'), 
    currentDateFormatted)

WebUI.mouseOver(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/input_Stock Date Acquisition_stockdate'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/select_--Select--ResignedActiveInactiveOthers'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/select_--Select--ContactPersonLandLineMobile'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/span_Preview'))

WebUI.delay(6)

WebUI.verifyElementText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/span_CARD Bank, Inc'), 
    'CARD Bank, Inc.')

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/Page_StockholderEnrollment/span_Close'))

