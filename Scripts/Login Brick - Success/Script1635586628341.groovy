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

WebUI.click(findTestObject('Sign Up Page - Brick/loginLink'))

//WebUI.click(findTestObject('Login Page - Brick/emailField'))

WebUI.setText(findTestObject('Login Page - Brick/emailField'), VariableCollections.map.get("email"))

WebUI.setEncryptedText(findTestObject('Login Page - Brick/passField'), VariableCollections.map.get("password"))

WebUI.click(findTestObject('Login Page - Brick/loginBtn'))

WebUI.verifyEqual(WebUI.getText(findTestObject('Login Page - Brick/errorSuccessMsg')), "Success", FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Login Page - Brick/wrongNotice'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Login Page - Brick/okBtn'))

WebUI.verifyElementVisible(findTestObject('Dashboard Page - Brick/logoutLink'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Dashboard Page - Brick/logoutLink'))

WebUI.closeBrowser()