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

WebUI.navigateToUrl('https://www.bkdelivery.co.id/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Index - Burger King/span_Order'), 0)

WebUI.click(findTestObject('Object Repository/Page_Index - Burger King/span_Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_King Saver Semua Menu  23K - Burger King/input_-_search'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_King Saver Semua Menu  23K - Burger King/input_-_search'))

WebUI.setText(findTestObject('Object Repository/Page_King Saver Semua Menu  23K - Burger King/input_-_search'), 'whop')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_King Saver Semua Menu  23K - Burger King/span_Cheese Whopper Jr'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_King Saver Semua Menu  23K - Burger King/span_Cheese Whopper Jr'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cheese Whopper Jr - Burger King/h1_Cheese Whopper Jr'), 'Cheese Whopper® Jr')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Cheese Whopper Jr - Burger King/div_Cheese Whopper Jr'), 
    'Cheese Whopper® Jr')

WebUI.closeBrowser()

