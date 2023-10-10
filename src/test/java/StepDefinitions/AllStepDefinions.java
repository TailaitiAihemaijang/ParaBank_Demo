package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import jdk.nashorn.tools.Shell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class AllStepDefinions {
    LocatorPage el = new LocatorPage();
    @Given("Navigate To Para Bank")
    public void navigateToParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("Click On The Element")
    public void clickOnTheElement(DataTable value) {
        List<String> strlinkList = value.asList(String.class);
        for (int i = 0;i < strlinkList.size();i++){
            WebElement linkWebElement = el.getWebElement(strlinkList.get(i));
            el.myClick(linkWebElement);
        }
    }

    @And("Enter Data in Text Box")
    public void enterDataInTextBox(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0;i < items.size();i++){
            WebElement element = el.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            el.mySendKeys(element,word);
        }
    }

    @And("Hover on the Element")
    public void hoverOnTheElement(DataTable value) {
        List<String> strlinkList = value.asList(String.class);
        for (int i = 0;i < strlinkList.size();i++){
            WebElement linkWebElement = el.getWebElement(strlinkList.get(i));
            el.hoverFunction(linkWebElement);

        }
    }

    @And("Verification Is In Progress")
    public void verificationIsInProgress(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0;i < items.size();i++){
            WebElement element = el.getWebElement(items.get(i).get(0));
            String word = items.get(i).get(1);
            el.verifyContainsText(element,word);
        }


    }

    @And("Enter Data from Excel")
    public void enterDataFromExcel() throws IOException {
        String path = "src/test/java/FeatureFiles/resources/Login.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet shell = workbook.getSheetAt(0);
        String userName = String.valueOf(shell.getRow(1).getCell(1));
        String userPassword = String.valueOf(shell.getRow(1).getCell(2));
        el.mySendKeys(el.logUserName,userName);
        el.mySendKeys(el.logUserPass,userPassword);

    }

    @And("Select On The Menua")
    public void selectOnTheMenua(DataTable value) {
        List<List<String>> items = value.asLists(String.class);
        for (int i = 0;i < items.size();i++){
            WebElement element = el.getWebElement(items.get(i).get(0));
            String val = items.get(i).get(1);
            el.selectContainElement(element,val);
        }
    }
}
