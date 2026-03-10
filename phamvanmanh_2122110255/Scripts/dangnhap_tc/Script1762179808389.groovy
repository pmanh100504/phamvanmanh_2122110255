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

// Mở trình duyệt và truy cập trang web
WebUI.openBrowser('')

WebUI.delay(5)

WebUI.navigateToUrl('https://vuighe.asia')

// Nhấn nút "Đăng nhập"
WebUI.click(findTestObject('dangnhap/button_dangnhapppp'))

// Nhập email và mật khẩu từ file Data
WebUI.setText(findTestObject('dangnhap/txt_email'), Email)

WebUI.setText(findTestObject('dangnhap/txt_matkhau'), Password)

// Bấm nút "Đăng nhập"
WebUI.click(findTestObject('dangnhap/button_dangnhap'))

// Đợi trang hiển thị thông báo lỗi (nếu có)
WebUI.delay(2)

WebUI.verifyTextPresent(ExpectedMsg, false)


// Kiểm tra phần thông báo lỗi hiển thị trong giao diện
// Đóng trình duyệt
WebUI.closeBrowser()

