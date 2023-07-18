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

import java.util.Random
//
import java.util.Calendar as Calendar
import java.text.SimpleDateFormat as SimpleDateFormat

//
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_StockholderEnrollment/select_--Select--Dr.Mrs.Mr.Atty.Hon.Ms.Engr.Rev'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_StockholderEnrollment/select_--Select--FemaleMale'), '1', 
    true)

// List of predefined names
List<Integer> namesList = ['John', 'Alice', 'Michael', 'Emily', 'James', 'Sophia', 'William', 'Olivia', 'Robert', 'Emma'
	, 'David', 'Ava' // Add more names as needed
]

// List of predefined surnames
List<Integer> surnamesList = ['Smith', 'Johnson', 'Brown', 'Davis', 'Miller', 'Wilson', 'Anderson', 'Taylor', 'Thomas', 'Jackson'
	, 'White', 'Jones' // Add more surnames as needed
]

// Define the number of random names to generate
int numberOfRandomNames = 9

// Create a Random object
Random random = new Random()

// Initialize a list to store the random full names
List<Integer> randomFullNamesList = new ArrayList<Integer>()

// Generate random names and surnames and add them to the list
for (int i = 0; i < numberOfRandomNames; i++) {
	int randomNameIndex = random.nextInt(namesList.size())

	int randomSurnameIndex = random.nextInt(surnamesList.size())

	String randomName = namesList[randomNameIndex]

	String randomSurname = surnamesList[randomSurnameIndex]

	String randomFullName = (randomName + ' ') + randomSurname

	randomFullNamesList.add(randomFullName)
}

// Output the list of random full names
println('Random Full Names: ' + randomFullNamesList)

// Assuming you have two input fields where you want to set the random names and surnames
String inputField1Locator = 'your/input/field1/locator'

String inputField2Locator = 'your/input/field2/locator'

// Set the generated random names and surnames in the input fields
String[] nameParts = (randomFullNamesList[0]).split(' ')

WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_First Name_Input_FirstName'), nameParts[0] // Set first name in inputField1
	)


WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_Middle Name_Input_FirstName2'), 'M')

WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_Last Name_Input_FirstName3'), nameParts[1] // Set last name in inputField2
)

//WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_Last Name_Input_FirstName3'), 'Nagata')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_StockholderEnrollment/select_--Select--IVSr.Jr.IIII'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_Mothers Maiden Name_Input_FirstName4'), 
    'Smokey\'s Mother')

WebUI.selectOptionByValue(findTestObject('Create New Stockholder/Page_StockholderEnrollment/Client_Details/select_--Select--Widower'), 
    '5', false)

WebUI.mouseOver(findTestObject('Object Repository/Page_StockholderEnrollment/input_Date of Birth_DateOfbirths'))

//
// Get the current date and create a Calendar instance
Calendar currentDate = Calendar.getInstance()

// subtract 3 years to the current date
currentDate.add(Calendar.YEAR, -18)

// Format the date as "mm/dd/yyyy"
SimpleDateFormat dateFormat = new SimpleDateFormat('MM-dd-yyyy')

String pastDate = dateFormat.format(currentDate.time)

// Print the past date
println('Past Date is: ' + pastDate)

////
// Input the current date into the text box
WebUI.setText(findTestObject('Create New Stockholder/Page_StockholderEnrollment/Client_Details/input_Date of Birth_DateOfbirths'), 
    pastDate)

WebUI.click(findTestObject('Object Repository/Page_StockholderEnrollment/button_Next'))

WebUI.click(findTestObject('Create New Stockholder/Page_StockholderEnrollment/Client_Details/button_Yes Accept Override'))

