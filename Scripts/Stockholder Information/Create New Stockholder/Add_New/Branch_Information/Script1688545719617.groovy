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
import java.util.Random as Random
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

//
import java.util.Calendar as Calendar
import java.text.SimpleDateFormat as SimpleDateFormat

//
WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_DasHboaRd/div_Stockholder Information_osui-submenu__h_be17fb'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_DasHboaRd/span_Create New Stockholder'))

WebUI.click(findTestObject('Page_UserManagement/div_Profile'))

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_DasHboaRd/span_Add New'))

//WebUI.delay(30)
WebUI.selectOptionByValue(findTestObject('Spy Elements/BranchInfo/Page_StockholderEnrollment/select_--Select--CARD Bank, Inc.CARD SME Bank Inc.CARD MRI Rizal Bank Inc.CARD Inc'), 
    '0', true)

'Select Region'
WebUI.click(findTestObject('Spy Elements/BranchSpyWeb/Page_StockholderEnrollment/div_Select_Region'))

WebUI.click(findTestObject('Spy Elements/BranchSpyWeb/Page_StockholderEnrollment/span_REGION 4-A'))

'Select Branch'
WebUI.click(findTestObject('Spy Elements/BranchSpyWeb/Page_StockholderEnrollment/div_Select_Branch'))

WebUI.click(findTestObject('Spy Elements/BranchSpyWeb/Page_StockholderEnrollment/span_Barleta'))

'Select Unit'
WebUI.click(findTestObject('Spy Elements/BranchSpyWeb/Page_StockholderEnrollment/div_Select_Unit'))

WebUI.click(findTestObject('Spy Elements/BranchSpyWeb/Page_StockholderEnrollment/span_SPC 2'))

WebUI.click(findTestObject('Spy Elements/BranchSpyWeb/Page_StockholderEnrollment/div_Select_Center'))
WebUI.click(findTestObject('Spy Elements/BranchSpyWeb/Page_StockholderEnrollment/span_AKAP 1'))

//
// Get the current date and create a Calendar instance
'Select Center'
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

WebUI.selectOptionByValue(findTestObject('Types/Page_StockholderEnrollment/select_--Select--Individual ShareholderCorporate Shareholder'), 
    '0', true)


// Define the file path to store the global variable value
def filePath = 'C:/Users/j.bundalian/Desktop/MY PROJECTS/STOCKS ADMIN SYSTEM (SAS)/KATALON TALON/OSSAS-KATALON/iterationValue.txt' // Replace with the actual file path

// Function to read the value from the file
// Handle any potential exceptions while reading the file
// You can log an error or take appropriate actions here
// Function to write the value to the file
// Handle any potential exceptions while writing to the file
// You can log an error or take appropriate actions here
// Get the initial value from the file
def initialValue = readGlobalValueFromFile()

if (initialValue == null) {
    initialValue = 0 // Set the initial value if the file doesn't exist or is empty
}

// Define the number of iterations
def numberOfIterations = 1 // Change this value to set the number of iterations you need

// Start the loop
for (int i = 0; i < numberOfIterations; i++) {
    // Perform your web automation actions here using 'initialValue'
    WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/input_CIFID Number_Input_TextVar'), 
        initialValue.toString( // Replace 'yourTestObject' with the actual Test Object
            ))

    // Add other web automation actions as needed
    // Increment the 'initialValue' by 1 for the next iteration
    initialValue++

    // Save the updated 'initialValue' back to the file after each iteration
    writeGlobalValueToFile(initialValue)
}

//WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Full Name_userName'), iterationValue.toString())
//WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/input_CIFID Number_Input_TextVar'), 
//randomNumber1.toString())
WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/span_Next'))

def readGlobalValueFromFile() {
    try {
        File file = new File('C:/Users/j.bundalian/Desktop/MY PROJECTS/STOCKS ADMIN SYSTEM (SAS)/KATALON TALON/OSSAS-KATALON/iterationValue.txt')

        if (file.exists()) {
            return Integer.parseInt(file.text)
        }
    }
    catch (Exception e) {
    } 
    
    return null
}

def writeGlobalValueToFile(int value) {
    try {
        File file = new File('C:/Users/j.bundalian/Desktop/MY PROJECTS/STOCKS ADMIN SYSTEM (SAS)/KATALON TALON/OSSAS-KATALON/iterationValue.txt')

        file.text = value.toString()
    }
    catch (Exception e) {
    } 
}

