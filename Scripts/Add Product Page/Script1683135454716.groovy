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

WebUI.click(findTestObject('Object Repository/Login/button_product'))

WebUI.click(findTestObject('Object Repository/AddProduct/button_product'))

WebUI.click(findTestObject('Object Repository/AddProduct/button_addProduct'))

WebUI.click(findTestObject('Object Repository/AddProduct/label_kode'))

WebUI.click(findTestObject('Object Repository/AddProduct/button_simpan'))

WebUI.setText(findTestObject('Object Repository/AddProduct/input_nama_nama'), 'nama product')

WebUI.setText(findTestObject('Object Repository/AddProduct/input_deskripsi_deskripsi'), 'deskripsi product')

WebUI.setText(findTestObject('Object Repository/AddProduct/input_harga beli_harga beli'), '10.000')

WebUI.setText(findTestObject('Object Repository/AddProduct/input_harga jual_harga jual'), '20.000')

WebUI.click(findTestObject('Object Repository/AddProduct/div_stok'))

WebUI.doubleClick(findTestObject('Object Repository/AddProduct/input_stok_stok'))

WebUI.click(findTestObject('Object Repository/AddProduct/input_stok_stok'))

WebUI.setText(findTestObject('Object Repository/AddProduct/input_stok_stok'), '5')

WebUI.click(findTestObject('Object Repository/AddProduct/input_kategori_kategori'))

WebUI.click(findTestObject('Object Repository/AddProduct/td_Umum'))

WebUI.click(findTestObject('Object Repository/AddProduct/button_simpan'))

WebUI.closeBrowser()

