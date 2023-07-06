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
import java.util.Calendar as Calendar
import java.text.SimpleDateFormat as SimpleDateFormat

//
WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_DasHboaRd/div_Stockholder Information_osui-submenu__h_be17fb'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_DasHboaRd/span_Create New Stockholder'))

WebUI.click(findTestObject('Page_UserManagement/div_Profile'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_DasHboaRd/span_Add New'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '0', true)

'Select Region'
WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/div_Select'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/span_REGION 4-A'))

'Select Branch'
WebUI.click(findTestObject('Page_StockholderEnrollment/div_SelectBranch'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/span_Barleta'))

'Select Unit'
WebUI.click(findTestObject('Create New Stockholder/Page_StockholderEnrollment/Page_StockholderEnrollment/div_SelectUnit'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/span_SPC 2'))

'Select Center'
WebUI.click(findTestObject('Create New Stockholder/Page_StockholderEnrollment/Page_StockholderEnrollment/div_SelectCenter'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/span_AKAP 1'))

//
// Get the current date and create a Calendar instance
Calendar currentDate = Calendar.getInstance()

// subtract 3 years to the current date
currentDate.add(Calendar.YEAR, -3)

// Format the date as "mm/dd/yyyy"
SimpleDateFormat dateFormat = new SimpleDateFormat('MM-dd-yyyy')

String pastDate = dateFormat.format(currentDate.time)

// Print the past date
println('Past Date is: ' + pastDate)

////
// Input the current date into the text box
WebUI.setText(findTestObject('Create New Stockholder/Page_StockholderEnrollment/input_Date Of Recognition_Input_TextVar6'), 
    pastDate)

WebUI.mouseOver(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/input_Date Of Recognition_Input_TextVar6'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/select_--Select--MemberNonMemberStaff'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/input_CIFID Number_Input_TextVar'), 
    '192168999')

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/span_Next'))

not_run: WebUI.callTestCase(findTestCase('Login, Dashboard, and Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

