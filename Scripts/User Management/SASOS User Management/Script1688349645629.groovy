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
WebUI.callTestCase(findTestCase('Login, Dashboard, and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_UserManagement/Page_DashBoardNew/div_Utilities_osui-submenu__header__icon'))

WebUI.click(findTestObject('Object Repository/Page_UserManagement/Page_DashBoardNew/span_User Management'))

WebUI.click(findTestObject('Object Repository/User Management/Page_UserManagement/i_Add user_icon fa fa-user-plus fa-2x'))

WebUI.click(findTestObject('User Management/Page_UserManagement/div_Select'))

WebUI.setText(findTestObject('Object Repository/User Management/Page_UserManagement/input_Close_vscomp-search-input'), 'wala')

WebUI.click(findTestObject('Object Repository/User Management/Page_UserManagement/span_walasir 5'))

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
WebUI.setText(findTestObject('Object Repository/User Management/Page_UserManagement/input_Expiration Date_Input_StaffId'), 
    futureDate)

WebUI.clickOffset(findTestObject('Object Repository/User Management/Page_UserManagement/input_Expiration Date_Input_StaffId'), 
    60, 0)

WebUI.setText(findTestObject('Object Repository/User Management/Page_UserManagement/input_Expiration Date_Input_StaffId'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Page_UserManagement/input_Staff Id No_Input_StaffId2'), '202209-52977')

WebUI.click(findTestObject('Object Repository/User Management/Page_UserManagement/Page_UserManagement/Page_UserManagement/button_Nextfirst'))

WebUI.click(findTestObject('Object Repository/Page_UserManagement/button_OK'))

WebUI.setText(findTestObject('Object Repository/Page_UserManagement/input_First NameMiddleNamelastName_Input_Name'), 'Juan')

WebUI.setText(findTestObject('Object Repository/Page_UserManagement/input_First NameMiddleNamelastName_Input_Name2'), 'D')

WebUI.setText(findTestObject('Object Repository/Page_UserManagement/input_First NameMiddleNamelastName_Input_Name3'), 'Dela Cruz')

WebUI.setText(findTestObject('Object Repository/Page_UserManagement/input_Mobile Phone_MobileNumber'), '09090000000')

WebUI.click(findTestObject('Object Repository/User Management/Page_UserManagement/button_Next01'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UserManagement/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UserManagement/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UserManagement/select_--Select--PangasinanBatangasCaviteMi_05c99a'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UserManagement/select_--Select--Sto. TomasLemeryBatangasRo_dd9050'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UserManagement/select_--Select--AGRIBANKBankAdminBatangas _a0a28e'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UserManagement/select_--Select--Area ManagerBook KeeperSto_e31272'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Page_UserManagement/button_Previous'))

WebUI.click(findTestObject('Object Repository/Page_UserManagement/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_UserManagement/button_Previous'))

WebUI.click(findTestObject('Object Repository/Page_UserManagement/button_Close'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UserManagement/select_----5--------10--------15--------20-_8e1c87'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_UserManagement/i_Activate_icon fa fa-clock-o fa-1x'))

WebUI.click(findTestObject('Object Repository/Page_UserManagement/i_USER ACCESS EXPIRATION DATE_icon fa fa-ti_eb519f'))

WebUI.click(findTestObject('Object Repository/Page_UserManagement/i_User Management_icon fa fa-power-off fa-2x'))

WebUI.click(findTestObject('Object Repository/Page_UserManagement/button_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

