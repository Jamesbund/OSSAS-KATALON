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

WebUI.callTestCase(findTestCase('Login, Dashboard, and Logout/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Create New Stockholder/Add_New/Branch_Information'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Create New Stockholder/Add_New/Client_Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Create New Stockholder/Add_New/Address'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Create New Stockholder/Add_New/Immediate_Family'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Create New Stockholder/Add_New/Stockholder'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Login, Dashboard, and Logout/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

