import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\User\\Downloads\\Toppr Doubts JEE Main NEET_v2.1.5_apkpure.com.apk', true)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.Button1 - Login (1)'), 0)

Mobile.setText(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.EditText0 (2)'), '1567890121', 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.TextView3 - Continue'), 0)

Mobile.setText(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.EditText0 (3)'), '12345', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.Button0 - Login (1)'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.ImageView0 (1)'), 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.TextView3 - EXTEND (1)'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.Button0 (3)'), 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.Button0 (4)'), 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.Spinner0 (1)'), 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.CheckedTextView1 - Uttarakhand (1)'), 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.Button0 (5)'), 0)

Mobile.switchToPortrait()

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.view.View6'), 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.view.View3'), 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.view.View3 (1)'), 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.view.View14'), 0)

Mobile.tap(findTestObject('toppr_doubts_login_buynowonline_logout/android.widget.Button1 - Logout (2)'), 0)

Mobile.closeApplication()

