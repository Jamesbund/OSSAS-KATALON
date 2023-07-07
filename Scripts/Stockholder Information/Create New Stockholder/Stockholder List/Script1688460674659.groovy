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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.callTestCase(findTestCase('Login, Dashboard, and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_DasHboaRd/div_Stockholder Information_osui-submenu__h_be17fb'))

WebUI.mouseOver(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_DasHboaRd/div_Create New Stockholder'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_DasHboaRd/span_Stockholder list'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Existing StockholdersNewly_53209e'), 
    '0', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--Individual ShareholderCorp_3d3b64'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '-1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/select_--Select--CARD Bank, Inc.CARD SME Ba_231bc7'), 
    '-1', true)

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/button_Stocks History'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_Stockdetails/div_Stockholder Information_osui-submenu__h_be17fb'))

WebUI.mouseOver(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_Stockdetails/div_Create New Stockholder_submenu-2-icon'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_Stockdetails/span_Stockholder list'))

WebUI.mouseOverOffset(findTestObject('Create New Stockholder/Stockholder_list/Page_StockholderList/button_Adding of Shares'), 
    0, 0)

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_StockholderList/button_Adding of Shares'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_ManageAccount/input_Select Adding of Share Type_RadioGroup1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_ManageAccount/select_--SELECT--Common Share StockPreferre_ef6566'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Stockholder_list/Page_ManageAccount/input_Number Of Shares_Input_NumberOfShares'), 
    '25')

// Get the current date
Date currentDate = new Date()

// Format the date as desired
SimpleDateFormat dateFormat = new SimpleDateFormat('MM-dd-yyy')

String currentDateFormatted = dateFormat.format(currentDate)

// Print the current date
println('The current date is: ' + currentDateFormatted)

// Input the current date into the text box
WebUI.setText(findTestObject('Create New Stockholder/Stockholder_list/Page_StockholderList/Page_ManageAccount/input_Date Aquisition_Input_DateAquisition'), 
    currentDateFormatted)

WebUI.callTestCase(findTestCase('Login, Dashboard, and Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

