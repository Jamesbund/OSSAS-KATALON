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

//
import java.util.Calendar as Calendar
import java.text.SimpleDateFormat as SimpleDateFormat

//
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_StockholderEnrollment/select_--Select--Dr.Mrs.Mr.Atty.Hon.Ms.Engr.Rev'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_StockholderEnrollment/select_--Select--FemaleMale'), '1', 
    true)

///////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////// List of predefined names
List<String> namesList = ['John', 'Jake', 'Michael', 'Jobert', 'James', 'Bogart', 'William', 'Oliver','Xander', 'Robert', 'Akira'
    , 'David', 'Tendou', 'Condoriano', 'Sendo', 'Jin', 'Hordy', 'Tony', 'Chris', 'Bruce', 'Junnie', 'Mavi', 'Red', 'Taylor', 'Jeff', 'Kim', 'Mark','Clark',
	'Peter','Glenn','Tom','Jeremy','Robert', 'Kevin','Samuel','Steve','Clint','Lockley','Niño' // Add more names as needed
]

List<String> MInamesList = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S'
    , 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','Ñ']

// List of predefined surnames
List<String> surnamesList = ['Smith', 'Johnson', 'Brown', 'Davis', 'Miller', 'Wilson', 'Anderson', 'Taylor', 'Thomas', 'Jackson'
    , 'White', 'Jones', 'Hernandez', 'Perez', 'Martinez', 'Trevor', 'Stark', 'Evans', 'Hemsworth', 'Romanof', 'York','Young','Barton','Renner','Johansson','Ford',
	'Ruffalo','Rogers','Isaac','Grant','Spector','Barzaga' // Add more surnames as needed
]

// Define the number of random names to generate
int numberOfRandomNames = 9

// Create a Random object
Random random = new Random()

// Initialize a list to store the random full names
List<String> randomFullNamesList = new ArrayList<String>()

List<String> randomEmailAddressesList = new ArrayList<String>()

// Generate random names and surnames and add them to the list
for (int i = 0; i < numberOfRandomNames; i++) {
    int randomNameIndex = random.nextInt(namesList.size())

    int randomMINameIndex = random.nextInt(MInamesList.size())

    int randomSurnameIndex = random.nextInt(surnamesList.size())

    String randomName = namesList[randomNameIndex]

    String randomMInameIndex = MInamesList[randomMINameIndex]

    String randomSurname = surnamesList[randomSurnameIndex]

    String randomFullName = (((randomName + ' ') + randomMInameIndex) + ' ') + randomSurname

    String randomEmailAddress = generateEmailAddress(randomName, randomSurname)

    randomFullNamesList.add(randomFullName)

    randomEmailAddressesList.add(randomEmailAddress)
}

// Output the list of random full names
println('Random Full Names: ' + randomFullNamesList)

println('Random Email Addresses: ' + randomEmailAddressesList)

// Set the generated random names and surnames in the input fields
String[] nameParts = (randomFullNamesList[0]).split(' ')

// Function to generate an email address based on the name and surname
// Remove any whitespace from the name and surname
// Convert the name and surname to lowercase
// Generate the email address
WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_First Name_Input_FirstName'), nameParts[
    0 // Set first name in inputField1
    ])

WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_Middle Name_Input_FirstName2'), nameParts[
    1 // Middle Name
    ])

WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_Last Name_Input_FirstName3'), nameParts[
    2 // Set last name in inputField2
    ])

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_Last Name_Input_FirstName3'), 'Nagata')
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_StockholderEnrollment/select_--Select--IVSr.Jr.IIII'), 
    '4', true)

WebUI.setText(findTestObject('Object Repository/Page_StockholderEnrollment/input_Mothers Maiden Name_Input_FirstName4'), nameParts[0] + "'"+'s Mother'
    )

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

/////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////// THIS PART IS THE ADDRESS SECTION ///////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////
WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_land Islands_Input_MN'), 
    '9090000200')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_Place of Birth_InputDOB'), 
    'Sample Place of Birth 01')

//Input the Generated Email Address into the text box
WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_Email Address_InputAddress'), 
    randomEmailAddressesList[0])

Random snum1 = new Random()
Random snum2 = new Random()

int randomNumber1 = snum1.nextInt(999)
int randomNumber2 = snum2.nextInt(999)

///WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_Email Address_InputAddress'),
//'Smokeynagata@sample.com')
WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_House Number_InputHN'), '1' +
    randomNumber1.toString())

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/select_PresentPermanent'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_Street_InputStreet'), 
    'Sample Street 01')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_Barangay_InputBrangay'), 
    'Sample Barangay 01')

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_City_InputCity'), 
    'Sample City 01')


WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_ZipCode_InputZipcode'), '4' +
    randomNumber2.toString())

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/input_Province_InputProvince'), 
    'Sample Province 01')

WebUI.click(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Address/span_Next'))



String generateEmailAddress(String name, String surname) {
    name = name.trim()

    surname = surname.trim()

    name = name.toLowerCase()

    surname = surname.toLowerCase()

    String emailAddress = ((name + '.') + surname) + '@sample.com'

    return emailAddress
}

