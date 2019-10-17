import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://parabank.parasoft.com/')

WebUI.delay(4)

WebUI.click(findTestObject('Registration/click_Reg link'))

WebUI.delay(2)

WebUI.scrollToPosition(2, 6)

WebUI.setText(findTestObject('Registration/Input_customerDetails', [('regdetails') : 'firstName']), First_name)

WebUI.setText(findTestObject('Registration/Input_customerDetails', [('regdetails') : 'lastName']), Last_Name)

WebUI.setText(findTestObject('Registration/input_addressdetails', [('address') : 'street']), Address)

WebUI.setText(findTestObject('Registration/input_addressdetails', [('address') : 'city']), City)

WebUI.setText(findTestObject('Registration/input_addressdetails', [('address') : 'state']), State)

WebUI.setText(findTestObject('Registration/input_addressdetails', [('address') : 'zipCode']), Zip_code)

WebUI.setText(findTestObject('Registration/Input_customerDetails', [('regdetails') : 'phoneNumber']), Phone)

WebUI.setText(findTestObject('Registration/Input_customerDetails', [('regdetails') : 'ssn']), SSN)

WebUI.delay(2)

WebUI.setText(findTestObject('Registration/Input_customerDetails', [('regdetails') : 'username']), UserName)

WebUI.setText(findTestObject('Registration/Input_customerDetails', [('regdetails') : 'password']), Password)

WebUI.setText(findTestObject('Registration/Confirm'), confirm)

WebUI.delay(4)

WebUI.click(findTestObject('Registration/Click_Reg btn'))

WebUI.scrollToPosition(3, 7)

WebUI.delay(5)

WebUI.closeBrowser()

