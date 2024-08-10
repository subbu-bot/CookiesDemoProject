package com.cucumber;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.cucumber.commonBase.Base;
import com.cucumber.commonValidation.ComValidation;
import com.cucumber.pages.HomePage;
import com.cucumber.commonServices.ExcelHelper;
import com.cucumber.commonServices.ScreenshotServices;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.cucumber.pages.LoginPage;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import java.io.FileOutputStream;
import java.io.IOException;

public class LoginStepDef extends Base {
    LoginPage login;
    ScreenshotServices services;
    ExcelHelper excelHelper;
    HomePage homePage;
    String actual;


    public LoginStepDef() {
        driver = Base.driver;
        login = new LoginPage();
        services = new ScreenshotServices();
        excelHelper = new ExcelHelper();
        homePage = new HomePage();
    }

    @When("I click on YourAccount")
    public void iClickOnYourAccount() throws InterruptedException {
        login.clickYourAccount();
        login.enterEmail();

    }


    @Then("I should see location dropdown")
    public void iShouldSeeLocationDropdown() throws InterruptedException {
        //login.selectDropdownByValue();
        login.selectDropdownByText();
        try {

            String actualValueCatalog = login.getTextOfTab();
            Assert.assertEquals(actualValueCatalog, "Catalogs");
        } catch (Exception e) {
            ExtentCucumberAdapter.getCurrentStep().fail(e.getMessage());
            scenario.attach(services.getScreenshot(), ComValidation.IMAGEPNG, scenario.getName());
        }
    }


    @When("read from excel")
    public void readFromExcel() throws IOException {
        XSSFSheet sheet = excelHelper.getExcelSheetTabData("D:\\Test.xlsx", "Test.xlsx", "Sheet2");
        actual = sheet.getRow(2).getCell(2).getStringCellValue();

    }

    @Then("data should display from excel")
    public void dataShouldDisplayFromExcel() {
        Assert.assertEquals(actual, "Bangalore");
    }

    @When("write to excel")
    public void writeToExcel() throws IOException {
        // create workbook for output result

        XSSFWorkbook outputworkbook;
        //to generate excel file, workbook
        outputworkbook = new XSSFWorkbook();
        //to generate sheet in excel
        XSSFSheet output = outputworkbook.createSheet("Output File");

// Create row for Output//this is hardcoded can be kept in loop
        XSSFRow outputValueRow = output.createRow(1);


// WRITE RESULT VALUE INTO OUTPUT RESULT FILE
        //as per 82nd line it would create row as per array of an object
        Object[] outputValues = {"1", "Baroda", "Test", "Pass"};
        excelHelper.WriteDataInOutputFile(outputValues, outputValueRow);
        FileOutputStream fos = excelHelper.getFileOutputStreamPath("D:\\Outputfile.xlsx");
        outputworkbook.write(fos);
        System.out.println("Excel generated Successfully");
        fos.close();
    }


    @Then("Catalogs tab should display")
    public void catalogsTabShouldDisplay() throws InterruptedException {
        //verify catalogs tab text
        String actualValue = login.getTextOfTab();
        String expectedValue = "Catalogs";
        Assert.assertEquals(actualValue, expectedValue);
        String actualValue1 = homePage.getTextCatalogs();

        String actualValueOfBrands = homePage.getTextBrands();
        String expectedValueOfBrands = "Brands";


        String expectedValueOfContactUs = "Contact Us";
        String actualValueOfContactUs = homePage.getContactUs();

        String expectedValueOfAbout = "About Kapruka";
        String actualValueOfAbout = homePage.getAbout();

        Assert.assertEquals(actualValue1, expectedValue, "Assert failed-catalog tab text is not displayed");
        Assert.assertEquals(actualValueOfBrands, expectedValueOfBrands, "Assert failed-Brands tab text is not displayed");
        Assert.assertEquals(actualValueOfContactUs, expectedValueOfContactUs, "Assert failed-Contact Us tab text is not displayed");
        Assert.assertEquals(actualValueOfAbout, expectedValueOfAbout, "Assert failed-About us text is not displayed");

    }

    @When("user navigate to homepage")
    public void userNavigateToHomepage()
    {
        System.out.println("home is displayed");
    }
}




