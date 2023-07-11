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
WebUI.callTestCase(findTestCase('Login, Dashboard, and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/Page_DasHboaRd/div_Stockholder Information_osui-submenu__h_be17fb'))

WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/Page_DasHboaRd/span_Generate Stock Certificate'))

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/GSC Per Branch/div_PDF_b10-MainContent'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/GSC Per Branch/select_--Select Type--Per InstitutionPer Br_196992'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/Page_UserlistReports/div_SelectInsti'))

'Just Change the Institution here'
WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Institution/span_CARD Bank, Inc'))

WebUI.click(findTestObject('Page_StockholderEnrollment/div_SelectBranch'))

WebUI.clickOffset(findTestObject('Generate Stockholder Certificate/GSC Per Branch/Page_UserlistReports/div_Generation Header1'), 
    0, 5)

'Can change the branch input search here'
WebUI.setText(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/Page_UserlistReports/input_Select All_vscomp-search-input'), 
    'Candelaria')

'Can change the branch here'
WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/GSC Per Branch/span_Candelaria'))

'can change the branch input search here'
WebUI.setText(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/GSC Per Branch/input_Select All_vscomp-search-input'), 
    'laoag')

'select the branch here'
WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/GSC Per Branch/span_Laoag'))

WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/GSC Per Branch/div_PDF_b10-LayoutPrint'))

// Get the current date
LocalDate currentDate1 = LocalDate.now()

// Subtract 1 week from the current date
LocalDate pastDate = currentDate1.minusWeeks(2)

// Format the date as desired
DateTimeFormatter dateFormat1 = DateTimeFormatter.ofPattern('MM-dd-yyy')

String pastDateFormatted = pastDate.format(dateFormat1)

// Print the past date
println('The past date is: ' + pastDateFormatted)

// Set the date output on thd field
WebUI.setText(findTestObject('Generate Stockholder Certificate/GSC Per Institution/input_End Date_Input_DateStart'), pastDateFormatted)

WebUI.mouseOver(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Institution/input_End Date_Input_DateStart'))

// Get the current date
LocalDate currentDate = LocalDate.now()

DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern('MM-dd-yyy')

String currentDateFormatted = currentDate.format(dateFormat)

// Print the current date
println('The current date is: ' + currentDateFormatted)

//
// Input the current date into the text box
WebUI.setText(findTestObject('Generate Stockholder Certificate/GSC Per Institution/input_End Date_Input_DateEnd'), currentDateFormatted)

WebUI.click(findTestObject('Object Repository/Generate Stockholder Certificate/GSC Per Branch/retake GSC Branch/GSC Per Branch/span_Generate'))

WebUI.delay(3)

for (def D : (1..15)) {
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))
}

WebUI.delay(3)

for (def U : (1..15)) {
    WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_UP))
}

WebUI.delay(4)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Generate Stockholder Certificate/Page_Login/Page_Login/i_User Management_icon fa fa-power-off fa-2x'))

WebUI.click(findTestObject('Generate Stockholder Certificate/Page_Login/Page_Login/button_Logout'))

WebUI.closeBrowser()

