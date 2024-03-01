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


WebUI.callTestCase(findTestCase("TC - Login Success"), null)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_Swag Labs'),0)
//check if there's title on the web page

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Backpack'),0)
//check if there's the item we're looking for

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Sauce Labs Backpack'))
//go to the item detail's page

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'),1)
//check if there's a button to put the item to the cart

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))
//add item to cart



