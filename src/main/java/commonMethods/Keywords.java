package commonMethods;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.CellType;
import java.util.Properties;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.DateUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.*;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONException;
import org.json.JSONObject;
//import java.awt.Color;
//import java.awt.image.BufferedImage;
//import javax.imageio.ImageIO;
//import java.io.File;
//import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
//import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.Directory;
import locators.Booking_Locators;
import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class Keywords extends ATUReports implements Booking_Locators {
	private static final String HMAC_SHA1_ALGORITHM = "HMACSHA1";

	public String ElementWait = Utils.getDataFromTestConfig("Wait Time");
	public int WaitElementSeconds = new Integer(ElementWait);
	public String Main_Window = "";
	public ArrayList<String> tabs;
	public WebElement fromElement;
	public ITestResult result;
	public String report_Filepath = Utils.getDataFromTestConfig("Reports  path");
	public String date = getCurrentDate();
	public String folder_name = report_Filepath.concat(date);
	public String folder_name_subfolder = folder_name.concat("/");
	public String report_folder_create = folder_name_subfolder;
	public String report_name = "PocReport";
	public String filepath_date_concat = folder_name_subfolder.concat(report_name).concat(".html");
	public String screenshot_folder_name = folder_name_subfolder.concat("Screenshot");
	public String screenshot_folder_path = screenshot_folder_name.concat("/");
	public String screenshot_folder_create = screenshot_folder_path;
	public String firstValue;
	public String secondValue;
	public boolean failureScreenshot = Directory.TestPassScreenshot;
	public static ExtentTest test;

	List<String> Encryptedpassword = new ArrayList<>();

	public String getCurrentDate() {
		Format formatter = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		Date date = new Date();
		String value = formatter.format(date);
		return value;
	}

	public static String[] splitXpath(String path) {
		String[] a = path.split(">");
		return a;
	}

	public String screenshot(WebDriver driver, String screenshotName) {
		String image_dest = null;
		try {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			String currenttime = new SimpleDateFormat("yyyyMMddHHmmss").format(Calendar.getInstance().getTime());
			image_dest = System.getProperty("user.dir").concat("\\snaptrude\\" + currenttime + screenshotName)
					.concat(".png");
			System.out.println(image_dest);
			File destination = new File(image_dest);
			FileUtils.copyFile(source, destination);
			return image_dest;
		} catch (Exception e) {
			System.out.println("Exception while taking Screenshot" + e.getMessage());
			return e.getMessage();
		}
	}


	public void wait(WebDriver driver, String inputData) {
		try {
			int time = Integer.parseInt(inputData);
			int seconds = time * 1000;
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			add1(driver, "Unable to wait ", LogAs.FAILED, true, "Wait");
			Assert.fail();
		}
	}

	

	public static void dropdown(WebDriver driver, String xpath) {

		String[] values = splitXpath(xpath);

		List<WebElement> li = driver.findElements(By.xpath(values[1]));
		try {
			for (int i = 0; i < li.size(); i++) {
				System.out.println(li.get(i).getText());
				Thread.sleep(2000);
				if (li.get(i).getText().contains("Apple iPhone 12")) {

					li.get(i).click();
					break;
				}
			}
		} catch (Exception e) {
			Assert.fail();
		}

	}

	public void waitForElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			add(driver, "Wait for the Element " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Element Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
					values[0]);
			Extent_fail(driver, "Element is not present " + values[0]+ e.getLocalizedMessage(), test);
			Assert.fail();
		}
	}

	public void waitForElement1(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			// int WaitElementSeconds1 = new Integer(ElementWait);
			driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 6000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			add(driver, "Wait for the Element " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Element Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
					values[0]);
			Assert.fail();
		}
	}

	public void waitForElementtopresent(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			// int WaitElementSeconds1 = new Integer(ElementWait);
			driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
			add(driver, "Wait for the Element " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Element Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
					values[0]);
			Assert.fail();
		}
	}

	public void waitForElementWithLessWait(WebDriver driver, String xpath) {

		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			// System.out.println(driver.getTitle());
			WebDriverWait wait1 = new WebDriverWait(driver, 60);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			add(driver, "Wait for visibility of Element" + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			System.out.println(" Exception " + e);
			add1(driver, "Element not visible " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
			Assert.fail();
		}

	}

	public void waitForElement5(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
			add(driver, "Wait for the Element " + values[0], LogAs.PASSED, true, values[0]);
			Extent_pass(driver, "Wait for the Element " + values[0] + values[0], test);

		} catch (Exception e) {
			e.printStackTrace();
			add1(driver, "Element Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
					values[0]);
			Extent_fail(driver, "Element Not Found " + values[0]+ e.getLocalizedMessage(), test);
			Assert.fail();
		}
	}

	public void click(WebDriver driver, String Xpath) {
		String[] values = splitXpath(Xpath);
		try {
			waitForElement(driver, Xpath);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
			WebElement element = driver.findElement(By.xpath(values[1]));
			element.click();

			add(driver, "Click on " + values[0], LogAs.PASSED, true, values[0]);

			Extent_pass(driver, "Click on " + values[0], test);

		} catch (Exception e) {
			e.printStackTrace();
			add1(driver, "Unable to click on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
			Extent_fail(driver, "Unable to click on " + values[0]+ e.getLocalizedMessage(), test);
			Assert.fail();
		}

	}

	public void click1(WebDriver driver, String path) {
		String[] values = splitXpath(path);
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", webElement);
			System.out.println(values[0] + " clicked");
			add(driver, "Click1 on " + values[0], LogAs.PASSED, true, values[0]);
			Extent_pass(driver, "Click on " + values[0], test);
		} catch (Exception e) {
			System.out.println(" Exception " + e);
			add1(driver, "Unable to click1 on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
			Extent_fail(driver, "Unable to click on " + values[0]+ e.getLocalizedMessage(), test);
			Assert.fail();
		}
	}

	public void switchToActiveElement(WebDriver driver) {
		try {
			driver.switchTo().activeElement();
		} catch (Exception e) {
		}
	}

	public void clickByClassName(WebDriver driver, String className) {
		String[] values = splitXpath(className);
		try {
			WebElement webElement = driver.findElement(By.className(values[1]));
			webElement.click();
			// add(driver, "Click on " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			// add1(driver, "Unable to click on " + values[0], LogAs.FAILED, true,
			// values[0]);
			Assert.fail();
		}
	}

	@SuppressWarnings("deprecation")
	public void clickWithoutFail(WebDriver driver, String path) {
		String[] values = splitXpath(path);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Actions actions = new Actions(driver);
			actions.moveToElement(webElement).click().perform();
			add(driver, "Click on " + values[0], LogAs.PASSED, true, values[0]);
			Extent_pass(driver, "Click on " + values[0], test);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Extent_fail(driver, "Unable to click on " + values[0]+ e.getLocalizedMessage(), test);
		}

	}


	public void waitForTexttopresent(WebDriver driver, String xpath, String text) {
		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// int WaitElementSeconds1 = new Integer(ElementWait);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
			wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(values[1]), text));
			add(driver, "Wait for the Text " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Text Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
					values[0]);
			Assert.fail();
		}
	}

	public String clearAndType(WebDriver driver, String xpaths, String keysToSend) {
		String[] values = splitXpath(xpaths);
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

			WebElement webElement = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='';", webElement);
			js.executeScript("arguments[0].click();", webElement);

			wait(driver, "1");
			js.executeScript("arguments[0].value=" + "\'" + keysToSend + "\'" + ";", webElement);

			add(driver, "Clear and Type on " + values[0], keysToSend, true, values[0]);
			Extent_pass(driver, "Clear and Type on " + values[0], test);
		} catch (Exception e) {
			add1(driver, "Unable to type on " + values[0] + "- " + e.getLocalizedMessage(), keysToSend, true,
					values[0]);
			Extent_fail(driver, "Unable to type on " + values[0] + "- " + e.getLocalizedMessage(), test);
			Assert.fail();
		}
		return keysToSend;
	}


	public void doubleClick(WebDriver driver, String element) {
		String[] values = splitXpath(element);
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Actions action = new Actions(driver).doubleClick(webElement);
			action.build().perform();
			add(driver, "Double click on " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Unable to click on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
			Assert.fail();
		}
	}

	public String sendKeys(WebDriver driver, String xpaths, String keysToSend) {
		String[] values = splitXpath(xpaths);

		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));

			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.sendKeys(keysToSend);

			add(driver, "Type on " + values[0], keysToSend, true, values[0]);
			Extent_pass(driver, "Type on " + values[0], test);
			wait(driver, "1");
		} catch (Exception e) {
			e.printStackTrace();
			add1(driver, "Unable to type on " + values[0] + "- " + e.getLocalizedMessage(), keysToSend, true,
					values[0]);
			Extent_fail(driver, "Unable to type on " + values[0]+ e.getLocalizedMessage(), test);

			Assert.fail();
		}
		return keysToSend;

	}


	public void clear(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.clear();
			add(driver, "Clear on " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Unable to clear on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.PASSED, true,
					values[0]);
			Assert.fail();
		}
	}


	public void selectByIndex(WebDriver driver, String xpaths, String inputData) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Integer index = new Integer(inputData);
			Select selectBox = new Select(webElement);
			selectBox.selectByIndex(index);
			add(driver, "Select the Dropdown by Index " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Unable to select the Dropdown by Index " + values[0] + "- " + e.getLocalizedMessage(),
					inputData, true, values[0]);
			Assert.fail();
		}
	}

	public void selectByText(WebDriver driver, String xpaths, String inputData) {
		String[] values = splitXpath(xpaths);
		try {
			Select selectBox = new Select(driver.findElement(By.xpath(values[1])));
			selectBox.selectByVisibleText(inputData);
			add(driver, "Select the Dropdown by text " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Unable to select the Dropdown by text " + values[0] + "- " + e.getLocalizedMessage(),
					inputData, true, values[0]);
			Assert.fail();
		}
	}

	public void selectByValue(WebDriver driver, String xpaths, String inputData) {
		String[] values = splitXpath(xpaths);
		try {

			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Select selectBox = new Select(webElement);
			selectBox.selectByValue(inputData);
			add(driver, "Select the Dropdown by Value " + values[0], inputData, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Unable to select the Dropdown by Value " + values[0] + "- " + e.getLocalizedMessage(),
					inputData, true, values[0]);
			Assert.fail();
		}
	}


	public void close(WebDriver driver) {
		try {
			driver.close();
			add(driver, "Application is closed", LogAs.PASSED, true, "Not Req");
		} catch (Exception e) {
			add1(driver, "Unable to close the application ", LogAs.FAILED, true,
					"Not Req" + "- " + e.getLocalizedMessage());
			Assert.fail();
		}
	}

	public String getText(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			String text = webElement.getText();
			add(driver, "The value ' " + text + " ' is retrieved from the element ' " + values[0] + "'", LogAs.PASSED,
					true, values[0]);
			return text;

		} catch (Exception e) {
			add1(driver, "Unable to retrieve the text " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED,
					true, values[0]);
			Assert.fail();
			return null;
		}
	}

	public void newTab2(WebDriver driver) {
		((JavascriptExecutor) driver).executeScript("window.open()");

		// Switch to the new tab
		ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		wait(driver, "1");
		driver.switchTo().window(tab.get(tab.size() - 1));
		wait(driver, "2");

	}

	public String getTextWithoutFail(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebElement webElement = driver.findElement(By.xpath(values[1]));
		String text = webElement.getText();
		add(driver, "The value ' " + text + " ' is retrieved for the element ' " + values[0] + "'", LogAs.PASSED, true,
				values[0]);
		return text;

	}

	public static void waitTime(WebDriver driver, String waitSeconds) {
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(waitSeconds), TimeUnit.SECONDS);
	}

	public void scrollBottom(WebDriver driver) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scroll(0,350)", "");
			waitTime(driver, "5");
			// add(driver, "Scrolled to the bottom ", LogAs.PASSED, true, "Not");
		} catch (Exception e) {
			// add1(driver, "Unable to scroll to the bottom", LogAs.FAILED, true, "Not");
			Assert.fail();
		}
	}

	public boolean verifyElementIsPresent(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			element.isDisplayed();
			add(driver, "Element '" + values[0] + "' is verified ", LogAs.PASSED, true, values[0]);
			return true;
		} catch (NoSuchElementException e) {
			add1(driver, "Element is Not Present " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
			Assert.fail();
			return true;
		}
	}

	public void verifyElementHasText(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			String text = driver.findElement(By.xpath(values[1])).getText();
			if (!text.equals("")) {
				add(driver, "Element '" + values[0] + "' has text " + text, LogAs.PASSED, true, values[0]);
			} else {
				add1(driver, "No text on the element " + values[0], LogAs.FAILED, true, values[0]);
				Assert.fail();
			}
		} catch (NoSuchElementException e) {
			add1(driver, "Element is Not Present " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
			Assert.fail();
		}
	}

	public boolean isDisplayed(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			return webElement.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void elementnotvisible(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {

			WebElement webElement = driver.findElement(By.xpath(values[1]));
			for (int i = 1; i <= 100; i++) {

				boolean flag = webElement.isDisplayed();

				if (flag == true) {
					Thread.sleep(3000);
				} else {
					break;
				}
			}

		} catch (Exception e) {

		}
	}

	public void closetab(WebDriver driver) {

		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_W);
			wait(driver, "2");
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_W);
			wait(driver, "2");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(0));
			wait(driver, "5");

		} catch (Exception e) {
		}
	}

	public boolean verifyElementIsNotPresent(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			element.isDisplayed();
			add1(driver, "Element is Present" + values[0], LogAs.FAILED, true, values[0]);
			Assert.fail();
			return true;
		} catch (NoSuchElementException e) {
			add(driver, "Verified Element is not Present" + values[0] + "- " + e.getLocalizedMessage(), values[0], true,
					values[0]);
		}
		return true;

	}

	public void scrollUsingElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			add(driver, "Scrolled to " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Unable to scroll " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
			Assert.fail();
		}
	}

	public void goBack(WebDriver driver) {

		try {
			driver.navigate().back();
			add(driver, "Go Back", LogAs.PASSED, true, "goback");

		} catch (Exception e) {
			add(driver, "Unable to Go Back", LogAs.FAILED, true, "goback");
			Assert.fail();

		}
	}



	public void waitTillVisibilityElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);

		try {
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOf(webElement));
			add(driver, "Waited till the element is visible", LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add(driver, "Unable to wait till an element is visible", LogAs.FAILED, true,
					values[0] + "-" + e.getLocalizedMessage());
			Assert.fail();

		}
	}

	public void waitTillElementIsClickable(WebDriver driver, String xpath) {
		try {
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			String[] values = splitXpath(xpath);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
			add(driver, "Waited till the element is clickable", LogAs.PASSED, true, "Scroll down");
		} catch (Exception e) {
			add(driver, "Unable to wait till an element is clickable", LogAs.FAILED, true,
					"Scroll down" + "- " + e.getLocalizedMessage());
			Assert.fail();

		}
	}

	public void IsElementEnabled(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.isEnabled();
			add(driver, "Element is enabled" + values[0], LogAs.PASSED, true, values[0]);

		} catch (NoSuchElementException e) {
			add(driver, "Element is not enabled", LogAs.FAILED, true, values[0]);
			Assert.fail();
		}
	}

	public int getRandomNum(WebDriver driver, int upperlimit) {
		List<Integer> randomZeroToSeven = new ArrayList<>();
		for (int i = 1; i <= upperlimit; i++) {
			randomZeroToSeven.add(i);
		}
		Collections.shuffle(randomZeroToSeven);

		return randomZeroToSeven.get(0);

	}

	public void deSelectByIndex(WebDriver driver, String xpath, String inputData) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Integer index = new Integer(inputData);
			Select selectBox = new Select(webElement);
			selectBox.deselectByIndex(index);
			add(driver, "Deselect the dropdown by index " + values[0], LogAs.PASSED, true, values[1]);
		} catch (Exception e) {
			add1(driver, "Unable to deselect the dropdown by index" + values[0], LogAs.FAILED, true, values[1]);
			Assert.fail();
		}
	}

	public void deSelectByValue(WebDriver driver, String xpath, String inputData) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Select selectBox = new Select(webElement);
			selectBox.deselectByValue(inputData);
			add(driver, "Deselect the dropdown by index " + values[0], LogAs.PASSED, true, values[1]);
		} catch (Exception e) {
			add(driver, "Unable to deselect the dropdown by index" + values[0], LogAs.FAILED, true, values[1]);
			Assert.fail();
		}
	}

	public void getWindow(WebDriver driver, String path) {
		try {
			waitTime(driver, "5");
			Main_Window = driver.getWindowHandle();
			System.out.println("Main_Window:" + Main_Window);
			String[] values = splitXpath(path);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.click();
			Thread.sleep(500);
			ArrayList<String> allWindows = new ArrayList<String>(driver.getWindowHandles());
			System.out.println("2nd Window:" + allWindows.get(1));
			driver.switchTo().window(allWindows.get(1));
		} catch (InterruptedException e) {
		}
	}

	public void switchWindow(WebDriver driver) {
		try {
			driver.switchTo().window(Main_Window);
		} catch (Exception e) {
		}
	}

	public void switchDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public void getAutoit(String exePath) {
		try {
			Runtime.getRuntime().exec(exePath);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void dragElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			fromElement = webElement;
			add(driver, "Drag an element " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Unable to drag an element " + values[0], LogAs.FAILED, true, values[0]);
		}

	}

	public void dropElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			Actions action = new Actions(driver);
			Action dragDrop = action.dragAndDrop(fromElement, webElement).build();
			dragDrop.perform();
			add(driver, "Drop an element " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Unable to drag an element " + values[0], LogAs.FAILED, true, values[0]);
		}
	}

	public boolean isElementSelected(WebDriver driver, String xpaths) {
		String[] values = splitXpath(xpaths);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.isSelected();
			add(driver, "Verified Element is selected " + values[0], LogAs.PASSED, true, values[0]);
			return true;
		} catch (NoSuchElementException e) {

			add1(driver, "Element is not selected " + values[0], LogAs.FAILED, true, values[0]);
			return false;
		}
	}

	public void inVisibilityElement(WebDriver driver, String NormalXpath) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(NormalXpath)));
		} catch (Exception e) {
		}
	}

	public void IstextPresent(WebDriver driver, String inputData) {
		if (driver.getPageSource().contains(inputData)) {
			add(driver, "Text is Present " + inputData, LogAs.PASSED, true, inputData);
		} else {
			add1(driver, "Text is not Present " + inputData, LogAs.FAILED, true, inputData);
		}
	}

	public void waitTillTextIsLoaded(WebDriver driver, String xpath, String inputData) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
			waits.until(ExpectedConditions.textToBePresentInElement(webElement, inputData));
			add(driver, "Waited till the text " + inputData + " is loaded", LogAs.PASSED, true, inputData);
		} catch (Exception e) {
			add1(driver, "Unable to Wait till the text " + inputData + "- " + e.getLocalizedMessage() + " is loaded",
					LogAs.FAILED, true, inputData);
		}
	}

	public void verifyTextIsNotPresent(WebDriver driver, String NormalXpath, String inputData) {
		try {
			WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
			waits.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(NormalXpath), inputData));
			add(driver, "Text is not present" + inputData, LogAs.PASSED, true, inputData);
		} catch (Exception e) {
			add1(driver, "Text is present" + inputData + "- " + e.getLocalizedMessage(), LogAs.FAILED, true, inputData);
		}

	}

	public void isElementClickable(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
			waits.until(ExpectedConditions.elementToBeClickable(webElement));
			add(driver, "Element is clickable " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Element is not clickable " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
		}
	}

	public void isElementSelectable(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait waits = new WebDriverWait(driver, WaitElementSeconds);
			waits.until(ExpectedConditions.elementToBeSelected(webElement));
			add(driver, "Element is selectable " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Element is not selectable " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
		}
	}

	public void waitUntilVisibilityOfElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
			wait.until(ExpectedConditions.visibilityOf(webElement));
			add(driver, "Wait till the Element is visible " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Element is not visible " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
		}

	}

	public void waitForElementNotpresent(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		try {
			WebDriverWait wait = new WebDriverWait(driver, WaitElementSeconds);
			wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
			add(driver, "Wait till the Element is visible " + values[0], LogAs.PASSED, true, values[0]);
		} catch (Exception e) {
			add1(driver, "Element is not visible " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
					values[0]);
		}
	}



	public void quit(WebDriver driver) {
		try {
			driver.quit();
		} catch (Exception e) {
		}
	}

	public void refreshPage(WebDriver driver) {
		try {
			waitTime(driver, "5");
			driver.navigate().refresh();
			waitTime(driver, "5");
		} catch (Exception e) {
			Assert.fail();
		}
	}

	public void maximize(WebDriver driver) {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			Assert.fail();
		}
	}

	public void keyTab(WebDriver driver) {
		try {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.TAB).build().perform();

		} catch (Exception e) {
			Assert.fail();
		}
	}


	public void enter(WebDriver driver) {
		try {
			Actions actionObject = new Actions(driver);
			actionObject.sendKeys(Keys.ENTER).build().perform();
		} catch (Exception e) {
			Assert.fail();
		}
	}

	public String alertAccept(WebDriver driver, String path) {
		String[] values = splitXpath(path);

		try {
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.click();
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			alert.accept();
			return alertText;
		} catch (Exception e) {
			Assert.fail();
			return null;
		}
	}

	public void dismissAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public String promptBox(WebDriver driver, String path, String inputData) {
		String[] values = splitXpath(path);
		try {

			WebElement element = driver.findElement(By.xpath(values[1]));
			element.click();
			Alert alert = driver.switchTo().alert();
			driver.switchTo().alert().sendKeys(inputData);
			String alertText = alert.getText();
			alert.accept();
			return alertText;
		} catch (Exception e) {
			return null;
		}
	}

	public void switchToFrame(WebDriver driver, String frameName) {
		String[] values = splitXpath(frameName);
		try {
			WebElement element = driver.findElement(By.xpath(values[1]));
			driver.switchTo().frame(element);

		} catch (NoSuchFrameException e) {

		}
	}

	public void switchToDefaultFrame(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			Assert.fail();
		}
	}

	
	public void escape(WebDriver driver) {

		Robot key;
		try {
			key = new Robot();

			key.keyPress(KeyEvent.VK_ESCAPE);
			key.delay(500);
			key.keyRelease(KeyEvent.VK_ESCAPE);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public void keyDown(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject = actionObject.sendKeys(Keys.ARROW_DOWN);
		actionObject.perform();
	}

	public void keyUp(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject = actionObject.sendKeys(Keys.ARROW_UP);
		actionObject.perform();
	}

	public void keyboardPageUp(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_UP).perform();
	}

	public void refreshUsingKeys(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.sendKeys(Keys.F5).perform();
	}

	public void keyboardPageDown(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).perform();
		waitTime(driver, "5");
	}

	public void keyboardEnd(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitTime(driver, "5");
	}

	public void keyboardHome(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitTime(driver, "5");
	}

	public void keyboardArrowUp(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_UP).perform();
	}

	public void keyboardArrowDown(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).perform();
	}

	public void keyboardArrowLeft(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_LEFT).perform();
	}

	public void keyboardArrowRight(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_RIGHT).perform();
	}

	public void pageMaximizeUsingKey(WebDriver driver) {
		Actions actionObject = new Actions(driver);
		actionObject = actionObject.sendKeys(Keys.F11);
		actionObject.perform();
	}

	public void deleteAllCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();

	}

	public void navigateUrl(WebDriver driver, String inputData) {
		if (inputData == null) {
			add(driver, " Navigated to " + inputData, LogAs.FAILED, true, inputData);
			Assert.fail(inputData);
		} else {
			driver.navigate().to(inputData);
			add(driver, " Navigated to " + inputData, LogAs.PASSED, true, inputData);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

	}

	public void highLightElement(WebDriver driver, String xpath) {
		String[] values = splitXpath(xpath);
		WebElement webElement = driver.findElement(By.xpath(values[1]));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement,
				"color: red; border: 3px solid red;");
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "");
	}


	
	public void Upload_File(WebDriver driver, String Location, String xpaths) {
		String[] values = splitXpath(xpaths);
		Robot rb1;
		try {
			rb1 = new Robot();
			rb1.delay(1000);
			StringSelection ss = new StringSelection(Location);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			rb1.keyPress(KeyEvent.VK_CONTROL);
			rb1.keyPress(KeyEvent.VK_V);
			rb1.keyRelease(KeyEvent.VK_V);
			rb1.keyRelease(KeyEvent.VK_CONTROL);
			wait(driver, "2");
			rb1.keyPress(KeyEvent.VK_ENTER);
			wait(driver, "10");
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
					webElement);
			webElement.click();
			wait(driver, "2");
		} catch (AWTException e) {

			e.printStackTrace();
		}

	}

	public void newTab(WebDriver driver) {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);
			wait(driver, "1");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			wait(driver, "1");
			wait(driver, "1");
		} catch (Exception e) {
		}
	}

	public void newTabpaste(WebDriver driver) {
		try {
			wait(driver, "5");
			Robot r = new Robot();
			r.delay(1000);
			r.keyPress(KeyEvent.VK_CONTROL);

			r.keyPress(KeyEvent.VK_T);
			wait(driver, "5");
			r.keyRelease(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_CONTROL);

			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			wait(driver, "5");
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			wait(driver, "5");
			r.keyPress(KeyEvent.VK_ENTER);
		} catch (Exception e) {
		}
	}

	public void get(WebDriver driver, String url) {
		Capabilities localCapabilities = ((RemoteWebDriver) driver).getCapabilities();
		String browser = localCapabilities.getBrowserName().toLowerCase();
		driver.get(url);
		if (browser.equalsIgnoreCase("ie") || browser.equalsIgnoreCase("UnKnown")) {
			wait(driver, "5");
			driver.get("javascript:document.getElementById('overridelink').click();");
			wait(driver, "5");
		}

	}

	public void closeTab(WebDriver driver) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "w");
		// tabs.remove(tabs.get(0));
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(0));
	}

	public void closeTab1(WebDriver driver, int input) {
		driver.findElement(By.xpath("body")).sendKeys(Keys.CONTROL + "w");
		// tabs.remove(tabs.get(0));
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(input));
	}

	public void switchtotab(WebDriver driver, int inputData) {
		Capabilities localCapabilities = ((RemoteWebDriver) driver).getCapabilities();
		String BROWSER_NAME = localCapabilities.getBrowserName().toLowerCase();
		if (BROWSER_NAME.equalsIgnoreCase("firefox")) {
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
			driver.switchTo().defaultContent();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(inputData));
		}
		if (BROWSER_NAME.equalsIgnoreCase("chrome")) {
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
			driver.switchTo().defaultContent();
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(inputData));
			wait(driver, "2");
		}
	}


	private static Object parse(String json) {
		// TODO Auto-generated method stub
		return null;
	}


	// Click to given day
	public static void clickGivenDay(List<WebElement> elementList, String day) {
		// DatePicker is a table. Thus we can navigate to each cell
		// and if a cell matches with the current date then we will click it.
		/** Functional JAVA version of this method. */
		elementList.stream().filter(element -> element.getText().contains(day)).findFirst()
				.ifPresent(WebElement::click);
	}

	public static String getCurrentDay() {
		// Create a Calendar Object
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

		// Get Current Day as a number
		int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Today Int: " + todayInt + "\n");

		// Integer to String Conversion
		String todayStr = Integer.toString(todayInt);
		System.out.println("Today Str: " + todayStr + "\n");

		return todayStr;
	}

	public void scrolltill(WebDriver driver) {
		try {

			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scroll(0,12200)", "");
			waitTime(driver, "5");
			// add(driver, "Scrolled to the bottom ", LogAs.PASSED, true, "Not");
		} catch (Exception e) {
			// add1(driver, "Unable to scroll to the bottom", LogAs.FAILED, true, "Not");
			Assert.fail();
		}
	}

	public void Alert1(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void Escape(WebDriver driver) {

		Robot rb1;
		try {
			rb1 = new Robot();
			rb1.delay(1000);
			rb1.keyPress(KeyEvent.VK_ESCAPE);
			rb1.delay(500);
			rb1.keyRelease(KeyEvent.VK_ESCAPE);

		} catch (Exception e) {
			System.out.println("escape its not working");
		}

	}

	public void takescreenshot(WebDriver driver, String screenshot_path) {
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/Screenshots" + screenshot_path + ".png");
		try {
			FileUtils.copyFile(scr, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		add(driver, "Captured the screenshot " + "", LogAs.PASSED, true, "");
		Extent_pass(driver, "Click on " + "Screenshot", test);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void takescreenshot1(WebDriver driver, String screenshot_path) {
		try {
			Robot robot = new Robot();

			// Define the region to capture using top-left and bottom-right coordinates
			int x1 = 70; // x-coordinate of the top-left corner
			int y1 = 200; // y-coordinate of the top-left corner
			int x2 = 1350; // x-coordinate of the bottom-right corner
			int y2 = 500; // y-coordinate of the bottom-right corner

			Rectangle captureRect = new Rectangle(x1, y1, x2, y2);

			BufferedImage screenCapture = robot.createScreenCapture(captureRect);

			// Save the screenshot
			File dest = new File(System.getProperty("user.dir") + "/Screenshots" + screenshot_path + ".png");
			ImageIO.write(screenCapture, "png", dest);

			System.out.println("Screenshot captured successfully!");

			add(driver, "Captured the screenshot " + "", LogAs.PASSED, true, "");
			Extent_pass(driver, "Taken Screenshot for " + screenshot_path, test);

		} catch (AWTException | IOException e) {
			e.printStackTrace();
		}

	}

	public String imageComparision(WebDriver driver, String ExpectedImage_path, String actualImage_path)
			throws IOException {
		String image_res = null;
		try {
			BufferedImage img1 = ImageIO.read(new File(
					System.getProperty("user.dir") + "/Screenshots/Expected_screenshot" + ExpectedImage_path + ".png"));
			BufferedImage img2 = ImageIO.read(new File(
					System.getProperty("user.dir") + "/Screenshots/Actual_screenshot" + actualImage_path + ".png"));
			int w1 = img1.getWidth();
			int w2 = img2.getWidth();
			int h1 = img1.getHeight();
			int h2 = img2.getHeight();
			long diff = 0;
			if ((w1 != w2) || (h1 != h2)) {
				System.out.println("Both images should have same dimwnsions");
			} else {

				for (int j = 0; j < h1; j++) {
					for (int i = 0; i < w1; i++) {
						// Getting the RGB values of a pixel
						int pixel1 = img1.getRGB(i, j);
						Color color1 = new Color(pixel1, true);
						int r1 = color1.getRed();
						int g1 = color1.getGreen();
						int b1 = color1.getBlue();
						int pixel2 = img2.getRGB(i, j);
						Color color2 = new Color(pixel2, true);
						int r2 = color2.getRed();
						int g2 = color2.getGreen();
						int b2 = color2.getBlue();
						// sum of differences of RGB values of the two images
						long data = Math.abs(r1 - r2) + Math.abs(g1 - g2) + Math.abs(b1 - b2);
						diff = diff + data;
					}
				}
				String s[] = ExpectedImage_path.split("/");
				double avg = diff / (w1 * h1 * 3);
				double percentage = (avg / 255) * 100;
				System.out.println("Difference: " + percentage);
				if (percentage < 0.5) {
					image_res = "Pass";

					add(driver, s[1] + " - " + s[2] + " - Image compared sucessfully" + "", LogAs.PASSED, true,
							"diff.hasDiff()");
					System.out.println(s[1] + " - " + s[2] + " - Image compared sucessfully");

					Extent_pass(driver, "Click on " + " Expected and Actual images are same", test);

				} else {
					add1(driver, s[1] + " - " + s[2] + " - Expected and Actual images are not same " + "", LogAs.FAILED,
							true, "diff.hasDiff()");
					System.out.println(s[1] + " - " + s[2] + " - Expected and Actual images are not same ");
					Extent_fail(driver, "Unable to click on " + "Expected and Actual images are not same", test);
					Assert.fail();

				}

			}
		} catch (Exception e) {
			System.out.println("Exception while taking Screenshot" + e.getMessage());
			return e.getMessage();
		}
		return image_res;

	}

	public static void disableToast(WebDriver driver) {

		try {

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			Object de = js1.executeScript("store.exposed.autoSaveConfig.disableToasts()");
			System.out.println(de);

		}

		catch (Exception e1) {
			Assert.fail();
		}

	}

	public void getfps(WebDriver driver, String action) {

		try {

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			Object de = js1.executeScript("return store.scene.getEngine().getFps()");
			System.out.println(action + " FPS value : " + de);

			// add(driver, action+" : FPS", LogAs.PASSED, true, ""+de);
			addfps(driver, action + " FPS", de.toString(), true, "");

		}

		catch (Exception e1) {
			add1(driver, "Could not retrieve FPS value", LogAs.FAILED, true, "");
		}

	}

	public void Upload_PDF_file(WebDriver driver, String Location) {

		Robot rb1;
		try {
			rb1 = new Robot();
			rb1.delay(1000);
			StringSelection ss = new StringSelection(Location);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			rb1.keyPress(KeyEvent.VK_CONTROL);
			rb1.keyPress(KeyEvent.VK_V);
			rb1.keyRelease(KeyEvent.VK_V);
			rb1.keyRelease(KeyEvent.VK_CONTROL);
			wait(driver, "2");
			rb1.keyPress(KeyEvent.VK_ENTER);

			wait(driver, "2");

		} catch (AWTException e) {

			e.printStackTrace();
		}

	}


	public void Upload_File1(WebDriver driver, String Location) {
		// String[] values = splitXpath(xpaths);
		Robot rb1;
		try {
			rb1 = new Robot();
			rb1.delay(1000);
			StringSelection ss = new StringSelection(Location);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			rb1.keyPress(KeyEvent.VK_CONTROL);
			rb1.keyPress(KeyEvent.VK_V);
			rb1.keyRelease(KeyEvent.VK_V);
			rb1.keyRelease(KeyEvent.VK_CONTROL);
			wait(driver, "4");
			rb1.keyPress(KeyEvent.VK_ENTER);
			wait(driver, "10");
			// WebElement webElement = driver.findElement(By.xpath(values[1]));
			wait(driver, "2");

			// JavascriptExecutor js = (JavascriptExecutor) driver;
			wait(driver, "2");

			wait(driver, "2");
		} catch (AWTException e) {

			e.printStackTrace();
		}

	}


	public void verifyElementText(WebDriver driver, String xpath, String expectedtext) {
		String[] values = splitXpath(xpath);
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			waitForElement(driver, xpath);
			String text = driver.findElement(By.xpath(values[1])).getText();
			if (text.equals(expectedtext)) {
				add(driver, "Exepected text is present" + values[0] + "" + text, LogAs.PASSED, true, values[0]);
			}
		} catch (NoSuchElementException e) {
			add1(driver, "Expected text is Not Present " + values[0], LogAs.FAILED, true, values[0]);
			Assert.fail();
		}
	}

	public String imageComparison(WebDriver driver, String ExpectedImage_path, String actualImage_path)
			throws IOException {
		String image_res = null;

		try {
			BufferedImage img1 = ImageIO
					.read(new File("./Screenshots/Expected_screenshot" + ExpectedImage_path + ".png"));
			BufferedImage img2 = ImageIO.read(new File("./Screenshots/Actual_screenshot" + actualImage_path + ".png"));

			int w1 = img1.getWidth();
			int w2 = img2.getWidth();
			int h1 = img1.getHeight();
			int h2 = img2.getHeight();
			long diff = 0;

			if ((w1 != w2) || (h1 != h2)) {
				System.out.println("Both images should have the same dimensions");
			} else {
				for (int j = 0; j < h1; j++) {
					for (int i = 0; i < w1; i++) {
						int pixel1 = img1.getRGB(i, j);
						Color color1 = new Color(pixel1, true);
						int r1 = color1.getRed();
						int g1 = color1.getGreen();
						int b1 = color1.getBlue();

						int pixel2 = img2.getRGB(i, j);
						Color color2 = new Color(pixel2, true);
						int r2 = color2.getRed();
						int g2 = color2.getGreen();
						int b2 = color2.getBlue();

						long data = Math.abs(r1 - r2) + Math.abs(g1 - g2) + Math.abs(b1 - b2);
						diff = diff + data;
					}
				}

				String[] s = ExpectedImage_path.split("/");
				double avg = (double) diff / (w1 * h1 * 3);
				double percentage = (avg / 255) * 100;
				System.out.println("Difference: " + percentage);

				if (percentage < 0.4) {
					image_res = "Pass";
					add(driver, s[1] + " - " + s[2] + " - Image compared successfully", LogAs.PASSED, true,
							"diff.hasDiff()");
					System.out.println(s[1] + " - " + s[2] + " - Image compared successfully");
					Extent_pass(driver, s[1] + " - " + s[2] + " - Expected and Actual images are same", test);
				} else {
					add1(driver, s[1] + " - " + s[2] + " - Expected and Actual images are not the same", LogAs.FAILED,
							true, "diff.hasDiff()");
					System.out.println(s[1] + " - " + s[2] + " - Expected and Actual images are not the same ");
					Extent_fail(driver, s[1] + " - " + s[2] + " - Expected and Actual images are not same", test);
					// Assert.fail();
				}
			}
		} catch (Exception e) {
			System.out.println("Exception while taking Screenshot: " + e.getMessage());
			e.printStackTrace(); // Log the exception stack trace
			return e.getMessage();
		}
		return image_res;
	}

	public void uploadfile(WebDriver driver, String path) {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
			File file = new File(path);
			System.out.println(file.getAbsolutePath());
			element.sendKeys(file.getAbsolutePath());
			add(driver, "uploaded the file " + path, LogAs.PASSED, true, path);
			wait(driver, "2");
		} catch (Exception e) {
			add1(driver, "upload is falied - " + path + e, LogAs.FAILED, true, e.getLocalizedMessage());
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void uploadfile1(WebDriver driver, String path) {
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement element = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
			File file = new File(path);
			System.out.println(file.getAbsolutePath());
			element.sendKeys(file.getAbsolutePath());
			add(driver, "uploaded the file " + path, LogAs.PASSED, true, path);
			wait(driver, "2");
		} catch (Exception e) {
			add1(driver, "upload is falied - " + path + e, LogAs.FAILED, true, e.getLocalizedMessage());
			e.printStackTrace();
			Assert.fail();
		}
	}


	public static void ActionTest(ExtentTest extentTest) {
		test = extentTest;
	}

	  public void pass(WebDriver driver, String value) {
			add(driver,value, LogAs.PASSED,true, "");	
		}
		
		public void fail(WebDriver driver, String value) {
			add1(driver,value, LogAs.FAILED,true, "");
		}
		
		
		   public void write_data(String columnName, String str) {
		       
			   String filePath = System.getProperty("user.dir") + "\\uploads\\Script_Data's.xlsx";

		        // Specify the sheet name
		        String sheetName = "Sheet1";

		        // New value to be set in the cell
		        String newValue = str;

		        try (FileInputStream fis = new FileInputStream(filePath);
		             Workbook workbook = new XSSFWorkbook(fis)) {

		            // Get the sheet
		            Sheet sheet = workbook.getSheet(sheetName);

		            // Get the row index (assuming you want to write to the first available row)
		            int rowIndex = 1; // Row index

		            // Get the row, create if it doesn't exist
		            Row row = sheet.getRow(rowIndex);
		            if (row == null) {
		                row = sheet.createRow(rowIndex);
		            }

		            // Get the column index based on the column name
		            int columnIndex = getColumnIndexByName(sheet, columnName);

		            // Get the cell, create if it doesn't exist
		            Cell cell = row.getCell(columnIndex);
		            if (cell == null) {
		                cell = row.createCell(columnIndex);
		            }

		            // Set the new value
		            cell.setCellValue(newValue);

		            // Write the changes back to the Excel file
		            try (FileOutputStream fos = new FileOutputStream(filePath)) {
		                workbook.write(fos);
		            }

		            System.out.println("Value updated successfully!");

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

		    // Method to get the column index by column name
		    
		    
		    public String Readdata(String Columnname) throws Exception {
		    	
		    	
		    	 String filePath = System.getProperty("user.dir") +"\\uploads\\Script_Data's.xlsx";

		         // Specify the sheet name
		         String sheetName = "Sheet1";

		         // Specify the row index (0-based)
		         int rowIndex = 1; // Row index

		         // Specify the column name
		         String columnName = Columnname; // Column name

		          FileInputStream fis = new FileInputStream(filePath);
		              Workbook workbook = new XSSFWorkbook(fis); 

		             // Get the sheet
		             Sheet sheet = workbook.getSheet(sheetName);

		             // Get the row
		             Row row = sheet.getRow(rowIndex);

		             // Get the column index based on the column name
		             int columnIndex = getColumnIndexByName(sheet, columnName);

		             // Get the cell
		             Cell cell = row.getCell(columnIndex);

		             // Get the value from the cell
		             String cellValue = cell.getStringCellValue(); // Assuming the cell contains string value

		             // Print the cell value
		             System.out.println("Cell Value: " + cellValue);

		     
				return cellValue;
		     }

		     // Method to get the column index by column name
		     public static int getColumnIndexByName(Sheet sheet, String columnName) {
		         Row row = sheet.getRow(0); // Assuming the column names are in the first row
		         for (int i = 0; i < row.getLastCellNum(); i++) {
		             Cell cell = row.getCell(i);
		             if (cell.getStringCellValue().equals(columnName)) {
		                 return i;
		             }
		         }
		         throw new IllegalArgumentException("Column with name '" + columnName + "' not found.");
		     }
		     
		     public String getTextColor(WebDriver driver,String Xpath) {
					String[] values=splitXpath(Xpath);
					try {
						WebElement eleSearch = driver.findElement(By.xpath(values[1]));
						String rgbFormat = eleSearch.getCssValue("color");
						String hexcolor = rgbToHex(rgbFormat);
						
						return hexcolor;
					}catch(Exception e) {
						System.out.println("Unable to get color of the element..!");
						return "";
					}
					
					
				}
				
				public static String rgbToHex(String rgb) {
			        String[] rgbValues = rgb.replace("rgba(", "").replace(")", "").split(", ");
			        int red = Integer.parseInt(rgbValues[0]);
			        int green = Integer.parseInt(rgbValues[1]);
			        int blue = Integer.parseInt(rgbValues[2]);

			        return String.format("#%02X%02X%02X", red, green, blue);
			    }

		public String getTextBackgroundColor(WebDriver driver,String Xpath) {
					String[] values=splitXpath(Xpath);
					try {
						WebElement eleSearch = driver.findElement(By.xpath(values[1]));

						String rgbFormat = eleSearch.getCssValue("background-color");

//						System.out.println(rgbFormat);     //In RGB Format the value will be print => rgba(254, 189, 105, 1)

						String hexcolor = rgbToHex(rgbFormat);
//						System.out.println(hexcolor);
						
						return hexcolor;
					}catch(Exception e) {
						System.out.println("Unable to get color of the element..!");
						return "";
					}
					
					
				}
}
