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
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://cmiti-dev.outsystemsenterprise.com/STOCKSADMINSYSTEMS/Login')

WebUI.setText(findTestObject('Object Repository/User Management/Page_Login/input_Username_Input_UsernameVal'), 'James Aldrine')

WebUI.setEncryptedText(findTestObject('Object Repository/User Management/Page_Login/input_Password_Input_PasswordVal'), 
    'MHSUC33hkPnBWRnjFBNCPA==')

WebUI.click(findTestObject('Object Repository/User Management/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/User Management/Page_DasHboaRd/span_Utilities'))

WebUI.click(findTestObject('Object Repository/User Management/Page_DasHboaRd/span_User Management'))

WebUI.click(findTestObject('Object Repository/User Management/Page_UserManagement/i_Action_icon fa fa-chevron-down fa-1x'))

WebUI.click(findTestObject('Object Repository/User Management/Page_UserManagement/i_Action_icon fa fa-chevron-up fa-1x'))

WebUI.click(findTestObject('Object Repository/User Management/Page_UserManagement/i_Add user_icon fa fa-user-plus fa-2x'))

WebUI.click(findTestObject('Object Repository/User Management/Page_UserManagement/div_Select'))

WebUI.setText(findTestObject('User Management/Page_UserManagement/input_Close_vscomp-search-input'), 'wala')

WebUI.click(findTestObject('Object Repository/User Management/Page_UserManagement/span_walasir 5'))

not_run: WebUI.rightClick(findTestObject('Object Repository/User Management/Page_UserManagement/input_Expiration Date_Input_StaffId'))

//
// Get the current date and create a Calendar instance
Calendar calendar = Calendar.getInstance()

// Add 5 days to the current date
calendar.add(Calendar.DAY_OF_MONTH, 5)

// Format the date as "mm/dd/yyyy"
SimpleDateFormat dateFormat = new SimpleDateFormat('MM-dd-yyyy\thh:mm  a')

String futureDate = dateFormat.format(calendar.time)

// Log the future date
println('Future Date: ' + futureDate)

////
// Input the current date into the text box
WebUI.setText(findTestObject('User Management/Page_UserManagement/input_Expiration Date_Input_StaffId'), futureDate)

WebUI.clickOffset(findTestObject('User Management/Page_UserManagement/input_Expiration Date_Input_StaffId'), 60, 0)

WebUI.setText(findTestObject('User Management/Page_UserManagement/input_Expiration Date_Input_StaffId'), 'a')

