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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Sign Up Page - Brick/registerBtn'))

//Assert for each field, whether the error message has been visible for user notice
WebUI.verifyElementVisible(findTestObject('Sign Up Page - Brick/errorFirstName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sign Up Page - Brick/errorLastName'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sign Up Page - Brick/errorEmail'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sign Up Page - Brick/errorPass'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sign Up Page - Brick/errorConfirmPass'), FailureHandling.CONTINUE_ON_FAILURE)

//Input the required data in each field
WebUI.setText(findTestObject('Sign Up Page - Brick/firstNameField'), 'aisyah')

WebUI.setText(findTestObject('Sign Up Page - Brick/lastNameField'), 'syahidah')

WebUI.setText(findTestObject('Sign Up Page - Brick/emailField'), 'aisyah87$%@gmail.com')

WebUI.click(findTestObject('Sign Up Page - Brick/errorEmail'))

WebUI.setText(findTestObject('Sign Up Page - Brick/emailField'), 'aisyah@gmail.c')

WebUI.click(findTestObject('Sign Up Page - Brick/errorEmail'))

WebUI.setText(findTestObject('Sign Up Page - Brick/emailField'), 'aisyah@gmail.com')

WebUI.setText(findTestObject('Sign Up Page - Brick/phoneNumberField'), "+6282643767")

WebUI.setText(findTestObject('Sign Up Page - Brick/addressField'), 'sawangan')

WebUI.setEncryptedText(findTestObject('Sign Up Page - Brick/passField'), 'NOZHw6sL/1I=')

WebUI.verifyElementVisible(findTestObject('Sign Up Page - Brick/errorPass'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Sign Up Page - Brick/passField'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.setEncryptedText(findTestObject('Sign Up Page - Brick/confirmPassField'),
	'NOZHw6sL/1I=')

WebUI.click(findTestObject('Sign Up Page - Brick/registerBtn'))

WebUI.verifyElementVisible(findTestObject('Sign Up Page - Brick/errorConfirmPass'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()