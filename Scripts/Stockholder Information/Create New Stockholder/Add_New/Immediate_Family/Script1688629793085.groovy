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

List<String> namesList = ['Jose', 'Ligaya', 'Reyna', 'Joselito', 'Coco', 'Bogart', 'Maria', 'Oliver','Xander', 'Robert', 'Akira'
	, 'David', 'Tendou','Chris', 'Bruce', 'Jeff', 'Kim', 'Mark','Clark',
	'Peter','Glenn','Tom','Jeremy','Robert', 'Kevin','Samuel','Niño' // Add more names as needed
]

// List of predefined surnames
List<String> surnamesList = ['Santos', 'Dela Cruz', 'Garcia', 'Reyes', 'Ramos', 'Mendoza', 'Flores', 'Gonzales', 'Dela Peña', 'Jacob'
	, 'Pascual', 'Jones', 'Hernandez', 'Perez', 'Martinez', 'Ignacio', 'Dolores', 'Cristobal', 'Calihan', 'Gill', 'York','Rogers','Isaac','Grant','Spector','Barzaga' // Add more surnames as needed
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

	int randomSurnameIndex = random.nextInt(surnamesList.size())
	
	String randomName = namesList[randomNameIndex]
	
	String randomSurname = surnamesList[randomSurnameIndex]
	
	String randomFullName = ((randomName + ' ') + ' ') + randomSurname
	
	randomFullNamesList.add(randomFullName)
	}
	
	// Output the list of random full names
	println('Random Full Names: ' + randomFullNamesList)

	// Set the generated random names and surnames in the input fields
	String[] nameParts = (randomFullNamesList[0]).split(' ')
	

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/input_ImmediateContact Person_Immediate_Con_5c3087'), 
    nameParts[0] + nameParts[2])

WebUI.setText(findTestObject('Object Repository/Create New Stockholder/Page_StockholderEnrollment/Stockholder/input_land Islands_ImmediateContactNumberS'), 
    '9091000000')

WebUI.setText(findTestObject('Spy Elements/Page_StockholderEnrollment/input_Immediate Address_ImmediateContactNumber (final11)'), 
    'Sample Immediate Address 01')

WebUI.click(findTestObject('Object Repository/Page_StockholderEnrollment/button_Next'))

