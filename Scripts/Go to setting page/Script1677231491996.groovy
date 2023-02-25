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

// after success doing login, user open setting page

Mobile.startApplication('/Users/asthalinggarfendykurniawan/Downloads/MaterialLoginExample.apk', true)

Mobile.setText(findTestObject('REGISTER/android.widget.EditText (6)'), 'a@a.com', 0)

Mobile.setText(findTestObject('REGISTER/android.widget.EditText (1) (1)'), 'password', 0)

Mobile.tap(findTestObject('REGISTER/android.widget.Button - LOGIN'), 0)

Mobile.verifyElementText(findTestObject('REGISTER/android.widget.TextView - Hello world (1)'), 'Hello world!')

Mobile.tap(findTestObject('REGISTER/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('REGISTER/android.widget.TextView - Settings'), 0)

Mobile.verifyElementText(findTestObject('REGISTER/android.widget.TextView - Hello world (1)'), 'Hello world!')

Mobile.closeApplication()

