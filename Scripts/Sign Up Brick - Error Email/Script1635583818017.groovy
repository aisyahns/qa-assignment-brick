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
import util.VariableCollections
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Sign Up Page - Brick/firstNameField'), 'aisyah')

WebUI.setText(findTestObject('Sign Up Page - Brick/lastNameField'), 'syahidah')

WebUI.setText(findTestObject('Sign Up Page - Brick/emailField'), VariableCollections.map.get("email"))

WebUI.setText(findTestObject('Sign Up Page - Brick/phoneNumberField'), "+62826532")

WebUI.setEncryptedText(findTestObject('Sign Up Page - Brick/passField'), 'p4y+y39Ir5MSxNs1t5lTZQ==')

WebUI.setEncryptedText(findTestObject('Sign Up Page - Brick/confirmPassField'), 'p4y+y39Ir5MSxNs1t5lTZQ==')

WebUI.click(findTestObject('Sign Up Page - Brick/registerBtn'))

WebUI.verifyEqual(WebUI.getText(findTestObject('Sign Up Page - Brick/errorMsg')), "Error", FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sign Up Page - Brick/emailNotice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sign Up Page - Brick/okBtn'))

WebUI.closeBrowser()